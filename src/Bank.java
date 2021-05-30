import java.util.ArrayList;

public class Bank {
    private String name;
    private String address;
    private int phone;
    private ArrayList<Account> arr=new ArrayList<Account>();
    private ArrayList<Client> arr_client=new ArrayList<Client>();

    public Bank(String n,String a,int p)
    {
        this.name=n;
        this.address=a;
        this.phone=p;
    }

    public void setName(String n)
    {
        this.name=n;
    }

    public void setAddress(String a)
    {
        this.address=a;
    }

    public void setPhone(int p)
    {
        this.phone =p;
    }

    public String getName()
    {
        return name;
    }

    /**
     *
     * @return
     */
    public String getAddress()
    {
        return address;
    }

    public int getPhone()
    {
        return phone;
    }



}