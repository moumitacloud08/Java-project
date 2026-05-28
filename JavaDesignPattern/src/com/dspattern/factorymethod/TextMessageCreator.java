package com.dspattern.factorymethod;

import com.dspattern.factorymethod.message.Message;
import com.dspattern.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new TextMessage();
	}

}
