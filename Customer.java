
public class Customer {

    private String userName;
    private String password;
    private String name;
    
    private String phone;
    private String address;

    private Cart Ccart;
    public Customer(String userName, String password, String name, String phone, String address) {
        this.userName = userName;
        this.password = password;
        this.phone = phone;
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
