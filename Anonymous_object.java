import java.util.*;

class Anonymous_object {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array:");
        int n = sc.nextInt();

        // Creating an array
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element of " + i + " index: ");
            arr[i] = sc.nextInt();
        }

        // Printing the array
        System.out.println("The array that you have entered is:");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Anonymous object for printing the maximum element
        System.out.println("Maximum element is:" +
                (new Object() {
                    int max = arr[0];

                    public int getMax() {
                        for (int element : arr) {
                            if (element > max) {
                                max = element;
                            }
                        }
                        return max;
                    }
                }).getMax()
        );
    }
}