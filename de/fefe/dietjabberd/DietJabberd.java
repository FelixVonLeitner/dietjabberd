package de.fefe.dietjabberd;

/**
 * A diet bug free Jabber daemon to allow jabber.ccc to participate in the
 * social (erm…) life.
 * 
 * @author Tux (tux@netz39.de)
 * 
 */
public class DietJabberd {
	/**
	 * Java main entry point.
	 * 
	 * @param args
	 *            No args. Do not confuse the users!
	 */
	public static void main(String[] args) {
		final DietJabberdServerManager djsm = DietJabberdDistributedServerManagerFactory.INSTANCE
				.defaultManager();

		djsm.runBugFree();
	}
}
