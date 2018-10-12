public class Bank {

		int id;
		String AccHldrName;
		long MobileNo;
		float balance;
		/*Bank(int id,String AccHldrName,Double MobileNo,float balance){
			this.id=id;
			this.AccHldrName=AccHldrName;
			this.MobileNo =MobileNo;
			this.balance=balance;
		}*/
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getAccHldrName() {
			return AccHldrName;
		}
		public void setAccHldrName(String accHldrName) {
			AccHldrName = accHldrName;
		}
		public long getMobileNo() {
			return MobileNo;
		}
		public void setMobileNo(long l) {
			MobileNo = l;
		}
		public float getBalance() {
			return balance;
		}
		public void setBalance(float balance) {
			this.balance = balance;
		}

		
		}

