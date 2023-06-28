public class Array_declaration_2 {
    public static void main(String[] args)
    {
        int[] arr;
        arr=new int[5];
        int x=10;
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = x;
            x=x+10;
        }

        // TO PRINT THE ELEMENT OF AN ARRAY 
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }

    }
    
}
