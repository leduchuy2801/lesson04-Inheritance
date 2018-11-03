package huy.dev;
import huy.dev.Circle;
import huy.dev.Shape;
import huy.dev.Square;
import huy.dev.Triangle;

	public class JavaInheritance {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			double max = 0; 
			double min = 0;
			Shape shapes[] = new Shape[10];
			shapes[0] = new Square (8, 9);
			shapes[1] = new Square (9,6);
			shapes[2] = new Square (10,5);
			shapes[3] = new Square (5,9);
			shapes[4] = new Circle (5);
			shapes[5] = new Circle (9);
			shapes[6] = new Circle (8);
			shapes[7] = new Triangle (5,6,7);
			shapes[8] = new Triangle (5,8,10);
			shapes[9] = new Triangle (6,4,9);
			
			for(int i = 0; i < shapes.length; i++)
				System.out.println("Dien tich: " + shapes[i].dienTich());
			
			for(int i = 0; i < shapes.length; i++) {
				if(shapes[i].dienTich() > max)
					max = shapes[i].dienTich();
			}
			
			min = shapes[0].dienTich();
			for(int i = 0; i < shapes.length; i++) {
				if(shapes[i].dienTich() < min)
					min = shapes[i].dienTich();
			}
			
			System.out.println("Dien tich lon nhat: "+ max);
			System.out.println("Dien tich be nhat: "+min);
		}

}
