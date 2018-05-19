package com.szy.action;

import com.opensymphony.xwork2.ActionSupport;

public class AddAction extends ActionSupport {

	private String firstNumber;
	private String secondNumber;
	private String result;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		result=firstNumber+secondNumber;
		return "success";
	}

	public String getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(String firstNumber) {
		this.firstNumber = firstNumber;
	}

	public String getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(String secondNumber) {
		this.secondNumber = secondNumber;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	

}
