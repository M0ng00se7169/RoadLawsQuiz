package com.quizapp.nickp.naukaprawjazdy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnNauka, btnTesty, btnEgzamin, btnStatystyki, btnUstawienia, btnWyszukajPytanie,
           btnEkurs, btnSubskrypcja, btnOnas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNauka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learnActivity = new Intent(MainActivity.this, LearnActivity.class);
                startActivity(learnActivity);
                finish();
            }
        });

        btnTesty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent testsActivity = new Intent(MainActivity.this, TestsActivity.class);
                startActivity(testsActivity);
                finish();
            }
        });

        btnEgzamin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent egzaminActivity = new Intent(MainActivity.this, EgzaminActivity.class);
                startActivity(egzaminActivity);
                finish();
            }
        });

        btnStatystyki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent statsActivity = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(statsActivity);
                finish();
            }
        });

        btnUstawienia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent settingsActivity = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(settingsActivity);
                finish();
            }
        });

        btnWyszukajPytanie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent searchActivity = new Intent(MainActivity.this, SearchQuestionActivity.class);
                startActivity(searchActivity);
                finish();
            }
        });

        btnEkurs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ekursActivity = new Intent(MainActivity.this, EkursActivity.class);
                startActivity(ekursActivity);
                finish();
            }
        });

        btnSubskrypcja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent subscriptionActivity = new Intent(MainActivity.this, SubscriptionActivity.class);
                startActivity(subscriptionActivity);
                finish();
            }
        });

        btnOnas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aboutActivity = new Intent(MainActivity.this, AboutUsActivity.class);
                startActivity(aboutActivity);
                finish();
            }
        });
    }
}
