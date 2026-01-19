package core.basesyntax;

import java.util.Random;

public class Lottery {
    Random random =new Random();
    private static final int FIGURE_COUNT = 100;
    ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall(){
        Ball ball = new Ball(colorSupplier.getRandomColor(), random.nextInt(FIGURE_COUNT));
        System.out.println(ball);
        return ball;
    }
}
