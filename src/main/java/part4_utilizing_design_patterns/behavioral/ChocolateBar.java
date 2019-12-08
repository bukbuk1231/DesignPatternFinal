package part4_utilizing_design_patterns.behavioral;

import java.util.Iterator;

public class ChocolateBar {

    private int[] chunks;

    public ChocolateBar() {
        chunks = new int[] { 3, 1, 2, 5, 4 }; // hard code for demo purpose
    }

    public Iterator<Integer> iterator() {
        return new ChocolateIterator();
    }

    class ChocolateIterator implements Iterator<Integer> {
        private int ptr;
        private int incr;

        ChocolateIterator() {
            ptr = chunks.length / 2;
            incr = -1;
        }

        public boolean hasNext() {
            return ptr < chunks.length;
        }

        public Integer next() {
            Integer bar = hasNext() ? chunks[ptr] : null;
            ptr += incr;
            if (ptr < 0) {
                ptr = chunks.length / 2 + 1;
                incr = 1;
            }
            return bar;
        }
    }
}
