import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class day6PartOne {
    public static void main(String[] args) throws IOException {

        List<String> allLines = Files.readAllLines(Paths.get("C:\\Users\\Tihomir\\IdeaProjects\\adventofcode\\src\\input6.txt"));

        for (String line : allLines) {
            String[] lineSplitted = line.split("");
            HashSet<String> set = new HashSet<>();
            int answer;
            for (int i = 0; i < lineSplitted.length - 3; i++) {
                set.add(lineSplitted[i]);
                set.add(lineSplitted[i + 1]);
                set.add(lineSplitted[i + 2]);
                set.add(lineSplitted[i + 3]);
                if (set.size() == 4) {
                    System.out.println("Index is " + i);
                    answer = i + 4;
                    System.out.println("Answer is: " + answer);
                    break;
                } else {
                    set.clear();
                }
            }
        }

    }

}

// a b c d e f - length - 6
//     1563  64 65 66