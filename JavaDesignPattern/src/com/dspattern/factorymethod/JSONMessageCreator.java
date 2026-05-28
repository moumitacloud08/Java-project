package com.dspattern.factorymethod;

import com.dspattern.factorymethod.message.JSONMessage;
import com.dspattern.factorymethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}
	
}
