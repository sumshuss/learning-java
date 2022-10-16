public class GreaterThan {
    public static void main(String[] args){
        double recommendedWaterIntake = 8;
        double daysInChallenge = 30;
        double yourWaterIntake = 235.5;
        
      double totalRecommendedAmount = recommendedWaterIntake * daysInChallenge;
      
      boolean isChallengeComplete = yourWaterIntake >= totalRecommendedAmount;
      
      System.out.println(isChallengeComplete);
      }       
    
}

//.equals can be used similarly to ==

class Song {
    public static void main(String[] args){
    String line1 = "Nah nah nah nah nah nah nah nah nah yeah";
    String line2 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
    String line3 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";

    System.out.println(line1.equals(line2));
  }       
}
