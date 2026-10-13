package ExceptionHandling;

public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        //try -> try the code
        //catch -> catch exception
        try{
//            int c = a/b;
//            divide(a,b);
            throw new MyException("This is my Exception");
        }
        catch (MyException e) {
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("Normal Exception");
        }
        finally {
            System.out.println("This will always exceute");
        }



    }
    //throws -> to declare Exception
    //throw -> to actually throw Exception
    static int divide( int a , int b) throws ArithmeticException{
        if(b==0) {
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a/b;
    }
}
