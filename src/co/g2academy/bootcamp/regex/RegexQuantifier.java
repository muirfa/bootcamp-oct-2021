/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.regex;

import java.util.regex.Pattern;

/**
 *
 * @author Asus
 */
public class RegexQuantifier {
    private static final Pattern REGEX_QUESTION_MARK = Pattern.compile("[amn]?");  //once or not at All
    private static final Pattern REGEX_PLUS = Pattern.compile("[amn]+");  //once or not at all
    private static final Pattern REGEX_ASTERISK = Pattern.compile("[amn]*");  //zero or notat all
    private static final Pattern REGEX_CURLY_BRACKET = Pattern.compile("[amn]{3}");  //threetimes
    private static final Pattern REGEX_CURLY_BRACKET_AND_COMMA = Pattern.compile("[amn]{3,}");  //three or more times
    private static final Pattern REGEX_CURLY_BRACKET_COMMA_AND_MAX = Pattern.compile("[amn]{3,5}");  //three or maximum five time
    
    public boolean isAMNOccureOnceOrNotAtAll(String text){
        return REGEX_QUESTION_MARK.matcher(text).matches();
    }
    
    public boolean isAMNOccureOnceOrMoreTimes(String text){
        return REGEX_PLUS.matcher(text).matches();
    }
    
    public boolean isAMNOccureZeroOrMoreTimes(String text){
        return REGEX_ASTERISK.matcher(text).matches();
    }
    
    public boolean isAMNOccureThreeTimes(String text){
        return REGEX_CURLY_BRACKET.matcher(text).matches();
    }
    
    public boolean isAMNOccureThreeTimesOrMore(String text){
        return REGEX_CURLY_BRACKET_AND_COMMA.matcher(text).matches();
    }
    
    public boolean isAMNOccureThreeTimesOrMaxFive(String text){
        return REGEX_CURLY_BRACKET_COMMA_AND_MAX.matcher(text).matches();
    }
    
    
   
}
