
interface Sphere {
	default String getName() { return "Unknown"; }
}
abstract class Planet {
	abstract String getName();
}
public class Mars extends Planet implements Sphere {
	public Mars() {
		super();
	}
	public String getName() { return "Mars"; }
	public static void main(final String[] probe) {
		System.out.print(((Planet)new Mars()).getName());
	}
}