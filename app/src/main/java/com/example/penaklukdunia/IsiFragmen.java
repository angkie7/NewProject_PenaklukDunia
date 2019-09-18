package com.example.penaklukdunia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IsiFragmen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_isi_fragmen );

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragmenUtama, new FragmenSatu());
        ft.commit();

        Button terserah = (Button) findViewById( R.id.btnSimpan );
        terserah.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fragmenUtama, new FragmenDua());
                ft.commit();
            }


        } );

        Button sembarang = (Button) findViewById( R.id.btnTambah );
        sembarang.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace( R.id.fragmenUtama, new FragmenSatu() );
                ft.commit();
            }
        } );

    }
}
