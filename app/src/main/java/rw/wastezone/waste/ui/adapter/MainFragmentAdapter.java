package rw.wastezone.waste.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import rw.wastezone.waste.R;
import rw.wastezone.waste.model.MyProductModel;

//public class MainFragmentAdapter extends ListAdapter<MyProductModel, MainFragmentAdapter.ViewHolder> {
public class MainFragmentAdapter extends RecyclerView.Adapter<MainFragmentAdapter.ViewHolder> {

    private Context context;
    private OnSelectedCategory selectedCategory;

    public MainFragmentAdapter(Context context, OnSelectedCategory selectedCategory) {
        //super(ITEM_CALLBACK);
        this.context = context;
        this.selectedCategory = selectedCategory;
    }

    private static DiffUtil.ItemCallback<MyProductModel> ITEM_CALLBACK = new DiffUtil.ItemCallback<MyProductModel>() {
        @Override
        public boolean areItemsTheSame(@NonNull MyProductModel oldItem, @NonNull MyProductModel newItem) {
            return false;
        }

        @Override
        public boolean areContentsTheSame(@NonNull MyProductModel oldItem, @NonNull MyProductModel newItem) {
            return false;
        }
    };

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_my_product, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        void bind(MyProductModel model) {

        }
    }

    public interface OnSelectedCategory {
        void onCategorySelected(MyProductModel model);
    }

}
