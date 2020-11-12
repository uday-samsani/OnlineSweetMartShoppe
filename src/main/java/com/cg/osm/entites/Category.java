package com.cg.osm.entites;

@Entity
public class Category {
	
	@Id
	private int categoryId;
	private String name;
	
	public Category() {
		super();
	}
	
	//constructors
	public Category(int categoryId, String name) {
		super();
		this.categoryId = categoryId;
		this.name = name;
	}
	//generate getters and setters
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + categoryId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		if (categoryId != other.categoryId)
			return false;
		return true;
	}
		
	

}
