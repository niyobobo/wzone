package rw.wastezone.waste.ui.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import rw.wastezone.waste.R;
import rw.wastezone.waste.ui.adapter.ITProductAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class ITEquipment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_itequipment, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recycle_it_equipment);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new ITProductAdapter());
        return view;
    }

}
