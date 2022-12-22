# Java-Practice-Projects

This is a collection of simple Java programs that I've built after completing the Java Udemy course, 
to consolidate all I've learn and build my Java skills.

## 1. Investment Earnings
This is a simple Java program that calculates profits or loss on investments per day. It accepts a 'buying price'
and 'investment closing price' from the user, and uses it to calculate the profits/loss. 

### NOTE: The program will continue until the 'investment closing price' inputed is less than 0.0.

## 2. Budget Allocation
This is a simple budgeting program that allocates money based on the 'total spending money' and 'percentage proportion'
inputed by the user. Since the program does not know how many 'percentage proportions' will be inputed, it uses
an ArrayList to store the inputs. The 'percentage porportions' inputed are used to allocate the 'total spending money'.

### NOTE: The program will accept 'percentage proportions' until the total sum of inputs exceeds 100%. Afterwards, it will recalculate the last input, to ensure the sum is exactly 100. 

## 3. Average Stock 
This simple java project that updates the average price as well as the share capital of stocks. It uses a Stock class and an AverageStock runner class. Three variables ( shares, price, and capital), and 'Buying' and 'selling' methods are created in the Stock class. The former method updates the capital variable using increments, while the latter method updates the capital using decrements. Both methods accept parameters 'price' and 'shares. The price is unique but the shares increases/decreases the total number of share available per program run.

## 4. StairCases
This program builds a 'staircase' (or a triangle) using hash (*) symbol. It accepts two input values from the user: one for the number of stairs (stairsNumber) and the other for the width of the stairs - i.e the number of * per stairs - (stairsWidth). I have solved this program using two methods. The first method uses nested FOR loop, while the second solution uses the repeat Sring method.
