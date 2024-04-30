import java.awt.Color;
import java.util.Random;

public class Tiger extends Critter {
    private int colorPhase;

    public Tiger() {
        this.colorPhase = new Random().nextInt(3);
    }

    public Color getColor() {
        switch (colorPhase) {
            case 0:
                return Color.RED;
            case 1:
                return Color.GREEN;
            default:
                return Color.BLUE;
        }
    }

    public String toString() {
        return "TGR";
    }

    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getRight() == Neighbor.WALL || info.getFront() == Neighbor.WALL) {
            return Action.LEFT;
        } else if (info.getFront() == Neighbor.SAME) {
            return Action.RIGHT;
        } else {
            return Action.HOP;
        }
    }
}


