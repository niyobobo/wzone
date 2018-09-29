package rw.wastezone.waste.ui.activity;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import rw.wastezone.waste.R;
import rw.wastezone.waste.ui.fragment.AccountFragment;
import rw.wastezone.waste.ui.fragment.MainFragment;
import rw.wastezone.waste.ui.fragment.ProductsFragment;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener
                (item -> {
                    Fragment selectedFragment = null;
                    switch (item.getItemId()) {
                        case R.id.menu_home:
                            selectedFragment = MainFragment.newInstance();
                            break;
                        case R.id.menu_list:
                            selectedFragment = ProductsFragment.newInstance();
                            break;
                        case R.id.menu_profile:
                            selectedFragment = AccountFragment.newInstance();
                            break;
                    }
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    if (selectedFragment != null)
                        transaction.replace(R.id.fragment_container, selectedFragment);
                    transaction.commit();
                    return true;
                });
        /*
         * Manually displaying the first fragment - one time only
         */
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, MainFragment.newInstance());
        transaction.commit();


    }
}
