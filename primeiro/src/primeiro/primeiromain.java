//import java.util.Arrays;
package primeiro;

import java.util.ArrayList;
import java.util.Random;

public class primeiromain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Projeto java\n");
		//array
		String[] students ={"Sade", "Alexus", "Sam", "Koma"};

	    double[] mathScores = new double[4];

	    mathScores[0]= 94.5;
	    mathScores[2]=76.8;

	  System.out.println("The number of students in the class is "+students.length+".");
	
	  System.out.println("length do array "+students.length);
	  //arraylist
	  ArrayList<String> toDoList = new ArrayList<String>();
	  String toDo1 = "Water plants";
	  // Add more to-dos here:
	  String toDo2 = "Water plants2";
	  String toDo3 = "Water plants3";
	    
	  // Add to-dos to toDoList
	  toDoList.add(toDo1);
	  toDoList.add(toDo2);
	  toDoList.add(toDo3);
	    
	  System.out.println(toDoList);
	  System.out.println("size "+toDoList.size());
	  
	  //lista mista
	  ArrayList assortment = new ArrayList<>();
	  assortment.add("Hello"); // String
	  assortment.add(12); // Integer
	  assortment.add(4.77777); // Double
	  //assortment.add(ferrari); // reference to Car
	  // assortment holds ["Hello", 12, ferrari]
	  System.out.println(assortment.get(1));//selecionar pelo indice
	  assortment.set(1, 6);
	  System.out.println(assortment.get(1));
	  System.out.println(assortment);
	  //remover item completamente
	  assortment.remove(0); //pode se remover pelo indice ou pelo valor
	  System.out.println(assortment);
	  System.out.println(assortment.indexOf(4.77777));//selecionar indice
	  
	  
	  
	  // Creating a random number generator
	  Random randomGenerator = new Random();
	    
	  // Generate a number between 1 and 6
	  int dieRoll = randomGenerator.nextInt(6) + 1;
	  System.out.println("rand "+dieRoll);
	    
	   
	  //se i nao eh divisivel por 5 pula, se nao, print i
	  
	  for (int i = 0; i < 100; i++) {
		  if(i%5!=0){
	        continue;
	      }
	      System.out.println(i);
	    }
	    
	  
	  //for each
	  ArrayList<Double> expenses = new ArrayList<Double>();
	  expenses.add(74.46);
	  expenses.add(63.99);
	  expenses.add(10.57);
	  expenses.add(81.37);

	  for(double item: expenses){
		  System.out.println(item);
	  }
	    
	    
	  /* alguns metodos string
	   * 
    length()
    concat()
    equals()
    indexOf()
    charAt()
    substring()
    toUpperCase() / toLowerCase()

	   */
	  String palavra="0123456789123";
	  System.out.println("\n\n strings");
	  System.out.println(palavra.length());
	  //concat()
	  String firstName = "cla";  
	  String lastName = "isa";
	  System.out.println(firstName.concat(lastName));
	  
	  //compareto
	  System.out.println(firstName.compareTo(lastName)+" falso");
	  System.out.println(firstName.compareTo(firstName)+" verdadeiros");
	  
	  //equals - equalsIgnoreCase()
	  System.out.println(firstName.equals(lastName)+" falso");
	  System.out.println(firstName.equals(firstName)+" verdadeiro");
	  System.out.println(firstName.equalsIgnoreCase("cLa"));
	  System.out.println(firstName.equalsIgnoreCase("CLA"));
	  
	  //indexOf() retorna o indice
	  System.out.println("\n\nindex of 123 eh 1--> "+palavra.indexOf("123"));
	  
	  
	  //retorna o char 
	  System.out.println(firstName.charAt(0));
	  System.out.println(lastName.charAt(0));
	    
	  //retorna o substring (indice inicial, indice final+1)
	  System.out.println("imprimir 123 eh --> "+palavra.substring(1,4));
	  
	  //toUpperCase()   toLowerCase()
	  System.out.println(firstName.toUpperCase());
	  
	  
	}

}
