package HW_05;

import java.lang.reflect.Array;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Program_01
{
    // Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
    // Пусть дан список сотрудников:Иван Иванов (и остальные)
    // Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
    // Отсортировать по убыванию популярности.
    public static void main(String[] args) 
    {
        HashMap<Integer, String> TelephoneBook = new HashMap<Integer, String>();
        HashMap<String, String> TelephoneBook2 = new HashMap<String, String>();
        HashMap<String, Integer> Frequency = new HashMap<String, Integer>();
        // TelephoneBook.put("88001122333", "Ivan Ivanov");
        // TelephoneBook.put("88001122444", "Ivan Kuricin");
        // TelephoneBook.put("88001122555", "Ivan Kuricin");
        // TelephoneBook.put("88001122666", "Ivan Nezlobin");
        // TelephoneBook.put("88001122777", "Sergey Potapov");
        // TelephoneBook.put("88001122888", "Sergey Potapov");
        // TelephoneBook.put("88001122999", "Serrgey Kuricin");
        // TelephoneBook.put("88001122990", "Mikhail Nezlobin");






        ArrayList<String> TelBook = new ArrayList<String>();
        TelBook.add("Ivan Ivanov 88001122333");
        TelBook.add("Ivan Kuricin 88001122444");
        TelBook.add("Ivan Kuricin 88001122555");
        TelBook.add("Ivan Nezlobin 88001122666");
        TelBook.add("Sergey Potapov 88001122777");
        for (int i = 0; i < TelBook.size(); i++) 
        {
            TelephoneBook.put(i, TelBook.get(i));
        }
        for (int i = 0; i < TelBook.size(); i++)
        {
            String[] x = TelephoneBook.get(i).split(" ");
            TelephoneBook2.put(x[1], x[0]);
        }


        Object[] objectArray = TelephoneBook2.values().toArray();

        ArrayList<Object> xxx = new ArrayList<Object>();
        for (int j = 0; j < objectArray.length; j++) 
        {
            xxx.add(objectArray[j]);
        }

        
        Set<Object> unique = new HashSet<Object>(xxx);

        for (Object key : unique) 
        {
            Frequency.put(key, Collection.frequency(xxx, key));
        }
        System.out.println();
        

        
        
            // System.out.println(y[0] + "=" + count);
            
    

        
    }
}

