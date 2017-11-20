import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSwap14 {
  public static void main(String[] args) {
 
	  ArrayList<String> Colours = new ArrayList<String>();
  Colours.add("Red");
  Colours.add("Purple");
  Colours.add("Yellow");
  Colours.add("White");
  Colours.add("Black");
  
  Collections.swap(Colours, 0, 3);
  System.out.println(Colours);

  	}
  }