public class VarTry
{
    public static void main(String[] argv)
    {
        /*
        Create a program that declares and initializes variables for:

A test score
One price value
User Name
Once initialized, print out the value you've set for each variable.

Output should look like this:
Test Score initialized is: 50
Price tag: 24.99
Username: Bobby Johnson
         */
        int i;                    // declares integer variable named i
        i = 9;                    // gives i the value 9
        System.out.println(i);    // print the value of i to the screen
int testScore = 50;
double priceTag= 24.99;
String userName= "Bobby Johnson";
        System.out.println("Test Score initialled is: "+ testScore +"\n"+"Price Tag: "+priceTag + "\n"+ "User Name: "+ userName+"\n");
    }
}
