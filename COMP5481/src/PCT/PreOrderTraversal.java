package PCT;

import java.util.Arrays;

public class PreOrderTraversal {
	static int search(int arr[], int x, int n)
	{
		for(int i= 0; i< n; i++)
		{
			if(arr[i]==x)
				return i;
		}
		return -1;
	}
	static void PrintPreOrder(int in[], int pos[], int n)
	{
		int root= search(in,pos[n],n);
		
		if (root!=0)
			PrintPreOrder(in,Arrays.copyOfRange(pos,1,n), root);
	
	if (root != n - 1) 
        PrintPreOrder(Arrays.copyOfRange(in, root+1, n), 
            Arrays.copyOfRange(pos, 1+root, n), n - root - 1); 
  
    // Print root 
    System.out.print( pos[n] + " "); 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int in[] = { 4, 2, 5, 1, 3, 6 }; 
    int pos[] = { 1, 2, 4, 5, 3, 6 }; 
    int n = in.length; 
    System.out.println("Preorder traversal " ); 
    PrintPreOrder(in, pos, n); 
} 
} 

