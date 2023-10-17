import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static Scanner in = new Scanner(System.in);
    static List<Integer> list = new ArrayList<>();
    int[] y = new int[Integer.parseInt(in.nextLine())];
    public static int sum;
    public static int x;
    String in;

    list.add(Integer.parseInt(in));
    int sum = 0;
    for (Integer item : list) {
        System.out.println((++i) + ". " + item);
        sum += item;
    }

    public static int add(int x) {
        for (x = 1; x < list.size(); x++) ;
        sum = x;
        return x;
    }

    public static void main(String[] args) {
        System.out.println("Enter numbers to find sum, enter \"Q\" to quit");
        list.add(Integer.parseInt(in.nextLine()));
        while (!(in.nextLine().toUpperCase().equals("q"))) {
            add(x);
            System.out.println(x);
        }

    }
}