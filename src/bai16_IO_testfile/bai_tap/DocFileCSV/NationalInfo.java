package bai16_IO_testfile.bai_tap.DocFileCSV;

public class NationalInfo {
    private String IP_LOW;
    private String IP_HIGH;
    private String NUM_1;
    private String NUM_2;
    private String LAND_CODE;
    private String LAND;

    public NationalInfo(String IP_LOW, String IP_HIGH, String NUM_1, String NUM_2, String LAND_CODE, String LAND) {
        this.IP_LOW = IP_LOW;
        this.IP_HIGH = IP_HIGH;
        this.NUM_1 = NUM_1;
        this.NUM_2 = NUM_2;
        this.LAND_CODE = LAND_CODE;
        this.LAND = LAND;
    }

    public String getIP_LOW() {
        return IP_LOW;
    }

    public void setIP_LOW(String IP_LOW) {
        this.IP_LOW = IP_LOW;
    }

    public String getIP_HIGH() {
        return IP_HIGH;
    }

    public void setIP_HIGH(String IP_HIGH) {
        this.IP_HIGH = IP_HIGH;
    }

    public String getNUM_1() {
        return NUM_1;
    }

    public void setNUM_1(String NUM_1) {
        this.NUM_1 = NUM_1;
    }

    public String getNUM_2() {
        return NUM_2;
    }

    public void setNUM_2(String NUM_2) {
        this.NUM_2 = NUM_2;
    }

    public String getLAND_CODE() {
        return LAND_CODE;
    }

    public void setLAND_CODE(String LAND_CODE) {
        this.LAND_CODE = LAND_CODE;
    }

    public String getLAND() {
        return LAND;
    }

    public void setLAND(String LAND) {
        this.LAND = LAND;
    }

    public String toString() {
        return getIP_HIGH() + " " + getIP_LOW() + " " + getNUM_1() + " " + getNUM_2() + " " + getLAND_CODE() + " " + getLAND();
    }
}
