public class variables {
    public static void main(String[] args) {
        String name = "James Gosling";
        int yearCreated = 1995;
        double decimalNum = 3.999;
        // int holds whole numbers
        //double holds decimals or large numbers
        System.out.println(name);
        System.out.println(decimalNum);
        System.out.println(yearCreated);
    
    }
}

class Boolean {

    public static void main(String[] args) {
      
        boolean javaIsACompiledLanguage = true;
        boolean javaIsACupOfCoffee = false;
        System.out.println(javaIsACompiledLanguage);
        System.out.println(javaIsACupOfCoffee);
    }

}

class Char {

    public static void main(String[] args) {
      //char can hold any character like spaces or punctuation marks DOUBLE QUOTATIONS DON'T WORK!
      char grade = 'A';
      System.out.println(grade);
        
    }

}

class string {
    public static void main(String[] args) {
        //Strings hold sequences of characters. We’ve already seen instances of a String, for example, when we printed out "Hello World". There are two ways to create a String object: using a String literal or calling the String class to create a new String object. Has to be in double quotes

        String greeting = "Hello";
        
        String salutations = new String("Hello World");
        
        // The \" escape sequence allows us to add quotation marks " to a String value
        System.out.println("\"Hello World\"");
        
        //Using the \\ escape sequence allows us to place backslashes in our String text:
        System.out.println("This is the backslash symbol: \\");


        // Finally, if we place a \n escape sequence in a String, the compiler will output a new line of text:
        System.out.println("Hello\nGoodbye");
        
    }
}

class MyProfile {
	public static void main(String[] args) {   
		String name = "Laura";
    int age = 25;
    double desiredSalary = 80000.00;
    char gender = 'f';
    boolean lookingForJob = true;
	}
}
