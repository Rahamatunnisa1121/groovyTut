class OOPTut{
    static void main(String[] args)
    {
        def king=new Animal("Lion","Roar");
        println("$king.name says ${king.sound}");
        king.setSound("Growl");
        println("$king.name now says ${king.sound}");
        king.run();
        king.makeSound();
        println(king);//prints all properties due to @ToString annotation in Animal class

        def grover=new Dog("Grover","Grrrr","Jim");
        king.makeSound();
        grover.makeSound();
    }
}