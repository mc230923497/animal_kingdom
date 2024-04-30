```java
import java.awt.Color;

public class Giant extends Critter {
    private int movesCount;

    public Giant() {
        this.movesCount = 0;
    }

    public Color getColor() {
        return Color.GRAY;
    }

    public String toString() {
        int phase = (movesCount / 6) % 4;
        switch (phase) {
            case 0:
                return "fee";
            case 1:
                return "fie";
            case 2:
                return "foe";
            default:
                return "fum";
        }
    }

    public Action getMove(CritterInfo info) {
        movesCount++;
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        } else {
            return Action.RIGHT;
        }
    }
}




