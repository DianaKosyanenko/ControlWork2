import java.util.Iterator;

public abstract class Animals implements Iterable<Animals> {
    private int id;
    private String birthDate;
    private String name;
    private String animalClass;

    public Animals(int id, String birthDate, String name, String animalClass) {
        this.id = id;
        this.birthDate = birthDate;
        this.name = name;
        this.animalClass = animalClass;
    }
    public Animals(){

    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnimalClass() {
        return animalClass;
    }

    public void setAnimalClass(String animalClass) {
        this.animalClass = animalClass;
    }

    public boolean equals(Animals animals) {
        if (this == animals)
            return true;
        if (animals == null)
            return false;
        return this.id == animals.id && this.name.equals(animals.name);

    }

    @Override
    public String toString() {
        return String.format("ID животного: " + id +
                " Имя животного: " + name +
                " Дата рождения: " + birthDate);
    }

    public Iterator<Animals> iterator() {
        return new AnimalIterator();
    }

    class AnimalIterator implements Iterator<Animals> {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Animals next() {
            return null;
        }
    }
}

