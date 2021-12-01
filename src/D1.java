import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class D1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("./inputs/p1.txt"));
        int larger = -1; // don't count first line
        int prev = Integer.MIN_VALUE;

        while (scan.hasNextLine()) {
            int next = Integer.parseInt(scan.nextLine().trim());
            if (next > prev) {
                larger += 1;
            }
            prev = next;
        }

        System.out.println(larger);
    }

}
