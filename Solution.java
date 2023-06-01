import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qty = scan.nextInt();
        int destination = scan.nextInt();
        int[] numbers = new int[qty];
        for (int i = 0; i < qty; i++) {
            numbers[i] = scan.nextInt();
        }

        int step = qty/2;
        int prevstep;
        int distance = step;
        int curr = numbers[step];
        System.out.print(curr + " ");
        int ba = qty;
        int bb = 0;
        while (distance != 1){
            if (curr == destination){
                break;
            }
            prevstep = step;

            if (curr < destination){
                bb = step + 1;
                step = (ba + bb)/2;
                distance = Math.abs(prevstep - step);
                curr = numbers[step];
                System.out.print(curr + " ");
            } else {
                ba = step - 1;
                step = (ba + bb)/2;
                distance = Math.abs(prevstep - step);
                curr = numbers[step];
                System.out.print(curr + " ");

            }

        }
        System.out.println();
        if (curr == destination){
            System.out.println("ditemukan");
        } else {
            System.out.println("tidak ditemukan");
        }
        
    }
}
