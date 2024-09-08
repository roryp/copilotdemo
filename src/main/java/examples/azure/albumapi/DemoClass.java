package examples.azure.albumapi;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoClass {

    public static void main(String[] args) {
        // JDK 8: Lambda expressions
        Runnable runnable = () -> System.out.println("Hello, Lambda!");
        runnable.run();

        // JDK 8: Stream API
        List<String> names = List.of("Alice", "Bob", "Charlie");
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperCaseNames);

        // JDK 8: Repeating annotations
        @Deprecated
        @Deprecated
        class DeprecatedClass {
        }

        // JDK 9: Diamond operator enhancements
        var list = new ArrayList<>(); // Diamond operator with anonymous class

        // JDK 10: var for local variables
        var message = "Hello, var!";
        System.out.println(message);

        // JDK 11: var for lambda parameters
        var numbers = List.of(1, 2, 3, 4, 5);
        numbers.forEach((var number) -> System.out.println(number));

        // JDK 11: String new methods
        var str = "  Hello, World!  ";
        System.out.println(str.strip());
        System.out.println("Line1\nLine2\nLine3".lines().collect(Collectors.toList()));
        System.out.println("Hello".repeat(3));

        // JDK 11: Optional.isEmpty()
        var optional = Optional.of("Hello");
        System.out.println(optional.isEmpty());

        // JDK 14: Switch expressions
        var day = "MONDAY";
        var result = switch (day) {
            case "MONDAY", "FRIDAY", "SUNDAY" -> 6;
            case "TUESDAY" -> 7;
            case "THURSDAY", "SATURDAY" -> 8;
            case "WEDNESDAY" -> 9;
            default -> throw new IllegalStateException("Unexpected value: " + day);
        };
        System.out.println(result);

        // JDK 15: Text blocks
        var textBlock = """
                This is a text block.
                It spans multiple lines.
                """;
        System.out.println(textBlock);

        // JDK 16: Records
        record Point(int x, int y) {
        }
        var point = new Point(1, 2);
        System.out.println(point);

        // JDK 16: Pattern matching for instanceof
        Object obj = "Hello, World!";
        if (obj instanceof String s) {
            System.out.println(s.toUpperCase());
        }

        // JDK 16: Stream.toList() method
        var stream = Stream.of("a", "b", "c");
        var listFromStream = stream.toList();
        System.out.println(listFromStream);
    }
}
