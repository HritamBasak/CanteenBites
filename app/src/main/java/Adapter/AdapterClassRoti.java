package Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.canteenbites.R;

import java.util.ArrayList;

import Model.ModelRecipeDosa;

public class AdapterClassRoti extends RecyclerView.Adapter<AdapterClassRoti.ViewHolder>
{
    ArrayList<ModelRecipeDosa> list1;
    Context context;
    public AdapterClassRoti(Context context, ArrayList<ModelRecipeDosa> list1)
    {
        this.list1=list1;
        this.context=context;
    }
    @NonNull
    @Override
    public AdapterClassRoti.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= View.inflate(context, R.layout.recyclerviewdosa,null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterClassRoti.ViewHolder holder, int position) {
        ModelRecipeDosa model=list1.get(position);
        holder.imageView.setImageResource(model.getPic());
        holder.textView.setText(model.gettext());

    }

    @Override
    public int getItemCount() {
        return list1.size();
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
