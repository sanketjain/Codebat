public class SingletonExample02 {

    private static SingletonExample instance;
    Object obj = new Object();

    private SingletonExample(){}
    
    public static SingletonExample getInstance(){
        if(instance == null){
        	synchronized (SingletonExample.class){
	            instance = new SingletonExample3();
        	}
        }
        return instance;
    }
    
}