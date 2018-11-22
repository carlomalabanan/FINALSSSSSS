package com.example.cloud.project;

import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {

    Toolbar mToolbar;
    ImageView mImageView;
    Button showBut;
    MyHelper myDb;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mToolbar = (Toolbar) findViewById(R.id.toolbar2);
        mImageView = (ImageView) findViewById(R.id.imageView2);
        showBut = (Button) findViewById(R.id.showButton);
        tv = (TextView) findViewById(R.id.tv);
        Bundle mBundle = getIntent().getExtras();
        if (mBundle != null) {
            mToolbar.setTitle(mBundle.getString("countryName"));
            mImageView.setImageResource(mBundle.getInt("countryFlag"));

        }
        showBut.setOnClickListener(this);
        viewAll();


    }

//    public void viewAll(){
//
//        showBut.setOnClickListener( new View.OnClickListener() {
//            @Override
//            public void onClick (View v){
//                Cursor res = myDb.getAllData();
//                if (res.getCount() == 0){
//                    showMessage("Error", "no data found.");
//
//                    return;
//                }
//
//                StringBuffer buffer= new StringBuffer();
//                while (res.moveToNext()){
//                    buffer.append("ID:" + res.getString(0 ) +"\n");
//                    buffer.append("Name" + res.getString(1 ) +"\n");
//                    buffer.append("History:" + res.getString(2 ) +"\n");
//                    buffer.append("Departments:" + res.getString(3 ) +"\n\n");
//
//                }
//                showMessage("Data ",buffer.toString());
//            }
//        });
//
//
//    }

    public void showMessage ( String title, String Message ){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }

    @Override
    public void onClick(View v) {
        int viewId=v.getId();
        if(viewId==R.id.showButton){
            str_name = et_
        }
    }
}


