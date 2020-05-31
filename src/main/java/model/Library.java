package model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.stereotype.Component;

@Component

// Elastic search annotation.
@Document(indexName = "libraries", type = "library")
public class Library {

	@Id
	private String id;
	private String name;
	private String owner;

	public Library() {
	}

	public Library(String id, String name, String owner) {
		this.id = id;
		this.name = name;
		this.owner = owner;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Library [id=" + id + ", name=" + name + ", owner=" + owner + "]";
	}

}