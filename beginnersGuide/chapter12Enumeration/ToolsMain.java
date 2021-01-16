package enumsMain;

public class ToolsMain {
	public static void main(String[] args) {
		enums.Tools[] tools = enums.Tools.values();
		for(enums.Tools tool : tools) {
			System.out.println(tool);
		}
	}
}
