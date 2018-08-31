package singleton;

public class CommonExample {
    public static void main(String[] args) {
        Runtime singletonRuntime = Runtime.getRuntime();
        singletonRuntime.gc();
        System.out.println(singletonRuntime);

        Runtime secondRuntime = Runtime.getRuntime();
        System.out.println(secondRuntime);

        if(singletonRuntime == secondRuntime)
        {
            System.out.println("Both the instances are same");
        }
    }
}
