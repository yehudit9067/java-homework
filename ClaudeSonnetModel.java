package lesson4;

public class ClaudeSonnetModel extends LLMModel{
	
public String sendPrompt(String prompt) {
		
		return "Claude Sonnet response to: "+ prompt;
	}

}
