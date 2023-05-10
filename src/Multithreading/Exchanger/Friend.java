package Multithreading.Exchanger;
import java.util.List;
import java.util.concurrent.Exchanger;
import Multithreading.Exchanger.Action.*;
/*
    Exchanger - это синхронизатор, позволяющий обмениваться данными между двумя потоками,
    обеспечивает то, что оба потока получат информацию друг от друга одновременно.
*/
public class Friend extends Thread{
    private String name;
    private List<Actions> myActions;
    private Exchanger<Actions> exchanger;

    public Friend(String name, List<Actions> myActions, Exchanger<Actions> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.start();
    }
    private void whoWins(Actions myActions, Actions friendsActions){
        if((myActions == Actions.STONE && friendsActions == Actions.SCISSORS)
        || (myActions == Actions.SCISSORS && friendsActions == Actions.PAPER)
        || (myActions == Actions.PAPER && friendsActions == Actions.STONE)) {
            System.out.println(name + " WINS!!!");
        }
    }
    @Override
    public void run() {
        // Ответ от второго потока будет хранится в reply
        Actions reply;
        for(Actions action: myActions) {
            try{
                // Метод exchange() возвращает информацию, полученную от второго потока
                reply = exchanger.exchange(action);
                whoWins(action, reply);
                sleep(2000);
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
