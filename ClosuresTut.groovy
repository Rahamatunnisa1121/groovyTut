class ClosuresTut{
    static void main(String[] args)
    {
        //call() forces Groovy to treat it as a closure, not a method.
        // def getFactorial={num->
        //     (num<=1?1:num*call(num-1))
        // };

        //or can declare closure variable first before using it
        def getFactorial;
        getFactorial={num->
            (num<=1?1:num*getFactorial(num-1))
        };
        println("Factorial of 4 is: "+getFactorial(4));

        def greeting="Goodbye";
        def sayGoodbye={name->
            println("$greeting, $name!")};
        sayGoodbye("Derek");

        def numsList=[1,2,3,4,5];
        numsList.each{println(it)};//it is implicit parameter

        def employeeAges=[
            'Paul':34,
            'Sally':35,
            'Sam':36
        ];
        employeeAges.each{k,v->
            println("$k is $v years old.")
        };

        employeeAges.each{
            println("$it.key is $it.value years old.")
        };

        def randNums=[1,2,3,4,5,6,7,8,9,10];
        randNums.each{num->
        if(num%2==0){
            println("$num is even.");
        }};

        def nameList=["Paul","Sally","Sam","Derek"];
        def matchEle=nameList.find{item->item=="Sue"};
        if(matchEle){
            println("Found: $matchEle");
        }else{
            println("No match found.");
        }
        
        def numMatches=randNums.findAll{item->item>4};
        //findAll returns a new list of all matching elements
        println("Numbers greater than 4: $numMatches");

        //any checks if any element matches the condition
        //if atleast one ele matches, returns true
        def anyMatch=randNums.any{it->it>8};
        println("Any number greater than 8: $anyMatch");

        //every checks do all elements match the condition
        def allMatch=randNums.every{it->it<11};
        println("All numbers less than 11: $allMatch");

        //collect is map - transforms each element and returns a new list
        println("Doubled numbers: "+randNums.collect{it*2});

        def getEven={num->return num%2==0;};
        println("Is 4 even? "+getEven(4));

        def evenNums=listEdit(randNums,getEven);
        println("Even Numbers: "+evenNums);
    }
    static def listEdit(list,closure)
    {
        def evenNums=list.findAll(closure);
        return evenNums;
    }
}