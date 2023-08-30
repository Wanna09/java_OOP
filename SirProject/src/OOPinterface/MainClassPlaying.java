package OOPinterface;

public class MainClassPlaying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child kid = new Child("park");
		System.out.println("Child play in the "+kid.toy);
		
		Musician voice = new Musician("guiter");
		System.out.println("Musician play "+voice.musical);
		
		Actor Spw = new Actor("game");
		System.out.println("Actor play "+Spw.flim);

	}

}
