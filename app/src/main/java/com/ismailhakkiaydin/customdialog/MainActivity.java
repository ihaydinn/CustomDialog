package com.ismailhakkiaydin.customdialog;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.showDialog(0);
    }

    protected Dialog onCreateDialog(int id){

        final Dialog dlg = new Dialog(this);
        dlg.setTitle("Connect to Server");

        LayoutInflater li = this.getLayoutInflater();
        View view = li.inflate(R.layout.activity_main, null);
        dlg.setContentView(view);

        dlg.findViewById(R.id.btnConnect).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dlg.dismiss();
            }
        });

        return dlg;
    }


}
