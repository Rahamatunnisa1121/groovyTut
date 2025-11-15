class Liststut {
    public static void main(String[] args)
    {
        def primes=[2,3,5,7,11,13]
        println("Primes List: "+primes)
        println("1st prime: "+primes[0])
        println("1st prime using get(): "+primes.get(0))
        println("Last prime: "+primes[-1])
        //println("Last prime using get():"+primes.get(-1));
        println("Length of primes list: "+primes.size())
        println("2nd to 4th primes: "+primes[1..3])//1 to 3 indexes including
        println("Adding 17 to primes list: "+(primes+17))//adds at last

        def employee=["Derek",40,6.25,[1,2,3]];
        println("2nd number:"+employee[3][1])//accessing nested list element

        primes.add(19)//adds 19 at last
        primes<<23//adds 23 at last
        println("Primes after additions:")
        println(primes)
        def newList=primes+[29,31]//adds 29 and 31 at last
        println("New List after additions:")
        println(newList)
        primes.addAll([29,31])//adds multiple elements at last
        println("Primes after adding multiple elements:")
        println(primes)
        primes.removeAll([29,31])//removes multiple elements
        println("Primes after removing multiple elements:") 
        println(primes)
        primes.removeAt(0)//removes element at index 0
        println("Primes after removing element at index 0:")
        println(primes)
        newList=newList - [19,23]//removes 19 and 23
        println("New List after removing 19 and 23:")   
        println(newList)

        def array=[5,7,2,9,1,3]
        println("Array: "+array)
        println("Matches:"+array.intersect([2,3,7,23]))//common elements

        println("Reverse:"+array.reverse())
        println("Sorted:"+array.sort())

        println("Last:"+array.pop())//removes and returns first element just as stack pop
        println("Array after pop:"+array)
   }
}