package com.oocl;

public class FizzBuzz {
    public FizzBuzz() {}

    public String response(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        return number + "";
    }
}
