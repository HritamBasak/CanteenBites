package Adapter4;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.canteenbites.R;

import java.util.ArrayList;

import Adapter3.AdapterClassCoconut;
import Model.ModelRecipeDosa;

public class AdapterFruit extends RecyclerView.Adapter<AdapterFruit.ViewHolder>
{
    ArrayList<ModelRecipeDosa> list;
    Context context;
    public AdapterFruit(Context context, ArrayList<ModelRecipeDosa> list) {
        this.list = list;
        this.context = context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= View.inflate(context, R.layout.recyclerviewdosa,null);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull AdapterFruit.ViewHolder holder, int position) {
        ModelRecipeDosa model=list.get(position);
        holder.imageView.setImageResource(model.getPic());
        holder.textView.setText(model.gettext());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView= itemView.findViewById(R.id.imageView);
            textView=itemView.findViewById(R.id.textView);
        }
    }
}
