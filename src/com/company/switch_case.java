package com.company;
import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        int var;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age: ");
        var = sc.nextInt();
       switch (var){
            case 3:
                System.out.println("you are not a baby anymore.");
                break;
            case 11:
                System.out.println("u are a child");
                break;
            case 20:
                System.out.println("you are an adult");
                break;
            default:
                System.out.println("invalid input");
    }

    }
}
