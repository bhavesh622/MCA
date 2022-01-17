interface Relatable{
	public int isLargerthan(Relatable r);
}

class Book implements Relatable{
	private String bname;
	private int noOfPages;
	Book(String bn, int nop){
		bname = bn;
		noOfPages = nop;
	}
	public String getBName(){
		return bname;
	}
	public int getNoOfPages(){
		return noOfPages;
	}
	public int isLargerthan(Relatable r){
		Book b = (Book)r;
		if(this.getNoOfPages()>b.getNoOfPages())
			return 1;
		else if(this.getNoOfPages()<b.getNoOfPages())
			return -1;
		else
			return 0;
	}
}

class BookCompare{
	public static void main(String[] args){
		Book b1 = new Book("Daniels",699);
		Book b2 = new Book("Jack Sparrow",340);
		Book b3 = new Book("Pigeons",799);
		Book b4 = new Book("Whisker",340);
		System.out.println("Book 1 Name: "+b1.getBName()+", No. of pages: "+b1.getNoOfPages());
		System.out.println("Book 2 Name: "+b2.getBName()+", No. of pages: "+b2.getNoOfPages());
		System.out.println("Book 3 Name: "+b3.getBName()+", No. of pages: "+b3.getNoOfPages());
		System.out.println("Book 4 Name: "+b4.getBName()+", No. of pages: "+b4.getNoOfPages());
		System.out.println("Comparison between Book 1 and 2 yields: "+b1.isLargerthan(b2));
		System.out.println("Comparison between Book 1 and 3 yields: "+b1.isLargerthan(b3));
		System.out.println("Comparison between Book 2 and 4 yields: "+b2.isLargerthan(b4));
	}
}