package enumsMain;

public class EmotionsValueOfMain {
	public static void main(String[] args) {
		enums.Emotions emotions;
		
		enums.Emotions[] emotionsArray = enums.Emotions.values();
		for(enums.Emotions em : emotionsArray) {
			System.out.print(em + " ");
		}
		
		emotions = enums.Emotions.valueOf("SAD");
		System.out.println("\nemotions: " + emotions);
	}
}	
		