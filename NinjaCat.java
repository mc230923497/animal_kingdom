import java.awt.*;

public class NinjaCat extends Critter {
    private static final Color[] COLORS = {Color.BLACK, Color.GRAY, Color.DARK_GRAY};
    private int movesCount;

    public NinjaCat() {
        this.movesCount = 0;
    }

    public Color getColor() {
        int colorIndex = movesCount % COLORS.length;
        return COLORS[colorIndex];
    }

    public String toString() {
        return "N";
    }

    public Action getMove(CritterInfo info) {
        movesCount++;
        int randomMove = (int) (Math.random() * 3);
        switch (randomMove) {
            case 0:
                return Action.HOP;
            case 1:
                return Action.LEFT;
            case 2:
                return Action.RIGHT;
            default:
                return Action.INFECT;
        }
    }
}

