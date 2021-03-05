import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FunctionalProgramming {

	public static void main(String[] args) {
		/*
		List<Integer> numbers = List.of(23,45,32,123,456,76,89,94);
		numbers.stream().sorted().forEach(element -> System.out.println(element));
		System.out.println("Now Squaring");
		numbers.stream().map(e -> e * e).forEach(element -> System.out.println(element)); // here using map method we can square the numbers.
		
        
        for(int Nummber: numbers)
        {
        	System.out.println(Nummber);
        }
        
        
        // PRINTING NUMBERS
        // numbers.stream().forEach(element -> System.out.println(element));
      
        
         * PRINTING ODD NUMBERS 
       numbers.stream().filter
       (element -> element%2 !=0). //here we are using the filter method and filtering only the even numbers out.
       forEach(element - > System.out.println(element));
       
       * PRINTING EVEN NUMBERS BASIC
        
      numbers.stream().filter //here we are using the filter method and filtering only the even numbers out.
    	       (element -> element%2 == 0).
    	       forEach(element ->System.out.println(element));
      
        
        
      // Adding the elements of the list using reduce method
      
      int sum = numbers.stream().reduce(0, (number1, number2) -> number1 + number2);
      System.out.println(sum);
       */
		
		
		List<String> list  = List.of("Apple", "Banana", "Courage", "Coconuta", "Avengerele", "evenera", "Australia");
		/*
		for(String string: list)
		{
			System.out.println("element " + string);
		}
		*/
		
		// list.stream().forEach(element -> System.out.println(element)); 
		// here this is  a lambda function where we are using forEach loop and printing each and every element.
		// list.stream().filter(e-> e.startsWith("A")).forEach(element -> System.out.println(element));
				list.stream().map(e-> e.toLowerCase()).forEach(element -> System.out.println(element)); // printing in lower case
				list.stream().map(e-> e.length()).forEach(element -> System.out.println(element)); // printing each string length

		//Here we are using the filter method and printing only the strings starting with A.
       
		
		// System.out.println("Printing the squares of the elements in the range");
		// IntStream.range(0,11).map(e -> e*e).forEach(element -> System.out.println(element));
	}

}
