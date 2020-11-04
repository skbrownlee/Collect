
public class Thingy implements Comparable<Thingy> {

	
	private String name;
	
	public Thingy(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Thingy arg0) {
		// TODO Auto-generated method stub
		return this.name.compareTo(arg0.getName());
	}
	
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return this.getName();
	}
}
