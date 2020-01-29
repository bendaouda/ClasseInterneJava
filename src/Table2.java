import java.util.Iterator;

public class Table2 {

		private int [] tableau;
		private int capacite;
		private int index;
	
		public Table2(int max_size) {
		this.tableau = new int[max_size];
		this.capacite = max_size;
		this.index = -1; //l'index jusqu'auquel le tableau est rempli
		}
		
		public int size() {
			return this.index +1 ;
			}
		
		public void add(int element) {
			if (this.size()< this.capacite) {
					this.tableau[++this.index] = element;
				}
			}
		
		public ImpIterator2 iterator () {
			return new ImpIterator2();
		}

	
	class ImpIterator2 implements Iterator{
		
		private int compteur;
		
		
		public ImpIterator2() {
			this.compteur = 0;
		}
		
		@Override
		public boolean hasNext() {
			return (this.compteur<= Table2.this.index);
		}

		//public Interger next() { si on met Integer en haut
		@Override
		public Object next() {
			int v[] = Table2.this.tableau;
			return v[this.compteur++];
		}
		
		public void remove() throws UnsupportedOperationException{
			throw new UnsupportedOperationException();
		}

	
	}
	

}
