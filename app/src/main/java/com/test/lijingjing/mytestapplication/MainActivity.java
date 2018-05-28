package com.test.lijingjing.mytestapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button button1 = null;

    public static final String DATE_FORMAT_NOW = "yyyy-MM-dd hh:mm:ss";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 =(Button)findViewById((R.id.MyButton));
        button1.setOnClickListener(new MyButtonListener());

        //打开日历页面
        Button btToWeek = (Button)findViewById(R.id.btnToWeek);
        btToWeek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(intent);
            }
        });

        //打开Grid测试页面
        Button btToGrid =(Button)findViewById(R.id.btnToGrid);
        btToGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main4Activity.class);
                startActivity(intent);
            }
        });
    }

    class  MyButtonListener implements View.OnClickListener {
        public void onClick(View view){
            //Toast.makeText(MainActivity.this,"欢迎使用安卓",Toast.LENGTH_SHORT);
//            Calendar cal =Calendar.getInstance();
//            SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
//            String text = "欢迎使用安卓" +  sdf.format(cal.getTime());
            String text ="欢迎使用安卓";


            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(intent);

        }
    }
}

