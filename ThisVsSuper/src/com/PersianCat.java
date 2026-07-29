package com;

public class PersianCat extends Cat{
	
	int cost;
	
	public PersianCat(int cost) {
		this.cost = cost;
	}
	
	public PersianCat() {
		this(10);
		System.out.println("persian cat object created..");
	}
	
	void getCost() {
		System.out.println(this.age);
	}

}
