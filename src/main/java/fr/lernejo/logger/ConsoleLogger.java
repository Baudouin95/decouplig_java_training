package fr.lernejo.logger;

import java.util.Scanner;

public class ConsoleLogger implements Logger{

    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    @Override
    public void log(String message) {
        message = this.str;
        System.out.println("Votre message: \n" + message);
    }
}
