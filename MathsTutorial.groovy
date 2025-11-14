class MathsTutorial {
    static void main(String[] args){
        println("Hello, Groovy!");
        def age="Dog";
        age=10;
        println("Age: "+age);
        println("5+2="+(5.plus(2)));
        println("5-2="+(5.minus(2)));
        println("5*2="+(5.multiply(2)));   
        println("5/2="+(5.div(2))); 
        // float division
        println("5%2="+(5.mod(2)));
        println("5**2="+(5.power(2)));
        println("5/2="+(5.intdiv(2)));
        // integer division
        println("age++="+(age++));
        println("++age="+(++age));
        println("age--="+(age--));  
        println("--age="+(--age));

        println("Biggest Integer:"+Integer.MAX_VALUE);
        println("Smallest Integer:"+Integer.MIN_VALUE);

        println("Biggest Long:"+Long.MAX_VALUE);
        println("Smallest Long:"+Long.MIN_VALUE);

        println("Biggest Float:"+Float.MAX_VALUE);
        println("Smallest Float:"+Float.MIN_VALUE);

        println("Biggest Double:"+Double.MAX_VALUE);
        println("Smallest Double:"+Double.MIN_VALUE);

        def randomNum=2.0;
        println("Abs Value of -2.0:"+Math.abs(-2.0));
        println("Ceil Value of 2.3:"+Math.ceil(2.3));   
        println("Ceil Value of -2.3:"+Math.ceil(-2.3));   
        println("Floor Value of 2.7:"+Math.floor(2.7));
        println("Floor Value of -2.7:"+Math.floor(-2.7));
        println("Round Value of 2.5:"+Math.round(2.5));
        println("Round Value of 2.4:"+Math.round(2.4));
        println("Round Value of -2.5:"+Math.round(-2.5));
        println("2 raised to 3:"+randomNum.pow(3));
        println("Square root of 16:"+Math.sqrt(16));
        println("Cbrt of 27:"+Math.cbrt(27));
        println("Max between 10 and 20:"+Math.max(10,20));
        println("Exponential of 1:"+Math.exp(1));
        println("Logarithm of 10:"+Math.log(10));
        println("Equals check 5 and 5:"+5.equals(5));
        println("Equals check 5 and 6:"+5.equals(6));
        println("Random number between 0 and 1:"+Math.random());
        println("Random number between 0 and 100:"+(Math.random()*100));
        //println("randomNum.isNaN():"+randomNum.isNaN());
        println("randomNum.equals(Float.NaN):"+randomNum.equals(Float.NaN));
    }
}