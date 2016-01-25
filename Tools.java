package Movies;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Tools {

	public static HashMap<Person, Integer> countMoviesPerPerson(List<Movie> movies) {
		return null;
	}

	public static String[] getMovieTitles(ArrayList<Movie> movies) {
		int listLength = movies.size();
		String[] result = new String[listLength];

		for (int j = 0; j < listLength; j++) {
			result[j] = movies.get(j).getTitle();
		}
		return result;
	}

	public static String toXMLTag(String MyTag, String MyValue) {
		return "<" + MyTag + ">" + MyValue + "</" + MyTag + ">";
	}

}
