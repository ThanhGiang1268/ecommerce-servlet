package com.ecomer.servlet.model;

public class CategoryModel  extends AbstractModel<CategoryModel>{
	private String code;
	private String name;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "CategoryModel [code=" + code + ", name=" + name + ", getCode()=" + getCode() + ", getName()="
				+ getName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
