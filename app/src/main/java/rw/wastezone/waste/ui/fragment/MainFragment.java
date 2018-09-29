package rw.wastezone.waste.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
        return view;
    }

    @Override
    public void onCategorySelected(MyProductModel model) {

    }
}
