import java.util.Scanner;
class Pattern5{
  public static void getPattern(int n)
  {
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
          System.out.print((i-1)%2+" ");
        }
      System.out.println();
    }
  }

  public static void rowSamePattern(int n)
  {
     for(int i=1;i<=n;i++)
     {
        for(int j=1;j<=n;j++)
          {
             System.out.print((j-1)%2+" ");
          }
        System.out.println();
     }
  }

  public static void bracketPattern(int n)
  {
    for(int i=1;i<=n;i++)
    {
       for(int j=1;j<=n;j++)
       {
          System.out.print("("+i+","+j+")");
       }
       System.out.println();
    }
  }

  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the no of rows:=");
    int n=sc.nextInt();
    getPattern(n);
    System.out.println("================");
    rowSamePattern(n);
    System.out.println("================");
    bracketPattern(n);
  }

}