import java.util.Scanner;
class Every1
{
     public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num");
        int n=sc.nextInt();
        int  sum=1;
        do{
              int r=n%10;
              sum=sum*r;
              n=n/10;
            }
        while(n!=0);
         
            System.out.println(sum+"is product of  num ");
     }
}