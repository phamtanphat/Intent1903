package com.ptp.phamtanphat.intent1903;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.textview);

        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                anotation :  chu thich
                //1 : Gui dang chuoi
//                int[] mangso = {1,2,3,4,5,6,7,8,9};
//
//                Send(mangso);
//                Intent intent = new Intent(MainActivity.this,ManhinhActivity.class);
//
//                Bundle bundle = new Bundle();
//                bundle.putInt(Key.so,10);
//                bundle.putString(Key.chuoi,"Chuoi");
//
//                intent.putExtra("Bundle",bundle);
//                startActivity(intent);
                Sinhvien sinhvien = new Sinhvien("Nguyen Van A",20);
                ArrayList<Sinhvien> mangsinhvien = new ArrayList<>();
                mangsinhvien.add(sinhvien);

                Send(mangsinhvien);
//                    Intent intent = new Intent(MainActivity.this,ManhinhActivity.class);
//                    intent.putExtra(Key.object,mangsinhvien);
//                    startActivity(intent);
            }
        });
    }
    public <T> void Send(T value){
        Intent intent = new Intent(MainActivity.this,ManhinhActivity.class);
        if (value instanceof String){
            intent.putExtra(Key.chuoi,(String) value);
        }
        if (value instanceof Integer){
            intent.putExtra(Key.so,(Integer) value);
        }
        if (value instanceof int[]){
            intent.putExtra(Key.intarray,(int[]) value);
        }
        if (value instanceof ArrayList<?>){
            if (value instanceof Object){
                intent.putExtra(Key.object,(ArrayList<Sinhvien>)value);
            }
        }
        startActivity(intent);
    }

}
