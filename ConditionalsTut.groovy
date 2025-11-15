class ConditionalsTut{
    static void main(String[] args)
    {
        def age;
        age=System.console().readLine("Enter your age: ").toInteger();
        if(age<18){
            println("Minor");
        }
        else if(age>=18 && age<65){
            println("Adult");
        }
        else{
            println("Senior Citizen");
        }

        def canvote=true;
        println(canvote?"You can vote":"You cannot vote");

        def marks=System.console().readLine("Enter your marks: ").toInteger();
        switch(marks){
            case 0..35:
                println("Fail");
                break;
            case 36..50:
                println("Pass");
                break;  
            case 51..75:
                println("Merit");
                break;
            case 76..100:
                println("Distinction");
                break;
            default:
                println("Enter valid Marks");
        }
    }
}