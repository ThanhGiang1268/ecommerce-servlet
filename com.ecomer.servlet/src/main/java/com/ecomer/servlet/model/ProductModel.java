package com.ecomer.servlet.model;

import java.util.Arrays;

public class ProductModel {
	private long id;
	private String name;
	private String image;
	private double price;
	private String title;
	private String description;
	private Long categoryId;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	@Override
	public String toString() {
		return "ProductModel [id=" + id + ", name=" + name + ", image=" + Arrays.toString(image) + ", price=" + price
				+ ", title=" + title + ", description=" + description + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getImage()=" + Arrays.toString(getImage()) + ", getPrice()=" + getPrice()
				+ ", getTitle()=" + getTitle() + ", getDescription()=" + getDescription() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
