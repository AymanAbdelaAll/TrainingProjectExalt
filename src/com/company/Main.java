package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Entry class ,crud class to test my other class and implements the other class
 */
public class Main {
    public static void main(String[] args) {
        ArrayList <Users> users=new ArrayList<Users>(){
            {
                add(new Users(new Address(new Geo(-37.3159, 81.1496), "Kulas Light", "Apt. 556", "Gwenborough", "92998-3874"),
                          new Company("Romaguera-Crona", "Multi-layered client-server neural-net", "harness real-time e-markets"),
                         "Leanne Graham", "Bret", "Sincere@april.biz", "1-770-736-8031 x56442", "hildegard.org"));

                add(new Users(new Address (new Geo(-43.9509,-34.4618),"Victor Plains","Suite 879","Wisokyburgh","90566-7771"),
                          new Company("Deckow-Crist","Proactive didactic contingency","synergize scalable supply-chains"),
                        "Ervin Howell","Antonette","Shanna@melissa.tv", "010-692-6593 x09125","anastasia.net"));

                add(new Users(new Address (new Geo(-68.6102,-47.0653 ),"Douglas Extension","Suite 847","McKenziehaven","59590-4157"),
                          new Company("Romaguera-Jacobson","Face to face bifurcated interface","e-enable strategic applications"),
                         "Clementine Bauch","Samantha","Nathan@yesenia.net","1-463-123-4447","ramiro.info"));

                add(new Users(new Address (new Geo(29.4572,-164.2990),"Hoeger Mall","Apt. 692","South Elvis","53919-4257"),
                          new Company("Robel-Corkery","Multi-tiered zero tolerance productivity","transition cutting-edge web services"),
                          "Patricia Lebsack","Karianne","Julianne.OConner@kory.org","493-170-9623 x156","kale.biz"));

                add(new Users(new Address (new Geo(-31.8129,62.5342),"Skiles Walks","Suite 351","Roscoeview","33263"),
                          new Company("Keebler LLC","User-centric fault-tolerant solution","revolutionize end-to-end systems"),
                          "Chelsey Dietrich","Kamren","Lucio_Hettinger@annie.ca","(254)954-1289","demarco.info"));

                add(new Users(new Address (new Geo(-71.4197,71.7478),"Norberto Crossing","Apt. 950","South Christy","23505-1337"),
                          new Company("Considine-Lockman","Synchronised bottom-line interface","e-enable innovative applications"),
                          "Mrs. Dennis Schulist","Leopoldo_Corkery","Karley_Dach@jasper.info","1-477-935-8478 x6430","ola.org"));

               add(new Users(new Address (new Geo(24.8918,21.8984),"Rex Trail","Suite 280","Howemouth","58804-1099"),
                          new Company("Johns Group","Configurable multimedia task-force","generate enterprise e-tailers"),
                          "Kurtis Weissnat","Elwyn.Skiles","Telly.Hoeger@billy.biz","210.067.6132","elvis.io"));

                add(new Users(new Address (new Geo(-14.3990,-120.7677),"Ellsworth Summit","Suite 729","Aliyaview","45169"),
                          new Company("Abernathy Group","Implemented secondary concept","e-enable extensible e-tailers"),
                          "Nicholas Runolfsdottir V","Maxime_Nienow","Sherwood@rosamond.me","586.493.6943 x140","jacynthe.com"));

                add(new Users(new Address(new Geo(24.6463,-168.8889),"Dayna Park","Suite 449","Bartholomebury","76495-3109"),
                          new Company("Yost and Sons","Switchable contextually-based project","aggregate real-time technologies"),
                        "Glenna Reichert","Delphine","Chaim_McDermott@dana.io","(775)976-6794 x41206","conrad.com"));

                add(new Users(new Address(new Geo(-38.2386,57.2232),"Kattie Turnpike","Suite 198","Lebsackbury","31428-2261"),
                          new Company("Hoeger LLC","Centralized empowering task-force","target end-to-end models"),
                        "Clementina DuBuque","Moriah.Stanton", "Rey.Padberg@karina.biz", "024-648-3804", "ambrose.net"));
            }
        };

        for (Users user:users) {
            System.out.println(user.toString());
            System.out.println();
        }
    }
}
