package com.example.recyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Student> studentList = new ArrayList<Student>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        studentList.add(new Student("1", "Leena", "Female", R.drawable.f));
        studentList.add(new Student("2", "Peeter", "Male", R.drawable.m));
        studentList.add(new Student("3", "Roozi", "Female",R.drawable.f));
        studentList.add(new Student("4", "Hiba", "Female", R.drawable.f));
        studentList.add(new Student("5", "Burhan", "Male", R.drawable.m));
        studentList.add(new Student("1", "Leena", "Female",R.drawable.f));
        studentList.add(new Student("2", "Peeter", "Male",R.drawable.m));
        studentList.add(new Student("3", "Roozi", "Female",R.drawable.f));
        studentList.add(new Student("4", "Hiba", "Female", R.drawable.f));
        studentList.add(new Student("5", "Burhan", "Male", R.drawable.m));
        studentList.add(new Student("1", "Leena", "Female",R.drawable.f));
        studentList.add(new Student("2", "Peeter", "Male",R.drawable.m));
        studentList.add(new Student("3", "Roozi", "Female",R.drawable.f));
        studentList.add(new Student("4", "Hiba", "Female", R.drawable.f));
        studentList.add(new Student("5", "Burhan", "Male", R.drawable.m));
        studentList.add(new Student("1", "Leena", "Female",R.drawable.f));
        studentList.add(new Student("2", "Peeter", "Male",R.drawable.m));
        studentList.add(new Student("3", "Roozi", "Female",R.drawable.f));
        studentList.add(new Student("4", "Hiba", "Female", R.drawable.f));
        studentList.add(new Student("5", "Burhan", "Male", R.drawable.m));

    }


}