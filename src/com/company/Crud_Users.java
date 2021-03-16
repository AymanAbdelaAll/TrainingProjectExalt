package com.company;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

/**
 * Crud_Users has a methods to delete users,update field in user,and show all users with field
 */
public class Crud_Users {
    public static Users removeUsers(ArrayList<Users> users,Integer index){
        Users remove_users=users.get(index);
        users.remove(index);
        return remove_users;
    }

    public static void showUsers(ArrayList<Users> users){
        for (Users user:users) {
            System.out.println(user.toString());
            System.out.println();
        }
    }

    public static boolean updateUsersName(@NotNull ArrayList<Users> users,@NotNull String name,@NotNull Integer index){
        if (index<users.size()&&index>=0){
        users.get(index).setName(name);
        return true;
        }else {
            return false;
        }
    }

    public static boolean updateUsersUserName(@NotNull ArrayList<Users> users, @NotNull String username,@NotNull Integer index){
        if (index<users.size()&&index>=0){
            users.get(index).setUsername(username);
            return true;
        }else {
            return false;
        }
    }

    public static boolean updateUsersEmail(@NotNull ArrayList<Users> users, @NotNull String email,@NotNull Integer index){
        if (index<users.size()&&index>=0){
            users.get(index).setUsername(email);
            return true;
        }else {
            return false;
        }
    }

    public static boolean updateUsersPhone(@NotNull ArrayList<Users> users, @NotNull String phone,@NotNull Integer index){
        if (index<users.size()&&index>=0){
            users.get(index).setUsername(phone);
            return true;
        }else {
            return false;
        }
    }

    public static boolean updateUsersWebsite(@NotNull ArrayList<Users> users, @NotNull String website,@NotNull Integer index){
        if (index<users.size()&&index>=0){
            users.get(index).setUsername(website);
            return true;
        }else {
            return false;
        }
    }

    public static boolean updateUsersAddress(@NotNull ArrayList<Users> users,@NotNull Address address,@NotNull Integer index){
        if (index<users.size()&&index>=0){
            users.get(index).setAddress(address);
            return true;
        }else {
            return false;
        }
    }

    public static boolean updateUsersCompany(@NotNull ArrayList<Users> users,@NotNull Company company,@NotNull Integer index){
        if (index<users.size()&&index>=0){
            users.get(index).setCompany(company);
            return true;
        }else {
            return false;
        }
    }


}
