/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.json;

import org.json.simple.JSONObject;

/**
 *
 * @author Asus
 */
public class JsonSimpleDemo {
    public String generateJson (String name, Integer num, Double balance, Boolean isVip){
        JSONObject jsonObject =  new JSONObject();
        jsonObject.put("name", name);
        jsonObject.put("num", num);
        jsonObject.put("balance", balance);
        jsonObject.put("is_vip", isVip);
        return jsonObject.toJSONString();
    }
}
