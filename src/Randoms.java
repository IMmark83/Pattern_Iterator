import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    private int min, max;

    public Randoms(int min, int max) {
        this.random = new Random();
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int current = min;

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                int newRandom = random.nextInt(max - min + 1) + min;
                current = newRandom;
                return newRandom;
            }
        };
    }
}