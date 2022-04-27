/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.collection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public class ArrayListExample {
    public List<String>generateListWithThreeItems(){
        List<String> threeItems = new ArrayList<String>();
        threeItems.add("hujan");
        threeItems.add("Senja");
        threeItems.add("cerita");
        
        for (String item : threeItems){
            System.out.println(item);
        }
        for(int i=0; i<threeItems.size();i++){
            System.out.println(threeItems.get(i));
    }
        return threeItems;
    }
    
}
