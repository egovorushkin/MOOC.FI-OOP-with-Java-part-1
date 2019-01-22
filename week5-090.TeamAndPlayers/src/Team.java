import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players;
    private int sizeOfTeam;

    public Team(String name) {
        this.name = name;
        sizeOfTeam = 16;
        players = new ArrayList<Player>(sizeOfTeam);

    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player){
        if(this.players.size() < this.sizeOfTeam) {
            players.add(player);
        }
    }

    public void printPlayers(){
        for (Player player : this.players ){
            System.out.println(player);
        }
    }

    public void setMaxSize(int maxSize){
        this.sizeOfTeam = maxSize;
        this.players = new ArrayList<Player>(this.sizeOfTeam);
    }

    public int size(){
        return this.players.size();
    }

    public int goals(){
        int total = 0;
        for (Player p : this.players){
            total += p.goals();
        }
        return total;
    }
}
