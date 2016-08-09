package com.renhui.android.pro_fresco809;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.facebook.drawee.view.SimpleDraweeView;

public class MainActivity extends AppCompatActivity {

    private SimpleDraweeView mSimpleDraweeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSimpleDraweeView = (SimpleDraweeView) findViewById(R.id.simpleDraweeView);

    }
    public void frescoLoaderImageClick(View view){
        String path = "http://i0.hdslb.com/bfs/archive/c249c88ccb50a2c0d6db53c0e141bb0a6d81fd92.jpg";
        mSimpleDraweeView.setImageURI(path);
    }
}
