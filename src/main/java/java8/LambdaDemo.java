package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaDemo {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

        }

        System.out.println("=================");

        map.forEach((k, v) -> {
            System.out.println("Key=" + k);
            System.out.println("Value=" + v);
        });

        System.out.println("=================");


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.forEach(k -> System.out.println(k));


        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world!");
            }
        });


        new Thread(()->{
            System.out.println("Hello world!");
        });




    }


}
