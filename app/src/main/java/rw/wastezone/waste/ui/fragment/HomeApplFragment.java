package rw.wastezone.waste.ui.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import rw.wastezone.waste.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeApplFragment extends Fragment {


    public HomeApplFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_appl, container, false);
    }

}
