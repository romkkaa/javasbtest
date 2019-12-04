package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class PurchaseDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String lastName;
    private int age;
    private PurchaseItem item;
    private long itemCount;
    private double amount;
    private Date date;

    public PurchaseDetails(long id, String name, String lastName, int age, PurchaseItem item, long itemCount, double amount, Date date) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.item = item;
        this.itemCount = itemCount;
        this.amount = amount;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public PurchaseItem getItem() {
        return item;
    }

    public void setItem(PurchaseItem item) {
        this.item = item;
    }

    public long getItemCount() {
        return itemCount;
    }

    public void setItemCount(long itemCount) {
        this.itemCount = itemCount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
