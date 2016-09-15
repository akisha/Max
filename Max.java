public class Max {
    public static void main(String[] args) {
        int[] arr = {-2, -5, -7, -1};
        int max = arr [0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) max = arr[i];
        }
        System.out.print("Максимальный элемент массива arr = {");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i]);
            System.out.print(", ");
        }
        System.out.print(arr[arr.length - 1]);
        System.out.print("} равен ");
        System.out.println(max);
    }
}
