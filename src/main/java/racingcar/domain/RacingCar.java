package racingcar.domain;

public class RacingCar {
    private String name;
    private int foward;
    public RacingCar(String name) {
        this.name = name;
        this.foward = 0;
    }

    public void plusFoward(){
        this.foward++;
    }

    public String getName() {
        return name;
    }

    public int getFoward() {
        return foward;
    }
}
