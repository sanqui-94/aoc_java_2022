import java.util.Objects;
import java.util.Scanner;

public class one {
    static int greatestCalories = 0;
    static int currentCount = 0;


    public static void main(String[] args) {
//        System.out.println("Hey");
        Scanner scanner = new Scanner(System.in);
        String line = "";
        while (!Objects.isNull(line = scanner.nextLine())) {

//            System.out.println("line: " + line);
            if (line.equals("bye")) break;
            int value = 0;
            if (line.isEmpty() || line.equals("\n") || line.length() == 0) {
                if (currentCount > greatestCalories) {
                    greatestCalories = currentCount;
                    currentCount = 0;
                }
            } else {
                value = Integer.parseInt(line);
                currentCount += value;
            }
        }
        System.out.println(greatestCalories);
    }
}