package com.company;

import java.util.ArrayList;

/**
 * Entry class ,crud class to test my other class and implements the other class
 */
public class Main {
    public static void main(String[] args) {
        //TODO : those lists can be a class member
        ArrayList<Geo> geos=new ArrayList<Geo>(){{
            add(new Geo(-37.3159, 81.1496));
            add(new Geo(-43.9509,-34.4618));
            add(new Geo(-68.6102,-47.0653 ));
            add(new Geo(29.4572,-164.2990));
            add(new Geo(-31.8129,62.5342));
            add(new Geo(-71.4197,71.7478));
            add(new Geo(24.8918,21.8984));
            add(new Geo(-14.3990,-120.7677));
            add(new Geo(24.6463,-168.8889));
            add(new Geo(-38.2386,57.2232));
        }};

        ArrayList<Address> addresses=new ArrayList<Address>(){{
            add(new Address(geos.get(0), "Kulas Light", "Apt. 556", "Gwenborough", "92998-3874"));
            add(new Address (geos.get(1),"Victor Plains","Suite 879","Wisokyburgh","90566-7771"));
            add(new Address (geos.get(2),"Douglas Extension","Suite 847","McKenziehaven","59590-4157"));
            add(new Address (geos.get(3),"Hoeger Mall","Apt. 692","South Elvis","53919-4257"));
            add(new Address (geos.get(4),"Skiles Walks","Suite 351","Roscoeview","33263"));
            add(new Address (geos.get(5),"Norberto Crossing","Apt. 950","South Christy","23505-1337"));
            add(new Address (geos.get(6),"Rex Trail","Suite 280","Howemouth","58804-1099"));
            add(new Address (geos.get(7),"Ellsworth Summit","Suite 729","Aliyaview","45169"));
            add(new Address(geos.get(8),"Dayna Park","Suite 449","Bartholomebury","76495-3109"));
            add(new Address(geos.get(9),"Kattie Turnpike","Suite 198","Lebsackbury","31428-2261"));

        }};

        ArrayList<Company> companies=new ArrayList<Company>(){{
            add(new Company("Romaguera-Crona", "Multi-layered client-server neural-net", "harness real-time e-markets"));
            add(new Company("Deckow-Crist","Proactive didactic contingency","synergize scalable supply-chains"));
            add(new Company("Romaguera-Jacobson","Face to face bifurcated interface","e-enable strategic applications"));
            add(new Company("Robel-Corkery","Multi-tiered zero tolerance productivity","transition cutting-edge web services"));
            add( new Company("Keebler LLC","User-centric fault-tolerant solution","revolutionize end-to-end systems"));
            add( new Company("Considine-Lockman","Synchronised bottom-line interface","e-enable innovative applications"));
            add(new Company("Johns Group","Configurable multimedia task-force","generate enterprise e-tailers"));
            add( new Company("Abernathy Group","Implemented secondary concept","e-enable extensible e-tailers"));
            add( new Company("Yost and Sons","Switchable contextually-based project","aggregate real-time technologies"));
            add(new Company("Hoeger LLC","Centralized empowering task-force","target end-to-end models"));
        }};

        ArrayList <Users> users=new ArrayList<Users>(){
            {
                add(new Users(addresses.get(0), companies.get(0), "Leanne Graham", "Bret",
                        "Sincere@april.biz", "1-770-736-8031 x56442", "hildegard.org"));

                add(new Users(addresses.get(1), companies.get(1), "Ervin Howell","Antonette",
                        "Shanna@melissa.tv", "010-692-6593 x09125","anastasia.net"));

                add(new Users(addresses.get(2), companies.get(2), "Clementine Bauch","Samantha",
                        "Nathan@yesenia.net","1-463-123-4447","ramiro.info"));

                add(new Users(addresses.get(3),companies.get(3), "Patricia Lebsack","Karianne",
                        "Julianne.OConner@kory.org","493-170-9623 x156","kale.biz"));

                add(new Users(addresses.get(4),companies.get(4), "Chelsey Dietrich","Kamren",
                        "Lucio_Hettinger@annie.ca","(254)954-1289","demarco.info"));

                add(new Users(addresses.get(5),companies.get(5), "Mrs. Dennis Schulist","Leopoldo_Corkery",
                        "Karley_Dach@jasper.info","1-477-935-8478 x6430","ola.org"));

               add(new Users(addresses.get(6), companies.get(6), "Kurtis Weissnat","Elwyn.Skiles",
                       "Telly.Hoeger@billy.biz","210.067.6132","elvis.io"));

                add(new Users(addresses.get(7),companies.get(7) , "Nicholas Runolfsdottir V","Maxime_Nienow",
                        "Sherwood@rosamond.me","586.493.6943 x140","jacynthe.com"));

                add(new Users(addresses.get(8),companies.get(8), "Glenna Reichert","Delphine",
                        "Chaim_McDermott@dana.io","(775)976-6794 x41206","conrad.com"));

                add(new Users(addresses.get(9), companies.get(9), "Clementina DuBuque","Moriah.Stanton",
                        "Rey.Padberg@karina.biz", "024-648-3804", "ambrose.net"));
            }
        };

        // TODO : from cli , from Scanner Object . let user decicde what to do
        Crud_Users.showUsers(users);
        Crud_Users.removeUsers(users,4);
        Crud_Users.updateUsersName(users,"AymanAbdelal",2);
        System.out.println("*********************************************************************************");
        Crud_Users.showUsers(users);
    }
}
