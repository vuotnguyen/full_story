package com.example.mvp_funystory.View.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvp_funystory.Model.Categories;
import com.example.mvp_funystory.R;

import java.util.List;

public class RecycleView_InDrawerMenu extends RecyclerView.Adapter<RecycleView_InDrawerMenu.RV_Holder> {
    private Context context;
    private List<Categories> list;

    public RecycleView_InDrawerMenu(Context context, List<Categories> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RV_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.drawablemenu_adapter,parent,false);
        return new RV_Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RV_Holder holder, int position) {
        Categories menu = list.get(position);
        holder.imageView.setImageResource(menu .getId());
        holder.textView.setText(menu.getCategory_name());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class RV_Holder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textView;
        public RV_Holder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imgID_menu);
            textView = itemView.findViewById(R.id.tv_menu);

        }
    }
}
