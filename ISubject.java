
public interface ISubject {
		//methods to add and remove observers
		public void addObserver(BoardComponent observer);
		
		public void removeObserver(BoardComponent observer);		
		
		//method to notify observers of change
		public void notifyObserver();
}
