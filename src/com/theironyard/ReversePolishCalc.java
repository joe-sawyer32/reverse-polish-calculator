package com.theironyard;

/**
 * Created by Joe on 7/20/17.
 */
public class ReversePolishCalc {

    // You'll need a variable here to keep track of the top of the stack
    int topOfStack = 0;

    // The array of the input string split up
    private String[] tokens;

    // The stack
    private String[] stack;

    public double calculate(String input) {

        // 1. Use the String split method to split the string into tokens at the commas
        tokens = input.split(",");

        // 2. Allocate a stack as big as the number of tokens
        stack =  new String[tokens.length];

        // 3. write the algorithm
        for(int i = 0; i < tokens.length; ++i) {
            // calls to push() and pop() and do the math here

        }

        // 4. return the result
        return pop();
    }

    private void push(String number) {
        // push on the stack
        stack[topOfStack] = number;
    }

    private void push(double d) {
        // change the double to a string and then push it on the stack
        String pushString = String.valueOf(d);
        push(pushString);
    }

    private double pop() {
        // remove the string from the top of the stack and convert it to a double and return it
        String popString = stack[topOfStack];
        stack[topOfStack] = null;
        double popDouble = Double.parseDouble(popString);
        return popDouble;
    }
}
