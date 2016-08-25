package com.example.suketurastogi.reportcardapp;

import android.support.v7.app.AppCompatActivity;

public class ReportCard extends AppCompatActivity{

    private char physicsGrade;
    private char chemistryGrade;
    private char mathsGrade;

    public ReportCard() {

        setPhysicsGrade('A');
        setChemistryGrade('B');
        setMathsGrade('C');
    }

    public int getPhysicsGrade() {
        return physicsGrade;
    }

    public void setPhysicsGrade(char grade) {
        physicsGrade = grade;
    }


    public int getChemistryGrade() {
        return chemistryGrade;
    }

    public void setChemistryGrade(char grade) {
        chemistryGrade = grade;
    }

    public int getMathsGrade() {
        return mathsGrade;
    }

    public void setMathsGrade(char grade) {
        mathsGrade = grade;
    }

    @Override
    public String toString() {
        return "Physics Grade : " + getPhysicsGrade() +" Chemistry Grade : " + getChemistryGrade() +
               "Maths Grade : " + getMathsGrade();
    }
}
