package com.company;

public class Main
{

    public static void main(String[] args)
    {
	int a=9,b=11;
        while(a != b) {
            if(a > b)
                a -= b;
            else
                b -= a;
        }
        if(a==1)
        System.out.println("nesbat be ham avval and ");
        else
            System.out.println("nesbat be ham avval nistand");

    }
}
