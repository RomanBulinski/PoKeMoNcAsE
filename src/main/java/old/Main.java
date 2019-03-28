package old;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {


    static String capitaliseFirstLetter(String name){
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    static String capitaliseSecondLetter(String name){
        return name.substring(0, 1).toUpperCase() + name.substring(1, 2).toUpperCase() + name.substring(2);
    }


//    public static void main(String[] args) {

//        List<String> stringCollection = new ArrayList<>();
//        stringCollection.add("ddd2");
//        stringCollection.add("aaa2");
//        stringCollection.add("bbb1");
//        stringCollection.add("aaa1");
//        stringCollection.add("bbb3");
//        stringCollection.add("ccc");
//        stringCollection.add("bbb2");
//        stringCollection.add("ddd1");

//        stringCollection
//                .stream()
//                .filter((s) -> s.startsWith("a"))
//                .forEach(System.out::println);


//        Stream<String> word = Stream.of("onetwo" );
//        word
//                .forEach(System.out::println);
//
//
//
//        Stream<String> word2 = Stream.of("onetwo" );
//        word2
//                .map(String::toUpperCase)
//                .forEach(System.out::println);

//        stringCollection
//                .stream()
//                .map(old.Main::capitaliseFirstLetter) // replace old.Main with the class containing the capitaliseFirstLetter method
//                .sorted()
//                .forEach(System.out::println);
//
//
//        stringCollection.stream()
//                .map(x -> x.substring(0, 1).toUpperCase() + x.substring(1))
//                .sorted()
//                .forEachOrdered(System.out::println);
//
//
//        stringCollection
//                .stream()
//                .map(old.Main::capitaliseSecondLetter) // replace old.Main with the class containing the capitaliseFirstLetter method
//                .sorted()
//                .forEach(System.out::println);
//
//
//        stringCollection
//                .stream()
//                .map(x -> x.substring(0, 1) + x.substring(1, 2).toUpperCase() + x.substring(2))
//                .sorted()
//                .forEachOrdered(System.out::println);
//
//
//        stringCollection
//                .stream()
//                .map(x -> x.substring(0, 1) + x.substring(1, 2).toUpperCase() + x.substring(2))
//                .sorted()
//                .forEachOrdered(System.out::println);









//    }


}
