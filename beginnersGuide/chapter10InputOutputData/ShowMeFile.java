import java.io.*;

public class ShowMeFile {
	public static void main(String[] args) {
		/*
            При вызове этой программы следует указать имя файла,
            содержымое которого требуется посмотреть. 
            Например, для вывода на экран содержимого файла text.text
            необходимо ввести в командной строке следующую команду:
            java ShowFile text.txt
        */
		int i;
		FileInputStream find;
		
		//Сначала нужно убедиться в том, что программе
		// передается имя файла
		
		if(args.length != 1) {
			System.out.println("Using: ShowFile file_name");
			return;
		}
		try {
			find = new FileInputStream(args[0]);
		} catch(FileNotFoundException exc) {
			System.out.println("Файл не найден");
			return;
		}
		
		try {
			//  Чтение файлов пока не встретитмя символ EOF
			do {
				i = find.read();
				if(i != -1) System.out.print((char) i);
			} while (i != -1);
		}catch (IOException exc) {
			System.out.println("Ошибка при чтении файла");
		}
		
		try {
			find.close();
		} catch (IOException exc) {
			System.out.println("Ошибка при закрытии файла");
		}
	}
}
	