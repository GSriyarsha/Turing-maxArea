import java.util.*;
import java.lang.*;

class Solution
{
    static int maxHist(int R,int C,int row[]) 
    { 
        Stack<Integer> result = new Stack<Integer>(); 
       
        int top_val;    
       
        int max_area = 0;
       
        int area = 0;    
        int i = 0; 
        while (i < C) 
        { 
            if (result.empty() || row[result.peek()] <= row[i]) 
                result.push(i++); 
       
            else
            { 
                top_val = row[result.peek()]; 
                result.pop(); 
                area = top_val * i; 
       
                if (!result.empty()) 
                    area = top_val * (i - result.peek() - 1 ); 
                max_area = Math.max(area, max_area); 
            } 
        } 
        while (!result.empty()) 
        { 
            top_val = row[result.peek()]; 
            result.pop(); 
            area = top_val * i; 
            if (!result.empty()) 
                area = top_val * (i - result.peek() - 1 ); 
       
            max_area = Math.max(area, max_area); 
        } 
        return max_area; 
    } 
    static int maxRectangle(int R,int C,int A[][]) 
    { 
        int result = maxHist(R,C,A[0]);  
        for (int i = 1; i < R; i++) 
        { 
       
            for (int j = 0; j < C; j++) 
       
                if (A[i][j] == 1) A[i][j] += A[i - 1][j]; 
       
       
            result = Math.max(result, maxHist(R,C,A[i])); 
        } 
       
        return result; 
    } 

    public static int biggestTable(String[][] grid, int rowsLen, int colsLen) {
        //Put your code here.  
        int M[][] = new int[rowsLen][colsLen];
        for (int i = 0; i < rowsLen; i ++){
            for (int j = 0; j < colsLen; j ++){
                M[i][j] = Integer.parseInt(grid[i][j]);
            }
        } 
        return maxRectangle(rowsLen, colsLen, M);
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int rowsLen = sc.nextInt();
        int colsLen = sc.nextInt();
        String matrix[][] = new String[rowsLen][colsLen];
        int i;
        for(i=0;i<rowsLen;i++){
            String line = sc.next();
            for(int j=0;j<line.length();j++) {
               matrix[i][j] = String.valueOf(line.charAt(j));  
            }
        }
        int result = biggestTable(matrix, rowsLen, colsLen);   
        System.out.print(result);
    }
}
