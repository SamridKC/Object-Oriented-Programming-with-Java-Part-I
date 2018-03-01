public class Player {
    private String name;
    private int goals;

    public Player(String playerName) {
        this(playerName, 0);
    }

    public Player(String playerName, int amountOfGoals) {
        this.name = playerName;
        this.goals = amountOfGoals;
    }

    public String getName() {
        return this.name;
    }

    public int goals() {
        return this.goals;
    }
    @Override
    public String toString() {
        return "Player: " + this.name + ", goals " + this.goals;
    }
}
