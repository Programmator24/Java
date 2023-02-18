package HW_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
public class Program_01 {
// Пусть дан произвольный список целых чисел
public static void main(String[] args) 
{
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 9, 8, 12, 2, 4, 1));
    System.out.println(list);
    getMin(list);
    getMax(list);
    removeEvenValue(list);

}

// Нужно удалить из него четные числа
public static ArrayList<Integer> removeEvenValue(ArrayList<Integer> list)
{
    ListIterator<Integer> lisIterator = list.listIterator();
    while(lisIterator.hasNext())
    {
        if (lisIterator.next()%2 == 0)
        {
            lisIterator.remove();
        } 
    }
    System.out.println(list);
    return new ArrayList<>();
}

// Найти минимальное значение
public static Integer getMin(List<Integer>list)
{
    int min = list.get(0);
    for (int i = 1; i < list.size(); i++) 
    {
        if (list.get(i) < min)
        {
            min = list.get(i);
        }
    }
    System.out.println(min);

    return min;
}

// Найти максимальное значение
public static Integer getMax(List<Integer> list)
{
    int max = list.get(0);
    for (int i = 1; i < list.size(); i++) 
    {
        if(list.get(i) > max)
        {
            max = list.get(i);
        }
    }
    System.out.println(max);
    return max;
}
}