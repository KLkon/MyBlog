package site.pers.kl.bean;

public class ContactPerson {
    private Integer pId;

    private String pName;

    private String pEmail;

    private String pConnection;

    private String pMessage;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public String getpEmail() {
        return pEmail;
    }

    public void setpEmail(String pEmail) {
        this.pEmail = pEmail == null ? null : pEmail.trim();
    }

    public String getpConnection() {
        return pConnection;
    }

    public void setpConnection(String pConnection) {
        this.pConnection = pConnection == null ? null : pConnection.trim();
    }

    public String getpMessage() {
        return pMessage;
    }

    public void setpMessage(String pMessage) {
        this.pMessage = pMessage == null ? null : pMessage.trim();
    }
}