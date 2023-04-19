package Generic.Game;
public class Main {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 15);
        Schoolar schoolar2 = new Schoolar("Maria", 16);
        Schoolar schoolar3 = new Schoolar("Bob", 15);
        Schoolar schoolar4 = new Schoolar("Anton", 14);

        Team<Schoolar> schoolarTeam1 = new Team("Dragons");
        schoolarTeam1.addNewParticipant(schoolar1);
        schoolarTeam1.addNewParticipant(schoolar2);

        Team<Schoolar> schoolarTeam2 = new Team("Elephants");
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        Student student1 = new Student("Oleg", 20);
        Student student2 = new Student("Olya", 18);
        Student student3 = new Student("Max", 25);
        Student student4 = new Student("Natasha", 22);

        Team<Student> studentTeam1 = new Team("Tigers");
        studentTeam1.addNewParticipant(student1);
        studentTeam1.addNewParticipant(student2);

        Team<Student> studentTeam2 = new Team("Lions");
        studentTeam2.addNewParticipant(student3);
        studentTeam2.addNewParticipant(student4);

        Employee employee1 = new Employee("Vladimir", 45);
        Employee employee2 = new Employee("Petr", 30);
        Employee employee3 = new Employee("Evgeny", 40);
        Employee employee4 = new Employee("Sergey", 50);

        Team<Employee> employeeTeam1 = new Team("Fishers");
        employeeTeam1.addNewParticipant(employee1);
        employeeTeam1.addNewParticipant(employee2);

        Team<Employee> employeeTeam2 = new Team("Rainbow");
        employeeTeam2.addNewParticipant(employee3);
        employeeTeam2.addNewParticipant(employee4);

        schoolarTeam1.playWith(schoolarTeam2);
    }
}
