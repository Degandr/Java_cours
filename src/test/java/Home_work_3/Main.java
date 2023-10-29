package Home_work_3;

public class Main {
    public static void main(String[] args) {
        Task_1 vasa = new Task_1("Vasa", "Pupkin", "QA", 1000);
        vasa.info();
        Task_1 petya = new Task_1("Petr", "Petrovich", "DEV", 2000);
        petya.info();
        Task_2 r8 = new Task_2(320, 5.2, 3.1);
        r8.getName();
        r8.getDifferenceBetweenTimeBrakingAndTimeAcceleration();
        r8.isTimeAccelerationEqualTimeBraking();
    }

}
