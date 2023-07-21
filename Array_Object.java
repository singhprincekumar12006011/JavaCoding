//In java programming the objects array are used to store the element of different data  type.



public class Array_Object {
    public static void main(String[] args)
    {
        Object[][] arr = {
            {"First Name", "Last Name", "State", "Degree", "Score", "Gender"},
            {"Prince", "Kumar", "Bihar", "B-tech", 9, 'M'},
            {"Tanu", "Singh", "Bihar", "BA", 6, 'F'},
            {"Manish", "Kumar", "Bihar", "BA", 6, 'M'}
        };

        for (Object[] row : arr) {
            for (Object o : row) {
                System.out.print(o + " ");
            }
            System.out.println();
        }
    }
}