 //WAP to create an array and initialize it.


public class Array_1 {
    public static void main(String[] args)
    {
        int a[];
        a = new int[4];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
