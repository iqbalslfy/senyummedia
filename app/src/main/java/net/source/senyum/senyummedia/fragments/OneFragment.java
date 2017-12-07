package net.source.senyum.senyummedia.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.source.senyum.senyummedia.R;
import net.source.senyum.senyummedia.adapter.ViewPagerAdapter;

import java.util.Timer;
import java.util.TimerTask;


public class OneFragment extends Fragment{

    ViewPager viewPager;
    private Timer timer;


    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_one, container, false);

        viewPager = view.findViewById(R.id.viewPagerHome);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getActivity());
        viewPager.setAdapter(viewPagerAdapter);

        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTasks(), 1000, 2000);
        return view;

    }

    public class TimerTasks extends TimerTask {

        @Override
        public void run() {
            getActivity().runOnUiThread(new Runnable() {
                @Override
                public void run() {

                    if (viewPager.getCurrentItem() == 0){
                        viewPager.setCurrentItem(1);
                    } else if (viewPager.getCurrentItem() == 1){
                        viewPager.setCurrentItem(2);
                    } else {
                        viewPager.setCurrentItem(0);
                    }

                }
            });


        }
    }

    @Override
    public void onPause() {
        super.onPause();
        timer.cancel();
        timer.purge();
    }

}
