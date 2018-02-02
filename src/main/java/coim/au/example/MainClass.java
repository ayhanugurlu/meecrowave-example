package coim.au.example;

import org.apache.meecrowave.Meecrowave;

import java.util.Scanner;

/**
 * Created by Ayhan.Ugurlu on 02/02/2018
 */
public class MainClass {

    public static void main(String[] args) {
        try (final Meecrowave meecrowave = new Meecrowave(); final Scanner scanner = new Scanner(System.in);) {

            meecrowave.getConfiguration().setHttpPort(8083);
            meecrowave.bake();
            scanner.nextLine();
        }
    }
}
