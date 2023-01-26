package test;


public class TestArrayDePrimitivos {
	
	public static void main(String[] args) {
		
		int[] edades = new int[5];
		
		for(int i = 0; i < edades.length; i++) {
			edades[i] = i * i;
			System.out.println(edades[i]);
		}
	}
}
