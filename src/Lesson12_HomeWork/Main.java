package Lesson12_HomeWork;
import java.util.ArrayList;
import java.util.Arrays;
import Lesson12_HomeWork.entity.Bill;
import Lesson12_HomeWork.entity.Client;
import Lesson12_HomeWork.entity.Hotel;
import Lesson12_HomeWork.entity.Room;
import Lesson12_HomeWork.service.ConsoleService;

public class Main {
    public static void main(String[] args) {
       ArrayList<Hotel> hotelArrayList = new ArrayList<>(Arrays.asList(
                new Hotel("Paris",
                        new ArrayList<>(Arrays.asList(
                                new Room(1,1000,false),
                                new Room(1,1000,true),
                                new Room(2,2000,true),
                                new Room(2,2000,true),
                                new Room(3,3000,true),
                                new Room(3,3000,true),
                                new Room(4,4000,true),
                                new Room(4,4000,true)
                        ))),

                new Hotel("Tokyo",
                        new ArrayList<>(Arrays.asList(
                                new Room(1,1000,true),
                                new Room(2,2000,true),
                                new Room(3,3000,true),
                                new Room(4,4000,true)
                        ))),
                new Hotel("London",
                        new ArrayList<>(Arrays.asList(
                                new Room(1,1000,true),
                                new Room(2,2000,true)
                        )))
        ));

        Client sergeyShmidt = new Client("Sergey","Shmidt","+9906456987","one@gmail.com", new Bill(1000));
        Client ladaShmidt = new Client("Lada", "Shmidt", "+9906123456", "two@gmail.com", new Bill(2000));

        ArrayList<Client> clientList = new ArrayList<>(Arrays.asList(sergeyShmidt, ladaShmidt));

        ConsoleService consoleService = new ConsoleService();

        consoleService.booking(hotelArrayList,clientList);

    }
}
