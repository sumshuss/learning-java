package Maths;

public class ATM{

    // Step 2: Create your static variables here
  
    // Instance variables
    public int money;
  
    public ATM(int inputMoney){
      this.money = inputMoney;
    }
  
    public void withdrawMoney(int amountToWithdraw){
      if(amountToWithdraw <= this.money){
        this.money -= amountToWithdraw;
      }
    }
  
    public static void main(String[] args){
      // Step 1: Create your two ATMs here
  
      // Step 3: Print your static variable in three different ways here
    }
  
  }
