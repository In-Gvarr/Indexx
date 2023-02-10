public class main {
    public static int findIndex(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {3, 6, 4, 7, 2, 1, 9};
        int value = 3;
        int index = findIndex(array, value);
        System.out.println("Index of " + value + " is: " + index);
    }
}