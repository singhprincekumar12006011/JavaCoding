// WAP to print the element of an array and also print the length of an array


public class Array_Size {
    public static void main(String[] args)
    {
        int a[] = {10,20,30};
        // To check the length of an array
        System.out.println("The length of an element is " + a.length);

        a[0]=20;
        a[1]=40;
        a[2]=60;
        System.out.println("The element of an array are : ");
        for(int i=0; i<a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
}
