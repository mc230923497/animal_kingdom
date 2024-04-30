import java.awt.Color;

public class Bear extends Critter {
    private boolean polar;
    private boolean slash;

    public Bear(boolean polar) {
        this.polar = polar;
        this.slash = true;
    }

    @Override
    public Color getColor() {
        return polar ? Color.WHITE : Color.BLACK;
    }

    @Override
    public String toString() {
        String bearSymbol = slash ? "/" : "\\";
        slash = !slash;
        return bearSymbol;
    }

    @Override
    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        } else {
            return Action.LEFT;
        }
    }
}

