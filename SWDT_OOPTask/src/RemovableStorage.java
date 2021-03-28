public class RemovableStorage extends VolatileStorage {

    public RemovableStorage(String data){
        this.data = data;
        this.location = this.getVolatileStoragePlace();
        this.setDateOfCreation();
        this.setTimeOfExistence();
        this.calculateSize();
        this.destroyVolatileData();

    }

    @Override
    public String getData() {
        return this.data;
    }

    @Override
    public void saveData(String data) {
        this.finalize();
        new RemovableStorage(data);

    }

    @Override
    public void setLocation(String location) {
        this.location=location;

    }

    @Override
    public void deleteData(String data) {
        this.finalize();

    }

    @Override
    public void changeData(String changes){
        this.finalize();
        new RemovableStorage(changes);
    }
}
