import groovy.transform.ToString;
@ToString(includeNames=true, includeFields=true)

class Animal{
    private int secret=99;
    def name,sound;
    def run(){
        println("$name runs!");
    }
    def makeSound(){
        println("$name makes sound: $sound");
    }
    def setSound(newSound){
        this.sound=newSound;
    }
    def Animal(name, sound){ //constructor
        this.name=name;
        this.sound=sound;
    }
}