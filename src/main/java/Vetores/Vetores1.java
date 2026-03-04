package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetores1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digita o valor ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();

        }
        for (int i = 0; i < n; i++) {
            System.out.println(vect[i]);;

        }
        double sum = 0;
        for (int i = 0; i<n; i++) {
            sum += vect[i];
        }
        double avg = sum/n;
        System.out.printf("Average heigh: %.2f%n", avg);

        sc.close();
    }
}