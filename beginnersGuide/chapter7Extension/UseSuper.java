package classes;

class One {
	int i;
}

class Two extends One{
	int i;
	Two(int a, int b) {
		super.i = a;
		this.i = b;
	}
	
	void show() {
		System.out.println("i in superclass: " + super.i);
		System.out.println("i in subclass: " + i);
	}
}

class UseSuper {
	public static void main(String[] args) {
		Two two = new Two(5, 2);
		
		two.show();
	}
}