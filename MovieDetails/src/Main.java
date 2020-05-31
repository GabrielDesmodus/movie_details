import java.util.Scanner;

public class Main {

	private static String name;
	private static String genre;
	private static String country;
	private static int releaseYear;
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {	
		
		String strService;
		String theater;
		
		char opt='Y';
		char opt2;
		
		System.out.println("-------Movie descriptions program-------");
		
		while(opt=='Y') {//while the the option to continue is yes
			
			System.out.println("Describing a new movie:"
					+ "\r\n" + "Type T if you watched the movie in a theater"
					+ "\r\n" + "Type S if you watched the movie in streaming service"
					+ "\r\n" + "Type N if you don't want to specify that"
					+ "\r\n");
			
			opt2=scan.nextLine().charAt(0);
			
			if(opt2=='S') {
				System.out.println("Name of the streaming service where the movie was released:");
				strService=scan.nextLine();
				inputVar();
				StreamingMovie strMovie = new StreamingMovie(name, genre, country, releaseYear, strService);
				strMovie.showInfo();
				
			}else if(opt2=='T') {
				System.out.println("Name of the theater where you watched the movie:");
				theater=scan.nextLine();
				inputVar();
				TheaterMovie theatMovie = new TheaterMovie(name, genre, country, releaseYear, theater);
				theatMovie.showInfo();
				
			}else if(opt2=='N') {
				inputVar();
				Movie movie= new Movie(name,genre,country,releaseYear);
				movie.showInfo();
			}else {
				System.out.println("Invalid input");
			}
			
			System.out.println("Do you wish to continue? Type Y for yes and N for no");
			opt=scan.nextLine().charAt(0);
		}
	}
	
	//Method for inputing the variables to be used in the constructors every time it's called, so the code doesn't need to be repeated in the conditions
	private static void inputVar(){

		
		System.out.println("Input the movie's name:");
		name=scan.nextLine();
		System.out.println("Input the movie's genre:");
		genre=scan.nextLine();
		System.out.println("Input the movie's country:");
		country=scan.nextLine();
		System.out.println("Input the movie's release year");
		releaseYear=scan.nextInt();
		scan.nextLine();//Cleaning buffer
	}
}
