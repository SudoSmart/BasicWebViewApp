package com.tosin.healthee.ui.home;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.tosin.healthee.MainActivity;
import com.tosin.healthee.R;
import com.tosin.healthee.WebFragment;
import com.tosin.healthee.customListAdapter;

public class HomeFragment extends Fragment {



    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        String[] maintitle ={
                "Nutrition",
                "Mushroom-Quinoa Burger",
                "Tofu Pad Thai",
                "Zucchanoush",
                "Creamy Roasted Squash Puree",
                "What Is a Mendiant? Everything You Need to Know About the Chocolate Treat" ,


                "Wellness",
                "How to Lose Weight Faster, But Safely",
                "My Husband and I Plan Our Whole Lives Around My Chronic Paranoid Schizophrenia",
                "The 15 Best Foods to Eat When You Have the Flu",
                "The Truth About Biotin's Potential Health Benefits and Side Effects",
                "7 Self-Help Strategies For When You're Overwhelmed, According to Psychologists"





        };

        String[] subtitle ={
                "",
                "2 days ago",
                "2 days ago",
                "2 days ago",
                "2 days ago",
                "2 days ago",
                "",
                "2 days ago",
                "2 days ago",
                "2 days ago",
                "2 days ago",
                "2 days ago"
        };

        Integer[] imgid={
                R.drawable.food,
                R.drawable.vegan1,
                R.drawable.vegan2,
                R.drawable.vegan3,
                R.drawable.vegan4,
                R.drawable.vegan5,

                R.drawable.healthy,
                R.drawable.health1,
                R.drawable.health2,
                R.drawable.health3,
                R.drawable.health4,
                R.drawable.health5

        };
        ListView mainListView  = (ListView)root.findViewById(R.id.mainListView);
        customListAdapter adapter = new customListAdapter(getActivity() , maintitle , subtitle , imgid);
        mainListView.setAdapter((adapter));




        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                Fragment fragment = null;
                // TODO Auto-generated method stub
                if(position == 0) {


                }
                else if(position == 1) {
                    String url = "https://www.goodhousekeeping.com/food-recipes/a38846/mushroom-quinoa-burger-recipe/";
                    Intent intent = new Intent(getActivity(), ActivityWebPreview.class);
                    intent.putExtra("URL" , url);
                    startActivity(intent);


                }

                else if(position ==2) {
                    String url = "https://www.goodhousekeeping.com/food-recipes/easy/a48188/tofu-pad-thai-recipe/";
                    Intent intent = new Intent(getActivity(), ActivityWebPreview.class);
                    intent.putExtra("URL" , url);
                    startActivity(intent);

                }

                else if(position == 3) {

                    String url = "https://www.goodhousekeeping.com/food-recipes/easy/a28507046/zucchanoush-recipe/";
                    Intent intent = new Intent(getActivity(), ActivityWebPreview.class);
                    intent.putExtra("URL" , url);
                    startActivity(intent);
                }
                else if(position == 4) {

                    String url = "https://www.goodhousekeeping.com/food-recipes/a29428413/butternut-squash-puree-recipe/";
                    Intent intent = new Intent(getActivity(), ActivityWebPreview.class);
                    intent.putExtra("URL" , url);
                    startActivity(intent);
                }
                else if(position == 5) {

                    String url = "https://www.goodhousekeeping.com/food-recipes/a29475257/what-is-a-mendiant/";
                    Intent intent = new Intent(getActivity(), ActivityWebPreview.class);
                    intent.putExtra("URL" , url);
                    startActivity(intent);
                }
                else if(position == 6) {

                }
                else if(position == 7) {

                    String url = "https://www.goodhousekeeping.com/health/diet-nutrition/advice/a17162/lose-weight-faster-karas-0302/";
                    Intent intent = new Intent(getActivity(), ActivityWebPreview.class);
                    intent.putExtra("URL" , url);
                    startActivity(intent);
                }
                else if(position == 8) {

                    String url = "https://www.goodhousekeeping.com/health/a29519180/living-with-schizophrenia-disorder/";
                    Intent intent = new Intent(getActivity(), ActivityWebPreview.class);
                    intent.putExtra("URL" , url);
                    startActivity(intent);
                }
                else if(position == 9) {

                    String url = "https://www.goodhousekeeping.com/health/diet-nutrition/g29685240/best-food-for-flu/";
                    Intent intent = new Intent(getActivity(), ActivityWebPreview.class);
                    intent.putExtra("URL" , url);
                    startActivity(intent);
                }else if(position == 10) {

                    String url = "https://www.goodhousekeeping.com/health/a29089397/biotin-side-effects-benefits/";
                    Intent intent = new Intent(getActivity(), ActivityWebPreview.class);
                    intent.putExtra("URL" , url);
                    startActivity(intent);
                }else if(position == 11) {

                    String url = "https://www.goodhousekeeping.com/health/a28763022/7-self-help-strategies-for-when-you-feel-overwhelmed/";
                    Intent intent = new Intent(getActivity(), ActivityWebPreview.class);
                    intent.putExtra("URL" , url);
                    startActivity(intent);
                }



            }
        });



        return root;
    }
}