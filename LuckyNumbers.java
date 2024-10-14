public class LuckyNumbers {
 
  public LuckyNumbers() { }

  public int randomIntegerBetween(int min, int max) {
     int randomInteger = (int) (Math.random() * ((max - min) + 1) + min); 
     return randomInteger;
  }
  
  public String getLuckyNumbers() {
    int luckyNumber1 = randomIntegerBetween(1, 65);
    int luckyNumber2 = randomIntegerBetween(1, 65);
    int luckyNumber3 = randomIntegerBetween(1, 65);
    int luckyNumber4 = randomIntegerBetween(1, 65);
    int superBall = randomIntegerBetween(1, 30);
    return "Your lucky numbers are: " + luckyNumber1 + " " + luckyNumber2 + " " + luckyNumber3 + " " + luckyNumber4 + "\n" +  "The super ball is: " + superBall;
  }
}