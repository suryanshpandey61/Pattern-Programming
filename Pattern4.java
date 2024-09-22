import java.util.Scanner;
class Pattern4{
  public static void printOneZeroPattern(int n){
     for(int i=1;i<=n;i++){
          for(int j=1;j<=n;j++){
             System.out.print(j%2+" ");
          }
        System.out.println();

    }
  }

 public static void rowSamePatternOneZero(int n){
  for(int i=1;i<=n;i++){
    for(int j=1;j<=n;j++){
      System.out.print(i%2+" ");
    }
   System.out.println();
  }

 }

 public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter no of rows:=");
   int n=sc.nextInt();
   printOneZeroPattern(n);
   System.out.println("============");
   rowSamePatternOneZero(n);
 
 }
}