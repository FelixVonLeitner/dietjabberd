package de.fefe.dietjabberd;

/**
 * Factory for the server manager.
 * 
 * @author Tux (tux@netz39.de)
 * 
 */
public enum DietJabberdDistributedServerManagerFactory {
	INSTANCE;

	/**
	 * Get the default manager.
	 * 
	 * @return The default manager.
	 */
	public DietJabberdServerManager defaultManager() {
		return new BugFreeDietJabberdServerManagerImpl();
	}
}
