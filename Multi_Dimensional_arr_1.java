public class Multi_Dimensional_arr_1 {
    public static void main(String[] args)
    {

        //declaration ofmulti-dimensional array
        int[][] arr = new int[3][4];

        int x=10;

        //assing the value to the  array 'arr'
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length; j++)
            {
                arr[i][j] = i + j;
            }
        }

        //Printing the element of an array
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
