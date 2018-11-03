package huy.dev;

public class Square extends Shape {
	
		private double chieuDai;
		private double chieuRong;
		
		public Square(double chieuDai, double chieuRong) {
			this.chieuDai= chieuDai;
			this.chieuRong= chieuRong;
		}

		@Override
		public double dienTich() {
			// TODO Auto-generated method stub
			return chieuDai*chieuRong;
		}
}
