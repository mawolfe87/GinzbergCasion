package ginzberg.casino.Roulette;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

/**
 * Created by rickjackson on 1/25/17.
 */
public class Wheel {
    private boolean ballSpinning;
    private int[] sequence;
    private Collection<String> wheelPocketSequence;

    Wheel() {
        ballSpinning = false;
        wheelPocketSequence = new ArrayList<>();
        constructPocketSequence();
        constructPocketNumberSequence();
    }

    public int getWinningNumber() {
        int pocket = generateRandomNumber();
        ballSpinning = false;

        return getWinningNumberFromPocketSequence(pocket);
    }

    public void spinBall() {
        ballSpinning = true;
    }

    private int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(38);
    }

    int getWinningNumberFromPocketSequence(int index) {
        return sequence[index];
    }

    private void constructPocketSequence() {
        sequence = new int[]{0, 28, 9, 26, 30, 11, 7, 20, 32, 17, 5, 22, 34, 15, 3, 24, 36, 13, 1,
            37, 27, 10, 25, 29, 12, 8, 19, 31, 18, 6, 21, 33, 16, 4, 23, 35, 14, 2};
    }

    private void constructPocketNumberSequence() {
        for (int i = 0; i < 38; i++) {
            wheelPocketSequence.add(Integer.toString(sequence[i]));
        }
    }
}
