package com.company;

public class Main {

    //    Write a code fragment that prints true if the double variables x and y are both
    //    strictly between 0 and 1 and false otherwise.

    public static void main(String[] args) {
	// write your code here
        double x = 0.50;
        double y = 0.75;

        if(x > 0 && x < 1 && y > 0 && y < 1){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
