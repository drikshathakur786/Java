class Demo
{
    int a, b, c;
    public void input()
    {
       
      a= Integer.parseInt(System.console().readLine("Enter a"));
      if(a < 0)
      {
          throw new RuntimeException("a is wrong");
      }
      b= Integer.parseInt(System.console().readLine("Enter b"));
      if(b < 0)
      {
          throw new RuntimeException("b is wrong");
      }
    
      c= a/b;
    }
        
    public void disp()
    {
        System.out.println(a+"  "+b+"  "+c);
    }
    
    public void setVal(int x, int y, int z)
    {
        a = x;
        b = y;
        c = z;
    }
}