package com.javaex.ex15;

public class Shape {

	protected String fillColor;
	protected String lineColor;

	public Shape() {
	}

	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

	public String getFillColer() {
		return fillColor;
	}

	public void setFillColer(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColer() {
		return lineColor;
	}

	public void setLineColer(String lineColor) {
		this.lineColor = lineColor;
	}

	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}


}
