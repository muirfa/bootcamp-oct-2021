/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Asus
 */
public class RegexExample {
    private static final String REGEX_PATTERN = ".s";
    private static final String REGEX_EMAIL_ADDRESS = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
    private static final String REGEX_PASSWORD = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
    private static final Pattern REGEX_PASSWORD_PATTERN = Pattern.compile(REGEX_PASSWORD);
    
    public boolean isTwoCharacterAndEndedWithS(String text){
        Pattern pattern = Pattern.compile(REGEX_PATTERN);
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }
    
     public boolean isValidEmailAddress(String email){
         return Pattern.compile(REGEX_EMAIL_ADDRESS).matcher(email).matches();
     }
     
//     this is the fastest and efisien way
     public boolean isValidPassword(String password){
         return REGEX_PASSWORD_PATTERN.matcher(password).matches();
     }
}
