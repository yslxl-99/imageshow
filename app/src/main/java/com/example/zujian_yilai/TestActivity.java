package com.example.zujian_yilai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class TestActivity extends AppCompatActivity {
    List<String> list;
    private Button btn_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        btn_show = findViewById(R.id.btn_show);
        list = new ArrayList<>();
        list.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1600697878896&di=a14fe356c7c3f9c15fff21866431a75b&imgtype=0&src=http%3A%2F%2Fimg.name2012.com%2Fuploads%2Fallimg%2F180315%2F21222Jc8-2.jpg");
        list.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1600699877950&di=3e1169c60781223513bce9be01f53284&imgtype=0&src=http%3A%2F%2Fpic.qqtn.com%2Fup%2F2018-3%2F15205728633274274.jpg");
        list.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1600699937067&di=924e1e02bec7f495969d0e26077e6b83&imgtype=0&src=http%3A%2F%2Fimage.biaobaiju.com%2Fuploads%2F20180802%2F02%2F1533149504-jGNIMOayuq.jpg");
        btn_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnOnClick();
            }
        });
    }

    public void btnOnClick() {
        Intent intent = new Intent();
        intent.setAction("imgeshowactivity");
        intent.putStringArrayListExtra("list", (ArrayList<String>) list);
        startActivity(intent);
    }
}