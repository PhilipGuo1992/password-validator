
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
       
        return passedRules;
    }
}


