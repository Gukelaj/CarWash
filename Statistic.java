public class Statistic {

    private String surName;
    private String lastName;

    public Statistic (String surName, String lastName)
    {
        this.surName = surName;
        this.lastName = lastName;
    }

    public String getSurName()
    { 
        return this.surName;
    }

    public String getLastName()
    {
        return this.lastName;
    }
}