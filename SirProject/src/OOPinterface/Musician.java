package OOPinterface;

public class Musician implements Playing {
	
	String musical;
	
	public Musician(String musical) {
		this. musical = musical; 
	}
	public String play() {
		return musical;
	}

	

}
