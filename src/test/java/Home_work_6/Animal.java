package Home_work_6;

public class Animal {
    protected String location;
    protected String food;

    public Animal(String location, String food) {
        this.location = location;
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public String getFood() {
        return food;
    }

    public void makeNoise() {
        System.out.println("This animal make this noise");
    }

    public void eat() {
        System.out.println("This animal eat this food");
    }

    public static void main(String[] args) {
        Animal[] pets = new Animal[4];
        pets[0] = new Cat("First_Flour", "Viskas", "Klubok");
        pets[1] = new Dog("Budka", "Pedigri", "Gosha");
        pets[2] = new Horse("Stoilo", "Hay", "Griva");
        pets[3] = new Parrot("Kletka", "Fruits", "Kesha");

        for (Animal animal : pets) {
            Veterenar.treatAnimal(animal);
            animal.eat();
        }

    }
}
