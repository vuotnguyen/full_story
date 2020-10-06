package com.example.mvp_funystory.View.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvp_funystory.Model.category_stories;
import com.example.mvp_funystory.R;

import java.util.List;

public class CategoryStoriesAdapter extends RecyclerView.Adapter<CategoryStoriesAdapter.HolderStories> {
    private Context context;
    private List<category_stories> listStory;

    public CategoryStoriesAdapter(Context context, List<category_stories> listStory) {
        this.context = context;
        this.listStory = listStory;
    }

    @NonNull
    @Override
    public HolderStories onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.stories_adapter,parent,false);
        return new HolderStories(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderStories holder, int position) {
        category_stories categorystories = listStory.get(position);
        holder.img_avatar.setImageResource(R.drawable.ic_baseline_menu_book_24);
//        holder.tv_name.setText(categorystories.getStory_name());
//        holder.tv_chuong.setText(categorystories.getTotal_chapter());
//        holder.tv_author.setText(categorystories.getAuthor());
//        holder.tv_dateMo.setText(categorystories.getModified_date());
    }

    @Override
    public int getItemCount() {
        return listStory.size();
    }

    public class HolderStories extends RecyclerView.ViewHolder {
        private ImageView img_avatar;
        private TextView tv_name,tv_chuong,tv_author,tv_dateMo;
        public HolderStories(@NonNull View itemView) {
            super(itemView);
            img_avatar = itemView.findViewById(R.id.imageView);
            tv_name = itemView.findViewById(R.id.tv_name);
            tv_chuong = itemView.findViewById(R.id.tv_chuong);
            tv_author = itemView.findViewById(R.id.tv_author);
            tv_dateMo  = itemView.findViewById(R.id.tv_dateMo);

        }
    }
}
