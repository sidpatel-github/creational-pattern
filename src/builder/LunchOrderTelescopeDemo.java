package builder;

public class LunchOrderTelescopeDemo {
    public static void main(String[] args) {
        LunchOrderTelescope lunchOrderBean = new LunchOrderTelescope("Wheat","Lettuce","Mustard", "Ham");

        System.out.println(lunchOrderBean.getBread());
        System.out.println(lunchOrderBean.getCondiments());
        System.out.println(lunchOrderBean.getDressing());
        System.out.println(lunchOrderBean.getMeat());

    }
}
