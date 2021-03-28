import java.util.List;
import java.util.Map;

public class WebStorage extends PersistentStorage {

    public WebStorage(String data, String client, String url, Map<String,String> permissions) {
        this.data = data;
        this.client=client;
        this.permissions = permissions;
        this.location = url;
        this.calculateSize();
        this.setDateOfCreation();
    }


    private boolean setConnection(String url) {
        return true;
    }

    @Override
    public String getData() {
        setConnection(location);
        this.checkPermission(client,"get");
        return this.data;
    }

    @Override
    public void saveData(String data) {
        setConnection(location);
        this.checkPermission(client,"get");
        this.data = this.data + data;

    }

    @Override
    public void setLocation(String location) {
        setConnection(location);
        this.checkPermission(client,"set");
        this.location=location;

    }

    @Override
    public void deleteData(String data) {
        setConnection(location);
        this.checkPermission(client,"delete");
        this.finalize();


    }

    @Override
    public void changeData(String changes) {
        setConnection(location);
        this.checkPermission(client,"change");
        this.data=data;

    }
}
