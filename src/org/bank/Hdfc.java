package org.bank;

public class Hdfc {
	public void savings() {
		System.out.println("% of savings in HDFC : 4%");
		}
	public void fixed() {
		System.out.println("% of fixed in HDFC : 7.5%");
	}
	public void deposits() {
		System.out.println("% of deposits in HDFC : 8%");
	}
	public static void main(String[] args) {
		Hdfc h = new Hdfc();
		h.deposits();
		h.fixed();
		h.savings();
	}
}
