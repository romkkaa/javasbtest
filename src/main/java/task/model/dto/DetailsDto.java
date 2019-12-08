package task.model.dto;

import javax.xml.bind.annotation.*;
import java.util.Date;

@XmlRootElement(name = "details")
@XmlAccessorType(XmlAccessType.FIELD)
public class DetailsDto {

    @XmlElement(name = "id")
    private long id;

    @XmlElement(name = "item_id")
    private long itemId;

    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "last_name")
    private String lastName;

    @XmlElement(name = "age")
    private int age;

    @XmlElement(name = "item_count")
    private long itemCount;

    @XmlElement(name = "amount")
    private double amount;

    @XmlElement(name = "purchase_date")
    private Date purchaseDate;

    public DetailsDto() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
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

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

}
