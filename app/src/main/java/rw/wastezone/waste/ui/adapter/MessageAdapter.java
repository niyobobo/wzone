package rw.wastezone.waste.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import rw.wastezone.waste.R;
import rw.wastezone.waste.model.MessageModel;

public class MessageAdapter extends ListAdapter<MessageModel, MessageAdapter.ViewHolder> {

    public MessageAdapter() {
        super(DIFF_CALLBACK);
    }

    private static final DiffUtil.ItemCallback<MessageModel> DIFF_CALLBACK = new DiffUtil.ItemCallback<MessageModel>() {
        @Override
        public boolean areItemsTheSame(@NonNull MessageModel oldItem, @NonNull MessageModel newItem) {
            return oldItem.getId() == newItem.getId();
        }

        @Override
        public boolean areContentsTheSame(@NonNull MessageModel oldItem, @NonNull MessageModel newItem) {
            return oldItem.getId() == newItem.getId() && oldItem.getMessage().equals(newItem.getMessage());
        }
    };

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_message_sender, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(getItem(position));
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView mTextView;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.textView6);
        }

        void bind(MessageModel model) {
            mTextView.setText(model.getMessage());
        }
    }
}
