package HW_06;

public class Notebook {

    String manufacture;

    String model;

    Integer year;

    Integer screenSize;

    String collor;

    Integer memory;

    Integer id;

    static Integer count = 0;

    

    Notebook(String manufacture, String model, Integer year, String collor, Integer screenSize, Integer memory)
    {
        this.manufacture = manufacture;
        this.model = model;
        this.year = year;
        this.collor = collor;
        this.screenSize = screenSize;
        this.memory = memory;
        this.id = count + 1;
        count++;
    }

    @Override
    public String toString() 
    {
        return "\nNotebook id %d: %s %s %d\nCollor: %s\nScreen size: %s\nMemory: %s GB\n".formatted(this.id, this.manufacture, this.model, this.year, this.collor, this.screenSize, this.memory);

    }


    
}
