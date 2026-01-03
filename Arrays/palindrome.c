/*
Problem:
Given an integer x, determine whether it is a palindrome.
A palindrome number reads the same forward and backward.

Approach:
Compare the digits of the number in forward and reverse order.
If both representations match, the number is a palindrome.

Time Complexity: O(d), where d is the number of digits in x.
Space Complexity: O(1).
*/
boolean palindrome(int x){
  int digit;
long long rev;
int original=x;
while(x>0){
  digit=digit%10;
  rev=rev*10+digit;
  x/=10;
}
if(original==rev){
  return true;
}
else{
return false;}}
  
