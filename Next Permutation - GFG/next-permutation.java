//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.nextPermutation(N, arr);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < N;i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static List<Integer> nextPermutation(int N, int arr[]){
        // code here
        ArrayList<Integer> arrl = new ArrayList<>();
        boolean flag = false;
        
        for(int i=N-1;i>0;i--){
            if(arr[i]>arr[i-1]){
                flag = true;
                int replacementIndex = findReplacement(arr,i,i-1);
                swap(arr,replacementIndex,i-1);
                sortTheRange(i,arr);
                
                break;
            }
        }
        
        
        if(flag == true){
            for(int i=0;i<N;i++){
                arrl.add(arr[i]);
            }
            return arrl;
        }
        reverse(arr);
        for(int i=0;i<N;i++){
                arrl.add(arr[i]);
            }
        return arrl;
    }
    static int findReplacement(int[] arr, int max,int min){
        int minIndex = max;
        for(int i=max;i<arr.length;i++){
            if(arr[i]<arr[max] && arr[i]>arr[min]){
                minIndex = i;
            }
        }
        return minIndex;
    }
    
    
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
   static  void sortTheRange(int start,int[] arr){
        int end=arr.length;
        for(int i=start;i<end;i++){
            for(int j=i+1;j<end;j++){
                
                if(arr[i]>arr[j]){
                    swap(arr,i,j);
                }
            }
        }
    }
     static void reverse(int[] arr){
        
        int j= arr.length-1;
        for(int i=0;i<arr.length/2;i++){
            swap(arr,i,j);
            j--;
        }
    }
}