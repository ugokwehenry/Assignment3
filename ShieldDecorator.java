import java.util.ArrayList;

public abstract class ShieldDecorator extends Square {

	protected Square decoratedSquare;

	public ShieldDecorator(Square decoratedSquare) {
		this.decoratedSquare = decoratedSquare;
	}

	public void Add(BoardComponent child) {
		decoratedSquare.Add(child);
	}

	public void Remove(BoardComponent child) {
		decoratedSquare.Remove(child);
	}

}
