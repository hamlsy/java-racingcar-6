package racingcar.domain;

import java.util.List;

public class RacingGame {
    List<RacingCar> racingCarList;
    int gameCount;

    public RacingGame(List<RacingCar> racingCarList, int gameCount) {
        this.racingCarList = racingCarList;
        this.gameCount = gameCount;
    }
}
