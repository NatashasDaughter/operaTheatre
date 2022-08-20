package buem.zui.summerschooltheater.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Document
public class Contract {
    @Id
    private String id;
    private String name;
    private String description;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

    private Troupe soloist;
    private int amountOfOperas;
    private LocalDate dateOfBegin;
    private LocalDate dateOfFinish;
    private int salaryAmount;
    private int BonusAmount;

    public Contract() {
    }

    public Contract(String name, String description, Troupe soloist, int amountOfOperas, LocalDate dateOfBegin, LocalDate dateOfFinish, int salaryAmount, int bonusAmount) {
        this.name = name;
        this.description = description;
        this.soloist = soloist;
        this.amountOfOperas = amountOfOperas;
        this.dateOfBegin = dateOfBegin;
        this.dateOfFinish = dateOfFinish;
        this.salaryAmount = salaryAmount;
        BonusAmount = bonusAmount;
    }

    public Contract(String id, String name, String description, LocalDateTime createAt, LocalDateTime updateAt, Troupe soloist, int amountOfOperas, LocalDate dateOfBegin, LocalDate dateOfFinish, int salaryAmount, int bonusAmount) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.soloist = soloist;
        this.amountOfOperas = amountOfOperas;
        this.dateOfBegin = dateOfBegin;
        this.dateOfFinish = dateOfFinish;
        this.salaryAmount = salaryAmount;
        BonusAmount = bonusAmount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    public Troupe getSoloist() {
        return soloist;
    }

    public void setSoloist(Troupe soloist) {
        this.soloist = soloist;
    }

    public int getAmountOfOperas() {
        return amountOfOperas;
    }

    public void setAmountOfOperas(int amountOfOperas) {
        this.amountOfOperas = amountOfOperas;
    }

    public LocalDate getDateOfBegin() {
        return dateOfBegin;
    }

    public void setDateOfBegin(LocalDate dateOfBegin) {
        this.dateOfBegin = dateOfBegin;
    }

    public LocalDate getDateOfFinish() {
        return dateOfFinish;
    }

    public void setDateOfFinish(LocalDate dateOfFinish) {
        this.dateOfFinish = dateOfFinish;
    }

    public int getSalaryAmount() {
        return salaryAmount;
    }

    public void setSalaryAmount(int salaryAmount) {
        this.salaryAmount = salaryAmount;
    }

    public int getBonusAmount() {
        return BonusAmount;
    }

    public void setBonusAmount(int bonusAmount) {
        BonusAmount = bonusAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contract contract = (Contract) o;
        return getId().equals(contract.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Contract{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", soloist=" + soloist +
                ", amountOfOperas=" + amountOfOperas +
                ", dateOfBegin=" + dateOfBegin +
                ", dateOfFinish=" + dateOfFinish +
                ", salaryAmount=" + salaryAmount +
                ", BonusAmount=" + BonusAmount +
                '}';
    }
}
