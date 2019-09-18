package com.example.penaklukdunia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        Button terserah = (Button) findViewById( R.id.mahasiswa );
        terserah.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent barbar = new Intent( MainActivity.this, IsiFragmen.class );
                startActivity( barbar );
            }


        } );
    }
}
