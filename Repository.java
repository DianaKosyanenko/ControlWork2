import java.text.ParseException;
import java.util.List;

public interface Repository {
    void addAnimal(Animals animals);
    List<Animals> showAnimals();
    void findAnimal() throws ParseException;
    void deleteAnimal() ;
}
