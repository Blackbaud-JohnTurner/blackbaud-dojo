
public class RomanNumeralConverter {


  private String returnHalf(int currentDigit){
      if(currentDigit==1){
          return "V";
      }
      else if(currentDigit==10){
          return "D";
      }
      else {
          return "L";
      }
  }

   private String returnSingle(int currentDigit){
       if(currentDigit==1){
           return "I";
       }
       else if(currentDigit==10){
           return "X";
       }
       else {
           return "C";
       }
   }

   private String returnNext(int currentDigit){
       if(currentDigit==1){
           return "X";
       }
       else if(currentDigit==10){
           return "C";
       }
       else {
           return "M";
       }
   }

  public String convertToRomanNumeral(int intToConvert){

      String str = Integer.toString(intToConvert);
      String result = "";
      int currentDigit = 1;

      for(int i=str.length()-1; i>=0; i--){
          int digit = (int) str.charAt(i);
          if(digit == currentDigit*10-1){
              result += (returnSingle(currentDigit)+returnNext(currentDigit));
              break;
          }
          else if(digit > currentDigit*5){
              result+=returnHalf(currentDigit);
              digit -= 5*currentDigit;
          }
          else {
              while(digit > 0){
                  result+=returnSingle(currentDigit);
                  digit--;

              }

          }
          currentDigit*=10;
      }



      return result;
  }



}
