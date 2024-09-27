package racingcar.service;

import racingcar.domain.RacingCar;
import racingcar.domain.RacingGame;
import racingcar.utils.Utils;

import java.util.List;
import java.util.stream.Collectors;

public class RacingCarService {

    public List<RacingCar> startRacing(List<RacingCar> racingCars){
        return racingCars.stream()
                .map(racingCar -> goFoward(racingCar))
                .collect(Collectors.toList());
    }

    private RacingCar goFoward(RacingCar racingCar){
        if(Utils.getRandomInt() >= 4){
            racingCar.plusFoward();
        }
        return racingCar;
    }

}
