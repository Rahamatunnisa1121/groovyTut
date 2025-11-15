class LoopingTut{
    static void main(String[] args)
    {
        def i=0;
        while(i<5)
        {
            println("Value of i is: "+i);
            i++;
        }

        for(i=0;i<5;i++)
        {
            println("Value of i in for loop is: "+i);
        }

        //some other way of looping in groovy through ranges
        for(j in 0..4){
            println("Value of j in range loop is: "+j);
        }

        def randList=  [10,20,30,40,50];
        for(item in randList){
            println("Value of item in list is: "+item);
        }

        def customers=[
            100:"Paul",//cust
            101:"John",
            102:"Jane"
        ];//a map of customerID to customerName
        for(cust in customers){
            //println("Customer ID: "+cust.key+" Name: "+cust.value);
            println("$cust.key -> $cust.value")
        }

    }
}