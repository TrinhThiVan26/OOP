public class SumOfSines {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        double radians = Math.toRadians(t); // doi do->radian
        double result = Math.sin(2 * radians) + Math.sin(3 * radians);
        System.out.println(result);
    }
}
