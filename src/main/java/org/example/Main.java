package org.example;

import org.example.FizzBuzz.FizzBuzz;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        FizzBuzz FB = new FizzBuzz();
        ArrayList<String> lista=new ArrayList<>();
        for(int index = 0; index<30;index++){
            System.out.println(FB.convert(index));
        }
    }
}
