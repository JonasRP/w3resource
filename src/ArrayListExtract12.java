import java.util.*;

public class ArrayListExtract12 {
  public static void main(String[] args) {
 
	  List<String> Colours = new ArrayList<String>();
  Colours.add("Red");
  Colours.add("Purple");
  Colours.add("Yellow");
  Colours.add("White");
  Colours.add("Black");
  
  System.out.println("Test: " + Colours);
  List<String> sub_List = Colours.subList(0, 3);
  System.out.println("Test to: " + sub_List);
  	}
  }