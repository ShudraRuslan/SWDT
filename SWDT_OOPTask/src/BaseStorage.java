import java.util.Date;

public abstract class BaseStorage {
    protected String data;
    protected String location;
    protected Integer size;
    protected Date dateOfCreation;

    public abstract String getData();

    public abstract void saveData(String data);

    public abstract void setLocation(String location);

    public abstract void deleteData(String data);

    public abstract void changeData(String changes);

    protected void finalize() {
    }

    protected void calculateSize() {
        this.size = 1;
    }

    protected void setDateOfCreation() {
    }
}
