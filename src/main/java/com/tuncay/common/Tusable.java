package com.tuncay.common;

public class Tusable {

    public static void main(String[] args) {
        System.out.println(getRandomUsername("cca.liamg."));
    }

    public static String randomStr(int n){
        String str = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < n; i++) {
            str += randomUpperLower(alphabet.charAt((int)(Math.random()*(alphabet.length())) ));
        }

        return str;

    }

    public static String randomUpperLower(char c){
        return String.valueOf(((int)(Math.random()*2)) == 1 ? Character.toUpperCase(c) : c );
    }

    /*
    public static String getRandomUsername(){
        return "cca.liamg." + randomStr(7);
    }
    */

    public static String getRandomUsername(String username){
        return username + "." + randomStr(7);
    }



}
