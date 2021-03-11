public class ExceptionImpl1 extends Exception{

        public static void main(String[] args) {
            try {
                String n = null;
                System.out.println(n.length());
            }
            catch (ArithmeticException e)
            {
                System.out.println("arithmetic exception");
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Array index out of bound");
            }

            // null pointer exception not given, so this catch block is invoked
            catch (Exception e)
            {
                System.out.println("Exception");
            }
        }

}
