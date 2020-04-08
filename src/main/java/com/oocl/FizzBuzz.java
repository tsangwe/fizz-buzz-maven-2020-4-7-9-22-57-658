package com.oocl;

public class FizzBuzz {
    public FizzBuzz() {}

    public String response(int number) {
        String message = "";

        if (number % 3 == 0) {
            message += "Fizz";
        }
        if (number % 5 == 0) {
            message += "Buzz";
        }

        return (message.equals("")) ? number + "" : message;
    }
}
