import java.util.Arrays;
import java.util.Scanner;

public class SecondHighest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int Elements[] = new int[size];
        for(int i = 0; i<size; i++){
            Elements[i] = sc.nextInt();
        }
        Arrays.sort(Elements);
        System.out.println(Arrays.toString(Elements));
        System.out.println(Elements[1]);
    }
}
