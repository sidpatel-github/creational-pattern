package singleton;

public class DatabaseSingleton {

    //*********************
    // 1.eagerly loaded
    // 2.lazy loaded
    // 3.thread safe loaded
    //*********************

    /*// 1
    private static DatabaseSingleton instance = new DatabaseSingleton();
    //===*/

    /*// 2
    private static DatabaseSingleton instance = null;
    //===*/

    // 3
    private static volatile DatabaseSingleton instance = null;
    //===*/

    private DatabaseSingleton(){
        if(instance !=null){
         throw new RuntimeException("Use getInstance() method to create");
        }
    }

    //getInstance method should not take any parameters
    public static DatabaseSingleton getInstance(){

       /* // 2
        if(instance == null)
        {
            instance = new DatabaseSingleton();
        }
        //===*/

        // 3
        if(instance == null)
        {
            synchronized (DatabaseSingleton.class)
            {
                if(instance == null){
                    instance = new DatabaseSingleton();
                }
            }
        }
        //===*/
        return instance;
    }
}
