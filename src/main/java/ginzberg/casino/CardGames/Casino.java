package ginzberg.casino.CardGames;

import ginzberg.casino.CardGames.BlackJack.BlackJack;
import ginzberg.casino.CardGames.CasinoWars.Casino_Wars;

/**
 * Created by ryangross on 1/25/17.
 */
public class Casino {

    // test
    // mockito: optional

    public void playBJ(UserIO aUI) {

        while (aUI.playAgain == true) {
            BlackJack newBJ = new BlackJack();
            newBJ.playRound(aUI);
            aUI.anotherRound();
        }
    }

    public void playWar(UserIO aUI) {
        while(aUI.playAgain == true) {
            Casino_Wars newCW = new Casino_Wars();
            newCW.playRound(aUI);
            aUI.anotherRound();
        }
    }


    public void startGame(UserIO aUI) {
        String selection = aUI.gameUserWantsToPlay();
        if (selection.equalsIgnoreCase("1")) {
            //BlackJack newBJ = new BlackJack();
            this.playBJ(aUI);
            // newBJ.playRound(aUI);
        } else if (selection.equalsIgnoreCase("3")) {
            this.playWar(aUI);
        }
    }


    public void play(UserIO anIO) {
        anIO.welcome();
        startGame(anIO);
    }


}
