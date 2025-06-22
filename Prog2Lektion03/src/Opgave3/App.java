package Opgave3;

public class App {
    public static void main(String[] args) {
        Chili[] chilis = new Chili[] {
                new Chili("Jalapeno", 3500),
                new Chili("Habanero", 350000),
                new Chili("Carolina Reaper", 2000000),
                new Chili("Ghost Pepper", 1041427)
        };

        Measurable maxChili = max(chilis);
        double averageScovilleStrenght = average(chilis);

        System.out.println("Højeste styrke" + maxChili);
        System.out.println("Gennemsnitlig styrke: " + averageScovilleStrenght);
    }


    public static Measurable max(Measurable[] objects) {
        if (objects == null || objects.length == 0) return null;

        Measurable max = objects[0];
        for (Measurable obj : objects) {
            if (obj != null && obj.getMeasure() > max.getMeasure()) {
                max = obj;
            }
        }
        return max;

    }
    public static double average(Measurable[] objects) {
        if (objects == null || objects.length == 0) return 0.0;

        double sum = 0.0;
        for (Measurable obj : objects) {
            if (obj != null) {
                sum += obj.getMeasure();
            }
        }
        return sum / objects.length;
    }


}
