package org.example;


public class Solution {
    public String countAndSay(int n) {
        String res = "1";
        if(n == 1) {
            return "1";
        }
        while(n > 1){
            res = convert(res);
            n--;
        }
        return res;
    }

    String convert(String s){
        StringBuilder sb = new StringBuilder();
        char cur = s.charAt(0);
        int count = 1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) != cur){
                sb.append(count);
                sb.append(cur);
                cur = s.charAt(i);
                count = 1;
            }else {
                count++;
            }
        }
        sb.append(count);
        sb.append(cur);
        return sb.toString();
    }
}