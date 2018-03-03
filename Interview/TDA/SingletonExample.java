public class SingletonExample {

    private static SingletonExample instance;
    Object obj = new Object();

    private SingletonExample(){}
    
    public static SingletonExample getInstance(){
        if(instance == null){
        	synchronized (obj){
	            instance = new SingletonExample3();
        	}
        }
        return instance;
    }
    
}