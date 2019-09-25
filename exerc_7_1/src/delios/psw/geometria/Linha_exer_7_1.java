package delios.psw.geometria;


	public class Linha_exer_7_1 extends Forma_geometrica {
		public class Linha extends FormaGeometrica{
			private Ponto2D a;
			private Ponto2D b;
			
			public Linha() {
				a = new Ponto2D();
				b = new Ponto2D();
			}
			
			public Linha(Ponto2D a, Ponto2D b) {
				this.a = new Ponto2D(a.getX(), a.getY());
				this.b = new Ponto2D(b.getX(), b.getY());
			}
			
			public Ponto2D getA() {
				return a;
			}

			public void setA(Ponto2D a) {
				this.a = a;
			}

			public Ponto2D getB() {
				return b;
			}

			public void setB(Ponto2D b) {
				this.b = b;
			}
			
			public Ponto2D centro() {
				return new Ponto2D((a.getX()+b.getX())/2,
						(a.getY()+b.getY())/2);
			} 

			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Linha other = (Linha) obj;
				if (a == null) {
					if (other.a != null)
						return false;
				} else if (!a.equals(other.a))
					return false;
				if (b == null) {
					if (other.b != null)
						return false;
				} else if (!b.equals(other.b))
					return false;
				return true;
			}
			
			public String toString() {
				return "[" + a + " ; " + b + "]";
			}	

			
			@Override
			public float perimetro() {
				return a.distancia(b);
			}

			@Override
			public float area() {
				return 0;
			}

			@Override
			public float largura() {
				return Math.abs(a.getX() - b.getX());
			}
			 public float altura(){
				 return Math.abs(a.getY() - b.getY());
			 }
		}
	}