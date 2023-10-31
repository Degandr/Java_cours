package Home_work_6;

public class Veterenar {

    public static void treatAnimal(Animal animal) {
        System.out.println(animal.getLocation() + " and " + animal.getFood());
        animal.makeNoise();
    }
}