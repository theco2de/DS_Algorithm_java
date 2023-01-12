import org.junit.jupiter.api.Test;
public class MyArray {

    int[] arr;

    public MyArray(int size) {
        this.arr = new int[size];
    }

    public void add(int index, int data) {
        if (index < 0 || index > this.arr.length) {
            throw new ArrayIndexOutOfBoundsException("초과");
        }

        int[] clone = this.arr.clone();
    }

    @Test
    void test() {
        // MyArray init
        int[] arr = {1, 2, 3, 4, 5};
        int[] arrLength = new int[2];
    }


}
