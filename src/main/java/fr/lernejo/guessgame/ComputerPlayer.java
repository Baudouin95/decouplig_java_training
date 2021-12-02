package fr.lernejo.guessgame;

import java.security.SecureRandom;

public class ComputerPlayer implements Player{

    public ComputerPlayer() {

    }

    @Override
    public long askNextGuess() {
        SecureRandom random = new SecureRandom();
        long nbr = random.nextLong(1000);
        return nbr;
    }

    @Override
    public void respond(boolean lowerOrGreater) {

    }
}
