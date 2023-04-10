package com.company;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayConcatenar {

    public static void main(String[] args){

        String [] nombres= {"Valentín ","Javier ","Ceballos ","Jiménez"};
        String arrayToString = Arrays.stream(nombres).collect(Collectors.joining());
        System.out.println(arrayToString);
        
    }
}
