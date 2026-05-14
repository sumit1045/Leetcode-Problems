package Easy;

import java.util.LinkedHashMap;
import java.util.Map;

public class FuniqueChar_387 {

    public static void main(String[] args){
        String s="dddccdbba";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
        Map<Character, Integer> map=new LinkedHashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
