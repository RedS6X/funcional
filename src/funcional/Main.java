package funcional;

import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		  
		  
		 Persona p1= new Persona ("Pepe",20);
		 Persona p2= new Persona ("Lola",50);
		 Persona p3= new Persona ("Lelo",60);
		  
		 
		 Stream<Persona> st = Stream.of(p1, p2, p3);
		 st.forEach((p) -> System.out.println(p.getNombre()));
		 
		 
		 
		 
		
		 
		
	 
		 
	}
} 
