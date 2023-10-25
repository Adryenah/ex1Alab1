import java.util.*;
import java.io.*;

//write a Java program that prints the prime numbers among
//the integers numbers given as a command line parameters

public class Main {
    public static void main(String[] args) {
        //boolean flag=false;
        int i,j;
        for (i=0; i< args.length; i++){
            boolean flag = false;
            for (j=2; j<= Integer.parseInt(args[i])/2; j++){
                if(Integer.parseInt(args[i])%j==0) {
                    flag = true;
                    break;
                }
            }

            if(!flag)
                System.out.println(args[i]+" is a prime number.");
            else
                System.out.println(args[i]+" is not a prime number.");


        }
    }
}