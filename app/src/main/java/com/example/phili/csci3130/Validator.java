package com.example.phili.csci3130;

public class Validator {
    /**
     *  if it passes five rules, it is very strong.
     * if it passes four rules, it is medium strong.
     * if it passes less than, or equal to three, is not strong.
     * @param s
     * @return the number of rules the string passed
     */

    // check if the password is strong or not
    public static int validatePassword(String s){
        // store the passed rules
        int passedRules = 0;

        //rule-1: check if it is 'password'
        if(!s.equals("password")){

            passedRules += 1;
        }
        //rule-2: it is at least 8 characters long
        if(s.length() >= 8){

            passedRules += 1;
        }
        // rule-3: at least has one digit.
        if(s.matches(".*[0-9]+.*")){
            passedRules += 1;
        }
        // rule-4: has both upper and lower case.
        if(s.matches(".*[a-z]+.*") && s.matches(".*[A-Z]+.*")){
            passedRules += 1;
        }
        // rule-5: first letter has to be letter, and is not upper case.
       if(s.substring(0,1).matches(".*[a-z]+.*")){
           passedRules += 1;

       }
        return passedRules;
    }
}


