
public abstract class VolatileStorage extends BaseStorage {
    protected Long timeOfExistence;

    protected void setTimeOfExistence() {
        timeOfExistence = Long.valueOf(1);
    }

    protected String getVolatileStoragePlace(){
        return "1";
    }

    private Long getCurrentTime() {
        return Long.valueOf(1);
    }


    protected void destroyVolatileData() {
        while (true) {
            Long currentTime = this.getCurrentTime();
            if (currentTime >= this.dateOfCreation.getTime() + this.timeOfExistence)
                this.finalize();
        }
    }
}
