import java.util.ArrayList;

public class Except{
      public void ListOf(){
            ArrayList<Object> myList = new ArrayList<Object>();
                  myList.add("13");
                  myList.add("hello world");
                  myList.add(48);
                  myList.add("Goodbye World");
      
            for(int i = 0; i < myList.size(); i++) {
                  try{
                  Integer castedValue = (Integer) myList.get(i);
                  System.out.println(castedValue);
                  }
                  //There always needs to be a catch after a try.
                  //What are you trying to catch? An error, in java it's called an Exeption.
                  catch(Exception e){
                  System.out.println("You can't do that");
                  }
            }
   
      }

}
//Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
//at Except.ListOf(Except.java:11)
//at ExceptTest.main(ExceptTest.java:5)