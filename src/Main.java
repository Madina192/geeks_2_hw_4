import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names_A = new ArrayList<>();
        ArrayList<String> names_B = new ArrayList<>();

        System.out.println("Enter names for list A:");
        for (int i = 0; i < 5; i++) {
            names_A.add(scanner.nextLine());
        }

        System.out.println("names A: " + names_A);

        System.out.println("Enter names for list B:");
        for (int i = 0; i < 5; i++) {
            names_B.add(scanner.nextLine());
        }
        System.out.println("names B: " + names_B);

        ArrayList<String> names_C = new ArrayList<>();
        Collections.reverse(names_B);

        for (int i = 0; i < names_A.size(); i++) {
            names_C.add(names_A.get(i));
            names_C.add(names_B.get(i));
        }

        System.out.println("names C: " + names_C);

        names_C.sort(Comparator.comparingInt(String::length));

        System.out.println("Sorted names C: " + names_C);
    }
}