/*
Problem:
accounts is a 2D integer array where accounts[i][j] represents the amount of money
the i-th customer has in the j-th bank account.

Approach:
Each row of the 2D array represents one customer.
To calculate a customer's wealth, sum all elements in that row.
Iterate through each row, compute the row sum, and keep track of the maximum sum encountered.

The final maximum sum represents the wealth of the richest customer.

Time Complexity: O(m × n), where m is the number of customers (rows)
and n is the number of bank accounts per customer (columns).

Space Complexity: O(1), since only a few variables are used.
*/
class Solution{
    public int RichestWealth(int [][]accounts){
        int max=0;
      int sum;
      for(int i=0;i<accounts.length;i++){
          sum=0;
        for(int j=0;i<accounts[i].length;i++){
            sum+=accounts[i][j];}
          if(sum>max){
            max=sum;}}
      return max;}}
      
