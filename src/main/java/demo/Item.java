package demo;

public class Item {

	private long uid;
	private String name;
	private String description;

	public Item(long uid, String name, String description) {
		this.uid = uid;
		this.name = name;
		this.description = description;
	}

	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}

