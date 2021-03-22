import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Phonebook {
    private final Map<String, Set<String>> book;

    public Phonebook() {
        this.book = new HashMap<>();
    }

    public void add(String name, String number) {
        Set<String> numbers = book.getOrDefault(name, new HashSet<>());
        numbers.add(number);
        book.putIfAbsent(name, numbers);
    }

    public Set<String> get(String name) {
        return book.getOrDefault(name, Collections.emptySet());
    }
}
