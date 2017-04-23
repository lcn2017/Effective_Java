package Model.test8_12;

public class clone1 {
	private int para1;
	private String para2;
	private double para3;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return (clone1)super.clone();
	}
}
