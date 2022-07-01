package com.example.homework7m5;

public class Math {

    public String add(String first, String second){
      String result = "";
      if (first.contains(".")|| second.contains(".")){
          result = "You're gay? Don't write dots!!!";

      }else if(!isNumeric(first) || !isNumeric(second)){
          result = "You're gay? Don't write letters!!!";
      }else if(first.contains("-") || second.contains("-")){
          result = "You're gay? Don't write minus!!!";
      }else if (first != null && second != null){
          result = "You're gay? Don't write null";
      }else if(first.isEmpty() || first.isEmpty()){
          result = "You're gay? String is Empty";
      }

      else {

          int firstNum = Integer.parseInt(first);
          int secondNum = Integer.parseInt(second);
          result = String.valueOf(firstNum + secondNum);
      }
      return result;
    }

    public static boolean isNumeric(String str){
        try{
            Double.parseDouble(str);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
