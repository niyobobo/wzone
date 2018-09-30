package rw.wastezone.waste.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import rw.wastezone.waste.R;
import rw.wastezone.waste.model.MyProductModel;
import rw.wastezone.waste.ui.adapter.MainFragmentAdapter;
import rw.wastezone.waste.util.ItemOffsetDecoration;

public class MainFragment extends Fragment implements MainFragmentAdapter.OnSelectedCategory {

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_navigation, container, false);
        ItemOffsetDecoration offsetDecoration = new ItemOffsetDecoration(getContext(), R.dimen.small_margin);
        RecyclerView recyclerView = view.findViewById(R.id.recycle_main);
        recyclerView.addItemDecoration(offsetDecoration);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        recyclerView.setAdapter(new MainFragmentAdapter(getContext(), this));

        FloatingActionButton actionButton= view.findViewById(R.id.fab_add_new);
        actionButton.setOnClickListener(v -> {
            Toast.makeText(getContext(), "Adding new product......", Toast.LENGTH_SHORT).show();
        });

        return view;
    }

    @Override
    public void onCategorySelected(MyProductModel model) {

    }
}
