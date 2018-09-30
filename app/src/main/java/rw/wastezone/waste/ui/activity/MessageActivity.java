package rw.wastezone.waste.ui.activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import rw.wastezone.waste.R;
import rw.wastezone.waste.model.MessageModel;
import rw.wastezone.waste.ui.adapter.MessageAdapter;
import rw.wastezone.waste.viewmodel.MessageViewModel;

public class MessageActivity extends AppCompatActivity {

    private MessageViewModel mMessageViewModel;
    private MessageAdapter adapter;
    private Button materialButton;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        adapter = new MessageAdapter();
        materialButton = findViewById(R.id.materialButton);
        editText = findViewById(R.id.appCompatEditText);
        mMessageViewModel = ViewModelProviders.of(this).get(MessageViewModel.class);
        mMessageViewModel.getMessages().observe(this, lists -> adapter.submitList(lists));

        RecyclerView mRecyclerView = findViewById(R.id.recycleView);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(adapter);
        saveMessage();
    }

    private void saveMessage() {
        materialButton.setOnClickListener(v -> {
            if (!editText.getText().toString().isEmpty()) {
                mMessageViewModel.insertMessage(new MessageModel(editText.getText().toString()));
                editText.setText(null);
            } else
                Toast.makeText(this, "Enter message", Toast.LENGTH_SHORT).show();
        });
    }
}
