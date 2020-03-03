package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	    String input = "abcklmnob";
	    System.out.println(findFirstDuplicate(input));
    }

    public static int findFirstDuplicate(String input){
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (int i=0 ; i<input.length() ; i++){
            if(hashMap.containsKey(input.charAt(i))){
                return i;
            }else {
                hashMap.put(input.charAt(i), 1);
            }
        }
        return -1;
    }

}
