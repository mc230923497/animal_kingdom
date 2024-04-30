import java.awt.Color;

public class WhiteTiger extends Tiger {
    private boolean infected;
    
    public WhiteTiger() {
        this.infected = false;
    }

    public Color getColor() {
        return Color.WHITE;
    }

    public String toString() {
        return infected ? "TGR" : "tgr";
    }

    public Action getMove(CritterInfo info) {
        Action action = super.getMove(info);
        if (action == Action.INFECT) {
            infected = true;
        }
        return action;
    }
}


