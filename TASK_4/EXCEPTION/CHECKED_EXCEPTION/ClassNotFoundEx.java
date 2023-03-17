package CHECKED_EXCEPTION;

public class ClassNotFoundEx {
    public static void main(String args[]) {
        try {
            Class.forName("NoClassExist");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

}