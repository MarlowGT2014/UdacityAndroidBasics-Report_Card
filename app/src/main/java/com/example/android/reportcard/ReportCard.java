package com.example.android.reportcard;

import android.util.Log;

/**
 * Created by joshua on 4/20/17.
 */

public class ReportCard {

    private int mMathGrade;
    private int mEnglishGrade;
    private int mSocialStudiesGrade;
    private int mScienceGrade;
    private int mGymGrade;
    private int mHistoryGrade;
    private int mMusicGrade;

    public ReportCard(int mathGrade, int englishGrade, int socialStudiesGrade, int scienceGrade, int gymGrade, int historyGrade, int musicGrade) {
        mMathGrade = mathGrade;
        mEnglishGrade = englishGrade;
        mSocialStudiesGrade = socialStudiesGrade;
        mScienceGrade = scienceGrade;
        mGymGrade = gymGrade;
        mHistoryGrade = historyGrade;
        mMusicGrade = musicGrade;
    }

    public int getGrade(String course) {
        String c = course;
        c.toLowerCase();

        if (c.contains("math")) { return mMathGrade; }
        else if (c.contains("english")) { return mEnglishGrade; }
        else if (c.contains("social studies")) { return mSocialStudiesGrade; }
        else if (c.contains("science")) { return mScienceGrade; }
        else if (c.contains("gym")) { return mGymGrade; }
        else if (c.contains("history")) { return mHistoryGrade; }
        else if (c.contains("music")) { return mMusicGrade; }
        else { Log.e("Unrecognizable Course: ", c); return 0;}
    }

    public void setGrade(String course, int grade) {
        String c = course;
        c.toLowerCase();

        if (c.contains("math")) { mMathGrade = grade; }
        else if (c.contains("english")) { mEnglishGrade = grade; }
        else if (c.contains("social studies")) { mSocialStudiesGrade = grade; }
        else if (c.contains("science")) { mScienceGrade = grade; }
        else if (c.contains("gym")) { mGymGrade = grade; }
        else if (c.contains("history")) { mHistoryGrade = grade; }
        else if (c.contains("music")) { mHistoryGrade = grade; }
        else { Log.e("Unrecognizable Course: ", c); }
    }

    @Override
    public String toString() {
        return new StringBuilder()
        .append("\n")
        .append("Math: ")
        .append(mMathGrade + "\n")
        .append("English: ")
        .append(mEnglishGrade + "\n")
        .append("Social Studies: ")
        .append(mSocialStudiesGrade + "\n")
        .append("Science: ")
        .append(mScienceGrade + "\n")
        .append("Gym: ")
        .append(mGymGrade + "\n")
        .append("History: ")
        .append(mHistoryGrade + "\n")
        .append("Music: ")
        .append(mMusicGrade + "\n")
        .toString();
    }
}
