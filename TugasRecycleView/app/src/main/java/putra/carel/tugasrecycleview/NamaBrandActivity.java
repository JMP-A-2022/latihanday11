package putra.carel.tugasrecycleview;

public class NamaBrandActivity {
    private String namabrand;
    private int logobrand;

    public NamaBrandActivity(String namabrand, int logobrand) {
        this.namabrand = namabrand;
        this.logobrand = logobrand;
    }

    public String getNamabrand() {
        return namabrand;
    }

    public void setNamabrand(String namabrand) {
        this.namabrand = namabrand;
    }

    public int getLogobrand() {
        return logobrand;
    }

    public void setLogobrand(int logobrand) {
        this.logobrand = logobrand;
    }
}
