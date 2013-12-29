package de.fefe.dietjabberd;

public enum DietJabberdDistributedServerManagerFactory {
	INSTANCE;

	public DietJabberdServerManager defaultManager() {
		return new BugFreeDietJabberdServerManagerImpl();
	}
}
