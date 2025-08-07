package javaselenium;

public class Lab2_1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Person1 p1 = new Person1("Smith", 23);
			Person1 p2 = new Person1("kathy", 22);
			
			Account a1 = new Account(1001, 2000, p1);
			Account a2 = new Account(1002, 3000, p2);
			
			a1.setBalance(2000);
			a2.withdraw(2000);
			
			System.out.println(a1.getAccNum() + " Account has Balance : " + a1.getBalance());
			System.out.println(a2.getAccNum() + " Account has Balance : " + a2.getBalance());
			System.out.println("________________________");
			System.out.println(a1);
			System.out.println(a2);
		}
	}

	class Person1 {
		private String name;
		private int age;
		
		public Person1(String name, int age) {
			// TODO Auto-generated constructor stub
			this.name = name;
			this.age = age;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
	}

	class Account {
		private long accNum;
		private double balance = 500;
		private Person1 accHolder;

		public Account() {}

		public Account(long accNum, double balance, Person1 person) {
			// TODO Auto-generated constructor stub
			this.accNum = accNum;
			this.balance = balance;
			this.accHolder = person;
		}

		@Override
		public String toString() {
		    return "Account Number: " + accNum +
		           "\nBalance: " + balance +
		           "\nAccount Holder: " + accHolder.getName();
		}
		
		public long getAccNum() {
			return accNum;
		}

		public void setAccNum(long accNum) {
			this.accNum = accNum;
		}

		public Person1 getAccHolder() {
			return accHolder;
		}

		public void setAccHolder(Person1 accHolder) {
			this.accHolder = accHolder;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		public void deposit(double amount) {
			balance += amount;	
		}

		public boolean withdraw(double amount) {
			if (amount < (balance - 500)) {	
				balance -= amount;
				return true;
			}
			return false;
		}

		public double getBalance() {
			return balance;
		}
	}



