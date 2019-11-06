package com.example.georgevio.sqlinew;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity {
    //DBHelper mydb;
    DBHelper mydb;
    Student student;
    ListView listView;
    ArrayList<Student> studentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        mydb = new DBHelper(this);
        studentList = new ArrayList<>();
        Cursor data = mydb.getListContents();
        //  ArrayList<String> getData =getIntent().getExtras().getStringArrayList("fetchAll");
        int numRows = data.getCount();
        if(numRows == 0){
            Toast.makeText(ResultActivity.this,"The Database is empty  :(.",Toast.LENGTH_LONG).show();
        }else{
            int i=0;
            while(data.moveToNext()){
                student = new Student(data.getString(1),data.getString(2),data.getString(3),data.getString(4));
               studentList.add(i,student);
                System.out.println(data.getString(1)+" "+data.getString(2)+" "+data.getString(3)+" "+data.getString(4));
                System.out.println(studentList.get(i).getName());
                i++;
            }
            CustomListView adapterview =  new CustomListView(this,R.layout.listview_row, studentList);
            listView = (ListView) findViewById(R.id.listView);
            listView.setAdapter(adapterview);
        }

    }
}
