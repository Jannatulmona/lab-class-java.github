import java.util.Scanner;
public class Find_Factorian
{

    public static int factorian(int r)
      {
         int fact=1;
         for(int i=2;i<=r;i++)
            {
              fact=fact*i;
            }
         return fact;

      }

   public static void main(String[]args)
     {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter star and end range : ");
            int start=sc.nextInt();
            int end =sc.nextInt();
            int count=0;
       for(int j=start;j<=end;j++)
         {
             int sum=0,temp=j;
           while(temp>0)
               {
                  int r= temp%10;
                  sum=sum+factorian(r);
                  temp=temp/10;
               }
          if(sum==j)
          count++;
        }
      System.out.println("nbr of factorian : "+count);

      sc.close();
    }
}
