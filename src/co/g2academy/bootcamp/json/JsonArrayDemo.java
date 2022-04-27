/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.json;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Asus
 */
public class JsonArrayDemo {
    private JSONParser parser =  new JSONParser();
    
    public Integer[] parseJsonArray(String jsonArrayText){
     try{
         JSONArray jsonArray = (JSONArray) parser.parse(jsonArrayText);
         Integer[] intArray =  new Integer[jsonArray.size()];
         for (int i = 0; i < jsonArray.size(); i++){
             Long item =  (Long) jsonArray.get(i);
             intArray[i] = item.intValue();
         }
         return intArray;
     }catch(ParseException ex){
         ex.printStackTrace();
     }
     return null;
    }
}
