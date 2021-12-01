package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class HumanPlayer implements Player{

    Scanner sc = new Scanner(System.in);
    private final Logger logger = LoggerFactory.getLogger("Player");
    @Override
    public long askNextGuess() {
        System.out.println("Veuillez donner un nombre");
        Scanner sc = new Scanner(System.in);
        return sc.nextLong();
    }

    @Override
    public void respond(boolean lowerOrGreater) {

    }
}
