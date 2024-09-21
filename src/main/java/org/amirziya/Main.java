package org.amirziya;

import data.InternationMorse;
import data.InternationMorseClas;

import java.util.Scanner;

public class Main {
    final  static String MASSAGE = "Enter Your  Massage :";

    public static void main(String[] args) {

        // TODO: Start and run App with Scanner

        InternationMorse internationMorse = new InternationMorseClas();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of option you want : \n 1-Encode \n 2-Decode");
        int option = input.nextInt();

        if(option == 1){
            Scanner inputEncode = new Scanner(System.in);
            System.out.println(MASSAGE);
            String massage = inputEncode.nextLine();
            System.out.println(internationMorse.Encode(massage));
        }if(option == 2){
            Scanner inputDecode = new Scanner(System.in);
            System.out.println(MASSAGE);
            String decodeMassage = inputDecode.nextLine();
            System.out.println( internationMorse.Decode(decodeMassage));
        }
    }
}