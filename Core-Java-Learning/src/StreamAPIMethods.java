import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIMethods {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kaushalam", "Gujarat", "India", "Java", "Stream");

         Getting the first character of each string as a Stream
        Stream<Character> firstChars = names.stream()
                .filter(name -> name != null && !name.isEmpty()) // Filter out null/empty strings
                .map(name -> name.charAt(0));                     // Map to first character

        // Printing the first characters
        firstChars.forEach(System.out::println);
        using flatMAp
        List<Character> firstChars = names.stream()
                .filter(name -> name != null && !name.isEmpty())               // Filter out null/empty strings
                .flatMap(name -> name.chars().limit(1).mapToObj(c -> (char) c)) // Convert first character to Character Stream
                .collect(Collectors.toList());
        // Collecting the characters
        List<Character> secondChars = names.stream()
                .filter(name -> name!=null && !name.isEmpty())
                        .flatMap(name -> name.chars().limit(2).mapToObj(c->(char)c))
                                .collect(Collectors.toList());
        // Printing the result
        System.out.println(firstChars);
        System.out.println(secondChars);


        flatMap Exmaple
        List<List<Integer> > number = new ArrayList<>();

        // adding the elements to number arraylist
        number.add(Arrays.asList(1, 2));
        number.add(Arrays.asList(3, 4));
        number.add(Arrays.asList(5, 6));
        number.add(Arrays.asList(7, 8));

        System.out.println("List of list-" + number);

        // using flatmap() to flatten this list
        List<Integer> flatList
                = number.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        // printing the list
        System.out.println("List generate by flatMap-"
                + flatList);
        List<String> data = Arrays.asList("one", "two", "three");
        data.stream()
                .peek(System.out::println)
                .map(String::toUpperCase)
                .forEach(System.out::println);
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        nums.stream()
                .skip(1)
                .limit(5)   // Limit to next 3 elements
                .forEach(System.out::println);  // Output: 3, 4, 5
    }
}
