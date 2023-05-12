package org.example;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String countAndSay(int n) {
        String result = "1";
        while ( n != 1 ){
           result = createString(stringToCountArray(result));
           n--;
        }
        return result;
    }

    public List<int[]> stringToCountArray(String number){
        List<int[]> list = new ArrayList<>();
        int count = 1;
        int previousNumber = number.charAt(0) - '0';
        for (int i = 1; i < number.length(); i++) {
            if(previousNumber == number.charAt(i) - '0'){
                count++;
            }else {
                list.add(new int[]{count, previousNumber});
                previousNumber = number.charAt(i) - '0';
                count = 1;
            }
        }
        list.add(new int[]{count, previousNumber});
        return list;
    }
    public String createString(List<int[]> list){
        StringBuilder sb = new StringBuilder();
        for (int[] x: list) {
            sb.append(x[0]);
            sb.append(x[1]);
        }
        return sb.toString();
    }
}