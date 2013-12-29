package de.fefe.dietjabberd;

public class DietJabberd {
	public static void main(String[] args) {
		final DietJabberdServerManager djsm = DietJabberdDistributedServerManagerFactory.INSTANCE
				.defaultManager();

		djsm.runBugFree();
	}
}
