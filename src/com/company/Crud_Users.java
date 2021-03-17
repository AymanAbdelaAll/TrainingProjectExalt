package com.company;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

/**
 * Crud_Users has a methods to delete users,update field in user,and show all users with field
 */

//TODO : bad convention !!! no need to create a stabd alnoe class for this
public class Crud_Users {

    public static Users removeUsers(@NotNull ArrayList<Users> users,int index){
        if (index<users.size()&&index>=0){
            Users remove_users=users.get(index);
            users.remove(index);
            System.out.println("The User Deleted .");
            return remove_users;
        }else {
            System.out.println("The User Doesn't Deleted .");
            return null;
        }
    }

    public static void showUsers(@NotNull ArrayList<Users> users){
        System.out.println("The list of Users:");
        for (Users user:users) {
            System.out.println(user.toString());
            System.out.println();
        }
    }

    public static boolean updateUsersName(@NotNull ArrayList<Users> users,@NotNull String name,int index){
        if (index<users.size()&&index>=0){
        users.get(index).setName(name);
        System.out.println("The Name Of User Updated .");
        return true;
        }else {
            System.out.println("The Name Of User doesn't Updated .");
            return false;
        }
    }

    public static boolean updateUsersUserName(@NotNull ArrayList<Users> users, @NotNull String username,int index){
        if (index<users.size()&&index>=0){
            users.get(index).setUsername(username);
            System.out.println("The Username Updated .");
            return true;
        }else {
            System.out.println("The Username doesn't Updated .");
            return false;
        }
    }

    public static boolean updateUsersEmail(@NotNull ArrayList<Users> users, @NotNull String email,int index){
        if (index<users.size()&&index>=0){
            users.get(index).setUsername(email);
            System.out.println("The User Email Updated .");
            return true;
        }else {
            System.out.println("The User Email Doesn't Updated .");
            return false;
        }
    }

    public static boolean updateUsersPhone(@NotNull ArrayList<Users> users, @NotNull String phone,int index){
        if (index<users.size()&&index>=0){
            users.get(index).setUsername(phone);
            System.out.println("The User Phone Updated .");
            return true;
        }else {
            System.out.println("The User Phone Doesn't Updated .");
            return false;
        }
    }

    public static boolean updateUsersWebsite(@NotNull ArrayList<Users> users, @NotNull String website,int index){
        if (index<users.size()&&index>=0){
            users.get(index).setUsername(website);
            System.out.println("The User Website Updated .");
            return true;
        }else {
            System.out.println("The User Website Doesn't Updated .");
            return false;
        }
    }

    public static boolean updateUsersAddress(@NotNull ArrayList<Users> users,@NotNull Address address,int index){
        if (index<users.size()&&index>=0){
            users.get(index).setAddress(address);
            System.out.println("The Address Updated .");
            return true;
        }else {
            System.out.println("The Address Doesn't Updated");
            return false;
        }
    }

    public static boolean updateUsersCompany(@NotNull ArrayList<Users> users,@NotNull Company company,int index){
        if (index<users.size()&&index>=0){
            users.get(index).setCompany(company);
            System.out.println("The Company Object Is Updated .");
            return true;
        }else {
            System.out.println("The Company Object Isn't Updated .");
            return false;
        }
    }


}
