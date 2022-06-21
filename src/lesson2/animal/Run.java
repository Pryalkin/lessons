package lesson2.animal;

public class Run {
    public static void main(String[] args) {
        Animal cat = new Cat("Вася", "Мяу-мяу");
        Animal dog = new Dog("Пушок", "Гав-гав");
        Animal horse = new Horse("Мустанг", "Иго-го");
        Veterinarian veterinarian = new Veterinarian();
        Animal[] animals = new Animal[]{cat, dog, horse};
        for (Animal animal: animals) {
            veterinarian.treatAnimal(animal);
        }
    }


}
