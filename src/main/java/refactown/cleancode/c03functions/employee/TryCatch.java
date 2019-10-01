package refactown.cleancode.c03functions.employee;

public class TryCatch {
	public void delete(Page page) {
		try {
			deletePageAndAllReferences(page); // indirection ->
		} catch (Exception e) {
			logError(e);
		}
	}

	public void deletePageAndAllReferences(Page page) {
		deletePage(page);
		deleteReferences(page);
		page.getConfigKeys().delete();
	}

	private void deleteReferences(Page page) {
	}

	private void deletePage(Page page) {
	}

	private void logError(Exception e) {
	}

}

class Page {
	private ConfigKeys configKeys;

	public Page(ConfigKeys configKeys) {
		super();
		this.configKeys = configKeys;
	}

	public ConfigKeys getConfigKeys() {
		return configKeys;
	}

	public void setConfigKeys(ConfigKeys configKeys) {
		this.configKeys = configKeys;
	}
}

class ConfigKeys {
	void delete() {
		new TryCatch().delete(new Page(new ConfigKeys()));
	}
}
