public class DivieandMulti {

    public static void main(String[] args) {   
        double subtotal = 30;
        double tax = 0.0875;
        
        double total = subtotal + subtotal*tax;
        
        System.out.println(total);
        
        double perPerson = total/4;
        
        System.out.println(perPerson);
	}
}

class Modulo {
    public static void main(String[] args) {
    int students = 26;
    double leftOut = students % 3;
    System.out.println(leftOut);
        
    }
}

class CompoundAssignmentOperators {
    public static void main(String[] args) {
        int numCookies = 17;
        numCookies -= 3;
        numCookies /= 2;
        // Add your code above
        System.out.println(numCookies);
    }
}

class GreaterLessThan {
	public static void main(String[] args) {   
	double creditsEarned = 176.5;
    double creditsOfSeminar = 8;
    double creditsToGraduate = 180;
     
    System.out.println(creditsEarned > creditsToGraduate);

    double creditsAfterSeminar = creditsEarned + creditsOfSeminar;
    
    System.out.println(creditsToGraduate < creditsAfterSeminar);
	}
}

class EqualNotEqual {

    public static void main(String[] args) {   
	int songsA = 9;
    int songsB = 9;
    int albumLengthA = 41;
    int albumLengthB = 53;

    
    boolean sameNumberOfSongs = songsA == songsB;
    boolean differentLength = albumLengthA != albumLengthB;
	}

}
