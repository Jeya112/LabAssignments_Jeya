/*
 * name Jeya Prashanthini R
 * date 1/11/2020
 * desc Library Management System
 */
package problem3;
import java.util.Scanner;

public class CD extends MediaItem {
	private String artist;
	private String genreCD;
    public String getArtist() {                                           // Getters and Setters for the private attributes
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenreCD() {
		return genreCD;
	}

	public void setGenreCD(String genreCD) {
		this.genreCD = genreCD;
	}
	
    @Override                                                            // Getters and Setters for the private attributes
	public void addDetails() {
		super.addDetails();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Artist");
		setArtist(sc.nextLine());
		System.out.println("Enter the Genre");
		setGenreCD(sc.next());
		
	}
                                                                        // Overriding method to display details
	 @Override
	public void printDetails() {
		super.printDetails();
		System.out.println("Artist: " + getArtist());
		System.out.println("Genre: " + getGenreCD());
	}

}
