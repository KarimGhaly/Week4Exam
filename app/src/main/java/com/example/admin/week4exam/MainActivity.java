package com.example.admin.week4exam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivityTAG";
    List<String> strList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Integer> array = new ArrayList<>();
        array.add(2);
        array.add(8);
        array.add(9);
        array.add(3);
        array.add(4);
        array.add(3);
        array.add(2);
        array.add(6);
        array.add(6);
        array.add(2);
        array.add(4);
        array.add(9);
        array.add(8);
        OrderArray(array);
        for (Integer i : newList)
        {
            Log.d(TAG, "onCreate: "+i);
        }
        for(String S: MixStrings("frog"))
        {
            Log.d(TAG, "onCreate: "+S);
        }

    }

    private ArrayList<String> MixStrings(String str){
        ArrayList<String> s = new ArrayList<String>();
        int length = str.length();
        String sub;
        for (int i=0; i<length; i++){
            for (int j=0; j<length-i; j++){
                sub = str.substring(i, i+j+1);
                s.add(sub);
            }
        }

        return s;
    }
    List<Integer> newList = new ArrayList<>();
    private void OrderArray(List<Integer> arraylist) {
        if (arraylist.size() > 0) {
            int Postition=0;
            int Min = arraylist.get(0);

            for (int i = 0; i < arraylist.size(); i++) {
                if (arraylist.get(i) < Min) {
                    Min = arraylist.get(i);
                    Postition = i;
                }
            }
                newList.add(Min);
                arraylist.remove(Postition);
                OrderArray(arraylist);
            }
        }


}
