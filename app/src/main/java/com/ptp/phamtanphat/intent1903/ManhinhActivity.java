package com.ptp.phamtanphat.intent1903;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class ManhinhActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinh);
        Intent intent = getIntent();
//        String chuoi = intent.getStringExtra(Key.chuoi);
//        int so = intent.getIntExtra(Key.so,0);
//        int[] intarrays = intent.getIntArrayExtra(Key.intarray);
////        for (Kieu du lieu trong mang : mang can in ra)
//        Bundle bundle = intent.getBundleExtra("Bundle");
//        String chuoi1 = bundle.getString(Key.chuoi);
//        int so1 = bundle.getInt(Key.so);

        ArrayList<Sinhvien> mangsinhvien = intent.getParcelableArrayListExtra(Key.object);
        Log.d("BBB",mangsinhvien.get(0).getTen());
    }
}
