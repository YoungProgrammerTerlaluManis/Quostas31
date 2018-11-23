package com.blogspot.yourfavoritekaisar.quostas31;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnQuots)
    public void onViewClicked() {
        Intent pindah = new Intent(MainActivity.this, tumblrActivity.class);
        startActivity(pindah);
    }
}
