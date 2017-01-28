package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;

public class ReportCard extends AppCompatActivity {

    private String mStudentName;
    private int mEnglishGrade;
    private int mMathGrade;
    private int mPhysicsGrade;
    private int mChemistryGrade;
    private int mHistoryGrade;

    public String studentName;
    public int englishGrade = mEnglishGrade;
    public int mathGrade = mMathGrade;
    public int physicsGrade = mPhysicsGrade;
    public int chemistryGrade = mChemistryGrade;
    public int historyGrade = mHistoryGrade;

    private int individualGrade;
    private int classNum;

    public int score;
    public String letterGrade;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        mStudentName = studentName;
    }

    public int getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(int englishGrade) {
        mEnglishGrade = englishGrade;
    }

    public int getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(int mathGrade) {
        mMathGrade = mathGrade;
    }

    public int getPhysicsGrade() {
        return physicsGrade;
    }

    public void setPhysicsGrade(int physicsGrade) {
        mPhysicsGrade = physicsGrade;
    }

    public int getChemistryGrade() {
        return chemistryGrade;
    }

    public void setChemistryGrade(int chemistryGrade) {
        mChemistryGrade = chemistryGrade;
    }

    public int getHistoryGrade() {
        return historyGrade;
    }

    public void setHistoryGrade(int historyGrade) {
        mHistoryGrade = historyGrade;
    }

    public String getGrade() {
        int totalGrade = englishGrade + mathGrade + physicsGrade + chemistryGrade + historyGrade;
        int averageGrade = totalGrade / classNum;

        if (averageGrade >= 90.0) {
            letterGrade = "A";
        } else if (averageGrade < 90.0 && averageGrade >= 80.0) {
            letterGrade = "B";
        } else if (averageGrade < 80.0 && averageGrade >= 70.0) {
            letterGrade = "C";
        } else if (averageGrade < 70.0 && averageGrade >= 60.0) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        return letterGrade;
    }

    public String displayResult() {
        return "Student Name: " + studentName + '\n' +
                "English Grade: " + englishGrade + '\n' +
                "Math Grade: " + mathGrade + '\n' +
                "Physics Grade: " + physicsGrade + '\n' +
                "Chemistry Grade: " + chemistryGrade + '\n' +
                "History Grade: " + historyGrade + '\n' +
                "Overall Grade: " + letterGrade;
    }

    @Override
    public String toString() {
        return "ReportCard " +
                "Student Name= " + studentName +
                "English Grade= " + englishGrade +
                "Math Grade= " + mathGrade +
                "Physics Grade= " + physicsGrade +
                "Chemistry Grade= " + chemistryGrade +
                "History Grade= " + historyGrade +
                "Overall Grade= " + letterGrade;
    }
}