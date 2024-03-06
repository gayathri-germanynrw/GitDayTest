package day01package;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(31);
        list.add(40);
        System.out.println(list);
        System.out.println("list.removeIf() = "
                + list.removeIf(x -> x % 2 != 0));
    }
}
