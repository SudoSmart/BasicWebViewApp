package com.tosin.healthee;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class customListAdapter extends ArrayAdapter<Object> {


    private final Activity context;
    private final String[] maintitle;
    private final String[] subtitle;
    private final Integer[] imgid;

    public customListAdapter(Activity context, String[] maintitle, String[] subtitle, Integer[] imgid) {
        super(context, R.layout.list_layout, maintitle);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.maintitle=maintitle;
        this.subtitle=subtitle;
        this.imgid=imgid;

    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.list_layout, null,true);

        TextView titleText = (TextView) rowView.findViewById(R.id.title);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView subtitleText = (TextView) rowView.findViewById(R.id.subtitle);

        if(position==0 || position ==6){
            //rowView.setPadding(40,20,0,2);
            LinearLayout l = (LinearLayout)rowView.findViewById(R.id.listLinear);
            l.setPadding(20 ,0,0,0);
            LinearLayout topL = (LinearLayout)rowView.findViewById(R.id.mainListLinear);
            topL.setPadding(40,20,0,0);
            imageView.requestLayout();
            imageView.getLayoutParams().height = 100;
            imageView.getLayoutParams().width = 100;
            titleText.setTextSize(40);
            titleText.setPadding(0,0,0,0);

            LinearLayout imageLinear = (LinearLayout) rowView.findViewById(R.id.imageListLinear);
            imageLinear.setPadding(0,20,10,0);


        }



        titleText.setText(maintitle[position]);
        imageView.setImageResource(imgid[position]);
        subtitleText.setText(subtitle[position]);





        return rowView;

    }
}
