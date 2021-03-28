import java.util.Map;

public class LocalStorage extends PersistentStorage {

    public LocalStorage(String data, String filePath, String client, Map<String, String> permissions) {
        this.data = data;
        this.location = filePath;
        this.client = client;
        this.permissions = permissions;
        this.calculateSize();
        this.setDateOfCreation();
    }


    @Override
    public String getData() {
        this.checkPermission(client,"get");
        return this.data;
    }

    @Override
    public void saveData(String data) {
        this.checkPermission(client,"save");
        this.data=data;

    }

    @Override
    public void setLocation(String location) {
        this.checkPermission(client,"set");
        this.location=location;

    }

    @Override
    public void deleteData(String data) {
        this.checkPermission(client,"delete");
        this.finalize();

    }

    @Override
    public void changeData(String changes) {
        this.checkPermission(client,"change");
        this.data=changes;

    }
}
