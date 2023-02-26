package HW_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
public class Program_01 {
// 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// 2) Создать коллекцию ноутбуков.
// 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
//      ноутбуки, отвечающие фильтру.
//      Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение, Цвет - Значение
// 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
public static void main(String[] args) {
    Notebook nb1 = new Notebook("Apple", "McBook Air", 2018, "Space gray", 13, 256);
    Notebook nb2 = new Notebook("Sumsung", "A11", 2018, "Black", 14, 128); 
    Notebook nb3 = new Notebook("Apple", "McBook Pro", 2020, "Space gray", 15, 512);
    List<Notebook> listNoteBook= initListNotebooks(nb1,nb2,nb3);
    Map<Integer, Notebook> mpNoteBook = DBmap(listNoteBook);
    
    filter(mpNoteBook);

}


public static List<Notebook> initListNotebooks(Notebook nb1, Notebook nb2, Notebook nb3){
    List<Notebook> listNoteBook = new ArrayList<>(Arrays.asList(nb1,nb2,nb3));
    return listNoteBook;
}

public static Map<Integer, Notebook> DBmap(List<Notebook> listNotebook){
    Map<Integer, Notebook> mpNoteBook = new TreeMap<Integer, Notebook>();
    for (Notebook item : listNotebook) {
        mpNoteBook.put(item.id, item);
        
    }
    return mpNoteBook;
}
public static Map<Integer, Notebook> filter(Map<Integer, Notebook> xxx)
{
    String parameter = "256 GB";
    for (int i = 1; i < xxx.size()+1; i++) 
    {
       if(xxx.get(i).toString().contains(parameter))
       {
        System.out.println(xxx.get(i));
       } 
        
    }

    return xxx;
}
}
