package com.itcast;

import java.util.*;

public class demo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("s");
        list.add("d");
        list.add("c");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
        }
        Map<String, String> map = new HashMap<>();
        map.put("1","d");
        map.put("2","f");
        map.put("3","w");
        for (String  key:map.keySet()){
            System.out.println("key："+" "+"value:"+map.get(key));
        }

        Set<String>  set=new HashSet<String>();
        set.add("1");
        for (String  s :  set){
            System.out.println(s);
        }
    }
}
