package OOPinterface;

public class Actor implements Playing {

	String flim;
	public Actor(String flim) {
		this.flim = flim;
	}
	
	public String play() {
		return flim;
	}
}
