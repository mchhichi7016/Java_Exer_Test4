import Sample

public class Main {
	public static void main(String[] args) {
		Sample s = new Sample();
		s.setValue("java");
		System.out.println(s.toString());
	}

}

public class Sample {
	private String value;
	public void setValue(String value) {
		value = "Hello," + value;
	}
	public String toString() {
		return value;
	}

}
