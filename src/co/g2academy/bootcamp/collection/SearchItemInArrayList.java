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
public class SearchItemInArrayList {

    public int search(List<String> items, String searchItem) {
        for (int i = 0; i < items.size(); i++) {
            String item = items.get(i);
            if (item.equals(searchItem)) {
                return i;
            }
        }
        return -1;
    }
}
