Function Description
=========================================================================================================================
Complete the beautifulDays function in the editor below. It must return the number of beautiful days in the range.
beautifulDays has the following parameter(s):

i: the starting day number
j: the ending day number
k: the divisor

Solution:
=========================================================================================================================
Step : 1 > Loop and find all numbers between i & j
Step : 2 > Reverse each number 'reverse(int i)' ? 
                                               >> Get Integer Object of i and then make it String
                                               >> Loop each character of String add to new String in reverse order
                                               >> Make the reversed String to Integer
                                               >> Retun the int
Step : 3 > Find the diff in Math.abs() as we do not need -ve value
Step : 4 > Find the module by k .
Step : 5 > If module == 0; Count ++;
                                                
                                                
