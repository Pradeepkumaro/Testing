package org.bank;

public class Axis extends Hdfc{
@Override
	public void deposits() {
	System.out.println("% of deposits in Axis : 7%");
}
public static void main(String[] args) {
	Axis a = new Axis();
	a.fixed();
	a.savings();
	a.deposits();
}
}
