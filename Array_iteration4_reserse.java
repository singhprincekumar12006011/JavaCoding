//WAP to reverse the element of an string.



public class Array_iteration4_reserse {
    public static void main(String[] args)
    {
        String[] str = {"Mon","Tue","Wed","Thr","Fri","Sat","Sun"};

        //Printing the array.
        System.out.println("The array is :");
        for(String p: str)
        {
            System.out.print(p + " ");
        }

        //reversing the element of an array 
        String temp;
        int j = str.length-1;

        for(int i=0; i<str.length/2; i++)
        {
            temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            j--;

        }
        
        //Printing the reverse of the array.

        System.out.println("\n"+"\n");
        System.out.println("The reverse to array :");
        for(String m:str)
        {
            System.out.print(m + " ");
        }
        
    }
}
