package Movies;

public class Person {
	String firstname;
	String lastname;
	Gender gender;
	boolean hasOscar;
	boolean hasGoldenGlobe;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public boolean isHasOscar() {
		return hasOscar;
	}

	public void setHasOscar(boolean hasOscar) {
		this.hasOscar = hasOscar;
	}

	public boolean isHasGoldenGlobe() {
		return hasGoldenGlobe;
	}

	public void setHasGoldenGlobe(boolean hasGoldenGlobe) {
		this.hasGoldenGlobe = hasGoldenGlobe;
	}

	public String toXMLString() {
		return Tools.toXMLTag("person",
				Tools.toXMLTag("firstName", this.firstname) + Tools.toXMLTag("lastName", this.lastname)
						+ Tools.toXMLTag("gender", String.valueOf(this.gender))
						+ Tools.toXMLTag("hasOscar", String.valueOf(this.hasOscar))
						+ Tools.toXMLTag("hasGoldenGlobe", String.valueOf(this.hasGoldenGlobe)));
	}

}
