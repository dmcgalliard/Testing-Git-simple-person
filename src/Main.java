import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Person player = new Person();

        player.setName(player);
        player.setAge(player);
        player.setOccupation(player);

        System.out.println("Name: " + player.getName());
        System.out.println("Age: " + player.getAge());
        System.out.println("Occupation: " + player.getOccupation());



    }


}