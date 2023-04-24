package day31_Constructors.Restaurant;

public class LocalRestaurant {
    public static void main(String[] args) {
        Restaurant resto1=new Restaurant("Louis","Geneve",8);
        Server server1=new Server("Caner",12,23,true);
        Server server2=new Server("Emma",15,21,true);
        Server server3=new Server("Irene",24,26,true);

        Server[] servers={server1,server2,server3};
        resto1.hireServer(servers);

        Chef chef1=new Chef("Emily",47,28,false);
        Chef chef2=new Chef("Verena",96,41,true);

        Chef[] chefs={chef1,chef2};
        resto1.hireChef(chefs);

        System.out.println(resto1);

        resto1.terminateServer(12);
        System.out.println(resto1);

        for (Server server : resto1.serversList) {
            System.out.println(server.name);
        }
        System.out.println(resto1.owner);

    }
}
