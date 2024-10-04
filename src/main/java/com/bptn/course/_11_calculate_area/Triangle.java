package com.bptn.course._11_calculate_area;

public class Triangle {
	
	int perimeterCalculator(int a, int b, int c) {
		return a + b + c;
	}
	
	
	int areaCalculator(int a, int b) {
		//return the area as int to make the tests pass
		return (int)(0.5 * (a * b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle object = new Triangle();

		int a = 7;
        int b = 10;
        int c = 35;

        int perimeter = object.perimeterCalculator(a,b,c);
        int area = object.areaCalculator(7,10);

        System.out.println("Perimeter of the triangle is: " + perimeter + "\nThe Area of the Triangle is: " + area);


	}

}
