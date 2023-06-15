package TASK_4.FILE_HANDLING.Scanner;
import java.io.File;
import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\akash\\OneDrive\\Desktop\\NucleousTeq TAsk\\TASK_4\\FILE_HANDLING\\FileExample.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                String line = sc.nextLine();
                System.out.println(line);
            }

        } catch (Throwable ex) {
            ex.printStackTrace();
        }
    }
}
