public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        if (arr.length > 0 && 0 <= 0 && 0 < arr.length) {
            System.out.println(arr[0]); // Corrected code
        } else {
            System.out.println("Array is empty or index is out of bounds");
        }
    }
}