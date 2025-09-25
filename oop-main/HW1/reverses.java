import java.util.Scanner;
public class reverses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine(); // Đọc bỏ dòng trống sau khi nhập số

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextLine();
        }

        // Đảo ngược mảng
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        // In mảng đã đảo ngược
        for (String s : arr) {
            System.out.print(s + " ");
        }

        input.close();
    }
}
