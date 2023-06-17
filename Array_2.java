//WAP  to create an array an initialize and also print the value
public class Array_2 {
    public static void main(String[] args)
    {
        int a[] = new int[5];
        int x=10;
        for(int i=0; i<a.length; i++)
        {
            a[i]=x;
            x=x+10;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
