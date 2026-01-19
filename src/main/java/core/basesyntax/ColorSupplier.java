package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private static Color[] colors = Color.values();
    public String getRandomColor() {
        int index = random.nextInt(colors.length);
        return colors[index].toString();
    }
}
