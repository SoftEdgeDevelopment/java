package unit06.array.learning27;
//multiple shift right array
public class MultipleRightShift {
    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        //shifts it 3 to the right
        for (int i = 0; i < 3; i++) {
            firstArray = shiftRight(firstArray);
        }
        printArray(firstArray);

        //another way also shifts it 3 more to the right
        for (int i = 0; i < firstArray.length; i = i+3) {
            firstArray = shiftRight(firstArray);

        }
        printArray(firstArray);
    }

    public static int[] shiftRight(int[] firstArray) {
        int[] secondArray = new int[firstArray.length];
        for (int i = 0; i < firstArray.length - 1; i++) {
            secondArray[i+1] = firstArray[i];
        }
        secondArray[0] = firstArray[firstArray.length - 1];
        return secondArray;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
