package Assignment10;

public class Contacts {
    //instance variables
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String email;
    private int zip;
    private String phoneNumber;

    //constructor
    public Contacts(String firstName, String lastName, String address,String city,int zip,String phoneNumber,String email)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email= email;
        this.city = city;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public void setZip(int zip)
    {
        this.zip = zip;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public void setCity(String city)
    {
        this.city = city;
    }
    public String getfirstName()
    {
        return firstName;
    }
    public String getLastName(String lastName)
    {
        return lastName;
    }
    public String getAddress()
    {
        return address;
    }
    public String getCity()
    {
        return city;
    }
    public int getZip()
    {
        return zip;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public String getEmail()
    {
        return email;
    }

    @Override
    public String toString() {
        return "Contacts [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
                + ", city=" + city + ", email=" + email + ", zip=" + zip + ", phoneNumber=" + phoneNumber + "]";
    }
}
