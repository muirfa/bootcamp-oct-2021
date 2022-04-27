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
public class BinarySearch {
    public int search(List<Integer> items, Integer searchItem){
        int left = 0;
        int right = items.size()-1;
        int middle;
        while(left <= right){
            middle = (left + right) / 2;
            if(items.get(middle) == searchItem){
                return middle;
            }else if(searchItem > items.get(middle)){
                left = middle+1;
            }else if(searchItem < items.get(middle)){
                right = middle -1;
            }
        }
        return -1;
    }
}
