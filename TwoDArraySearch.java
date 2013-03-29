import java.util.Arrays;

public class TwoDArraySearch {
    public static void main(String[] args) {
 
  int mat[][] = {   {10, 20, 30, 40},
                    {15, 25, 35, 45},
                    {27, 29, 37, 48},
                    {32, 33, 39, 50},
                  };
  search(mat, 4, 35);
  search(mat, 4, 48);
  search(mat, 4, 30);
  search(mat, 4, 5); 
}
	///Time Complexity: O(n)

/// The above approach will also work for m x n matrix (not only for n x n). Complexity would be O(m + n).

public static int search(int mat[][], int n, int x)
{
   int i = 0, j = n-1;  //set indexes for top right element
   while ( i < n && j >= 0 )
   {
      if ( mat[i][j] == x )
      {
        	System.out.println("\n Found atRow "+i+" Column"+j);
         return 1; /// have to return value so that program terminates.. return 1 as return type is int. 
      }
      if ( mat[i][j] > x )
        j--;
      else //  if mat[i][j] < x
        i++;
   }
 
   	System.out.println("\n Element not found");
   return 0;  // if ( i==n || j== -1 )
}
 
// driver program to test above function
}