package com.assignM09;

public class Customer {
    private String first_name;
    private String last_name;
    
    public Customer() {
   	this.first_name = null;
 		this.last_name = null;
    }
    
    public Customer(String first_name, String last_name) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
	}
    
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	@Override
	public String toString() {
		return "Customer [first_name=" + first_name + ", last_name=" + last_name + "]";
	}
	

	

		public static void main(String[] args) {
			Customer customer = new Customer("Afreed", "Shaik");
			Account account = new Account(121, 10000, 2, customer);
			account.deposit(3000);
			account.withdraw(5000);
			System.out.println(account.toString());

		}

	}

