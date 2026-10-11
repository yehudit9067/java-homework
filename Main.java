package lesson4;

public class Main {

	public static void main(String[] args) {
		LLMModel model1 = LLMModelFactory.getModel(Activities.CODE_GENERATION);
		System.out.println(model1.sendPrompt("Write a Java function"));
		LLMModel model2 = LLMModelFactory.getModel(Activities.SIMPLE_QUESTION);
		System.out.println(model2.sendPrompt("What is a variable?"));
		LLMModel model3 = LLMModelFactory.getModel(Activities.COMPLEX_ANALYSIS);

		System.out.println(model3.sendPrompt("Analyze this algorithm"));

		try {
			LLMModel model4 = LLMModelFactory.getModel("UNKNOWN_ACTIVITY");

			System.out.println(model4.sendPrompt("Hello"));

		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
