package me.vasylkov.mvc.validationdemo.entity;

import jakarta.validation.constraints.*;

public class Customer
{
    private String firstName;

    @NotNull(message = "is required")
    @Size(min = 1, message = "must be min 1 symbol")
    private String lastName;

    @NotNull(message = "is required")
    @Min(value = 0, message = "must be greater then or equal to zero")
    @Max(value = 10, message = "must be less than or equal to 10")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
    private String postalCode;

    public Customer()
    {
    }

    public Customer(String firstName, String lastName, int freePasses, String postalCode)
    {
        this.freePasses = freePasses;
        this.firstName = firstName;
        this.lastName = lastName;
        this.postalCode = postalCode;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public Integer getFreePasses()
    {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses)
    {
        this.freePasses = freePasses;
    }

    public String getPostalCode()
    {
        return postalCode;
    }

    public void setPostalCode(String postalCode)
    {
        this.postalCode = postalCode;
    }
}
