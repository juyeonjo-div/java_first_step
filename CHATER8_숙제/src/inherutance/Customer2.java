package inherutance;

public class Customer2 {

	protected int customerID;     //고객아이디
	protected String customerName; //고객이름
	protected String customerGrade; //고객등급
	int bonusPoint;   //보너스 포인트
	double bonusRatio;   //적립 비율
	
	
	
	
	public Customer() {
		customerGrade = "SILVER";   //기본등급
		bonusRatio = 0.01; //보너스 포인트 기본 적립 비율
		
	}
	
	public int calcPrice(int price) {
		bonusPoint +=price *bonusRatio; //보너스 포인트 계산
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의등급은"+customerGrade+"이며,보너스 포인트는"+bonusPoint+"입니다";
	}

public int getCustomerID() {
	return customerID;
}
	
public void setCustomerID(int customerID){
	this.customerID = customerID;
}

public String getCustomerName() {
	return customerName;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
	
}

public String getCustomerGrade() {
	return customerGrade;
}

public void setCustomerGrade(String customerGradet) {
	this.customerGrade = customerGrade;
	
}

}

