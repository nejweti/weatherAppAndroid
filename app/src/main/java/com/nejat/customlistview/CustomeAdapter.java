package com.nejat.customlistview;

import android.content.Context;
import android.provider.ContactsContract;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.LayoutInflaterCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by user on 11/1/2017.
 */

public class CustomeAdapter extends ArrayAdapter<DataModel> {
    ArrayList<DataModel> dataSet;
    Context mcontext;

    public CustomeAdapter(Context context, ArrayList<DataModel> data) {
        super(context,R.layout.row_item,data);
        this.dataSet = data;
        this.mcontext = context;
    }

    private static class ViewHolder{
        TextView city;
        TextView temp;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder = new ViewHolder();
        Object object = getItem(position);
        DataModel dataModel =(DataModel) object;

        LayoutInflater inflater = LayoutInflater.from(getContext());

        convertView = inflater.inflate(R.layout.row_item,parent,false);

        viewHolder.city = (TextView) convertView.findViewById(R.id.city);
        viewHolder.temp = (TextView) convertView.findViewById(R.id.temp);

        viewHolder.city.setText(dataModel.getCity());
        viewHolder.temp.setText(dataModel.getTemp());



        return convertView;
    }


}
