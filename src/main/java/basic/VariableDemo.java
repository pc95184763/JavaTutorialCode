package basic;

public class VariableDemo {

    private int f;//instance variable

    private static int h;//class variable/static variable

    public static void main(String[] args) {
        int age = 20;
        System.out.println("age:" + age);

        age = 30;
        //30 = age;
       // 30 = age;  not allowed
        System.out.println("age:" + age);

        int _usa;
        int $usa;

        int j_a$p;





//        int number;
//        number = 100;


        int number = 100;

        System.out.println(number);


        int a = 0, b = 0, c = 0;


        System.out.println("a:" + a + "b:" + b + "c:" + c);

        int d = a + b + c;
        System.out.println("d:" + d);

        VariableDemo instance = new VariableDemo();
        instance.demo();


        System.out.println("f:" + instance.f);

        System.out.println("h:" + h);


    }

    private void demo() {
        System.out.println("f in demo:" + f);
        System.out.println("h in demo:" + h);
        //System.out.println("age:" + age);  cannot visit since out of scope
    }
}
