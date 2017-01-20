package fr.akwanet.java.optimized;

final public class MutableCircle implements ImmutableCircle {

    private double radius;

    public MutableCircle(double r) {
        radius = r;
    }

//    public void setRadius(double radius) {
//		this.radius = radius;
//	}

	public double radius() {
        return radius;
    }
}