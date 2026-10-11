package lesson4;

public class GeminiModel extends LLMModel {

	public String sendPrompt(String prompt) {

		return "Gemini response to: " + prompt;
	}

}
