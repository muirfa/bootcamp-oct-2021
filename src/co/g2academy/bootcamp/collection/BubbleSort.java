/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.collection;

import java.util.List;

/**
 *
 * @author Asus
 */
public class BubbleSort {
    public List<Integer> sort(List<Integer> unsorted){
        for(int i = 0;  i < unsorted.size() -1; i++){
            for(int j = 0; j < unsorted.size() -1 -i; j++){
                if(unsorted.get(j) > unsorted.get(j + 1)){
                    Integer temp = unsorted.get(j);
                    unsorted.set(j, unsorted.get(j+1));
                    unsorted.set(j+1, temp);
                }
            }
        }
        return unsorted;
    }
}
