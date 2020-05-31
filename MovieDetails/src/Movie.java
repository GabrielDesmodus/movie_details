
public class Movie {
	private String name;
	private String genre;
	private String country;
	private int releaseYear;
	
	public Movie(String name, String genre, String country, int releaseYear) {
		this.name = name;
		this.genre = genre;
		this.country = country;
		this.releaseYear = releaseYear;
	}	
	
	public void showInfo(){
		System.out.println("Name of the Movie: " + this.name);
		System.out.println("Genre of the Movie: " + this.genre);
		System.out.println("Country of the Movie: " + this.country);
		System.out.println("Release year: " + this.releaseYear);
	}
}
