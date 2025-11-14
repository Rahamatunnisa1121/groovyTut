class InputTut {
    public static void main(String[] args) {
        print("What's your name?")
        def fname=System.console().readLine()
        //System.console() returns a console object, it allows us to read input from user
        //readLine() is a method of console object that reads a line of text from user
        println("Hello,$fname!")
        print("Enter age:")
        def age=System.console().readLine().toInteger()
        //toInteger() method converts the string input to an integer
        println("You are $age years old.")

        def num1,num2
        print("Enter first number:")
        num1=System.console().readLine().toDouble() //toDouble() method converts the string input to a double
        print("Enter second number:")
        num2=System.console().readLine().toDouble()
        printf("%.2f + %.2f = %.2f\n",[num1,num2,(num1+num2)]) //formatted output with 2 decimal places
    }
}