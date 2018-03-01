import java.util.ArrayList;

public class Team {
    private String name;
//    private int size;
    private int max;
    private ArrayList<Player> members;   // don;t forget to initialize in constructor

    public Team(String teamName) {
        this.name = teamName;
        this.members = new ArrayList<Player>();   // arrayList initialization
//        this.size = 0;
        this.max = 16;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player player) {

        if(members.size() < this.max) {
            this.members.add(player);
        }
    }

    public void printPlayers() {
        for(Player index: members) {
            System.out.println(index);
        }
    }

    public int goals() {
        int totalGoals = 0;
        for(Player index: members) {
            totalGoals += index.goals();
        }
        return totalGoals;
    }

    public int size() {
        return this.members.size();
    }

    public void setMaxSize(int maxSize) {
        this.max = maxSize;
    }
}
