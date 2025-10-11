package Shinewash360.ShineWash360.model;


import jakarta.persistence.*;



@Entity
@Table(name = "shine360customerregistor")
public class RegistorCustomerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id",nullable = false)
    private long customerId;

    @Column(name = "full_name",nullable = false)
    private String fullName;

    @Column(name = "email",nullable = false,unique = true)
    private String email;

    @Column(name="phone",nullable = false,unique = true)
    private String phone;



    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
