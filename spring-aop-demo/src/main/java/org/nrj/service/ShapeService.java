package org.nrj.service;

import org.nrj.model.Circle;
import org.nrj.model.Triangle;
import org.springframework.context.annotation.Bean;

public class ShapeService {
	
	private Circle circle;
	private Triangle triangle;
	
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
	

}
