package com.company;


import org.jetbrains.annotations.NotNull;

/**
 * The Users class contain all information about any user
 */
public class Users {
    private int id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;
    private static int countid=1;

    public Users() {
        this.setId();
    }

    /**
     *
     * @param address ,the address of user
     * @param company ,the instance of a Company class
     * @param members ,an array that has five parameter of filed (name, username, email , phone, website)
     */
    public Users(@NotNull Address address,@NotNull Company company,@NotNull String...members){
        this.setId();
        this.setName(members[0]);
        this.setUsername(members[1]);
        this.setEmail(members[2]);
        this.setAddress(address);
        this.setPhone(members[3]);
        this.setWebsite(members[4]);
        this.setCompany(company);
    }

    /**
     * these method make the class auto assign id
     */
    private void setId() {
        this.id=getCountid();
        countid++;
    }

    public int getId() {
        return id;
    }

    public void setName(@NotNull String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setUsername(@NotNull String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setEmail(@NotNull String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setAddress(@NotNull Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setPhone(@NotNull String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setWebsite(@NotNull String website) {
        this.website = website;
    }

    public String getWebsite() {
        return website;
    }

    public void setCompany(@NotNull Company company) {
        this.company = company;
    }

    public Company getCompany() {
        return company;
    }

    public static int getCountid() {
        return countid;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address.toString() +
                ", phone='" + phone + '\'' +
                ", website='" + website + '\'' +
                ", company=" + company.toString() +
                '}';
    }
}
