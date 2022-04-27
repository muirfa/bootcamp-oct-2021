/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.string;

/**
 *
 * @author Asus
 */
public class ReverseWordInSetence {
    private ReverseString reverse = new ReverseString();
    public String reverse (String sentence){
//        use String.split(" ")
        String words[] = sentence.split(" ");
        String reverseWordSentence = "";
        for (int i = 0; i < words.length; i++){
//        use ReverseString.reverse do revert each every word
//        use String concatenation (+) to construct back the sentence
                reverseWordSentence = reverseWordSentence + reverse.reverse(words[i]) + " ";
        } 

        System.out.println(reverseWordSentence);
        return reverseWordSentence.trim();
        
        
    }
}
