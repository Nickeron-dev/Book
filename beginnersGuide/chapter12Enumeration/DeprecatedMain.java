package annotation;

@Deprecated
class DeprecatedClass {
	public String msg;
	
	public DeprecatedClass(String m) {
		msg = m;
	}
	
	public String getMsg() {
		return msg;
	}
}

public class DeprecatedMain {
	public static void main(String[] args) {
		DeprecatedClass depClass = new DeprecatedClass("This class is deprecated");
		System.out.println(depClass.getMsg());
	}
}
