import java.io.File;
import java.util.Scanner;

public class D2 {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("./inputs/d2.txt"));
        int aim = 0;
        int depth = 0;
        int horiz = 0;

        while (scan.hasNextLine()) {
            String[] data = scan.nextLine().split(" ");
            int num = Integer.parseInt(data[1]);
            switch (data[0]) {
                case "forward":
                    horiz += num;
                    depth += aim * num;
                    break;
                case "down":
                    aim += num;
                    break;
                case "up":
                    aim -= num;
                    break;
                default:
                    break;
            }
        }

        System.out.println(horiz);
        System.out.println(depth);
        System.out.println(horiz * depth);

    }

}
