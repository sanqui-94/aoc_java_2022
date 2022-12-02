import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class one {

    public static void main(String[] args) throws IOException {
        try (Stream<String> stream = Files.lines(Paths.get("./utils/input.txt"))) {
            var lambdaContext = new Object() {
                int currentCount = 0;
                List<Integer> greatestCalories = new ArrayList<>();
            };

            stream.forEach(line -> {
                if (line.isEmpty()) {
                    lambdaContext.greatestCalories.add(lambdaContext.currentCount);
                    lambdaContext.currentCount = 0;
                } else {
                    lambdaContext.currentCount += Integer.parseInt(line);
                }
            });

            Collections.sort(lambdaContext.greatestCalories, Collections.reverseOrder());
            Integer sum = lambdaContext.greatestCalories.get(0) + lambdaContext.greatestCalories.get(1) + lambdaContext.greatestCalories.get(2);
            System.out.println(sum);
        }
    }
}