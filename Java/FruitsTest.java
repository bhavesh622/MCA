class Fruits{
    
	void mango(){
		System.out.println("Mango is sweet");
	}
	void apple(){
		System.out.println("Apple is sweet");
	}
	void orange(){
		System.out.println("Orange is sour");
	}
	void grapes(){
		System.out.println("Grapes are sour");
	}
}
class Taste{
	void taste(){
		Fruits f1 = new Fruits(){
			void mango(){
				System.out.println("Mango is sour");
			}
		};
		f1.mango();
	}
}
class FruitsTest{
	public static void main(String[] args){
		Taste t1 = new Taste();
		t1.taste();
	}
}
