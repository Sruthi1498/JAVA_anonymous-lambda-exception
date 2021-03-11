public class ExceptionImpl extends Exception {
    public static void main(String[] args) {
        try {
            int arr[] = new int[10];
            arr[20] = 10 / 0;
        }
        catch (ArithmeticException e)
        {
            System.out.println("arithmetic exception");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index out of bound");
        }
        catch (Exception e)
        {
            System.out.println("Exception");
        }
    }
}
