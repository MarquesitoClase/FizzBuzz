package org.example;

import org.example.FizzBuzz.FizzBuzz;

public class Main {
    static void main() {
        FizzBuzz FB = new FizzBuzz();
        for(int index = 0; index<30;index++){
            System.out.println(FB.convert(index));
        }
    }
}
