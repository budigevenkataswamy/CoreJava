package com.in28minutes.exceptionhandling;

class Amount {
	private String currency;
	private int amount;

	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}

	public void add(Amount that) throws CurrenciesDoNotMatchException {
		if (!this.currency.equals(that.currency)) {
			// throw new Exception("Curency doesn't match"+this.currency+" &
			// "+that.currency);
			throw new CurrenciesDoNotMatchException("Curency doesn't match" + this.currency + " & " + that.currency);
		}
		this.amount = this.amount + that.amount;
	}
}

class CurrenciesDoNotMatchException extends Exception {
	public CurrenciesDoNotMatchException(String msg) {
		super(msg);
	}

}

public class ThrowingExceptionHandler {

	public static void main(String[] args) throws CurrenciesDoNotMatchException {
		Amount amount1 = new Amount("USD", 10);
		Amount amount2 = new Amount("EUR", 20);
		amount1.add(amount2);
		System.out.println(amount1);

	}

}
