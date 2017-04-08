package com.codepathms.cp.tripplannerapp.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;

import com.astuetz.PagerSlidingTabStrip;
import com.codepathms.cp.tripplannerapp.R;
import com.codepathms.cp.tripplannerapp.fragments.ItineraryListFragment;

public class MainActivity extends AppCompatActivity {
    private ItineraryListFragment itineraryListFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set up viewpager for tabs
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new ItinerariesPagerAdapter(getSupportFragmentManager()));
        PagerSlidingTabStrip pagerSlidingTabStrip = (PagerSlidingTabStrip) findViewById(R.id.tabs);
        pagerSlidingTabStrip.setViewPager(viewPager);

    }

    //return order of the fragments in the viewpager
    public class ItinerariesPagerAdapter extends FragmentPagerAdapter {
        final int PAGE_COUNT = 3;
        final String[] tabTitles = {"Explore", "Saved", "Visited"};
        public ItinerariesPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if ( position==0 ) {
                return new ItineraryListFragment();
            } else if (position == 1) {
                return new ItineraryListFragment();
                //TODO: RETURN SAVED LIST
            } else if (position == 2) {
               return new ItineraryListFragment();
                //TODO: RETURN VISITED LIST
            } else {
                return null;
            }
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            Fragment createdFragment = (Fragment) super.instantiateItem(container, position);
            // save the appropriate reference depending on position
            switch (position) {
                case 0:
                    itineraryListFragment = (ItineraryListFragment) createdFragment;
                    break;
                case 1:
//                    mentionsTimelineFragment = (MentionsTimelineFragment) createdFragment;
                    break;
            }
            return createdFragment;
        }

        @Override
        public CharSequence getPageTitle(int position) {
//            return super.getPageTitle(position);
            return tabTitles[position];
        }

        @Override
        public int getCount() {
            return tabTitles.length;
        }
    }

}
