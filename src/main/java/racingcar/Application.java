package racingcar;

import racingcar.controller.RacingCarController;
import racingcar.service.RacingCarService;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        RacingCarController controller = new RacingCarController(new RacingCarService());
        controller.run();
    }
}
