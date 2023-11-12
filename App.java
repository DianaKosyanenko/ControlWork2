import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public class App {
    Scanner scanner = new Scanner(System.in);
    public void appButton() throws ParseException {
        Controller controller = new Controller();
        AnimalFunction animalFunction = new AnimalFunction();
        while (true) {
            System.out.println("Выберите действие: \n" +
                    "1. Добавить животное - 1 \n" +
                    "2. Удалить животное - 2\n" +
                    "3. Найти животное - 3\n" +
                    "4. Просмотр всех животных - 4\n" +
                    "5. Просмотр команд классов - 5");
            int numMenu = scanner.nextInt();
            switch (numMenu) {
                case 1:
                    Animals animal = controller.addNewAnimal();
                    System.out.println("Животное |" + animal + "| добавлен в список!");
                    animalFunction.addAnimal(animal);
                    break;
                case 2:
                    animalFunction.deleteAnimal();
                    break;
                case 3:
                    animalFunction.findAnimal();
                    break;
                case 4:
                    List<Animals> showAnimal = animalFunction.showAnimals();
                    System.out.println(showAnimal);
                    break;
                case 5:
                    controller.showCommands();
                    break;
            }
        }
    }
}
