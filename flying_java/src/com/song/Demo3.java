package com.song;

public class Demo3 {
    public static void main(String[] args){
        int age = 25;
        if (age > 60){
            System.out.println("老年");
        }else if (40 < age && age <=60 ){
            System.out.println("中年");
        }else if (18 < age && age <=40 ){
            System.out.println("少年");
        }else{
            System.out.println("童年");
        }
    }
}
