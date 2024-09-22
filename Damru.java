import java.util.Scanner;
class Damru{
   public static void getDamru(int n){
      int star=n;
      int space=0;
      int mid=n/2+1;
      for(int i=1;i<=n;i++)
      {
           for(int j=1;j<=space;j++)
             System.out.print("  ");
           for(int j=1;j<=star;j++)
             System.out.print("* ");
           if(i<mid){
              space++;
              star=star-2;
           }
           else{
             star=star+2;
             space--;
           }
          System.out.println();
      }
   }

   public static void butterFly(int n)
   {
      int sStar=1;
      int eStar=n;
      int mid=n/2+1;
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=n;j++)
        {
              if(j<=sStar || j>=eStar)
                 System.out.print("* ");
              else
                 System.out.print("  ");
        }
        if(i<mid){
           sStar++;
           eStar--;
        }
        else{
           sStar--;
           eStar++;
        }
       System.out.println();
      }  
       
   }

   public static void getDiamond(int n)
   {
     int star=1;
     int space=n/2;
     int mid=n/2+1;
     int x=1;
     char ch='A';
     for(int i=1;i<=n;i++){
        for(int j=1;j<=space;j++)
            System.out.print("  ");
        for(int j=1;j<=star;j++){
            System.out.print(ch+" ");
            ch++;
             
         }
        ch='A';
        if(i<mid){
          star=star+2;
          space--;
        }
        else{
          star=star-2;
          space++;
        }
       System.out.println(); 
     } 
   }
 
   

   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.print("enter the no of rows:=");
       int n=sc.nextInt();
      // getDamru(n);
      //   butterFly(n);
          getDiamond(n);
   }




}