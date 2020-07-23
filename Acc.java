package OOPTest;

public class Acc {
	 String id,name;
	 int amt=0;
	Acc(String id,String name,int amt){
		this.id=id;
		this.name=name;
		this.amt=amt;
	}
	
	public void credit(int amt) {
		this.amt+=amt;
		System.out.println(show());
	}
	public void debit(int bal) {
		if(this.amt>bal) {
			amt-=bal;
			System.out.println(show());
		}else {
			System.out.println("Not enough balance");
		}
	}
	public void Transfer(Acc another,int bal) {
		System.out.println("Transfer to "+another.name+" Amount "+bal);
		if(this.amt>bal) {
			this.debit(bal);
			another.credit(bal);
			
			
			
		}else {
			System.out.println("Transfer amount is exceed than your balance");
		}
		
	}
	public String show() {
		String str="Id : "+this.id+" Name : "+this.name+" Balance :"+this.amt;
		return str;
	}
	public static void main(String[] arg) {
		Acc a1=new Acc("1","Mg Mg",10000);
		Acc a2=new Acc("2","Ma MA",5000);
		System.out.println(a1.show());
		System.out.println(a2.show());
		a2.Transfer(a1, 2000);
	}
}

