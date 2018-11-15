package arraydemo;

public class ArrayDemo {
    public static void main(String[] args) {
        //define an array
        int a[];
        //create an array
        a = new int[10];

        //show array length
        System.out.println(a.length);

        //show initial value of an array
        for (int item : a) {
            System.out.print(item + " ");
        }
        //show element in array whose index is 9
        System.out.println(a[9]);

    }
}
