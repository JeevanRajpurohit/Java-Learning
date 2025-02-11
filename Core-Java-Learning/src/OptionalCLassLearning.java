import java.util.Optional;

public class OptionalCLassLearning {
    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
        System.out.println(empty);
        String[] str = new String[5];

        // Setting value for 2nd index
        str[2] = "fsdjh";
        Optional<String> value = Optional.of(str[2]);
        System.out.println(value.get());
        System.out.println(value.hashCode());
        System.out.println(value.isPresent());
    }
}
