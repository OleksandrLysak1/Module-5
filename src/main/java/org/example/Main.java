package org.example;

public class Main {
    public static void main(String[] args) {
        int n = 10;

        // Iterative
        System.out.println("Ітераційний підхід:");
        System.out.println("Fibonacci(" + n + ") = " + Iterative.fibonacciIterative(n));

        // Dynamic
        System.out.println("\nРекурсивний підхід:");
        System.out.println("Fibonacci(" + n + ") = " + Dynamic.fibonacciDynamic(n));

        // Recursive
        System.out.println("\nДинамічне програмування:");
        System.out.println("Fibonacci(" + n + ") = " + Recursive.fibonacciRecursive(n));
    }
}
