import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalFunction implements Repository {
    public List<Animals> animals = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public AnimalFunction() {

    }

    @Override
    public void addAnimal(Animals animal) {
        animals.add(animal);
    }


    @Override
    public List<Animals> showAnimals() {
        return animals;
    }

    @Override
    public void findAnimal() throws ParseException {
        int a = 0;
        List<Animals> findAnimal = new ArrayList<>();
        System.out.println("По каким данным найти животное? \n" +
                "1. ID - 1\n" +
                "2. Имя животного - 2\n" +
                "3. Дата рождения - 3\n"
        );
        int findNum = scanner.nextInt();
        switch (findNum) {
            case 1:
                System.out.println("Введите Id животного: \n");
                int findId = scanner.nextInt();
                for (Animals animal : animals) {
                    if (animal.getId() == findId) {
                        a++;
                        System.out.println(animal);
                    }

                }
                scanner.nextLine();
                if (a == 0)
                    System.out.println("Такого животного нет");
                break;
            case 2:
                System.out.println("Введите имя животного");
                String findName = scanner.nextLine();
                for (Animals animal : animals) {
                    if (animal.getName().equals(findName)) {
                        a++;
                        findAnimal.add(animal);

                    }
                }
                scanner.nextLine();
                if (a == 0)
                    System.out.println("Такого животного нет");
                else
                    System.out.println(findAnimal);
                break;
            case 3:
                System.out.println("Введите дату рождения животного \n");
                String findDate = scanner.nextLine();
                for (Animals animal : animals) {
                    if (animal.getBirthDate().equals(findDate)) {
                        a++;
                        findAnimal.add(animal);
                    }
                }
                scanner.nextLine();
                if (a == 0) System.out.println("Такого животного нет");
                else System.out.println(findAnimal);
                break;



        }


            }
    @Override
    public void deleteAnimal() {
        System.out.println("\"Введите ID животного которого хотите удалить: \\n\"");
        int deliteId = scanner.nextInt();
        int a = 0;
        for (Animals animal : animals) {
            if (animal.getId() == deliteId) {
                a++;
                animals.remove(animal);
            }

        }
        if (a == 0) {
            System.out.println("Такого животного нет");

        }
    }
}
