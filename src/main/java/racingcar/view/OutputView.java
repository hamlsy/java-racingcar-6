package racingcar.view;

import racingcar.domain.RacingCar;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OutputView {
    private static final String RACING_CAR_NAME = "%s : ";
    private static final String RACING_CAR_FOWARD_STRING = "-";

    public static void printAllRacingCarsFowardResult(List<RacingCar> racingCars){
        racingCars.forEach(racingCar -> printRacingCarFowardResult(racingCar));
    }

    public static void printRacingCarFowardResult(RacingCar racingCar){
        printRacingCarName(racingCar);
        printRacingCarFoward(racingCar);
    }

    private static void printRacingCarName(RacingCar racingCar){
        System.out.printf(RACING_CAR_NAME, racingCar.getName());
    }

    private static void printRacingCarFoward(RacingCar racingCar){
        String foward = "";
        for(int i=0;i< racingCar.getFoward();i++){
            foward += RACING_CAR_FOWARD_STRING;
        }
        System.out.println(foward);
    }

}
