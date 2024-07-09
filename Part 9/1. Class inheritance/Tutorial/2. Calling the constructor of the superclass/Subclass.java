public class Subclass extends Superclass {

	public Subclass() {
		super("Subclass");
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nAnd let's add my own message to it!";
	}
}
