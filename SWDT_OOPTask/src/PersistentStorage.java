import java.util.Map;

public abstract class PersistentStorage extends BaseStorage {
    protected String client;
    protected Map<String, String> permissions;

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public Map<String, String> getPermissions() {
        return permissions;
    }

    public void setPermissions(Map<String, String> permissions) {
        this.permissions = permissions;
    }

    public boolean checkPermission(String person, String permission) {
        return true;
    }
}
