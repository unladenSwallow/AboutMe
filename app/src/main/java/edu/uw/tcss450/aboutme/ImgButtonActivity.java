package edu.uw.tcss450.aboutme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ImgButtonActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img_button);
        ImageView imgView = (ImageView) findViewById(R.id.space_g);
        imgView.setImageResource(R.drawable.space_g);
    }
}
