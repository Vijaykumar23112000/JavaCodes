package Algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Frequency {

    public static void freq(String str){
        Map<Character , Integer> mp = new HashMap<Character , Integer>();
        for(int i = 0;i<str.length();i++){
            char ch = str.toLowerCase().charAt(i);
            Integer count = mp.get(ch);
            if(count==null)
                mp.put(ch, 0);
            else
                mp.put(ch, ++count);
        }
        for(Entry<Character , Integer> e : mp.entrySet()){
            System.out.println(e.getKey()+" : "+e.getValue());
        }
    }
    public static void main(String[] args) {

        String str = "Malayalam";
        freq(str);
    }
}
