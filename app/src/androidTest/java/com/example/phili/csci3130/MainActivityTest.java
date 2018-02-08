package com.example.phili.csci3130;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

import static org.junit.Assert.*;

/**
 * Created by phili on 2018-02-07.
 */
public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    private String mWeakPsw = "password";
    private String mediumPsw = "123Wesdeny";
    private String srongPsw = "snowBa1987";

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testInputPsw1(){
        // 1 input password from the textEdit
        Espresso.onView(withId(R.id.editText)).perform(typeText(mWeakPsw));

        //2 close the keyboard
        Espresso.closeSoftKeyboard();
        //3 click the validate button
        Espresso.onView(withId(R.id.button)).perform(click());
        //4 show the result
        Espresso.onView(withId(R.id.textView)).check(matches(withText("Not strong!")));
    }
    @Test
    public void testInputPsw2(){
        // 1 input password from the textEdit
        Espresso.onView(withId(R.id.editText)).perform(typeText(mediumPsw));

        //2 close the keyboard
        Espresso.closeSoftKeyboard();
        //3 click the validate button
        Espresso.onView(withId(R.id.button)).perform(click());
        //4 show the result
        Espresso.onView(withId(R.id.textView)).check(matches(withText("Medium strong")));
    }
    @Test
    public void testInputPsw3(){
        // 1 input password from the textEdit
        Espresso.onView(withId(R.id.editText)).perform(typeText(srongPsw));

        //2 close the keyboard
        Espresso.closeSoftKeyboard();
        //3 click the validate button
        Espresso.onView(withId(R.id.button)).perform(click());
        //4 show the result
        Espresso.onView(withId(R.id.textView)).check(matches(withText("Very strong")));
    }

    @After
    public void tearDown() throws Exception {
    }

}