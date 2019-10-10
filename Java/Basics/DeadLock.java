public class DeadLock {
    
    DeadLock() {}
    
    public void printMessage() {
        synchronized (String.class) {
            System.out.print("String printing...");
            synchronized (Integer.class) {
                System.out.print("Integer Printing...");
            }
        }
    }

    public void showMessage() {
        synchronized (Integer.class) {
            System.out.print("Integer > "+3);
            synchronized (String.class) {
                System.out.print("Number of companies >> Three");
            }
        }
    }

    /**
     * If printMessage() and showMessage() both will be called by two or many threads ,
     * there is a good chance of deadlock because if thread 1 acquires lock on Sting object while executing method1() and thread 2 acquires lock on Integer object while executing method2() both will be waiting for each other to release lock on Integer and String to proceed further which will never happen.
     *
     * Read more: https://javarevisited.blogspot.com/2018/08/how-to-avoid-deadlock-in-java-threads.html#ixzz5y4QgSdJ9
     */
}
