package core.basesyntax;


import java.util.Random;

public class ColorSupplier {
    Random random =new Random();
    static Color[] colors=Color.values();
    private static final int FIGURE_COUNT = colors.length;
    public String getRandomColor() {
        int index = random.nextInt(colors.length);
        return colors[index].toString();
    }
}
