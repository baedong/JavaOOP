package bank;

public class Bank implements BankRole{
	//아래 배열은 계좌를 관리하는 DB
	private BankBook[] bankBookList; 
	private int count; // 은행에서 관리하는 통장갯수
	//배열, 자료구조(컬렉션)을 보유하는 객체를 만들고자 할때 그 객체의 생성자에 배열, 자료구조의 객체를생성해준다 
	public Bank(int count){
		bankBookList = new BankBook[count]; 
	}
	
	public BankBook[] getBankBookList() {
		return bankBookList;
	}
	public int getCount() {
		return count;
	}
	public void setBankBookList(BankBook[] bankBookList) {
		this.bankBookList = bankBookList;
	}
	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public void openAccount(String ownerName, int password, int restMoney) {
		BankBook bankBook = (BankBook) new BankBook(ownerName);
		bankBook.setPass(password);
		bankBook.deposit(restMoney);
		bankBookList[count] = (BankBook) bankBook; // 통장을 개설하자마자 은행전산 DB에 통장정보 저장개념
		this.count++; //전체은행에 개설된통장 갯수 1증가
		System.out.println(bankBook.showAccount());
	}

	@Override
	public BankBook searchAccountByAccountNo(String accountNo) {// 계좌 검색
		BankBook account = null;
		// String - > int 
		int searcAccountNo = Integer.parseInt(accountNo);
		for (int i = 0; i < this.count; i++) {
			// 문자타입(String) 이 서로 같은지 여부 . equals()
			// 숫자타입(int) 이 서로 같은지 여부 == 
			if (bankBookList[i].getBankbookNo()==searcAccountNo) { // equals (같은값 찾는 변수)
				account = bankBookList[i];
			}
		}
		return account ;
	}

	@Override
	public BankBook[] searchAccountByname(String name) { //이름으로 계좌 검색
		BankBook[] accounts = null;
		// searchAccountByName() 이 메서드를 호출하면
		// 자동으로 searchCountByname() 을 먼저 호출하라
		int tempcount = this.searchCountByname(name);
		if (tempcount==0) { // 조회하는 사람의 통장이 하나도 없다면
			return null;
		}
		for (int i = 0; i < this.count; i++) {
			if (bankBookList[i].getName().equals(name)) {
				accounts[tempcount] = bankBookList[i];
				tempcount++;
			}
		}
		return accounts;
	}

	@Override
	public int searchCountByname(String name) {
		// for 문을 돌면서 파라미터로 받은 이름과 동일한 통장이 있다면 count 0 에서 1씩 증가시켜라
		int count =0;
		for (int i = 0; i < this.getCount(); i++) {
			if (bankBookList[i].getName().equals(name)) {
				count++;
			}
		}
		return count;
	}

	@Override
	public boolean closeAccount(String accountNo) {
		// flag 은 삭제가 성공적으로 이뤄지면 true를 리턴하고
		// 삭제할것이 없으면 false 리턴
		boolean flag = false;
		// String(문자열) 로 들어온 값을 숫자로 바꿔서 비교
		int searcAccountNo = Integer.parseInt(accountNo);
		for (int i = 0; i < this.count; i++) {
			if (bankBookList[i].getBankbookNo()==searcAccountNo) {
			flag = true;
			//j = i 로 바꾼 이유 - 홍길동의 계좌가 은행전체계좌의 50번째라면
			//내부 for 문에서 다시 처음부터 0부터 회전하지 않고
			//홍길동의 계좌가 있는 인덱스 번호부터 뒤에 있는 계좌번호를 덮어쓰는 방식으로 진행한후
			//맨 마지막 인덱스번호를 제거 하면 은행에서 전체계좌가 100개가 있는 상황이라면
			//홍길동이 삭제된 후 전체계좌수는 99개가 될것이다 그래서 this.count-1 을 해줌
			for (int j = i; j < this.count-1; j++) {
				bankBookList[i]= bankBookList[j+1];
			}
			count--;
			}
		}
	return flag;
	}
}
