public class Call {

    public static void main(String[] args) {

        int a=0,b=0,c=0;
        try
        {
            a= Integer.parseInt(System.console().readLine("Enter a"));
            b= Integer.parseInt(System.console().readLine("Enter b"));
            c=a/b;
        }
        catch(Exception ex)
        {
            System.out.println(ex);
            a=b=c= -3;
        }
        catch(NumberFormatException ex)
        {
            System.out.println(ex);
            a=b=c= -1;
        }
        catch(ArithmeticException ex)
        {
            System.out.println(ex);
            a=b=c= -2;
        }
      
        finally
        {
            System.out.println(a+"  "+b+"  "+c);
        }
        }

    public static void main(String[] args) {
        
        Demo d1 = new Demo();
        d1.input();
        d1.disp();

    }
}
// Exception is the parent class of numberformat and arithmetic so both of these will never run
// the program wont compile and run ever and becomes unreachable