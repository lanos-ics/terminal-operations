import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class AppRunner {
    public static void main(String[] args) {
        // terminal operation
//        List<String> fruits = List.of("apple", "orange", "banana");
//
//        fruits.stream().forEach(fruit -> System.out.println( "this is " + fruit));
//
//        Array string =  fruits.stream().filter().toArray();

        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
        List<String> xyz = List.of("one", "two", "three");
             Optional<Integer> sum = nums.stream()
                     .reduce( (first, second) -> first + second );
             Optional<String> kuchBhi = xyz.stream().min(Comparator.comparing(String::length));

             kuchBhi.ifPresent(System.out::println);
             Optional<String> k = kuchBhi.stream().findAny();

             k.ifPresent(System.out::println);



    }
}
