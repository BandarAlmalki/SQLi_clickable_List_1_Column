package com.example.georgevio.sqlinew;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListView extends ArrayAdapter<Student> {
    private LayoutInflater mInflater;
    private ArrayList<Student> studentsList;
    private int mViewResourceId;

    public CustomListView(Context context, int textViewResourceId, ArrayList<Student> students) {
        super(context, textViewResourceId, students);
        this.studentsList = students;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mViewResourceId = textViewResourceId;
    }


    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = mInflater.inflate(mViewResourceId, null);

        Student student = studentsList.get(position);

        if (student != null) {
            TextView Name = (TextView) convertView.findViewById(R.id.FirstText);
            TextView phone = (TextView) convertView.findViewById(R.id.SecondText);
            TextView emile = (TextView) convertView.findViewById(R.id.ThirdText);
            TextView street = (TextView) convertView.findViewById(R.id.FourthText);
            if (Name != null) {
                Name.setText(student.getName());
            }
            if (phone != null) {
                phone.setText((student.getPhone()));
            }

            if (emile != null) {
                emile.setText((student.getEmail()));
            }
            if (street != null) {
                street.setText((student.getStreet()));
            }
        }

        return convertView;
    }
}
/*{

    private ArrayList<String> listData;
    private LayoutInflater layoutInflater;
    private Context context;

    // Constructor
    public CustomListView(Context context, ArrayList<String> listData) {
        this.listData = listData;
        layoutInflater = LayoutInflater.from(context);
        this.context = context;
    }

    public int getCount() {
        return listData.size();
    }

    public Object getItem(int position) {
        return listData.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        //      int type = getItemViewType(position);

        if (convertView == null) {

            convertView = layoutInflater.inflate(R.layout.listview_row, null);
            holder = new ViewHolder();

            holder.FirstText = (TextView) convertView.findViewById(R.id.FirstText);
            holder.SecondText = (TextView) convertView.findViewById(R.id.SecondText);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.FirstText.setText("JOPH");
        holder.SecondText.setText("44");

        return convertView;
    }

    static class ViewHolder {
        TextView FirstText;
        TextView SecondText;
    }
}*/
