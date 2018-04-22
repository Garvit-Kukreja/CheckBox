package com.example.garvit.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
   ArrayList<String> selection=new ArrayList<>();
   TextView Cart;
    public void SelectItem(View view){
        boolean checked=((CheckBox)view ).isChecked();
        switch (view.getId()){
            case R.id.TheVerdict:
                if(checked){
                    selection.add("The Verdict");
                }
                else {
                    selection.remove("The Verdict");
                }break;
            case R.id.yoyo:
                if(checked){
                    selection.add("YO YO");
                }
                else {
                    selection.remove("YO YO");
                }break;
            case R.id.OllietheOwl:
                if(checked){
                    selection.add("Ollie the Owl");
                }
                else {
                    selection.remove("Ollie the Owl");
                }break;
            case R.id.GLTCWalnutToyFarm:
                if(checked){
                    selection.add("GLTC Walnut Toy Farm");
                }
                else {
                    selection.remove("GLTC Walnut Toy Farm");
                }break;

        }

    }
    public void result(View view){
        String FinalResult="";
        for(String selections:selection){
            FinalResult=FinalResult+selections +"\n";
        }
        Cart.setText(FinalResult);
        Cart.setVisibility(View.VISIBLE);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Cart=(TextView)findViewById(R.id.cart);
        Cart.setVisibility(View.INVISIBLE);
    }

    }

