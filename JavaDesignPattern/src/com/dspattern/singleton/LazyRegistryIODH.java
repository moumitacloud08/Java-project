package com.dspattern.singleton;

/**
 * Singleton pattern using lazy initialization holder class. This ensures that, we have a lazy initialization
 * without worrying about synchronization.
 */
public class LazyRegistryIODH {
	private LazyRegistryIODH() {
		System.out.println("In LazyRegistryIODH singleton");
	}
	
	//This class won't be invoked until and unless anyone calls getInstance()
	private static class RegistryHolder{
		static LazyRegistryIODH INSTANCE = new LazyRegistryIODH();
	}
	
	public static LazyRegistryIODH getInstance() {
		return RegistryHolder.INSTANCE;
	}

}
