import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        doTask2();
    }

    
    static void doTask1() {
        String[] words = {"comics", "book", "book", "books", "Book", "storybook", "comix", "comiX"};

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));

        System.out.println(uniqueWords);

        Map<String, Integer> counter = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (counter.containsKey(words[i])) {
                counter.put(words[i], counter.get(words[i]) + 1);
            } else {
                counter.put(words[i], 1);
            }
        }
        System.out.println(counter);
    }

    static void doTask2() {
        Phonebook pb = new Phonebook();

        Iterator<String> it = pb.get("Nikita").iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}