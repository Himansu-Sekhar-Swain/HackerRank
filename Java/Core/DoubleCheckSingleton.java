public class DoubleCheckSingleton {

    private volatile DoubleCheckSingleton doubleCheckSingleton;

    private DoubleCheckSingleton(){};

    public DoubleCheckSingleton getInstance() {

        if(doubleCheckSingleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                if(doubleCheckSingleton == null) {
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }
}
