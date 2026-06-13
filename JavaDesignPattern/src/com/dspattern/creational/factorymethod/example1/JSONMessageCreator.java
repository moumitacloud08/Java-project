package com.dspattern.creational.factorymethod.example1;

import com.dspattern.creational.factorymethod.example1.message.JSONMessage;
import com.dspattern.creational.factorymethod.example1.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}
	
}
