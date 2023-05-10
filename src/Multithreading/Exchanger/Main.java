package Multithreading.Exchanger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;
import Multithreading.Exchanger.Action.*;
public class Main {
    public static void main(String[] args) {
        Exchanger<Actions> exchanger = new Exchanger();
        List<Actions> friendActions = new ArrayList<>();
        friendActions.add(Actions.PAPER);
        friendActions.add(Actions.SCISSORS);
        friendActions.add(Actions.STONE);

        List<Actions> myActions = new ArrayList<>();
        myActions.add(Actions.SCISSORS);
        myActions.add(Actions.PAPER);
        myActions.add(Actions.PAPER);

        Friend bob = new Friend("Bob", friendActions, exchanger);
        Friend sergey = new Friend("Sergey", myActions, exchanger);
    }
}
