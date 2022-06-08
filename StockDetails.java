package interfacePractice;


interface stock1{
	int shareprice1=200;
	String sharename1="Relaince Industry";
	int TotalShare1=1500;
	void print(String sharename1);
	void print(int shareprice1);
	void Noshare( int Totalshare1);
	int print( int shareprice1, int Totalshare1);
	
}

interface stock2 extends stock1{
	int shareprice2=350;
	String sharename2="Indian_Railway";
	int TotalShare2=2000;
	void Print(String sharename2);
	void price(int shareprice2);
	void Noshare2( int Totalshare2);
	int value( int shareprice2, int Totalshare2);
	
	
}


public class StockDetails implements stock1,stock2 {


	@Override
	public void print(String sharename1) {
		// TODO Auto-generated method stub
		System.out.println("First Stock Account is => Relaince Industry");
		
	}
	
	@Override
	public void print(int shareprice1) {
		// TODO Auto-generated method stub
		System.out.println("Share Price Of Relaince Industry is.." +shareprice1);
	}
	

	@Override
	public int print(int shareprice1, int Totalshare1) {
		// TODO Auto-generated method stub
		int networth=shareprice1*Totalshare1;
		return networth;
	}
	
	@Override
	public void Print(String sharename2) {
		// TODO Auto-generated method stub
		System.out.println("Second Stock Account Is => Indian_Railway");
	}

	
	public static void main(String[] args) {
		StockDetails details = new StockDetails();
		details.print(sharename1);
		details.print(shareprice1);
		details.Noshare(TotalShare1);
		System.out.println("Total Estimated Value of Relaince Industry Shares is.."+details.print(shareprice1, TotalShare1));
		
		details.Print(sharename2);
		details.price(shareprice2);
		details.Noshare2(TotalShare2);
		System.out.println("Total Estimated Value of Indian_Railway Shares is.."+details.print(shareprice2, TotalShare2));
	}

	@Override
	public void price(int shareprice2) {
		// TODO Auto-generated method stub
		System.out.println("Share Price Of Indian_Railway Is.."+shareprice2);
		
	}

	@Override
	public int value(int shareprice2, int Totalshare2) {
		// TODO Auto-generated method stub
		int totalStockValue=shareprice2*Totalshare2;
		return totalStockValue;
	}

	@Override
	public void Noshare2(int Totalshare2) {
		// TODO Auto-generated method stub
		System.out.println("Total Number Of Share Of Indian_Railway Is ... "+Totalshare2);
		
	}

	@Override
	public void Noshare(int Totalshare1) {
		// TODO Auto-generated method stub
		System.out.println("Total Number Of Share Of Relaince Industry Is ... "+Totalshare1);
		
		
	}

}



