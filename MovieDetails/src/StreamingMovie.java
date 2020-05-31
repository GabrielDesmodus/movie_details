
public class StreamingMovie extends Movie{
	
	private String strService; //Streaming service
	
	public StreamingMovie(String name, String genre, String country, int releaseYear, String strService) {
		super(name, genre, country, releaseYear);
		this.strService = strService;
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Name of the Streaming Service: " + this.strService);
	}
	
}
