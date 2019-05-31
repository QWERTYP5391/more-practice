import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class AverageWordLength {

    /**
     *
     *
     * [word] -> count
     * @param sentence
     * @return
     */
    public static double averageWordLength(String sentence) {
        AtomicInteger wordLength = new AtomicInteger();

        String[] words = sentence.replace("[^a-zA-Z0-9]", " ").split(" ");
        Arrays.stream(words).parallel().forEach(w -> wordLength.addAndGet(w.length()));

        return (double) wordLength.get() / words.length;
    }
}
