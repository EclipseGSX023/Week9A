package Movies;

import java.util.ArrayList;

public class Movie {

	String title;
	Gener gener;
	long duration;
	double rate;
	ArrayList<Person> cast = new ArrayList<Person>();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Gener getGener() {
		return gener;
	}

	public void setGener(Gener gener) {
		this.gener = gener;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public ArrayList<Person> getCast() {
		return cast;
	}

	public void setCast(ArrayList<Person> cast) {
		this.cast = cast;
	}

	public String toXMLString() {

		StringBuffer result = new StringBuffer();

		String strTitleTag = Tools.toXMLTag("title", this.title);
		String strGenreTag = Tools.toXMLTag("genre", this.gener.toString());
		String strDurationTag = Tools.toXMLTag("duration", String.valueOf(this.title));
		String strRateTag = Tools.toXMLTag("title", String.valueOf(this.title));
		String strCastTag = "";
		for (Person person : cast) {
			strCastTag += person.toXMLString();
		}
		strCastTag = Tools.toXMLTag("cast", strCastTag);
		return Tools.toXMLTag("Movie", strTitleTag + strGenreTag + strDurationTag + strRateTag + strCastTag);

	}
}
