import java.util.Scanner;

class InsertionExample {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int x = 10;
        int n, pos;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to insert:");
        n = sc.nextInt();
        System.out.println("Enter the position to insert the element (1 to " + (arr.length + 1) + "):");
        pos = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = x;
            x = x + 15;
        }

        System.out.println("The array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Insertion logic
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < arr.length + 1; i++, j++) {
            if (i == pos - 1) {
                newArr[i] = n;
                j--;
            } else {
                newArr[i] = arr[j];
            }
        }

        System.out.println("The array after insertion:");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}