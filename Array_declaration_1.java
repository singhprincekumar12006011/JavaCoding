public class Array_declaration_1
{
    public static void main(String[] args)
    {
        int array[] = new int[5];
        //new int[5]: This part of the syntax dynamically allocates memory for the array and specifies its size.
        // The new keyword is used to create a new instance of the array object. 

        
        array[0] =10;
        array[1]=20;
        array[2]=30;
        array[3]=40;
        array[4]=50;

        for(int i=0; i<array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
}