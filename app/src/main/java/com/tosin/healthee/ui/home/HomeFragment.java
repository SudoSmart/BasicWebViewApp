package com.tosin.healthee.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.tosin.healthee.R;
import com.tosin.healthee.customListAdapter;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        String[] maintitle ={
                "Mushroom-Quinoa Burger",
                "Tofu Pad Thai",
                "10 Things to Know About Anxiety",
                "10 health benefits of daily yoga practice" ,
                "Zucchanoush",
                "Creamy Roasted Squash Puree",
                "9 Ways Practicing Yoga Benefits Your Health and Well-Being",
                "What Is a Mendiant? Everything You Need to Know About the Chocolate Treat" ,


        };

        String[] subtitle ={
                "2 days ago",
                "2 days ago",
                "2 days ago",
                "2 days ago",
                "2 days ago",
                "2 days ago",
                "2 days ago",
                "2 days ago"
        };

        Integer[] imgid={
                R.drawable.vegan1,R.drawable.vegan2,
                R.drawable.mentalhealth,
                R.drawable.yoga1,R.drawable.vegan3,
                R.drawable.vegan4,
                R.drawable.yoga2,
                R.drawable.vegan5
        };
        ListView mainListView  = (ListView)root.findViewById(R.id.mainListView);
        customListAdapter adapter = new customListAdapter(getActivity() , maintitle , subtitle , imgid);
        mainListView.setAdapter((adapter));


        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                // TODO Auto-generated method stub
                if(position == 0) {
                    String url = "https://www.goodhousekeeping.com/food-recipes/a38846/mushroom-quinoa-burger-recipe/";
                    //Intent intent = new Intent(getApplicationContext(), openPage.class);
                    //startActivity(intent);
                }

                else if(position == 1) {
                    //code specific to 2nd list item
                    Toast.makeText(getActivity().getApplicationContext(),"Place Your Second Option Code",Toast.LENGTH_SHORT).show();
                }

                else if(position == 2) {

                    Toast.makeText(getActivity().getApplicationContext(),"Place Your Third Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 3) {

                    Toast.makeText(getActivity().getApplicationContext(),"Place Your Forth Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 4) {

                    Toast.makeText(getActivity().getApplicationContext(),"Place Your Fifth Option Code",Toast.LENGTH_SHORT).show();
                }

            }
        });



        return root;
    }
}