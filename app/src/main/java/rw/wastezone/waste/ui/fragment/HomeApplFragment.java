package rw.wastezone.waste.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import rw.wastezone.waste.R;
import rw.wastezone.waste.ui.activity.MessageActivity;
import rw.wastezone.waste.ui.adapter.HomeProductAdapter;

public class HomeApplFragment extends Fragment implements HomeProductAdapter.ListItemSelected {
    private FloatingActionButton actionButton;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_appl, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recycle_home_appliance);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new HomeProductAdapter(this));
        actionButton = view.findViewById(R.id.fab_chat);
        actionButton.setOnClickListener(v -> {
            startActivity(new Intent(getContext(), MessageActivity.class));
        });
        return view;
    }

    @Override
    public void onItemSelected() {
        actionButton.show();
    }
}
