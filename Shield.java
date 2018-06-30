
public class Shield extends BoardComponent implements IObserver{
private int shieldHealth;
	public Shield() {
		super();
		shieldHealth = 2;
	}
	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Add(BoardComponent child) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Remove(BoardComponent child) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Update() {	
		System.out.println("Building " + shieldHealth + " times.");
		for (int i = 0; i < shieldHealth; i++)
		{
			if(i == 0){
				GameBoard.Instance().DecrementBuildingCount();
			}
		}
		
	}

}
