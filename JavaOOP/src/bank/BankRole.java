package bank;

public interface BankRole {
	public void openAccount(String ownerName,int password, int restMoney);
	
	public abstract BankBook searchAccountByAccountNo(String accountNo); // 계좌입력 내용출력
	
	public BankBook[] searchAccountByname(String name);// 이름입력하면 계좌검색,다수계좌 가질수잇음
	
	public int searchCountByname(String name);// 계좌주 이름 입력하면 계좌 갯수
	
	public boolean closeAccount(String accountNo);	// 특정 계좌 폐기
	
}
