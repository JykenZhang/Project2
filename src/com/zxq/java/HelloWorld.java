package com.zxq.java;



import java.util.ArrayList;
import java.util.Date;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world");
        Date date = new Date();
        ArrayList arrayList = new ArrayList();
        arrayList.add(299);
        method();
        String[] arr =  new String[]{"zxq", "wer", "aaa"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            System.out.println(s);
        }

    }

    public static void method() {

    }
}
