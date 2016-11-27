package com.example.e450c.lvmama.activity;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.e450c.lvmama.R;
import com.example.e450c.lvmama.utils.CodeUtils;

public class LoginAcitivity extends AppCompatActivity {

    CodeUtils codeUtils;

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_acitivity);
        imageView = (ImageView) findViewById(R.id.check);
        codeUtils = CodeUtils.getInstance();
        Bitmap bitmap = codeUtils.createBitmap(getApplicationContext());
        imageView.setImageBitmap(bitmap);
    }




}
