package com.example.buoc1;

public class Main {
    public static void main(String[] args) {
        MyBigNumber myBigNumber = new MyBigNumber();
        String stn1 = "1234";
        String stn2 = "897";
        String result = myBigNumber.sum(stn1, stn2);
        System.out.println("Kết quả: " + result);


    }
}