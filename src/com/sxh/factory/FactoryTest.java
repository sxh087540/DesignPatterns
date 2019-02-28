package com.sxh.factory;

public class FactoryTest {
	public static void main(String[] args) {
		SenderFactory senderFactory = new SenderFactory();
		Sender sender = senderFactory.produce("sms");
		sender.send();
	}
}
