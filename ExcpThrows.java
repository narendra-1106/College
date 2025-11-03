public class ExcpThrows {
    public void printArray() throws ArrayIndexOutOfBoundsException {
        int[] a = {1, 2};
        System.out.println("Accessing element at index 3: " + a[3]);
    }

    public static void main(String args[]) {
        ExcpThrows e = new ExcpThrows();
        e.printArray();
    }
}
