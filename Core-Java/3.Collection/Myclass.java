package com.techm.sushil;

import java.util.TreeSet;

public class Myclass {
	private String label;
	private String value;
	public Myclass(String label, String value) {
		super();
		this.label = label;
		this.value = value;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Myclass [label=" + label + ", value=" + value + "]";
	}
	public boolean equals(Object o){
		Myclass mycls=(Myclass)o;
		return value.equalsIgnoreCase(mycls.value);
	}
	
	
	

}
