package Movies;

import java.util.ArrayList;

public class MovieManager {
	public static void main(String[] agrs) {
		
		Person person1 = new Person();
				
		Movie movie1 = new Movie();
		
		person1.firstname = ("Robert");
		person1.lastname = ("Downey JR");
		person1.gender = Gender.Male;
		person1.hasOscar = false;
		person1.hasGoldenGlobe = true;
		
		movie1.title = ("Tropic Thunder");
		movie1.gener = Gener.Action;
		movie1.duration = 107;
		movie1.rate = 7.0;
		ArrayList<Person> persons = new 
		ArrayList<Person>();
		persons.add(person1);
		
		ArrayList<Movie> movies = new
		ArrayList<Movie>();
		movies.add(movie1);
	}

}
