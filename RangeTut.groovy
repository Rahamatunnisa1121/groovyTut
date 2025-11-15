class RangeTut{
    static void main(String[] args){
        //stored as Range object
        def oneTo10=1..10 //Range<Integer>
        def aToZ='a'..'z' //Range<Character>
        def zToA='z'..'a'
        println("Range 1 to 10: "+oneTo10)
        println("Range a to z: "+aToZ)
        println("Range z to a: "+zToA)//toString representation
        //to get full list from range
        println("List from 1 to 10: "+oneTo10.toList())
        println("List from a to z: "+aToZ.toList())
        println("List from z to a: "+zToA.toList())

        //size
        println("Size of 1 to 10 range: "+oneTo10.size())
        println("2nd element in 1 to 10 range: "+oneTo10[1])
        println("2nd element in 1 to 10 range: "+oneTo10.get(1))
        println("Last element in 1 to 10 range: "+oneTo10[-1])
        println("Contains 11?"+oneTo10.contains(11))

        println("Get Last ele using 'to' keyword: "+oneTo10.getTo())
        println("Get First ele using 'from' keyword: "+oneTo10.getFrom())


    }
}