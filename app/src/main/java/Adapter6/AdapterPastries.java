package Adapter6;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.canteenbites.R;

import java.util.ArrayList;

import Adapter5.Adapterbrownie;
import Model.ModelRecipeDosa;

public class AdapterPastries extends RecyclerView.Adapter<AdapterPastries.ViewHolder>
{
    ArrayList<ModelRecipeDosa> list;
    Context context;
    public AdapterPastries(ArrayList<ModelRecipeDosa> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterPastries.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=View.inflate(context, R.layout.recyclerviewdosa,null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterPastries.ViewHolder holder, int position) {
        ModelRecipeDosa model=list.get(position);
        holder.imageView.setImageResource(model.getPic());
        holder.textView.setText(model.gettext());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.textView);
            imageView=itemView.findViewById(R.id.imageView);
        }
    }
}