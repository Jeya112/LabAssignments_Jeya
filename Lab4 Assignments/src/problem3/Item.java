/*
 * name Jeya Prashanthini R
 * date 1/11/2020
 * desc Library Management System
 */
package problem3;

public abstract class Item {

	                                                                                 // Attributes of abstract class
    private long id;
	private String title;
	private int noOfCopies;
    public long getId() {                                                            // Getters and setters for the class attributes
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}                                                                                             //abstract methods to implement in child classes for add and print details
    public abstract void addDetails();
    public abstract void printDetails();

}
