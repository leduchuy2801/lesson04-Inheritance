package huy.dev;

public class Circle extends Shape {

		private double r;
		public Circle (double r) {
			//TODO Auto-Generated contructor stub
			this.r=r;
		}
		@Override
		public double dienTich() {
			// TODO Auto-generated method stub
			return r*r*3.14;
		}
}
