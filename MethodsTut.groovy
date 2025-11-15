class MethodsTut{
    static def getSum(num1=0,num2=10){
        return num1 + num2;
    }
    static def getSum(int a, int b){
        return a + b;
    }
    static def sayHello(){
        println("Hello from Groovy Method!");
    }
    static def passByValue(int x){//modifying copy of x, not the original
        x = x + 10;
        println("Inside passByValue, x: "+x);
    }
    static def passByReference(obj){//modifying the object passed
        obj[0] = obj[0] + 10;
        println("Inside passByReference, x: "+obj[0]);
    }
    static def doubleList(list){
        def newList=list.collect{ it * 2 };//collect method creates a new list by applying the closure to each element
        return newList;
    }
    static def sumAll(int... args)//to accept variable number of arguments -> varargs method
    {
        def sum=0;
        args.each{sum+=it};
        return sum;
    }
    static def factorial(n)
    {
        if(n<=1)return 1;
        return n*factorial(n-1);
    }
    static void main(String[] args)
    {
        sayHello();
        int sum1=getSum();
        int sum2=getSum(5,15);
        println("Sum1 (default params): "+sum1);
        println("Sum2 (passed params): "+sum2);
        def x=20;
        println("Before passByValue, x: "+x);
        passByValue(x);//groovy sends a copy of x to method
        println("After passByValue, x: "+x);

        //there is no pass by reference in groovy, but we can simulate by using mutable objects
        //put that num inside an object
        //because groovy passes a reference your obj when ou pass it
        def obj=[20];
        println("Before passByReference, x: "+obj[0]);
        passByReference(obj);
        println("After passByReference, x: "+obj[0]);//obj modified inside method and in main too


        def listToDouble=[1,2,3,4,5];
        listToDouble=doubleList(listToDouble);
        println("Doubled List: "+listToDouble);

        def nums=sumAll(1,2,3,4,5);
        println("Sum of all nums: "+nums);

        def fact=factorial(5);
        println("Factorial of 5: "+fact)
    }
    
}