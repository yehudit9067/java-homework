package lesson4;

public class LLMModelFactory {

	public static LLMModel getModel(String activity) {

		if (activity == null) {
			throw new IllegalArgumentException("Activity cannot be null");
		}

		switch (activity) {

		case Activities.CODE_GENERATION:
			return new ClaudeSonnetModel();

		case Activities.SUMMARIZATION:
			return new GeminiModel();

		case Activities.DOCUMENT_ANALYSIS:
			return new GeminiModel();

		case Activities.SIMPLE_QUESTION:
			return new GPT5MiniModel();

		case Activities.COMPLEX_ANALYSIS:
			return new GPT5Model();
			
		default:
			throw new IllegalArgumentException("Unsupported activity: " + activity);

		}
	}
}
