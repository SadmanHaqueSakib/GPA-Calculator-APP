package com.example.gpacalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;


public class Calculator extends AppCompatActivity {

    Spinner spinner1, spinner2, spinner3, spinner4, spinner5, spinner6, spinner7, spinner8, spinner9, spinner10, spinner11, spinner12, spinner13, spinner14, spinner15, spinner16, spinner17;
    Spinner spinner18, spinner19, spinner20, spinner21, spinner22, spinner23, spinner24, spinner25, spinner26, spinner27, spinner28, spinner29, spinner30, spinner31, spinner32, spinner33;
    Spinner spinner34, spinner35, spinner36, spinner37, spinner38, spinner39, spinner40, spinner41, spinner42, spinner43, spinner44, spinner45, spinner46, spinner47, spinner48, spinner49;
    TextView display_data, display_data1, display_data2, display_data3, display_data4, display_data5, display_data6, display_data7, totalgpa;
    FloatingActionButton floatingActionButton;
    LinearLayout phy119, cse441, pev107, fst700, pes317, cse332, cse322, cse224;

    SharedPreferences LastSelect;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES){
            setTheme(R.style.Theme_Dark);

        }else{
            setTheme(R.style.Theme_Light);
        }
        setContentView(R.layout.activity_calculator);

        LastSelect = getSharedPreferences("LastSetting", Context.MODE_PRIVATE);
        editor=LastSelect.edit();

        totalgpa=findViewById(R.id.totalgpa);

        floatingActionButton=findViewById(R.id.floating);

        ArrayList<SpinnerGrades> gradeList= new ArrayList<SpinnerGrades>();
        gradeList.add(new SpinnerGrades("10","O"));
        gradeList.add(new SpinnerGrades("9","A+"));
        gradeList.add(new SpinnerGrades("8","A"));
        gradeList.add(new SpinnerGrades("7","B+"));
        gradeList.add(new SpinnerGrades("6","B"));
        gradeList.add(new SpinnerGrades("5","C"));
        gradeList.add(new SpinnerGrades("4","D"));
        gradeList.add(new SpinnerGrades("0","E/F/G"));

        ArrayAdapter<SpinnerGrades> spinnerAdapter = new ArrayAdapter<SpinnerGrades>(Calculator.this,
                android.R.layout.simple_spinner_dropdown_item,gradeList);

        final float[] sub1 = {0};
        final float[] sub2 = {0};
        final float[] sub3 = {0};
        final float[] sub4 = {0};
        final float[] sub5 = {0};
        final float[] sub6 = {0};
        final float[] sub7 = {0};
        final float[] sub8 = {0};

        final float[] sub9 = {0};
        final float[] sub10 = {0};
        final float[] sub11 = {0};
        final float[] sub12 = {0};
        final float[] sub13 = {0};
        final float[] sub14 = {0};
        final float[] sub15 = {0};
        final float[] sub16 = {0};
        final float[] sub17 = {0};

        final float[] sub18 = {0};
        final float[] sub19 = {0};
        final float[] sub20 = {0};
        final float[] sub21 = {0};
        final float[] sub22 = {0};
        final float[] sub23 = {0};
        final float[] sub24 = {0};

        final float[] sub25 = {0};
        final float[] sub26 = {0};
        final float[] sub27 = {0};
        final float[] sub28 = {0};
        final float[] sub29 = {0};
        final float[] sub30 = {0};
        final float[] sub31 = {0};
        final float[] sub32 = {0};
        final float[] sub33 = {0};

        final float[] sub34 = {0};
        final float[] sub35 = {0};
        final float[] sub36 = {0};
        final float[] sub37 = {0};
        final float[] sub38 = {0};
        final float[] sub39 = {0};

        final float[] sub40 = {0};
        final float[] sub41 = {0};
        final float[] sub42 = {0};
        final float[] sub43 = {0};
        final float[] sub44 = {0};
        final float[] sub45 = {0};

        final float[] sub46 = {0};
        final float[] sub47 = {0};
        final float[] sub48 = {0};

        final float[] sub49 = {0};

        //SEMESTER1----------------------------------------------------------------------------------------------------------------------------------!

        display_data=findViewById(R.id.displayterm1);

        spinner1=findViewById(R.id.sub1);
        spinner2=findViewById(R.id.sub2);
        spinner3=findViewById(R.id.sub3);
        spinner4=findViewById(R.id.sub4);
        spinner5=findViewById(R.id.sub5);
        spinner6=findViewById(R.id.sub6);
        spinner7=findViewById(R.id.sub7);
        spinner8=findViewById(R.id.sub8);

        final int Spinner1 = LastSelect.getInt("LastClick1",0);
        final int Spinner2 = LastSelect.getInt("LastClick2",0);
        final int Spinner3 = LastSelect.getInt("LastClick3",0);
        final int Spinner4 = LastSelect.getInt("LastClick4",0);
        final int Spinner5 = LastSelect.getInt("LastClick5",0);
        final int Spinner6 = LastSelect.getInt("LastClick6",0);
        final int Spinner7 = LastSelect.getInt("LastClick7",0);
        final int Spinner8 = LastSelect.getInt("LastClick8",0);

        spinner1.setAdapter(spinnerAdapter);
        spinner1.setSelection(Spinner1);
        spinner2.setAdapter(spinnerAdapter);
        spinner2.setSelection(Spinner2);
        spinner3.setAdapter(spinnerAdapter);
        spinner3.setSelection(Spinner3);
        spinner4.setAdapter(spinnerAdapter);
        spinner4.setSelection(Spinner4);
        spinner5.setAdapter(spinnerAdapter);
        spinner5.setSelection(Spinner5);
        spinner6.setAdapter(spinnerAdapter);
        spinner6.setSelection(Spinner6);
        spinner7.setAdapter(spinnerAdapter);
        spinner7.setSelection(Spinner7);
        spinner8.setAdapter(spinnerAdapter);
        spinner8.setSelection(Spinner8);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick1",position).apply();

                switch (position){
                    case 0:
                        sub1[0] = Integer.parseInt("40");
                        calculateGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub1[0] = Integer.parseInt("36");
                        calculateGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub1[0] = Integer.parseInt("32");
                        calculateGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub1[0] = Integer.parseInt("28");
                        calculateGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub1[0] = Integer.parseInt("24");
                        calculateGpa();;
                        calculateCgpa();
                        break;
                    case 5:
                        sub1[0] = Integer.parseInt("20");
                        calculateGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub1[0] = Integer.parseInt("16");
                        calculateGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub1[0] = Integer.parseInt("0");
                        calculateGpa();
                        calculateCgpa();
                }

            }

            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }

            private void calculateGpa() {
                float credits = 25;
                float total1= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0])/credits;
                display_data.setText(String.valueOf(String.format("%.2f",total1)));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick2",position).apply();

                switch (position){
                    case 0:
                        sub2[0] = Integer.parseInt("30");
                        calculateGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub2[0] = Integer.parseInt("27");
                        calculateGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub2[0] = Integer.parseInt("24");
                        calculateGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub2[0] = Integer.parseInt("21");
                        calculateGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub2[0] = Integer.parseInt("18");
                        calculateGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub2[0] = Integer.parseInt("15");
                        calculateGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub2[0] = Integer.parseInt("12");
                        calculateGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub2[0] = Integer.parseInt("0");
                        calculateGpa();
                        calculateCgpa();
                }
            }

            private void calculateGpa() {
                float credits = 25;
                float total1= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0])/credits;
                display_data.setText(String.valueOf(String.format("%.2f",total1)));
            }

            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick3",position).apply();

                switch (position){
                    case 0:
                        sub3[0] = Integer.parseInt("10");
                        calculateGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub3[0] = Integer.parseInt("9");
                        calculateGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub3[0] = Integer.parseInt("8");
                        calculateGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub3[0] = Integer.parseInt("7");
                        calculateGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub3[0] = Integer.parseInt("6");
                        calculateGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub3[0] = Integer.parseInt("5");
                        calculateGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub3[0] = Integer.parseInt("4");
                        calculateGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub3[0] = Integer.parseInt("0");
                        calculateGpa();
                        calculateCgpa();
                }

            }

            private void calculateGpa() {
                float credits = 25;
                float total1= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0])/credits;
                display_data.setText(String.valueOf(String.format("%.2f",total1)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick4",position).apply();

                switch (position){
                    case 0:
                        sub4[0] = Integer.parseInt("40");
                        calculatorgpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub4[0] = Integer.parseInt("36");
                        calculatorgpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub4[0] = Integer.parseInt("32");
                        calculatorgpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub4[0] = Integer.parseInt("28");
                        calculatorgpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub4[0] = Integer.parseInt("24");
                        calculatorgpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub4[0] = Integer.parseInt("20");
                        calculatorgpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub4[0] = Integer.parseInt("16");
                        calculatorgpa();
                        calculateCgpa();
                        break;
                    default:
                        sub4[0] = Integer.parseInt("0");
                        calculatorgpa();
                        calculateCgpa();
                }
            }

            private void calculatorgpa() {
                float credits = 25;
                float total1= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0])/credits;
                display_data.setText(String.valueOf(String.format("%.2f",total1)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick5",position).apply();

                switch (position){
                    case 0:
                        sub5[0] = Integer.parseInt("10");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub5[0] = Integer.parseInt("9");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub5[0] = Integer.parseInt("8");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub5[0] = Integer.parseInt("7");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub5[0] = Integer.parseInt("6");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub5[0] = Integer.parseInt("5");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub5[0] = Integer.parseInt("4");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub5[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }

            private void calculatorGpa() {
                float credits = 25;
                float total1= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0])/credits;
                display_data.setText(String.valueOf(String.format("%.2f",total1)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick6",position).apply();

                switch (position){
                    case 0:
                        sub6[0] = Integer.parseInt("40");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub6[0] = Integer.parseInt("36");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub6[0] = Integer.parseInt("32");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub6[0] = Integer.parseInt("28");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub6[0] = Integer.parseInt("24");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub6[0] = Integer.parseInt("20");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub6[0] = Integer.parseInt("16");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub6[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }

            private void calculatorGpa() {
                float credits = 25;
                float total1= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0])/credits;
                display_data.setText(String.valueOf(String.format("%.2f",total1)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick7",position).apply();

                switch (position){
                    case 0:
                        sub7[0] = Integer.parseInt("40");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub7[0] = Integer.parseInt("36");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub7[0] = Integer.parseInt("32");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub7[0] = Integer.parseInt("28");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub7[0] = Integer.parseInt("24");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub7[0] = Integer.parseInt("20");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub7[0] = Integer.parseInt("16");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub7[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }

            private void calculatorGpa() {
                float credits = 25;
                float total1= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0])/credits;
                display_data.setText(String.valueOf(String.format("%.2f",total1)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick8",position).apply();

                switch (position){
                    case 0:
                        sub8[0] = Integer.parseInt("40");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub8[0] = Integer.parseInt("36");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub8[0] = Integer.parseInt("32");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub8[0] = Integer.parseInt("28");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub8[0] = Integer.parseInt("24");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub8[0] = Integer.parseInt("20");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub8[0] = Integer.parseInt("16");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub8[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }
            private void calculatorGpa() {
                float credits = 25;
                float total1= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0])/credits;
                display_data.setText(String.valueOf(String.format("%.2f",total1)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        //SEMESTER2----------------------------------------------------------------------------------------------------------------------------------!

        display_data1=findViewById(R.id.displayterm2);
        phy119 = findViewById(R.id.phy119);

        spinner9=findViewById(R.id.sub9);
        spinner10=findViewById(R.id.sub10);
        spinner11=findViewById(R.id.sub11);
        spinner12=findViewById(R.id.sub12);
        spinner13=findViewById(R.id.sub13);
        spinner14=findViewById(R.id.sub14);
        spinner15=findViewById(R.id.sub15);
        spinner16=findViewById(R.id.sub16);
        spinner17=findViewById(R.id.sub17);

        final int Spinner9 = LastSelect.getInt("LastClick9",0);
        final int Spinner10 = LastSelect.getInt("LastClick10",0);
        final int Spinner11 = LastSelect.getInt("LastClick11",0);
        final int Spinner12 = LastSelect.getInt("LastClick12",0);
        final int Spinner13 = LastSelect.getInt("LastClick13",0);
        final int Spinner14 = LastSelect.getInt("LastClick14",0);
        final int Spinner15 = LastSelect.getInt("LastClick15",0);
        final int Spinner16 = LastSelect.getInt("LastClick16",0);
        final int Spinner17 = LastSelect.getInt("LastClick17",0);

        spinner9.setAdapter(spinnerAdapter);
        spinner9.setSelection(Spinner9);
        spinner10.setAdapter(spinnerAdapter);
        spinner10.setSelection(Spinner10);
        spinner11.setAdapter(spinnerAdapter);
        spinner11.setSelection(Spinner11);
        spinner12.setAdapter(spinnerAdapter);
        spinner12.setSelection(Spinner12);
        spinner13.setAdapter(spinnerAdapter);
        spinner13.setSelection(Spinner13);
        spinner14.setAdapter(spinnerAdapter);
        spinner14.setSelection(Spinner14);
        spinner15.setAdapter(spinnerAdapter);
        spinner15.setSelection(Spinner15);
        spinner16.setAdapter(spinnerAdapter);
        spinner16.setSelection(Spinner16);
        spinner17.setAdapter(spinnerAdapter);
        spinner17.setSelection(Spinner17);

        spinner9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick9",position).apply();

                switch (position){
                    case 0:
                        sub9[0] = Integer.parseInt("30");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub9[0] = Integer.parseInt("27");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub9[0] = Integer.parseInt("24");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub9[0] = Integer.parseInt("21");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub9[0] = Integer.parseInt("18");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub9[0] = Integer.parseInt("15");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub9[0] = Integer.parseInt("12");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub9[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }
            private void calculatorGpa() {
                float credits = 26;
                float total2= (sub9[0]+ sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0])/credits;
                display_data1.setText(String.valueOf(String.format("%.2f",total2)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick10",position).apply();

                switch (position){
                    case 0:
                        sub10[0] = Integer.parseInt("10");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub10[0] = Integer.parseInt("9");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub10[0] = Integer.parseInt("8");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub10[0] = Integer.parseInt("7");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub10[0] = Integer.parseInt("6");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub10[0] = Integer.parseInt("5");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub10[0] = Integer.parseInt("4");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub10[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }
            private void calculatorGpa() {
                float credits = 26;
                float total2= (sub9[0]+ sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0])/credits;
                display_data1.setText(String.valueOf(String.format("%.2f",total2)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick11",position).apply();

                switch (position){
                    case 0:
                        sub11[0] = Integer.parseInt("40");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub11[0] = Integer.parseInt("36");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub11[0] = Integer.parseInt("32");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub11[0] = Integer.parseInt("28");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub11[0] = Integer.parseInt("24");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub11[0] = Integer.parseInt("20");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub11[0] = Integer.parseInt("16");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub11[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }
            private void calculatorGpa() {
                float credits = 26;
                float total2= (sub9[0]+ sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0])/credits;
                display_data1.setText(String.valueOf(String.format("%.2f",total2)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner12.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick12",position).apply();

                switch (position){
                    case 0:
                        sub12[0] = Integer.parseInt("10");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub12[0] = Integer.parseInt("9");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub12[0] = Integer.parseInt("8");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub12[0] = Integer.parseInt("7");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub12[0] = Integer.parseInt("6");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub12[0] = Integer.parseInt("5");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub12[0] = Integer.parseInt("4");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub12[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }
            private void calculatorGpa() {
                float credits = 26;
                float total2= (sub9[0]+ sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0])/credits;
                display_data1.setText(String.valueOf(String.format("%.2f",total2)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner13.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick13",position).apply();

                switch (position){
                    case 0:
                        sub13[0] = Integer.parseInt("40");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub13[0] = Integer.parseInt("36");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub13[0] = Integer.parseInt("32");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub13[0] = Integer.parseInt("28");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub13[0] = Integer.parseInt("24");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub13[0] = Integer.parseInt("20");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub13[0] = Integer.parseInt("16");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub13[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }
            private void calculatorGpa() {
                float credits = 26;
                float total2= (sub9[0]+ sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0])/credits;
                display_data1.setText(String.valueOf(String.format("%.2f",total2)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner14.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick14",position).apply();

                switch (position){
                    case 0:
                        sub14[0] = Integer.parseInt("40");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub14[0] = Integer.parseInt("36");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub14[0] = Integer.parseInt("32");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub14[0] = Integer.parseInt("28");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub14[0] = Integer.parseInt("24");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub14[0] = Integer.parseInt("20");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub14[0] = Integer.parseInt("16");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub14[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }
            private void calculatorGpa() {
                float credits = 26;
                float total2= (sub9[0]+ sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0])/credits;
                display_data1.setText(String.valueOf(String.format("%.2f",total2)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner15.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick15",position).apply();

                switch (position){
                    case 0:
                        sub15[0] = Integer.parseInt("40");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub15[0] = Integer.parseInt("36");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub15[0] = Integer.parseInt("32");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub15[0] = Integer.parseInt("28");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub15[0] = Integer.parseInt("24");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub15[0] = Integer.parseInt("20");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub15[0] = Integer.parseInt("16");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub15[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }
            private void calculatorGpa() {
                float credits = 26;
                float total2= (sub9[0]+ sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0])/credits;
                display_data1.setText(String.valueOf(String.format("%.2f",total2)));
            }
            private void calculateCgpa() {
                float totalCredits = 51;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner16.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick16",position).apply();

                switch (position){
                    case 0:
                        sub16[0] = Integer.parseInt("40");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub16[0] = Integer.parseInt("36");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub16[0] = Integer.parseInt("32");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub16[0] = Integer.parseInt("28");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub16[0] = Integer.parseInt("24");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub16[0] = Integer.parseInt("20");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub16[0] = Integer.parseInt("16");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub16[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }
            private void calculatorGpa() {
                float credits = 26;
                float total2= (sub9[0]+ sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0])/credits;
                display_data1.setText(String.valueOf(String.format("%.2f",total2)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner17.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick17",position).apply();

                switch (position){
                    case 0:
                        sub17[0] = Integer.parseInt("10");
                        calculatorGpa();
                        calculateCgpa();
                        changeColor();
                        break;
                    case 1:
                        sub17[0] = Integer.parseInt("9");
                        calculatorGpa();
                        calculateCgpa();
                        changeColor();
                        break;
                    case 2:
                        sub17[0] = Integer.parseInt("8");
                        calculatorGpa();
                        calculateCgpa();
                        changeColor();
                        break;
                    case 3:
                        sub17[0] = Integer.parseInt("7");
                        calculatorGpa();
                        calculateCgpa();
                        changeColor();
                        break;
                    case 4:
                        sub17[0] = Integer.parseInt("6");
                        calculatorGpa();
                        calculateCgpa();
                        changeColor();
                        break;
                    case 5:
                        sub17[0] = Integer.parseInt("5");
                        calculatorGpa();
                        calculateCgpa();
                        changeColor();
                        break;
                    case 6:
                        sub17[0] = Integer.parseInt("4");
                        calculatorGpa();
                        calculateCgpa();
                        changeColor();
                        break;
                    case 7:
                        sub17[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();

                    default:
                        sub17[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                        phy119.setBackgroundColor(R.attr.final_background);

                }
            }

            private void changeColor() {
                phy119.setBackgroundColor(R.attr.background_color_change);
            }

            private void calculatorGpa() {
                float credits = 26;
                float total2= (sub9[0]+ sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0])/credits;
                display_data1.setText(String.valueOf(String.format("%.2f",total2)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //SEMESTER3----------------------------------------------------------------------------------------------------------------------------------!
        display_data2=findViewById(R.id.displayterm3);

        spinner18=findViewById(R.id.sub18);
        spinner19=findViewById(R.id.sub19);
        spinner20=findViewById(R.id.sub20);
        spinner21=findViewById(R.id.sub21);
        spinner22=findViewById(R.id.sub22);
        spinner23=findViewById(R.id.sub23);
        spinner24=findViewById(R.id.sub24);

        final int Spinner18 = LastSelect.getInt("LastClick18",0);
        final int Spinner19 = LastSelect.getInt("LastClick19",0);
        final int Spinner20 = LastSelect.getInt("LastClick20",0);
        final int Spinner21 = LastSelect.getInt("LastClick21",0);
        final int Spinner22 = LastSelect.getInt("LastClick22",0);
        final int Spinner23 = LastSelect.getInt("LastClick23",0);
        final int Spinner24 = LastSelect.getInt("LastClick24",0);

        spinner18.setAdapter(spinnerAdapter);
        spinner18.setSelection(Spinner18);
        spinner19.setAdapter(spinnerAdapter);
        spinner19.setSelection(Spinner19);
        spinner20.setAdapter(spinnerAdapter);
        spinner20.setSelection(Spinner20);
        spinner21.setAdapter(spinnerAdapter);
        spinner21.setSelection(Spinner21);
        spinner22.setAdapter(spinnerAdapter);
        spinner22.setSelection(Spinner22);
        spinner23.setAdapter(spinnerAdapter);
        spinner23.setSelection(Spinner23);
        spinner24.setAdapter(spinnerAdapter);
        spinner24.setSelection(Spinner24);

        spinner18.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick18",position).apply();

                switch (position){
                    case 0:
                        sub18[0] = Integer.parseInt("40");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub18[0] = Integer.parseInt("36");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub18[0] = Integer.parseInt("32");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub18[0] = Integer.parseInt("28");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub18[0] = Integer.parseInt("24");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub18[0] = Integer.parseInt("20");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub18[0] = Integer.parseInt("16");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub18[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }
            private void calculatorGpa() {
                float credits = 22;
                float total3= (sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0])/credits;
                display_data2.setText(String.valueOf(String.format("%.2f",total3)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner19.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick19",position).apply();

                switch (position){
                    case 0:
                        sub19[0] = Integer.parseInt("40");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub19[0] = Integer.parseInt("36");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub19[0] = Integer.parseInt("32");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub19[0] = Integer.parseInt("28");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub19[0] = Integer.parseInt("24");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub19[0] = Integer.parseInt("20");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub19[0] = Integer.parseInt("16");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub19[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }
            private void calculatorGpa() {
                float credits = 22;
                float total3= (sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0])/credits;
                display_data2.setText(String.valueOf(String.format("%.2f",total3)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner20.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick20",position).apply();

                switch (position){
                    case 0:
                        sub20[0] = Integer.parseInt("30");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub20[0] = Integer.parseInt("27");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub20[0] = Integer.parseInt("24");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub20[0] = Integer.parseInt("21");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub20[0] = Integer.parseInt("18");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub20[0] = Integer.parseInt("15");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub20[0] = Integer.parseInt("12");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub20[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }
            private void calculatorGpa() {
                float credits = 22;
                float total3= (sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0])/credits;
                display_data2.setText(String.valueOf(String.format("%.2f",total3)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner21.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick21",position).apply();

                switch (position){
                    case 0:
                        sub21[0] = Integer.parseInt("20");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub21[0] = Integer.parseInt("18");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub21[0] = Integer.parseInt("16");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub21[0] = Integer.parseInt("14");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub21[0] = Integer.parseInt("12");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub21[0] = Integer.parseInt("10");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub21[0] = Integer.parseInt("8");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub21[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }
            private void calculatorGpa() {
                float credits = 22;
                float total3= (sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0])/credits;
                display_data2.setText(String.valueOf(String.format("%.2f",total3)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner22.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick22",position).apply();

                switch (position){
                    case 0:
                        sub22[0] = Integer.parseInt("30");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub22[0] = Integer.parseInt("27");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub22[0] = Integer.parseInt("24");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub22[0] = Integer.parseInt("21");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub22[0] = Integer.parseInt("18");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub22[0] = Integer.parseInt("15");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub22[0] = Integer.parseInt("12");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub22[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }
            private void calculatorGpa() {
                float credits = 22;
                float total3= (sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0])/credits;
                display_data2.setText(String.valueOf(String.format("%.2f",total3)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        spinner23.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick23",position).apply();

                switch (position){
                    case 0:
                        sub23[0] = Integer.parseInt("30");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub23[0] = Integer.parseInt("27");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub23[0] = Integer.parseInt("24");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub23[0] = Integer.parseInt("21");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub23[0] = Integer.parseInt("18");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub23[0] = Integer.parseInt("15");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub23[0] = Integer.parseInt("12");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub23[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }
            private void calculatorGpa() {
                float credits = 22;
                float total3= (sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0])/credits;
                display_data2.setText(String.valueOf(String.format("%.2f",total3)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner24.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick24",position).apply();

                switch (position){
                    case 0:
                        sub24[0] = Integer.parseInt("30");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub24[0] = Integer.parseInt("27");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub24[0] = Integer.parseInt("24");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub24[0] = Integer.parseInt("21");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub24[0] = Integer.parseInt("18");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub24[0] = Integer.parseInt("15");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub24[0] = Integer.parseInt("12");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub24[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }
            private void calculatorGpa() {
                float credits = 22;
                float total3= (sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0])/credits;
                display_data2.setText(String.valueOf(String.format("%.2f",total3)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //SEMESTER4----------------------------------------------------------------------------------------------------------------------------------!

        display_data3=findViewById(R.id.displayterm4);

        spinner25=findViewById(R.id.sub25);
        spinner26=findViewById(R.id.sub26);
        spinner27=findViewById(R.id.sub27);
        spinner28=findViewById(R.id.sub28);
        spinner29=findViewById(R.id.sub29);
        spinner30=findViewById(R.id.sub30);
        spinner31=findViewById(R.id.sub31);
        spinner32=findViewById(R.id.sub32);
        spinner33=findViewById(R.id.sub33);

        final int Spinner25 = LastSelect.getInt("LastClick25",0);
        final int Spinner26 = LastSelect.getInt("LastClick26",0);
        final int Spinner27 = LastSelect.getInt("LastClick27",0);
        final int Spinner28 = LastSelect.getInt("LastClick28",0);
        final int Spinner29 = LastSelect.getInt("LastClick29",0);
        final int Spinner30 = LastSelect.getInt("LastClick30",0);
        final int Spinner31 = LastSelect.getInt("LastClick31",0);
        final int Spinner32 = LastSelect.getInt("LastClick32",0);
        final int Spinner33 = LastSelect.getInt("LastClick33",0);

        spinner25.setAdapter(spinnerAdapter);
        spinner25.setSelection(Spinner25);
        spinner26.setAdapter(spinnerAdapter);
        spinner26.setSelection(Spinner26);
        spinner27.setAdapter(spinnerAdapter);
        spinner27.setSelection(Spinner27);
        spinner28.setAdapter(spinnerAdapter);
        spinner28.setSelection(Spinner28);
        spinner29.setAdapter(spinnerAdapter);
        spinner29.setSelection(Spinner29);
        spinner30.setAdapter(spinnerAdapter);
        spinner30.setSelection(Spinner30);
        spinner31.setAdapter(spinnerAdapter);
        spinner31.setSelection(Spinner31);
        spinner32.setAdapter(spinnerAdapter);
        spinner32.setSelection(Spinner32);
        spinner33.setAdapter(spinnerAdapter);
        spinner33.setSelection(Spinner33);

        spinner25.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick25",position).apply();

                switch (position){
                    case 0:
                        sub25[0] = Integer.parseInt("30");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub25[0] = Integer.parseInt("27");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub25[0] = Integer.parseInt("24");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub25[0] = Integer.parseInt("21");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub25[0] = Integer.parseInt("18");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub25[0] = Integer.parseInt("15");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub25[0] = Integer.parseInt("12");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub25[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }
            private void calculatorGpa() {
                float credits = 25;
                float total4= (sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0])/credits;
                display_data3.setText(String.valueOf(String.format("%.2f",total4)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner26.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick26",position).apply();

                switch (position){
                    case 0:
                        sub26[0] = Integer.parseInt("10");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub26[0] = Integer.parseInt("9");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub26[0] = Integer.parseInt("8");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub26[0] = Integer.parseInt("7");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub26[0] = Integer.parseInt("6");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub26[0] = Integer.parseInt("5");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub26[0] = Integer.parseInt("4");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub26[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }
            private void calculatorGpa() {
                float credits = 25;
                float total4= (sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0])/credits;
                display_data3.setText(String.valueOf(String.format("%.2f",total4)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner27.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick27",position).apply();

                switch (position){
                    case 0:
                        sub27[0] = Integer.parseInt("40");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub27[0] = Integer.parseInt("36");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub27[0] = Integer.parseInt("32");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub27[0] = Integer.parseInt("28");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub27[0] = Integer.parseInt("24");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub27[0] = Integer.parseInt("20");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub27[0] = Integer.parseInt("16");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub27[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }
            private void calculatorGpa() {
                float credits = 25;
                float total4= (sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0])/credits;
                display_data3.setText(String.valueOf(String.format("%.2f",total4)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner28.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick28",position).apply();

                switch (position){
                    case 0:
                        sub28[0] = Integer.parseInt("30");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub28[0] = Integer.parseInt("27");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub28[0] = Integer.parseInt("24");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub28[0] = Integer.parseInt("21");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub28[0] = Integer.parseInt("18");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub28[0] = Integer.parseInt("15");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub28[0] = Integer.parseInt("12");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub28[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }
            private void calculatorGpa() {
                float credits = 25;
                float total4= (sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0])/credits;
                display_data3.setText(String.valueOf(String.format("%.2f",total4)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner29.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick29",position).apply();

                switch (position){
                    case 0:
                        sub29[0] = Integer.parseInt("10");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub29[0] = Integer.parseInt("9");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub29[0] = Integer.parseInt("8");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub29[0] = Integer.parseInt("7");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub29[0] = Integer.parseInt("6");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub29[0] = Integer.parseInt("5");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub29[0] = Integer.parseInt("4");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub29[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }
            private void calculatorGpa() {
                float credits = 25;
                float total4= (sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0])/credits;
                display_data3.setText(String.valueOf(String.format("%.2f",total4)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner30.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick30",position).apply();

                switch (position){
                    case 0:
                        sub30[0] = Integer.parseInt("30");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub30[0] = Integer.parseInt("27");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub30[0] = Integer.parseInt("24");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub30[0] = Integer.parseInt("21");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub30[0] = Integer.parseInt("18");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub30[0] = Integer.parseInt("15");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub30[0] = Integer.parseInt("12");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub30[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }
            private void calculatorGpa() {
                float credits = 25;
                float total4= (sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0])/credits;
                display_data3.setText(String.valueOf(String.format("%.2f",total4)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner31.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick31",position).apply();

                switch (position){
                    case 0:
                        sub31[0] = Integer.parseInt("40");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub31[0] = Integer.parseInt("36");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub31[0] = Integer.parseInt("32");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub31[0] = Integer.parseInt("28");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub31[0] = Integer.parseInt("24");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub31[0] = Integer.parseInt("20");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub31[0] = Integer.parseInt("16");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub31[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }
            private void calculatorGpa() {
                float credits = 25;
                float total4= (sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0])/credits;
                display_data3.setText(String.valueOf(String.format("%.2f",total4)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner32.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick32",position).apply();

                switch (position){
                    case 0:
                        sub32[0] = Integer.parseInt("30");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub32[0] = Integer.parseInt("27");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub32[0] = Integer.parseInt("24");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub32[0] = Integer.parseInt("21");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub32[0] = Integer.parseInt("18");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub32[0] = Integer.parseInt("15");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub32[0] = Integer.parseInt("12");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub32[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }
            private void calculatorGpa() {
                float credits = 25;
                float total4= (sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0])/credits;
                display_data3.setText(String.valueOf(String.format("%.2f",total4)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner33.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick33",position).apply();

                switch (position){
                    case 0:
                        sub33[0] = Integer.parseInt("30");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub33[0] = Integer.parseInt("27");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub33[0] = Integer.parseInt("24");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub33[0] = Integer.parseInt("21");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub33[0] = Integer.parseInt("18");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub33[0] = Integer.parseInt("15");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub33[0] = Integer.parseInt("12");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub33[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }
            private void calculatorGpa() {
                float credits = 25;
                float total4= (sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0])/credits;
                display_data3.setText(String.valueOf(String.format("%.2f",total4)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //SEMESTER5----------------------------------------------------------------------------------------------------------------------------------!
        display_data4=findViewById(R.id.displayterm5);

        pev107 = findViewById(R.id.PEV107);
        cse322 = findViewById(R.id.CSE322);
        cse332 = findViewById(R.id.CSE332);
        cse224 = findViewById(R.id.cse224);

        spinner34=findViewById(R.id.sub34);
        spinner35=findViewById(R.id.sub35);
        spinner36=findViewById(R.id.sub36);
        spinner37=findViewById(R.id.sub37);
        spinner38=findViewById(R.id.sub38);
        spinner39=findViewById(R.id.sub39);

        final int Spinner34 = LastSelect.getInt("LastClick34",0);
        final int Spinner35 = LastSelect.getInt("LastClick35",0);
        final int Spinner36 = LastSelect.getInt("LastClick36",0);
        final int Spinner37 = LastSelect.getInt("LastClick37",0);
        final int Spinner38 = LastSelect.getInt("LastClick38",0);
        final int Spinner39 = LastSelect.getInt("LastClick39",0);

        spinner34.setAdapter(spinnerAdapter);
        spinner34.setSelection(Spinner34);
        spinner35.setAdapter(spinnerAdapter);
        spinner35.setSelection(Spinner35);
        spinner36.setAdapter(spinnerAdapter);
        spinner36.setSelection(Spinner36);
        spinner37.setAdapter(spinnerAdapter);
        spinner37.setSelection(Spinner37);
        spinner38.setAdapter(spinnerAdapter);
        spinner38.setSelection(Spinner38);
        spinner39.setAdapter(spinnerAdapter);
        spinner39.setSelection(Spinner39);

        spinner34.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick34",position).apply();

                switch (position){
                    case 0:
                        sub34[0] = Integer.parseInt("20");
                        calculatorGpa();
                        calculateCgpa();
                        changeColor();
                        break;
                    case 1:
                        sub34[0] = Integer.parseInt("18");
                        calculatorGpa();
                        calculateCgpa();
                        changeColor();
                        break;
                    case 2:
                        sub34[0] = Integer.parseInt("16");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub34[0] = Integer.parseInt("14");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub34[0] = Integer.parseInt("12");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub34[0] = Integer.parseInt("10");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub34[0] = Integer.parseInt("8");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub34[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }

            private void changeColor() {
                cse224.setBackgroundColor(R.attr.background_color_change);
            }

            private void calculatorGpa() {
                float credits = 16;
                float total4= (sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0])/credits;
                display_data4.setText(String.valueOf(String.format("%.2f",total4)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner35.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick35",position).apply();

                switch (position){
                    case 0:
                        sub35[0] = Integer.parseInt("30");
                        calculatorGpa();
                        calculateCgpa();
                        changeColor();
                        break;
                    case 1:
                        sub35[0] = Integer.parseInt("27");
                        calculatorGpa();
                        calculateCgpa();
                        changeColor();
                        break;
                    case 2:
                        sub35[0] = Integer.parseInt("24");
                        calculatorGpa();
                        calculateCgpa();
                        changeColor();
                        break;
                    case 3:
                        sub35[0] = Integer.parseInt("21");
                        calculatorGpa();
                        calculateCgpa();
                        changeColor();
                        break;
                    case 4:
                        sub35[0] = Integer.parseInt("18");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub35[0] = Integer.parseInt("15");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub35[0] = Integer.parseInt("12");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub35[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }

            private void changeColor() {
                cse322.setBackgroundColor(R.attr.background_color_change);
            }

            private void calculatorGpa() {
                float credits = 16;
                float total4= (sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0])/credits;
                display_data4.setText(String.valueOf(String.format("%.2f",total4)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner36.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick36",position).apply();

                switch (position){
                    case 0:
                        sub36[0] = Integer.parseInt("20");
                        calculatorGpa();
                        calculateCgpa();
                        changeColor();
                        break;
                    case 1:
                        sub36[0] = Integer.parseInt("18");
                        calculatorGpa();
                        calculateCgpa();
                        changeColor();
                        break;
                    case 2:
                        sub36[0] = Integer.parseInt("16");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub36[0] = Integer.parseInt("14");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub36[0] = Integer.parseInt("12");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub36[0] = Integer.parseInt("10");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub36[0] = Integer.parseInt("8");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub36[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }

            private void changeColor() {
                cse332.setBackgroundColor(R.attr.background_color_change);
            }

            private void calculatorGpa() {
                float credits = 16;
                float total4= (sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0])/credits;
                display_data4.setText(String.valueOf(String.format("%.2f",total4)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner37.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick37",position).apply();

                switch (position){
                    case 0:
                        sub37[0] = Integer.parseInt("30");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub37[0] = Integer.parseInt("27");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub37[0] = Integer.parseInt("24");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub37[0] = Integer.parseInt("21");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub37[0] = Integer.parseInt("18");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub37[0] = Integer.parseInt("15");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub37[0] = Integer.parseInt("12");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub37[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }
            private void calculatorGpa() {
                float credits = 16;
                float total4= (sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0])/credits;
                display_data4.setText(String.valueOf(String.format("%.2f",total4)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner38.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick38",position).apply();

                switch (position){
                    case 0:
                        sub38[0] = Integer.parseInt("30");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub38[0] = Integer.parseInt("27");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub38[0] = Integer.parseInt("24");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub38[0] = Integer.parseInt("21");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub38[0] = Integer.parseInt("18");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub38[0] = Integer.parseInt("15");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub38[0] = Integer.parseInt("12");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub38[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }
            private void calculatorGpa() {
                float credits = 16;
                float total4= (sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0])/credits;
                display_data4.setText(String.valueOf(String.format("%.2f",total4)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner39.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick39",position).apply();

                switch (position){
                    case 0:
                        sub39[0] = Integer.parseInt("30");
                        calculatorGpa();
                        calculateCgpa();
                        changeColor();
                        break;
                    case 1:
                        sub39[0] = Integer.parseInt("27");
                        calculatorGpa();
                        calculateCgpa();
                        changeColor();
                        break;
                    case 2:
                        sub39[0] = Integer.parseInt("24");
                        calculatorGpa();
                        calculateCgpa();
                        changeColor();
                        break;
                    case 3:
                        sub39[0] = Integer.parseInt("21");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub39[0] = Integer.parseInt("18");
                        calculatorGpa();
                        calculateCgpa();
                        changeColor();
                        break;
                    case 5:
                        sub39[0] = Integer.parseInt("15");
                        calculatorGpa();
                        calculateCgpa();
                        changeColor();
                        break;
                    case 6:
                        sub39[0] = Integer.parseInt("12");
                        calculatorGpa();
                        calculateCgpa();
                        changeColor();
                        break;
                    default:
                        sub39[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                        changeColor();
                }
            }

            private void changeColor() {
                pev107.setBackgroundColor(R.attr.background_color_change);
            }

            private void calculatorGpa() {
                float credits = 16;
                float total4= (sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0])/credits;
                display_data4.setText(String.valueOf(String.format("%.2f",total4)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        //SEMESTER6----------------------------------------------------------------------------------------------------------------------------------!
        display_data5=findViewById(R.id.displayterm6);

        pes317= findViewById(R.id.PES317);

        spinner40=findViewById(R.id.sub40);
        spinner41=findViewById(R.id.sub41);
        spinner42=findViewById(R.id.sub42);
        spinner43=findViewById(R.id.sub43);
        spinner44=findViewById(R.id.sub44);
        spinner45=findViewById(R.id.sub45);

        final int Spinner40 = LastSelect.getInt("LastClick40",0);
        final int Spinner41 = LastSelect.getInt("LastClick41",0);
        final int Spinner42 = LastSelect.getInt("LastClick42",0);
        final int Spinner43 = LastSelect.getInt("LastClick43",0);
        final int Spinner44 = LastSelect.getInt("LastClick44",0);
        final int Spinner45 = LastSelect.getInt("LastClick45",0);

        spinner40.setAdapter(spinnerAdapter);
        spinner40.setSelection(Spinner40);
        spinner41.setAdapter(spinnerAdapter);
        spinner41.setSelection(Spinner41);
        spinner42.setAdapter(spinnerAdapter);
        spinner42.setSelection(Spinner42);
        spinner43.setAdapter(spinnerAdapter);
        spinner43.setSelection(Spinner43);
        spinner44.setAdapter(spinnerAdapter);
        spinner44.setSelection(Spinner44);
        spinner45.setAdapter(spinnerAdapter);
        spinner45.setSelection(Spinner45);

        spinner40.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick40",position).apply();

                switch (position){
                    case 0:
                        sub40[0] = Integer.parseInt("20");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub40[0] = Integer.parseInt("18");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub40[0] = Integer.parseInt("16");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub40[0] = Integer.parseInt("14");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub40[0] = Integer.parseInt("12");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub40[0] = Integer.parseInt("10");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub40[0] = Integer.parseInt("8");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub40[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }
            private void calculatorGpa() {
                float credits = 14;
                float total4= (sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0])/credits;
                display_data5.setText(String.valueOf(String.format("%.2f",total4)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner41.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick41",position).apply();

                switch (position){
                    case 0:
                        sub41[0] = Integer.parseInt("20");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub41[0] = Integer.parseInt("18");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub41[0] = Integer.parseInt("16");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub41[0] = Integer.parseInt("14");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub41[0] = Integer.parseInt("12");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub41[0] = Integer.parseInt("10");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub41[0] = Integer.parseInt("8");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub41[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }
            private void calculatorGpa() {
                float credits = 14;
                float total4= (sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0])/credits;
                display_data5.setText(String.valueOf(String.format("%.2f",total4)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner42.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick42",position).apply();

                switch (position){
                    case 0:
                        sub42[0] = Integer.parseInt("30");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub42[0] = Integer.parseInt("27");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub42[0] = Integer.parseInt("24");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub42[0] = Integer.parseInt("21");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub42[0] = Integer.parseInt("18");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub42[0] = Integer.parseInt("15");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub42[0] = Integer.parseInt("12");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub42[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }
            private void calculatorGpa() {
                float credits = 14;
                float total4= (sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0])/credits;
                display_data5.setText(String.valueOf(String.format("%.2f",total4)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner43.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick43",position).apply();

                switch (position){
                    case 0:
                        sub43[0] = Integer.parseInt("10");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub43[0] = Integer.parseInt("9");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub43[0] = Integer.parseInt("8");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub43[0] = Integer.parseInt("7");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub43[0] = Integer.parseInt("6");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub43[0] = Integer.parseInt("5");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub43[0] = Integer.parseInt("4");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub43[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }
            private void calculatorGpa() {
                float credits = 14;
                float total4= (sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0])/credits;
                display_data5.setText(String.valueOf(String.format("%.2f",total4)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner44.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick44",position).apply();

                switch (position){
                    case 0:
                        sub44[0] = Integer.parseInt("30");
                        calculatorGpa();
                        calculateCgpa();
                        changeColor();
                        break;
                    case 1:
                        sub44[0] = Integer.parseInt("27");
                        calculatorGpa();
                        calculateCgpa();
                        changeColor();
                        break;
                    case 2:
                        sub44[0] = Integer.parseInt("24");
                        calculatorGpa();
                        calculateCgpa();
                        changeColor();
                        break;
                    case 3:
                        sub44[0] = Integer.parseInt("21");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub44[0] = Integer.parseInt("18");
                        calculatorGpa();
                        calculateCgpa();
                        changeColor();
                        break;
                    case 5:
                        sub44[0] = Integer.parseInt("15");
                        calculatorGpa();
                        calculateCgpa();
                        changeColor();
                        break;
                    case 6:
                        sub44[0] = Integer.parseInt("12");
                        calculatorGpa();
                        calculateCgpa();
                        changeColor();
                        break;
                    default:
                        sub44[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                        changeColor();
                }
            }

            private void changeColor() {
                pes317.setBackgroundColor(R.attr.background_color_change);
            }

            private void calculatorGpa() {
                float credits = 14;
                float total4= (sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0])/credits;
                display_data5.setText(String.valueOf(String.format("%.2f",total4)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner45.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick45",position).apply();

                switch (position){
                    case 0:
                        sub45[0] = Integer.parseInt("30");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub45[0] = Integer.parseInt("27");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub45[0] = Integer.parseInt("24");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub45[0] = Integer.parseInt("21");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub45[0] = Integer.parseInt("18");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub45[0] = Integer.parseInt("15");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub45[0] = Integer.parseInt("12");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub45[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }
            private void calculatorGpa() {
                float credits = 14;
                float total4= (sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0])/credits;
                display_data5.setText(String.valueOf(String.format("%.2f",total4)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //SEMESTER7----------------------------------------------------------------------------------------------------------------------------------!

        display_data6=findViewById(R.id.displayterm7);

        fst700 = findViewById(R.id.FST700);

        spinner46=findViewById(R.id.sub46);
        spinner47=findViewById(R.id.sub47);
        spinner48=findViewById(R.id.sub48);

        final int Spinner46 = LastSelect.getInt("LastClick46",0);
        final int Spinner47 = LastSelect.getInt("LastClick47",0);
        final int Spinner48 = LastSelect.getInt("LastClick48",0);

        spinner46.setAdapter(spinnerAdapter);
        spinner46.setSelection(Spinner46);
        spinner47.setAdapter(spinnerAdapter);
        spinner47.setSelection(Spinner47);
        spinner48.setAdapter(spinnerAdapter);
        spinner48.setSelection(Spinner48);

        spinner46.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick46",position).apply();

                switch (position){
                    case 0:
                        sub46[0] = Integer.parseInt("20");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub46[0] = Integer.parseInt("18");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub46[0] = Integer.parseInt("16");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub46[0] = Integer.parseInt("14");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub46[0] = Integer.parseInt("12");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub46[0] = Integer.parseInt("10");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub46[0] = Integer.parseInt("8");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub46[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }

            private void calculatorGpa() {
                float credits = 8;
                float total7= (sub46[0]+ sub47[0]+ sub48[0])/credits;
                display_data6.setText(String.valueOf(String.format("%.2f",total7)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner47.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick47",position).apply();

                switch (position){
                    case 0:
                        sub47[0] = Integer.parseInt("30");
                        calculatorGpa();
                        calculateCgpa();
                        changeColor();
                        break;
                    case 1:
                        sub47[0] = Integer.parseInt("27");
                        calculatorGpa();
                        calculateCgpa();
                        changeColor();
                        break;
                    case 2:
                        sub47[0] = Integer.parseInt("24");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub47[0] = Integer.parseInt("21");
                        calculatorGpa();
                        calculateCgpa();
                        changeColor();
                        break;
                    case 4:
                        sub47[0] = Integer.parseInt("18");
                        calculatorGpa();
                        calculateCgpa();
                        changeColor();
                        break;
                    case 5:
                        sub47[0] = Integer.parseInt("15");
                        calculatorGpa();
                        calculateCgpa();
                        changeColor();
                        break;
                    case 6:
                        sub47[0] = Integer.parseInt("12");
                        calculatorGpa();
                        calculateCgpa();
                        changeColor();
                        break;
                    default:
                        sub47[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                        changeColor();
                }
            }

            private void changeColor() {
                fst700.setBackgroundColor(R.attr.background_color_change);
            }

            private void calculatorGpa() {
                float credits = 8;
                float total7= (sub46[0]+ sub47[0]+ sub48[0])/credits;
                display_data6.setText(String.valueOf(String.format("%.2f",total7)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner48.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick48",position).apply();

                switch (position){
                    case 0:
                        sub48[0] = Integer.parseInt("30");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 1:
                        sub48[0] = Integer.parseInt("27");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 2:
                        sub48[0] = Integer.parseInt("24");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 3:
                        sub48[0] = Integer.parseInt("21");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 4:
                        sub48[0] = Integer.parseInt("18");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 5:
                        sub48[0] = Integer.parseInt("15");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    case 6:
                        sub48[0] = Integer.parseInt("12");
                        calculatorGpa();
                        calculateCgpa();
                        break;
                    default:
                        sub48[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                }
            }
            private void calculatorGpa() {
                float credits = 8;
                float total7= (sub46[0]+ sub47[0]+ sub48[0])/credits;
                display_data6.setText(String.valueOf(String.format("%.2f",total7)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //SEMESTER8----------------------------------------------------------------------------------------------------------------------------------!

        display_data7=findViewById(R.id.displayterm8);

        cse441=findViewById(R.id.CSE441);

        spinner49=findViewById(R.id.sub49);

        final int Spinner49 = LastSelect.getInt("LastClick49",0);

        spinner49.setAdapter(spinnerAdapter);
        spinner49.setSelection(Spinner49);

        spinner49.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerGrades spn = (SpinnerGrades) parent.getItemAtPosition(position);
                editor.putInt("LastClick49",position).apply();

                switch (position){
                    case 0:
                        sub49[0] = Integer.parseInt("160");
                        calculatorGpa();
                        calculateCgpa();
                        changeColorCSE441();
                        break;
                    case 1:
                        sub49[0] = Integer.parseInt("144");
                        calculatorGpa();
                        calculateCgpa();
                        changeColorCSE441();
                        break;
                    case 2:
                        sub49[0] = Integer.parseInt("128");
                        calculatorGpa();
                        calculateCgpa();
                        changeColorCSE441();
                        break;
                    case 3:
                        sub49[0] = Integer.parseInt("112");
                        calculatorGpa();
                        calculateCgpa();
                        changeColorCSE441();
                        break;
                    case 4:
                        sub49[0] = Integer.parseInt("96");
                        calculatorGpa();
                        calculateCgpa();
                        changeColorCSE441();
                        break;
                    case 5:
                        sub49[0] = Integer.parseInt("80");
                        calculatorGpa();
                        calculateCgpa();
                        changeColorCSE441();
                        break;
                    case 6:
                        sub49[0] = Integer.parseInt("74");
                        calculatorGpa();
                        calculateCgpa();
                        changeColorCSE441();
                        break;
                    default:
                        sub49[0] = Integer.parseInt("0");
                        calculatorGpa();
                        calculateCgpa();
                        changeColorCSE441();
                }
            }

            private void changeColorCSE441() {
                cse441.setBackgroundColor(R.attr.background_color_change);
            }

            private void calculatorGpa() {
                float credits = 16;
                float total8= (sub49[0])/credits;
                display_data7.setText(String.valueOf(String.format("%.2f",total8)));
            }
            private void calculateCgpa() {
                float totalCredits = 152;
                float cgpa= (sub1[0]+ sub2[0]+ sub3[0]+ sub4[0]+ sub5[0]+ sub6[0]+ sub7[0]+ sub8[0]+ sub9[0]
                        + sub10[0]+ sub11[0]+ sub12[0]+ sub13[0]+ sub14[0]+ sub15[0]+ sub16[0]+ sub17[0]
                        + sub18[0]+ sub19[0]+ sub20[0]+ sub21[0]+ sub22[0]+ sub23[0]+ sub24[0]
                        + sub25[0]+ sub26[0]+ sub27[0]+ sub28[0]+ sub29[0]+ sub30[0]+ sub31[0]+ sub32[0]+ sub33[0]
                        + sub34[0]+ sub35[0]+ sub36[0]+ sub37[0]+ sub38[0]+ sub39[0]
                        + sub40[0]+ sub41[0]+ sub42[0]+ sub43[0]+ sub44[0]+ sub45[0]
                        + sub46[0]+ sub47[0]+ sub48[0]
                        + sub49[0])/totalCredits;
                totalgpa.setText(String.valueOf(String.format("%.2f",cgpa)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //DONE--------------------------------------------------------------------------------------------------------------------------------------!

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Calculator.this, SettingsActivity.class));
            }
        });


    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Press again to exit!", Toast.LENGTH_SHORT).show();
        finish();
    }
}