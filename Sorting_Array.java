public class Sorting_Array {
    public static void main(String[] args) 
    {
        int arr[] = {2,4,6,7,3,1,5,9,8};
        int temp=0;

        System.out.println("The array before sorting is :");
        for(int x:arr)
        {
            System.out.print(x + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        //Printing the sorted array.
        for(int x:arr)
        {
            System.out.print(x + " ");
        }
    }
    
}
