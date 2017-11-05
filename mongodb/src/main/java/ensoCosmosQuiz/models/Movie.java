package ensoCosmosQuiz.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "<COLLECTION>")
public class Movie {
	@Id
	private String id;
	private String original_title;

	public Movie(String id, String original_title) {
		this.id = id;
		this.original_title = original_title;
	}

	@Override
	public String toString() {
		return "Movie{" +
				"id='" + id + '\'' +
				", original_title='" + original_title +
				'}';
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOriginal_title() {
		return original_title;
	}

	public void setOriginal_title(String original_title) {
		this.original_title = original_title;
	}


}

