package racingcar.controller;

import racingcar.domain.RacingCar;
import racingcar.domain.RacingGame;
import racingcar.service.RacingCarService;
import racingcar.utils.Utils;
import racingcar.view.InputView;

import java.util.List;
import java.util.stream.Collectors;

import static camp.nextstep.edu.missionutils.Console.readLine;
public class RacingCarController {

    private List<RacingCar> racingCars;
    private RacingGame racingGame;
    private RacingCarService service;

    public RacingCarController(RacingCarService service) {
        this.service = service;
    }

    //todo start controller
    public void run(){
        //initRacing
        //start racing
        //after racing
    }


    //todo impl initRacing
    public void initRacing(){
        InputView.printInputCarNameMessage();
        createRacingCar(inputRacingCarName());
        InputView.printInputGameCountMessage();
        createRacingGame(racingCars, inputGameCount());
    }

    private List<String> inputRacingCarName(){
        String input = readLine().trim();
        return Utils.stringToList(input);
    }

    private List<RacingCar> createRacingCar(List<String> racingCarNames){
        return racingCarNames.stream()
                .map(carName -> new RacingCar(carName)).collect(Collectors.toList());
    }

    private void createRacingGame(List<RacingCar> racingCars, int gameCount){
        this.racingGame = new RacingGame(racingCars, gameCount);
    }

    private int inputGameCount(){
        String input = readLine().trim();
        return Utils.stringToInt(input);
    }

    //todo impl startRacing
    public void startRacing(){

    }

    //todo impl afterRacing
    public void afterRacing(){

    }
}
