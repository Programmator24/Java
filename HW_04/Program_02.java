package HW_04;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

public class Program_02 {
    //Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке,
    // и каждый из их узлов содержит одну цифру.
    // Сложите два числа и верните сумму в виде связанного списка.
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,2,3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));
        // result [6,6,0,1]
        System.out.println(sum(d1, d2));
    
    }
    
    
    public static Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) 
    {
        Deque<Integer> d3 = new ArrayDeque<>();
        while(d1.size()>0)
        {
            int tmp = d1.pollFirst() + d2.pollFirst();
            if (tmp > 9)
            {
                d3.addLast(tmp%10);
                d3.addLast(1);
            }
            else d3.addLast(tmp);
        }
        return d3;
    }
    }
    
