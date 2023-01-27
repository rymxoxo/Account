package net.guides.springboot2.springboot2jpacrudexample.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "accounts")
public class Account{

    private long id;
    private String firstName;
    private String lastName;
    private String cin;
    private String accountNumber;
    private String agency;
    private long amount;

    public Account() {
    }

    public Account(final String firstName, final String lastName, final String cin, final String accountNumber,
            final String agency, final long amount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cin = cin;
        this.accountNumber = accountNumber;
        this.agency = agency;
        this.amount = amount;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;

    }

    public void setId(final long id) {
        this.id = id;
    }

    @Column(name = "first_name", nullable = false)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name", nullable = false)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "cin", nullable = false)
    public String getCin() {
        return cin;
    }

    public void setCin(final String cin) {
        this.cin = cin;
    }

    @Column(name = "account_number", nullable = false)
    public String getAccountNumber() {

        return accountNumber;
    }

    public void setAccountNumber(final String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Column(name = "agency", nullable = false)
    public String getAgency() {
        return agency;
    }

    public void setAgency(final String agency) {
        this.agency = agency;
    }

    @Column(name = "amount", nullable = false)
    public long getAmount() {
        return amount;
    }

    public void setAmount(final long amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Account [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", cin=" + cin
                + ", accountNumber=" + accountNumber + ", agency=" + agency + ", amount=" + amount + "]";
    }

}

