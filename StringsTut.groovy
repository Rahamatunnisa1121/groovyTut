class StringsTut{
   static void main(String[] args){
    def name="Derek"
    println("I am ${name}")
    println('I am ${name}')

    def multStr='''I am a string
    that goes on 
    for multiple lines
    '''
    println(multStr)

   //0 based index
    println("2nd index  of name: "+name[2])
    println("Index of rek: "+name.indexOf('rek'))//gives index of r
    println("Length of name: "+name.length())
    println("1st 3 letters: "+name[0..2])//0 to 2 including
    println("Last 3 letters: "+name[-3..-1])//-3 to -1 including
    println("every other letter: "+name[0,2,4])//0,2,4 indices
    println("My name is:"+name.substring(0,2)+"rek")//0 to 2 excluding 2
    println("Equals Derek? "+(name.equals("Derek")))
    println("Equals derek? "+(name.equals("derek")))
    println("Equals derek by ignore case?"+(name.equalsIgnoreCase("derek")))
    println("Uppercase: "+name.toUpperCase())
    println("Lowercase: "+name.toLowerCase())

      def repeatStr="What I said is "*2;
      println(repeatStr)
      println(repeatStr-"What ")//removes first occurrence of What
      println(repeatStr.split(" "))//splits into array by space
      println(repeatStr.toList())//splits into list by every character
      println(repeatStr.contains("said"))//checks if contains said
      println(repeatStr.startsWith("What"))//checks if starts with What
      println(repeatStr.endsWith('is '))//checks if ends with is
      println(repeatStr.replace("What","Huh"))//replaces What with Huh -> (literal match)
      println(repeatStr.replaceAll(" ","_"))//replaces all spaces with _ (regex based)

      // spaceship operator -> ' <=> '
      /*
      if left side < right side -> returns -1
      if left side == right side -> returns 0
      if left side > right side -> returns 1
      */
      println("Apple <=> Banana: "+("Apple"<=>"Banana"))
      println("Banana <=> Apple: "+("Banana"<=>"Apple"))
      print("Apple <=> Apple: "+("Apple"<=>"Apple"))

      def randString="Random";
        println("A ${randString} String");
        println("A $randString String");
        printf("A %s string \n",randString);//for formatted text use printf
        printf("%-10s %d %.2f %10s \n",["Stuff",10,1.234,"Random"])
        // %-10s -> left align string in field of width 10
        // %d -> integer
        // %.2f -> float with 2 decimal places
        // %10s -> right align string in field of width 10
   } 
}
