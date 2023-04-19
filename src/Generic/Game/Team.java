package Generic.Game;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participant>{
    private String name;
    List<T> participantsList = new ArrayList<>();
    Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(T participant) {
        participantsList.add(participant);
    }

    public void playWith(Team<T> team) {
        String winnerName;
        Random random = new Random();
        int value = random.nextInt(2);
        if (value == 0) {
            winnerName = this.name;
        } else {
            winnerName = team.name;
        }
        System.out.println("Winner: " + winnerName);
    }
}
