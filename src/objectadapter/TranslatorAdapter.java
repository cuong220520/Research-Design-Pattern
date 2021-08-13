package objectadapter;

public class TranslatorAdapter implements VietnameseTarget {
	
	private JapaneseAdaptee japaneseAdaptee;
	
	public TranslatorAdapter(JapaneseAdaptee japaneseAdaptee) {
		this.japaneseAdaptee = japaneseAdaptee;
	}

	@Override
	public void send(String message) {
		System.out.println("Reading message");
		String translatedMsg = translator(message);
		System.out.println("Sending message ...");
		japaneseAdaptee.receiveMsg(translatedMsg);
	}
	
	private String translator(String message) {
		System.out.println("Received message in Vietnamese: " + message);
		return "ã?“ã‚“ã?«ã?¡ã?¯";
	}

}
