package com.example.acsnoteuitests.testimpl;

import android.content.Context;
import android.util.Log;

import com.robotium.solo.Solo;

public class TestSuiteImpl_1_Menu
{
    private Solo    solo;
    private Context context;

    public TestSuiteImpl_1_Menu(Solo solo, Context context)
    {
        this.solo = solo;
        this.context = context;

    }

    public void allNotesMenu()
    {
        Log.i("AcsNoteUITests", "solo.getCurrentActivity() = " + solo.getCurrentActivity());
    }

}
