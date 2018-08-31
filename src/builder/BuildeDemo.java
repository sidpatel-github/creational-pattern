package builder;

public class BuildeDemo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        builder.append("This is for testing.");
        builder.append(" This is how it works you can append any data type  ");
        builder.append(7);
        builder.append(" Try to built it by your own");

        System.out.println(builder.toString());

    }
}
