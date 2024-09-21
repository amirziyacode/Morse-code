package org.amirziya;

import data.InternationMorse;
import data.InternationMorseClas;

import java.util.Scanner;


public class Main {
    final static String GREEN = "\u001B[32m";
    final static String YELLOW = "\u001B[33m";
    final  static String MASSAGE = "Enter Your  Massage :";

    public static void main(String[] args) {

        // TODO: Start and run App with Scanner
        InternationMorse internationMorse = new InternationMorseClas();

        try(Scanner input = new Scanner(System.in)){
            System.out.println(GREEN+"Enter the number of option you want : \n 1-Encode \n 2-Decode");
            if(input.hasNextLine()){
                int option = input.nextInt();
                DecodeOrEncode(option, internationMorse);
            }
        }catch(RuntimeException e) {
            throw  new IllegalStateException("Enter valid number !!!!! ");
        }

    }

    private static void DecodeOrEncode(int option, InternationMorse internationMorse) {
        if(option == 1){
            String massage = getMassage();
            System.out.println(YELLOW+internationMorse.Encode(massage));
        }
        if(option == 2){
            String decodeMassage = getMassage();
            System.out.println(YELLOW+internationMorse.Decode(decodeMassage));
        }
    }

    private static String getMassage() {
        Scanner inputEncode = new Scanner(System.in);
        System.out.println(GREEN+MASSAGE);
        return inputEncode.nextLine();
    }
}