import java.util.Objects;

public class CSVEntity implements Comparable<CSVEntity>{

    private Integer fid;
    private String serialNum;
    private String memberCode;
    private String acctType;
    private String openedDT;
    private String actRteCDE;
    private String reportingDT;
    private String creditLimit;

    public CSVEntity(Integer fid, String serialNum, String memberCode, String acctType, String openedDT,
                     String actRteCDE, String reportingDT, String creditLimit) {
        this.fid = fid;
        this.serialNum = serialNum;
        this.memberCode = memberCode;
        this.acctType = acctType;
        this.openedDT = openedDT;
        this.actRteCDE = actRteCDE;
        this.reportingDT = reportingDT;
        this.creditLimit = creditLimit;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public String getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(String memberCode) {
        this.memberCode = memberCode;
    }

    public String getAcctType() {
        return acctType;
    }

    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }

    public String getOpenedDT() {
        return openedDT;
    }

    public void setOpenedDT(String openedDT) {
        this.openedDT = openedDT;
    }

    public String getActRteCDE() {
        return actRteCDE;
    }

    public void setActRteCDE(String actRteCDE) {
        this.actRteCDE = actRteCDE;
    }

    public String getReportingDT() {
        return reportingDT;
    }

    public void setReportingDT(String reportingDT) {
        this.reportingDT = reportingDT;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(String creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CSVEntity csvEntity = (CSVEntity) o;
        return Objects.equals(fid, csvEntity.fid) &&
                Objects.equals(serialNum, csvEntity.serialNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fid, serialNum);
    }

    @Override
    public int compareTo(CSVEntity o) {
        return fid.compareTo(o.getFid());
    }

    @Override
    public String toString() {
        return "CSVEntity{" +
                "fid=" + fid +
                ", serialNum='" + serialNum + '\'' +
                '}';
    }
}
