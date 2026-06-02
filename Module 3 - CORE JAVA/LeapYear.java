// 5. Multiplication Table 
// • Objective: Implement loops. 
// • Task: Print the multiplication table for a number up to 10. 
// • Instructions: 
// o Prompt the user for a number. 
// o Use a for loop to iterate from 1 to 10. 
// o Multiply the input number by the loop counter and display the result. 

public class LeapYear{
    public static void main(String[] args){
        int year = 2016;
        if(year%4==0&&year%100!=0 || year%400==0){
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}