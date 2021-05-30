public class Client {

    private String name;
    protected int natoinalId;
    private String address;
    private int phone;
    private  Account account;

    public Client()
    {
        name="null";
        natoinalId=0;
        address="null";
        phone=0;
        Account acc=new Account();
        account =acc;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNatoinalId() {
        return natoinalId;
    }
    public void setNatoinalId(int natoinalId) {
        this.natoinalId = natoinalId;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String toString(){
        return "name is :"+ name + "\n nationalID is : "+ natoinalId +
                "\n address is :" + address +"\n phone is :" + phone + " \n account is : " +account;
    }
}

class CommercialClient extends Client{
    int commercialID;

    public int getCommercialID() {
        return commercialID;
    }

    public void setCommercialID(int commercialID) {
        this.commercialID = commercialID;
    }

    public CommercialClient(){
        natoinalId=0;
    }
    public String toString(){
        super.toString();
        natoinalId=commercialID;
        return null;
    }
}
