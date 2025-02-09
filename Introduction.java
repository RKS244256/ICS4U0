public class Introduction {
    public static void main(String[] args) {
        String x;
        int y;
        y = 0;
        x = "hello";
        System.out.printf("%s World\n", x);
	    System.out.printf("The current number is %d\n", y);
        System.out.printf("The current number is %d\n", y);
        System.out.printf("The current number is %d\n", y);
        y = (int) Math.pow(y, 5);
        System.out.printf("The current number is %d\n", y);
        y = (int) (y + MathLesson.maxSearchStatic());
        System.out.printf("The current number is %d\n", y);
        System.out.printf("Root of %d is %f rounded to %d", y, Math.sqrt((double) y), (int) Math.round(Math.sqrt((double) y)));
        y = (int) (y + Math.random());
        System.out.println(y);
        System.out.println(MathLesson.findArea(y, 5));
        MathLesson.printArea(y, 5);
    }
}

class MathLesson {
    public static float maxSearchStatic() {
        double x = 250.00;
        float y = 6.00f;
        int i = 1;
        byte z = 2;
        float m = (float) Math.max(Math.max(x, y), Math.max(i, z));
        return m;
    }
    static double findArea(double l, double w) {
        return l*w;
    }
    static void printArea(double l, double w) {
        System.out.println(l*w);
    }

}