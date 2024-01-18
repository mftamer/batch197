package day30_lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C04Lambda07 {

    public static void main(String[] args) throws IOException {

        // How to access to a file
        Path path = Paths.get("C:\\Users\\TAMER\\IdeaProjects\\batch197\\src\\main\\java\\day30_lambda\\MyText.txt");
        Files.
                lines(path).
                forEach(System.out::println);

        // Convert all characters to uppercase and sort the lines in natural order
        Files.
                lines(path).
                map(String::toUpperCase).
                sorted().
                forEach(System.out::println);

        // Print the lines contain Java.
        Files.
                lines(path).
                filter(t-> t.contains("Java")).
                forEach(System.out::println);

        // Print the distinct words in the text file.
        Files.
                lines(path).
                map(t->t.split(" ")). //convert every line to Array
                flatMap(Arrays::stream). //Arrays changed into streams
                map(t-> t.replaceAll("\\p{Punct}","")).
                distinct().
                forEach(System.out::println);

        // Print the words' end with "s", distinctly, in uppercase and in alphabetical order.
        Files.
                lines(path).
                map(t-> t.split(" ")).
                flatMap(Arrays::stream).
                filter(t->t.endsWith("s")).
                map(String::toUpperCase).
                distinct().
                sorted().
                forEach(System.out::println);

        // Find the total number of letters used in the text file
        List<String> letters = Files.
                lines(path).
                map(t-> t.split("")).
                flatMap(Arrays::stream).
                map(t->t.replaceAll("[^A-Za-z]","")).
                collect(Collectors.toList());

        int num = letters.size();
        System.out.println(num);



    }
}
