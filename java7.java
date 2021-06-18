import java.util.*;
 
class prog8
{
   public static void main(String args[])
   {
      int n, i, j;
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Enter the rank of square matrix ");
      n = sc.nextInt();
 
      int m1[][] = new int[n][n];
      int m2[][] = new int[n][n];
      int sum[][] = new int[n][n];
      int subtract[][] = new int[n][n];
      int inverse[][] =new int[n][n];
      System.out.println("Enter the elements of first matrix");
 
      for (  i = 0 ; i < n ; i++ )
         for ( j = 0 ; j < n ; j++ )
            m1[i][j] = sc.nextInt();
 
      System.out.println("Enter the elements of second matrix");
 
      for ( i = 0 ; i < n ; i++ )
         for ( j = 0 ; j < n ; j++ )
             m2[i][j] = sc.nextInt();
 
      for ( i = 0 ; i < n ; i++ )
         for ( j = 0 ; j < n ; j++ )
             sum[i][j] = m1[i][j] + m2[i][j];  
 
      System.out.println("Sum of entered matrices:-");
 
      for ( i = 0 ; i < n ; i++ )
      {
         for ( j = 0 ; j < n ; j++ )
            System.out.print(sum[i][j]+"\t");
 
         System.out.println();
      }
      for ( i = 0 ; i < n ; i++ )
         for ( j = 0 ; j < n ; j++ )
             subtract[i][j] = m1[i][j] - m2[i][j];  
 
      System.out.println("subtraction of entered matrices:-");
 
      for ( i = 0 ; i < n ; i++ )
      {
         for ( j = 0 ; j < n ; j++ )
            System.out.print(subtract[i][j]+"\t");
 
         System.out.println();
      }

      for ( i = 0 ; i < n ; i++ )
         for ( j = 0 ; j < n ; j++ )
             inverse[j][i] = m1[i][j];  

      System.out.println("inverse of entered matrices:-");
 
      for ( i = 0 ; i < n ; i++ )
      {
         for ( j = 0 ; j < n ; j++ )
            System.out.print(inverse[i][j]+"\t");
 
         System.out.println();
      }
   }
}
