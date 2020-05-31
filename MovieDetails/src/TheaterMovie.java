
public class TheaterMovie extends Movie{
	private String theater;

	public TheaterMovie(String name, String genre, String country, int releaseYear, String theater) {
		super(name, genre, country, releaseYear);
		this.theater = theater;
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Name of the Teather: " + this.theater);
	}
	
	
}
