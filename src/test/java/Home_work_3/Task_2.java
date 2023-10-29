package Home_work_3;

public class Task_2 {
    int speed;
    double timeAcceleration;
    double timeBraking ;
    final String brand = "Audi";

    public Task_2 (int speed, double timeAcceleration, double timeBraking) {
        this.speed = speed;
        this.timeAcceleration = timeAcceleration;
        this.timeBraking = timeBraking;
    }
    public void getName() {
        System.out.println(brand);
    }

    public void getDifferenceBetweenTimeBrakingAndTimeAcceleration () {
        System.out.println(timeAcceleration - timeBraking);
    }

    public void isTimeAccelerationEqualTimeBraking() {
        System.out.println(timeAcceleration == timeBraking);
    }
}
