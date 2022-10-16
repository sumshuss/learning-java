public class Order {
     
  public static void main(String[] args) {
    
    double itemCost = 30.99;
    
    // Write an if-then statement:
    if(itemCost > 24.00) {
      
    System.out.println("High value item!");
    }

    
 
  }
    
}

// if else

 class Oder {
  
    public static void main(String[] args) {
      
      boolean isFilled = false;
      
      // Write an if-then-else statement:
      
      if (isFilled) {
        System.out.println("Shipping");
      } else {
          System.out.println("Order not ready");
      }
      
    }
    
  }
  

  // if else then

   class Orer {
    boolean isFilled;
    double billAmount;
    String shipping;
    
    public Orer(boolean filled, double cost, String shippingMethod) {
          if (cost > 24.00) {
        System.out.println("High value item!");
      }
      isFilled = filled;
      billAmount = cost;
      shipping = shippingMethod;
    }
    
    public void ship() {
      if (isFilled) {
        System.out.println("Shipping");
        System.out.println("Shipping cost: " + calculateShipping());
      } else {
        System.out.println("Order not ready");
      }
    }
    
    public double calculateShipping() {
           // declare conditional statement here
      if (shipping.equals("Regular")) {
        return 0;
      } else if (shipping.equals("Express")) {
        return 1.75;
      } else {
        return .50;
      }
       }
    
    public static void main(String[] args) {
      // do not alter the main method!
      Orer book = new Orer(true, 9.99, "Express");
      Orer chemistrySet = new Orer(false, 72.50, "Regular");
      
      book.ship();
      chemistrySet.ship();
    }
  }
