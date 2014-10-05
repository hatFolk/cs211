// This corresponds to Question 4
// Part g.
public class Animal{
	// Part a fulfilled below
	private String species;
	private int weight;
	public Animal(){ // Part b
		this.species = "Arbitrary Animal"; // Weirdly, the string is < 20.
		this.weight = 0; // This is surprisingly allowed.
	}

	public Animal(String species, int weight){ // Part c
		int len = species.length();
		if(len >= 1 && len < 20){ // Part f
			this.species = species;
			this.weight = weight;
		} else { // Of course, what if they fail the check?
			/* Since, the specs don't say what to do...
			 * You get to choose.
			 * And since I'll probably never use this for real programming...
			 * I'll just throw an exception.
			 */
			throw new Exception("Species length failed :" + len);
		}
	}

	public void setSpecies(String species){ // Part e
		int len = species.length();
		if (len >= 1 && len < 20){ // Part f; Could reuse the check...
			this.species = species;
		} else { // In case the species name wasn't good...
			System.out.println("Species length failed : " + len);
		}
		/* You know when you've typed a word too many times...
		 * It doesn't look like a word anymore?
		 * "species" is such a weird word.
		 */
	}

	public String toString(){ // part d. Anyway you'd like it.
		return "Species: "+this.species+"\nWeight: "+this.weight;
	}
}
