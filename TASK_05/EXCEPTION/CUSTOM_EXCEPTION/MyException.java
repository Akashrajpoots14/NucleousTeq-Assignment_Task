package CUSTOM_EXCEPTION;

// A Class that represents use-defined exception
 
class MyException extends Exception {
    public MyException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}