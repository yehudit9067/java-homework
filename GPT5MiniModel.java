package lesson4;

public class GPT5MiniModel extends LLMModel{

	public String sendPrompt(String prompt) {
		
		return "GPT-5 mini response to: "+ prompt;
	}

}
