package lab05;

public class shape {

	private String color;
	private boolean filled ;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	@Override
	public String toString() {
		return "shape [color=" + color + ", filled=" + filled + ", getColor()=" + getColor() + ", isFilled()="
				+ isFilled() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
chohomtrang22@gmail.com
