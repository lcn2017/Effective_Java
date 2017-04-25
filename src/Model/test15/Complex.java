package Model.test15;
//对于不可变类我们经常在公有的方法中返回一个new这样就不会影响到原来的对象。
public class Complex {
	private final double re;
	private final double im;

	public Complex(double re, double im) {
		this.im = im;
		this.re = re;
	}

	public double realPart() {
		return re;
	}

	public double imaginaryPart() {
		return im;
	}

	public Complex add(Complex c) {
		return new Complex(re + c.re, im + c.im);
	}

	public Complex subtract(Complex c) {
		return new Complex(re - c.re, im - c.im);
	}

	public Complex multiply(Complex c) {
		return new Complex(re * c.re - im * c.im, re * c.im - im * c.re);
	}

	public Complex divide(Complex c) {
		double temp = c.re * c.re + c.im * c.im;
		return new Complex((re * c.re - im * c.im) / temp, (re * c.im - im * c.re) / temp);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Complex)) {
			return false;
		}
		Complex c = (Complex) obj;
		return Double.compare(re, c.re) == 0 && Double.compare(im, c.im) == 0;
	}
	@Override
	public int hashCode() {
		int result=17+hashDouble(re);
		result = 31*result+hashDouble(im);
		return result;
	}

	private int hashDouble(double val) {
		long longBits = Double.doubleToLongBits(re);
		return(int)(longBits^(longBits>>32));
	}

	@Override
	public String toString() {
		return "Complex [re=" + re + ", im=" + im + "]";
	}
}
