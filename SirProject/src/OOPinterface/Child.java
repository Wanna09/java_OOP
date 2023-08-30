package OOPinterface;

public class Child implements Playing {

	String toy;
	public Child(String toy) {
		this.toy = toy;
	}
	
	public String play(){
		return toy;
	}
}
