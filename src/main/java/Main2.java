import java.security.KeyStore;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main2 {




    public static String aBcDe(String string) {

        List<String> substring2 = Arrays.asList(string.split("(?<=\\G.{2})"));

       String result = substring2.stream()
               .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
               .collect(Collectors.joining());
//               .forEach(n-> System.out.print(n))
       return result;
    }


    public static void main(String[] args) {

        System.out.println( aBcDe("ala ma kota")    );

//        Stream<String> letters = Stream.of("onetwo".split("") );
//
//        List<String> list = Arrays.asList("a","b","c","d","e");
//
//        int skip = 2;
//        int size = list.size();
//        int limit = size / skip + Math.min(size % skip, 1);
//
//        List<String> result = Stream.iterate(0, i -> i + skip)
//                .limit(limit)
//                .map(list::get)
//                .map(String::toUpperCase)
//                .collect(Collectors.toList());
//
//        System.out.println(result);

    }

}
