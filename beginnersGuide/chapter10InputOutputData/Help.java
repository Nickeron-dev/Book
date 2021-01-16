import java.io.*;

public class Help {
	String helpFile;
	
	Help(String helpFile) {
		this.helpFile = helpFile;
	}
	
	public boolean helpon (String what) {
		int chr;
		String topic, info;
		FileReader file = null;
		try {
			file = new FileReader(helpFile);
		} catch (IOException exc) {
			System.out.println("Error reading file");
			return false;
		}
		BufferedReader br = new BufferedReader(file);
		try {
			do {
				chr = br.read();
				
				//checking is symbol #
				if(chr == '#') {
					topic = br.readLine();
					if(topic.equals(what)) {
						do {
							info = br.readLine();
							if(info != null) System.out.println(info);
						} while(!info.equals("") && info != null);
						return true;
					}
				}
			} while (chr != -1);
		} catch (IOException exc) {
			System.out.println("Can't find this topic");
			return false;
		} finally {
			try {
				file.close();
			} catch (IOException exc) {
				System.out.println("Issue in closing file");
			}
		}
		return false;
	}
	
	public String getSelection() {
		String topic = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter topic: ");
		try {
			topic = br.readLine();
		} catch (IOException exc) {
			System.out.println("Issue in reading from console");
		}
		
		return topic;
	}
	
	public static void main(String[] args) {
		String inputFile = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter file: ");
		try {
			inputFile = br.readLine();
		} catch (IOException exc) {
			System.out.println("Problem in reading from console");
			return;
		}
		String topic;
		Help helpObj = new Help(inputFile);
		
		do {
			topic = helpObj.getSelection();
			if(!helpObj.helpon(topic)) System.out.println("Topic is not found!"); // ! here means if(false) so it will enter 'Not Found' when helpon(boolean) is false
		} while (topic.compareTo("stop") != 0);
	}
}