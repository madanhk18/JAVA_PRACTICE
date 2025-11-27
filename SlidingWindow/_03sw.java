package SlidingWindow;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class _03sw {
    public static void main(String[] args) {
        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int windSize = 3;

        List<Integer> list=new ArrayList<>();

        list.add(12);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        list.add(1);
        list.add(43);
//        System.out.println("BEfore"+list);
//        list.addFirst(98);
//
//
//        System.out.println(list.getFirst());
//        list.removeFirst();
//        System.out.println("After"+list);

        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(1);
        dq.addFirst(2);

        dq.addLast(3);
//        System.out.println(dq);
        dq.offerFirst(4);
//
//        System.out.println(dq.peek());
//        System.out.println(dq.peekLast());
        dq.add(111);
        System.out.println(dq);

    }
}
