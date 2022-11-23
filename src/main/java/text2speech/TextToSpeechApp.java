package text2speech;

import java.io.File;

/**
 * Hello world!
 *
 */
public class TextToSpeechApp {
	public static void main(String[] args) {

		String path = "C:\\Users\\Leo\\eclipse-workspace\\fis.txt";
		File file = new File(path);

		TextToSpeech txt2sp = new TextToSpeech();
		txt2sp.speak(file, "audio_f");
	}
}
