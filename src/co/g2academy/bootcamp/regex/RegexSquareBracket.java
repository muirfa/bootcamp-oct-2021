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
public class RegexSquareBracket {
    private static final Pattern REGEX_AMN = Pattern.compile("[amn]");
    public boolean isAMN(String text){
        return REGEX_AMN.matcher(text).matches();
    }
}
