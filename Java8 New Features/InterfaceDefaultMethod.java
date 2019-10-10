package java8.features;

public interface InterfaceDefaultMethod {

    public void name();

    /**
     * Default method implementation in  interface.
     */
    default void address() {
        System.out.println("Its in Chennai.");
    }

    /**
     * Default method implementation in  interface.
     */
    default void manager() {
        System.out.println("We are sleeping.");
    }
}

class InterfaceDefaultMethod_Impl implements InterfaceDefaultMethod {
	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("Overridden from INterfae...");
	}
	
	public static void main(String[] args) {
		
		InterfaceDefaultMethod_Impl impl = new InterfaceDefaultMethod_Impl();
		/**
		 * Below two methods are automatically available because 
		 * these are defined as 'DEFAULT'
		 */
		impl.manager();
		impl.address();
		
	}
	
}
