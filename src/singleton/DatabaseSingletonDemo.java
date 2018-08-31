package singleton;

public class DatabaseSingletonDemo {
    public static void main(String[] args) {

        //This is not allowed as we have private constructor
        // DatabaseSingleton instance = new DatabaseSingleton();

        DatabaseSingleton instance = DatabaseSingleton.getInstance();
        System.out.println(instance);

        DatabaseSingleton secondInstance = DatabaseSingleton.getInstance();
        System.out.println(secondInstance);


    }
}
