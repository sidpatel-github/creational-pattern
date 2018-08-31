package builder;

public class LunchOrderTelescope {

    private String bread;
    private String dressing;
    private String meat;
    private String condiments;


    public LunchOrderTelescope(String bread) {
        this.bread = bread;
    }

    public LunchOrderTelescope(String bread, String condiments) {
        this(bread);
        this.condiments = condiments;
    }

    public LunchOrderTelescope(String bread, String condiments, String dressing) {
        this(bread,condiments);
        this.dressing = dressing;
    }

    public LunchOrderTelescope(String bread, String dressing, String meat, String condiments) {
        this(bread,condiments,dressing);
        this.meat = meat;
    }

    public String getBread() {
        return bread;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }

    public String getCondiments() {
        return condiments;
    }
}
