import java.util.ArrayList;

public class ArrayListCompare13 {
  public static void main(String[] args) {
 
	  ArrayList<String> Colours = new ArrayList<String>();
	  
  Colours.add("Red");
  Colours.add("Purple");
  Colours.add("Yellow");
  Colours.add("White");
  Colours.add("Black");
  
  	  ArrayList<String> Colours2 = new ArrayList<String>();
  	  
  Colours2.add("Farve1");
  Colours2.add("Farve2");
  Colours2.add("Farve3");
  
  	  ArrayList<String> ColoursC = new ArrayList<String>();
  	  for (String e : Colours)
  		  ColoursC.add(Colours2.contains(e) ? "Yes" : "No");
  
  System.out.println(ColoursC);

  	}
  }