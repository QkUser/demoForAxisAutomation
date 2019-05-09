package com.qk.axis.AxisBankMobileAutomation;

import org.testng.annotations.Test;

import com.qk.axis.FundTransferSolvent.FundTransferFunctions;

public class AppTest extends FundTransferFunctions {
	String Nickname = getData().getVariable("NickName");
	String Mpin = getData().getVariable("Mpin");

	@Test
	public void f() {
		System.out.println(Nickname);
		try {
			openApp();
			logIn();
			EnterMpin(Mpin);
			clickOnFundTransferButton().clickOnInitialButtonOfPayee(Nickname);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
