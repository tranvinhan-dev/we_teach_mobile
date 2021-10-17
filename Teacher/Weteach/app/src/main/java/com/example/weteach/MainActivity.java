package com.example.weteach;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.Toast;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

public class MainActivity extends AppCompatActivity {
    //Intitialize variable
    MeowBottomNavigation bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigation = findViewById(R.id.bottom_navigation);
        bottomNavigation.add(new MeowBottomNavigation.Model(1,R.drawable.ic_baseline_home_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(2,R.drawable.ic_baseline_calendar_today_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(3,R.drawable.ic_baseline_dvr_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(4,R.drawable.ic_baseline_chat_bubble_24));


        bottomNavigation.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {
                Fragment fragment = null;
                //check condition
                switch (item.getId()){
                    case 1:
                        fragment = new HomeFragment();

                        break;
                    case 2:
                        fragment = new CalendarFragment();

                        break;
                    case 3:
                        fragment = new QuizListFragment();
                        break;
                    case 4:
                        fragment = new ChatFragment();
                        break;

                }
                loadFragment(fragment);
            }
        });
        bottomNavigation.show(1,true);
        bottomNavigation.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {
                Toast.makeText(getApplicationContext(),"You clicked "+item.getId(),Toast.LENGTH_SHORT).show();
            }
        });
        bottomNavigation.setOnReselectListener(new MeowBottomNavigation.ReselectListener() {
            @Override
            public void onReselectItem(MeowBottomNavigation.Model item) {
                Toast.makeText(getApplicationContext(),"You reselected "+item.getId(),Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,fragment).commit();
    }
}