import java.io.FileWriter;
import java.util.Scanner;

//Напишите программу, которая принимает с консоли число в формате byte и записывает его в файл ”result.txt”.
//Требуется перехватить все возможные ошибки и вывести их в логгер.
//
//После написания, попробуйте подать на вход числа 100 и 200 и проследите разницу в результате
public class Program_01 {
     public static void main(String[] args) 
    {
        String filePath = "test.txt";
        Scanner scanner = new Scanner(System.in);
        byte stones = scanner.nextByte();
        String stones1 = Byte.toString(stones);
        scanner.close();
        
        findJewelsInStones(stones1, filePath);
    }
    static void findJewelsInStones(String stones1, String filePath)
    {
        
        try (FileWriter filewriter = new FileWriter(filePath))
        {
            filewriter.write(stones1);
            
        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }
}