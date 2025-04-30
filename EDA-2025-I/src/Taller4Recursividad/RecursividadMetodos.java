/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4Recursividad;

/**
 *
 * @author LENOVO LOQ
 */
public class RecursividadMetodos {

    // el estado base, el estado recursivo y el acercamiento al estado base.
    public static int fibonacci(int n) {

        //Si es menor o igual que 1, se retorna
        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
//    public static int fibonacci2(int n){
//        
//    }

    public static int power(int base, int exponent) {

        if (exponent == 0) {
            return 1;
        }

        return base * power(base, exponent - 1);
    }

    public static int reverseNumber(int n) {

        if (n < 10) {
            return n;
        }

        int digit = n % 10;
        int remainingDigits = n / 10;
        return Integer.parseInt(String.valueOf(digit) + reverseNumber(remainingDigits));
    }

    public static int sumDigits(int n) {

        if (n == 0) {
            return 0;
        }

        return n % 10 + sumDigits(n / 10);
    }

    public static void countdown(int n) {

        if (n == 0) {
            System.out.println("¡Despegue!");
            return;
        }

        System.out.println(n);
        countdown(n);
    }

    public static boolean isPrime(int n, int i) {

        if (i == 1) {
            return true;
        }

        if (n % i == 0) {
            return false;
        } else {
            return isPrime(n, i - 1);
        }
    }

    public static void printEvenNumbers(int start, int end) {

        if (start > end) {
            return;
        }

        if (start % 2 == 0) {
            System.out.println(start);
        }
        printEvenNumbers(start, end);
    }



}
