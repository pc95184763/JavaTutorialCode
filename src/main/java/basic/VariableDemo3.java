package basic;

public class VariableDemo3 {

  public static void main(String[] args) {
    int a = 2;
    int b = 4;

    int sum = a + b;
    System.out.println("sum=" + sum);

    int dis = a - b;
    System.out.println("dis=" + dis);

    int mul = a * b;
    System.out.println("mul=" + mul);

    System.out.println("div=" + (a / b));

    System.out.println(5 / 2);
    System.out.println((int) 5.0 / 2);//显示类型转换 ，当我们进行缩窄类型的时候必须显示调用
    System.out.println(5.0 / 2); //拓宽类型，自动完成，无需显示调用

    float a1 = 1.0f;
    float a2 = 1.0f;

    System.out.println(a1 + a2);
    System.out.println(a1 - a2);
    System.out.println(a1 * a2);
    System.out.println(a1 / a2);

    //取模操作符获取两数相除的余数
    System.out.println(5 % 2);
    System.out.println(5.0 % 2);


  }

}
