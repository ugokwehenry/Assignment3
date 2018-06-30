import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class AsteroidSubject implements ISubject{
private int state;
	private List<BoardComponent> boardComponents = new ArrayList<>();
	public AsteroidSubject() {
		
	}

	@Override
	public void addObserver(BoardComponent observer) {
		this.boardComponents.add(observer);
		
	}

	@Override
	public void removeObserver(BoardComponent observer) {
		this.boardComponents.remove(observer);
		
	}

	@Override
	public void notifyObserver() {	
		ListIterator<BoardComponent> iter = boardComponents.listIterator();
		while (iter.hasNext())
		{
			iter.next().Operation();
		}
	}
}
