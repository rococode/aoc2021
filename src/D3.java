import java.io.File;
import java.util.Scanner;

public class D3 {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("./inputs/d3.txt"));

        while (scan.hasNextLine()) {
            String[] data = scan.nextLine().split(" ");
            int num = Integer.parseInt(data[1]);
        }

        System.out.println();
        System.out.println();
        System.out.println();
    }

}
