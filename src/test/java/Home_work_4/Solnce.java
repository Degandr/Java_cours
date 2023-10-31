package Home_work_4;

public class Solnce {
    static int finalSunriseQnty;
    public static void sunrise(int i) {
        finalSunriseQnty += i;
    }

    public void getSunrise() {
        System.out.println("Solnce vstalo " + finalSunriseQnty + " raz");
    }
}
