import java.util.Scanner;

public class Controller {
    public Animals addNewAnimal() {
        Scanner scanner = new Scanner(System.in);
        AnimalFunction animalFunction = new AnimalFunction();
        System.out.println("Какого класса животное добавить \n" +
                "1. Домашнее - 1\n" +
                "2. Вьючее -2");
        int numClass = scanner.nextInt();
        switch (numClass) {
            case 1:
                System.out.println("Какое животное добавить?\n" +

                        "1. Собака - 1\n" +
                        "2. Кот - 2\n" +
                        "3. Хомяк - 3"

                );
                int numAnim = scanner.nextInt();
                switch (numAnim) {
                    case 1:
                        Dog dog = new Dog();
                        System.out.println("Ввдеита ID собаки: ");
                        int idDog = scanner.nextInt();
                        dog.setId(idDog);
                        scanner.nextLine();
                        System.out.println("Введите дату рождения собаки: ");
                        String date = scanner.nextLine();
                        dog.setBirthDate(date);
                        System.out.println("Введите имя собаки: ");
                        String nameDog = scanner.nextLine();
                        dog.setName(nameDog);
                        System.out.println("Введите класс собаки: ");
                        String classDog = scanner.nextLine();
                        dog.setAnimalClass(classDog);
                        return dog;
                    case 2:
                        Cat cat = new Cat();
                        System.out.println("Ввдеита ID кошки: ");
                        int idCat = scanner.nextInt();
                        cat.setId(idCat);
                        scanner.nextLine();
                        System.out.println("Введите дату рождения кошки :");
                        String dateCat = scanner.nextLine();
                        cat.setBirthDate(dateCat);
                        System.out.println("Введите имя кошки: ");
                        String nameCat = scanner.nextLine();
                        cat.setName(nameCat);
                        System.out.println("Введите класс кошки: ");
                        String classCat = scanner.nextLine();
                        cat.setAnimalClass(classCat);
                        return cat;

                    case 3:
                        Hamster hamster = new Hamster();
                        System.out.println("Ввдеита ID хомяка: ");
                        int idGoat = scanner.nextInt();
                        hamster.setId(idGoat);
                        scanner.nextLine();
                        System.out.println("Введите дату рождения хомяка");
                        String dateGoat = scanner.nextLine();
                        hamster.setBirthDate(dateGoat);
                        System.out.println("Введите имя хомяка: ");
                        String nameGoat = scanner.nextLine();
                        hamster.setName(nameGoat);
                        System.out.println("Введите класс хомяка: ");
                        String classGoat = scanner.nextLine();
                        hamster.setAnimalClass(classGoat);
                        return hamster;
                }
                break;
            case 2:
                System.out.println("Какое животное добавить? \n +" +
                        "1. Лошадь - 1\n" +
                        "2. Осёл - 2\n" +
                        "3. Веблюд - 3");
                int numPackAnim = scanner.nextInt();
                switch (numPackAnim) {
                    case 1:
                        Horse horse = new Horse();
                        System.out.println("Ввдеита ID лошади: ");
                        int idHorse = scanner.nextInt();
                        horse.setId(idHorse);
                        scanner.nextLine();
                        System.out.println("Введите дату рождения лошади (в формате yyyy-MM-dd):");
                        String date = scanner.nextLine();
                        horse.setBirthDate(date);
                        System.out.println("Введите имя лошади: ");
                        String nameHorse = scanner.nextLine();
                        horse.setName(nameHorse);
                        System.out.println("Введите класс лошади: ");
                        String classHorse = scanner.nextLine();
                        horse.setAnimalClass(classHorse);
                        return horse;
                    case 2:
                        Donkey donkey = new Donkey();
                        System.out.println("Ввдеита ID осла: ");
                        int idDonkey = scanner.nextInt();
                        donkey.setId(idDonkey);
                        scanner.nextLine();
                        System.out.println("Введите дату рождения осла (в формате yyyy-MM-dd):");
                        String dateDonkey = scanner.nextLine();
                        donkey.setBirthDate(dateDonkey);
                        System.out.println("Введите имя осла: ");
                        String nameDonkey = scanner.nextLine();
                        donkey.setName(nameDonkey);
                        System.out.println("Введите класс осла: ");
                        String classDonkey = scanner.nextLine();
                        donkey.setAnimalClass(classDonkey);
                        return donkey;
                    case 3:
                        Camel camel = new Camel();
                        System.out.println("Ввдеита ID козла: ");
                        int idCamel = scanner.nextInt();
                        camel.setId(idCamel);
                        scanner.nextLine();
                        System.out.println("Введите дату рождения козла (в формате yyyy-MM-dd):");
                        String dateCamel = scanner.nextLine();
                        camel.setBirthDate(dateCamel);
                        System.out.println("Введите имя козла: ");
                        String nameCamel = scanner.nextLine();
                        camel.setName(nameCamel);
                        System.out.println("Введите класс козла: ");
                        String classCamel = scanner.nextLine();
                        camel.setAnimalClass(classCamel);
                        return camel;
                }
        }
        return null;
    }

    public void showCommands() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Команды какого класса хотите просмотреть?\n" +
                "1. Домашние животние\n" +
                "2. Вьючие животные");
        int com = sc.nextInt();
        switch (com) {
            case 1:
                Command[] domesticArr = Command.getDomesticComands();
                for (Command command : domesticArr) {
                    System.out.println(command);
                }
                ;
                break;
            case 2:
                Command[] baggageArr = Command.getPackComands();
                for (Command command : baggageArr) {
                    System.out.println(command);
                }
                ;
                break;


        }
    }
}

