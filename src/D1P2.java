import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class D1P2 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("./inputs/d1.txt"));
        int larger = 0;
        int[] num = new int[3];

        int next = Integer.parseInt(scan.nextLine().trim());
        num[0] = next;

        next = Integer.parseInt(scan.nextLine().trim());
        num[1] = next;

        next = Integer.parseInt(scan.nextLine().trim());
        num[2] = next;

        int oldestIdx = 0;

        while (scan.hasNextLine()) {
            next = Integer.parseInt(scan.nextLine().trim());
            if (next > num[oldestIdx]) {
                larger += 1;
            }
            num[oldestIdx] = next;
            oldestIdx += 1;
            if(oldestIdx > 2) {
                oldestIdx = 0;
            }
        }

        System.out.println(larger);
    }

}
