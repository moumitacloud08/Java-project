package com.dspattern.creational.factorymethod;

import com.dspattern.creational.factorymethod.message.Message;
import com.dspattern.creational.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new TextMessage();
	}

}
