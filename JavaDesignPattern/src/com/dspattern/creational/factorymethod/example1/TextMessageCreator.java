package com.dspattern.creational.factorymethod.example1;

import com.dspattern.creational.factorymethod.example1.message.Message;
import com.dspattern.creational.factorymethod.example1.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new TextMessage();
	}

}
