package com.sda.agorytmy;

/**
 * Hello world!
 */
public class App {

    public static double ciag(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 0.5;
        }
        return ciag(n - 1) * ciag(n - 2);
    }

    public static int ciag2 (int a){
        if (a==1){
            return -1;
        }
        else {
            return -ciag2(a-1)*a-3;
        }
    

}


    public static int silnia(int n) {
        System.out.println(n);
        if (n < 2) {
            return 1;
        }
        return n * silnia(n - 1);


    }

    public static void main(String[] args) {

        silnia(5);

        int silnia = 5;
        int wynik = 1;
        for (int i = 1; i <= silnia; i++) {
            wynik = wynik * i;
        }
        System.out.println("Silnia:" + wynik);
    }

}
