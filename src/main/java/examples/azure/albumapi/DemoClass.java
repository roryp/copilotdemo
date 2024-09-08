package examples.azure.albumapi;

import java.util.ArrayList;
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

        // JDK 8: Diamond operator enhancements
        ArrayList<String> list = new ArrayList<>(); // Diamond operator with anonymous class

        // JDK 8: Local variables
        String message = "Hello, var!";
        System.out.println(message);

        // JDK 8: Lambda parameters
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        numbers.forEach((Integer number) -> System.out.println(number));

        // JDK 8: String new methods
        String str = "  Hello, World!  ";
        System.out.println(str.trim());
        System.out.println(Stream.of("Line1", "Line2", "Line3").collect(Collectors.toList()));
        System.out.println(new String(new char[3]).replace("\0", "Hello"));

        // JDK 8: Optional.isPresent()
        Optional<String> optional = Optional.of("Hello");
        System.out.println(!optional.isPresent());

        // JDK 8: Switch statements
        String day = "MONDAY";
        int result;
        switch (day) {
            case "MONDAY":
            case "FRIDAY":
            case "SUNDAY":
                result = 6;
                break;
            case "TUESDAY":
                result = 7;
                break;
            case "THURSDAY":
            case "SATURDAY":
                result = 8;
                break;
            case "WEDNESDAY":
                result = 9;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + day);
        }
        System.out.println(result);

        // JDK 8: Traditional string concatenation
        String textBlock = "This is a text block.\n" +
                   "It spans multiple lines.\n";
        System.out.println(textBlock);

        // JDK 8: Traditional class instead of record
        class Point {
            private final int x;
            private final int y;

            public Point(int x, int y) {
                this.x = x;
                this.y = y;
            }

            @Override
            public String toString() {
                return "Point{" +
                        "x=" + x +
                        ", y=" + y +
                        '}';
            }
        }
        Point point = new Point(1, 2);
        System.out.println(point);

        // JDK 8: Traditional instanceof check and casting
        Object obj = "Hello, World!";
        if (obj instanceof String) {
            String s = (String) obj;
            System.out.println(s.toUpperCase());
        }

        // JDK 8: Stream.collect(Collectors.toList())
        Stream<String> stream = Stream.of("a", "b", "c");
        List<String> listFromStream = stream.collect(Collectors.toList());
        System.out.println(listFromStream);
    }
}