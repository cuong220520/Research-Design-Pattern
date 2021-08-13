package objectadapter;

public class VietnameseClient {

	public static void main(String[] args) {
		VietnameseTarget vietnameseClient = new TranslatorAdapter(new JapaneseAdaptee());
		vietnameseClient.send("Xin chào");
	}
	
}
