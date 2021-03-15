package com.company;

import org.jetbrains.annotations.NotNull;

public class Company {
    private String name;
    private  String catchphrase;
    private String bs;

    public Company() { }

    /**
     *
     * @param members ,an array that has three parameter of filed (name , String catchphrase, String bs)
     */
    public Company(@NotNull String...members){
        // TODO : bad use of var-args because caller has no clue which string would be assigned to what. better is to explicitly define parameters
        this.setName(members[0]);
        this.setCatchphrase(members[1]);
        this.setBs(members[2]);
    }

    public String getName() {
        return name;
    }

    public void setName(@NotNull String name) {
        this.name = name;
    }

    public String getCatchphrase() {
        return catchphrase;
    }

    public void setCatchphrase(@NotNull String catchphrase) {
        this.catchphrase = catchphrase;
    }

    public String getBs() {
        return bs;
    }

    public void setBs(@NotNull String bs) {
        this.bs = bs;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", catchphrase='" + catchphrase + '\'' +
                ", bs='" + bs + '\'' +
                '}';
    }
}
