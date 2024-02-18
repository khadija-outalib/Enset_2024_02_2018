package dao;

public class DeoImpl implements IDao {
	
	@Override
	public double getData () {
		///dATABASE
		double temp =Math.random()*40;
		return temp;
	}

}
