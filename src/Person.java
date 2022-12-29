import java.util.Scanner;

//creates Person class with needed values
public class Person {
    private String name;
    private int age;
    private String occupation;
    
    //default constructor
    public Person() {

    }
    //setters
    public void setName(Person p) {
        System.out.println("Enter your name: ");

        Scanner in = new Scanner(System.in);

        String newName = in.nextLine();
        this.name = newName;
    }
    public void setAge(Person p) {
        System.out.println("Enter your age: ");

        Scanner in = new Scanner(System.in);

        int newAge = in.nextInt();
        this.age = newAge;
    }

    public void setOccupation(Person p) {
        System.out.println("Enter your occupation: ");

        Scanner in = new Scanner(System.in);

        String newOccupation = in.nextLine();
        this.occupation = newOccupation;
    }

    //getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }
}
