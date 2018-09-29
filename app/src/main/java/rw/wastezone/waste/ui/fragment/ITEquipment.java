package rw.wastezone.waste.ui.fragment;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import rw.wastezone.waste.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ITEquipment extends Fragment {


    public ITEquipment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_itequipment, container, false);
    }

}
