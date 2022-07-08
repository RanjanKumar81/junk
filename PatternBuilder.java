package com.example;

import java.util.Arrays;
import java.util.List;

class PatternBuilder {


    private static void patternPrinter() {
        int i,j;
        List<String> alphabets = Arrays.asList("A", "B", "C", "D", "E", "F","G");
        int rowsToPrint = alphabets.size();
        for(i = 0; i <= rowsToPrint; i++){
            for(int s = 0; s<i; s++){
                System.out.print(" ");
            }
            for(j=i; j<rowsToPrint; j++){
                System.out.print(alphabets.get(j)+ " ");
            }
            System.out.println();
        }
    }
    public static void main (String args[]){
        patternPrinter();
    }
}