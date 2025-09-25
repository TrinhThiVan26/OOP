public class Distance {
    public static void main(String[] args) {
        // Lấy 2 số nguyên từ dòng lệnh
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        double distance = Math.sqrt(x * x + y * y);
        System.out.println(distance);
    }
}
