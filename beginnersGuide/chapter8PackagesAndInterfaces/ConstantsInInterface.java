package interfacesMain;

public class ConstantsInInterface implements interfaces.OnlyConstants {
	public static void main(String[] args) {
		int[] array = new int[interfaces.OnlyConstants.MAX];
		for(int i = interfaces.OnlyConstants.MIN; i < 11; i++) {
			if(i >= interfaces.OnlyConstants.MAX) 
				System.out.println(interfaces.OnlyConstants.ErrorMSG);
			else {
				array[i] = i;
				System.out.println(array[i] + " element ");
			}
		}
	}
}
