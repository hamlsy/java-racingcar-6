package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    List<RacingCar> racingCars = new ArrayList<>();
    int gameCount;

    public RacingGame(List<RacingCar> racingCars, int gameCount) {
        this.racingCars = racingCars;
        this.gameCount = gameCount;
    }

    public List<RacingCar> getRacingCars() {
        return racingCars;
    }

    public int getGameCount() {
        return gameCount;
    }
}
