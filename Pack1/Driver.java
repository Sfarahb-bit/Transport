package Pack1;
import Pack2.Train;
import Pack2.Tram;
import Pack3.Metro;
import Pack4.Monowheel;
import Pack5.Aircraft;
import Pack5.WorldWarIIAiroplane;
import Pack6.Ferry;

import java.lang.management.MonitorInfo;

public class Driver {


    public static void main(String[] args) {
        System.out.println( "----------------------------WheeledTransportation---------------------------" );
        WheeledTransportation wheeledTransportation1 = new WheeledTransportation( 8, 200 );
        System.out.println( wheeledTransportation1 );
        WheeledTransportation wheeledTransportation2 = new WheeledTransportation( 4, 300 );
        System.out.println( wheeledTransportation2 );
        WheeledTransportation wheeledTransportation3 = new WheeledTransportation( 6, 180 );
        System.out.println( wheeledTransportation3 );


        System.out.println( "----------------------------Train---------------------------------" );
        Train train1 = new Train();
        System.out.println( train1 );
        Train train2 = new Train( 100, 100, 1, "Toronto", "Vancouver" );
        System.out.println( train2 );
        Train train3 = new Train( 120, 150, 118, "Montreal", "Vancouver" );
        System.out.println( train3 );


        System.out.println( "----------------------------Tram---------------------------" );
        Tram tram1 = new Tram( 10, 80, 10, "Montreal", "Quebec City", 5, 1999 );
        System.out.println( tram1 );
        Tram tram2 = new Tram( 6, 120, 16, "Montreal", "Toronto", 7, 2015 );
        System.out.println( tram2 );


        System.out.println( "----------------------------Metro---------------------------" );
        Metro metro1 = new Metro( 18, 110, 13, "Montmorency", "cote-Vertu", 30 );
        System.out.println( metro1 );
        Metro metro2 = new Metro( 12, 120, 11, "Snowdon", "Saint-Michel",11 );
        System.out.println( metro2 );

        System.out.println( "----------------------------Monowheel---------------------------" );
        Monowheel monowheel1 = new Monowheel(1,60,100);
        System.out.println(monowheel1);
        Monowheel monowheel2 = new Monowheel(1,4,75);
        System.out.println(monowheel2);

        System.out.println( "----------------------------Aircraft---------------------------" );
        Aircraft aircraft1 = new Aircraft(10000000, 40000);
        System.out.println(aircraft1);
        Aircraft aircraft2 = new Aircraft (12000000,50000);
        System.out.println(aircraft2);


        System.out.println( "----------------------------WorldWarIIAiroplane---------------------------" );
        WorldWarIIAiroplane worldWarIIAiroplane1 = new WorldWarIIAiroplane(true,8000000,35000);
        System.out.println(worldWarIIAiroplane1);
        WorldWarIIAiroplane worldWarIIAiroplane2 = new WorldWarIIAiroplane(false,9200000,45000);
        System.out.println(worldWarIIAiroplane2);
        WorldWarIIAiroplane worldWarIIAiroplane3 = new WorldWarIIAiroplane(worldWarIIAiroplane1);
        System.out.println(worldWarIIAiroplane3);


        System.out.println( "----------------------------Ferry---------------------------" );
        Ferry ferry1 = new Ferry(46,50);
        System.out.println(ferry1);
        Ferry ferry2 = new Ferry(70,65);
        System.out.println(ferry2);
        Ferry ferry3 = new Ferry(ferry2);
        System.out.println(ferry3);

        System.out.println("------------------------------Equality test------------------------------");

        System.out.print( "wheeledTransportation1  and wheeledTransportation2 : " );
        printEqual( wheeledTransportation1, wheeledTransportation2 );

        System.out.println("**********************************************           ");
        System.out.print( "train2  and metro1 : " );
        printEqual( train2, metro1 );

        System.out.println("**********************************************           ");
        System.out.println("worldWarIIAiroplane1 and worldWarIIAiroplane3 :  ");
        printEqual( worldWarIIAiroplane1, worldWarIIAiroplane3 );

        System.out.println("**********************************************************");
        System.out.println("monowheel1 and Ferry1 : ");
        printEqual( monowheel1,ferry1);

        System.out.println("**********************************************************");
        System.out.println("ferry2 and Ferry3 : ");
        printEqual( ferry2,ferry3);
        System.out.println("**********************************************************");

        Object [] array1 = {wheeledTransportation1,train1,tram2,metro2,monowheel1,aircraft1,wheeledTransportation3,worldWarIIAiroplane1,ferry1,ferry2,ferry3,aircraft2};

       Object [] array2 = {wheeledTransportation2,wheeledTransportation1,train2,tram1,tram2,metro1,monowheel1,wheeledTransportation3,worldWarIIAiroplane3,ferry2,ferry3,metro2};

        Object [] array3 = {train1,train2,tram2,ferry1,ferry2,wheeledTransportation1,aircraft1};

        System.out.println("The most and lest expansive Aircraft price in array 1 is :");
        findLeastAndMostExpensiveAircraft(array1);
        System.out.println("**********************************************************" );
        System.out.println("The most and lest expansive Aircraft price in array 2 is :");
        findLeastAndMostExpensiveAircraft(array2);
        System.out.println("**********************************************************" );
        System.out.println("The most and lest expansive Aircraft price in array 3 is :");
        findLeastAndMostExpensiveAircraft(array3);


    }

        public static void findLeastAndMostExpensiveAircraft(Object [] array) {
            double mostexp = Double.MIN_VALUE;
            double leastexp = Double.MAX_VALUE;

            Aircraft mostExpensiveAircraft = null;
            Aircraft leastExpensiveAircraft = null;

            for (int i = 0; i < array.length; i++) {
                if (array[i].getClass().getName() == "Pack5.Aircraft" ){

                    Aircraft aircraft = (Aircraft) array[ i ];
                    double price = aircraft.getPrice();

                    if (price > mostexp) {
                        mostexp = price;
                        mostExpensiveAircraft = aircraft;
                    }
                    if (price < leastexp) {
                        leastexp = price;
                        leastExpensiveAircraft = aircraft;
                    }
                }
            }


            if (mostexp == Double.MIN_VALUE || leastexp == Double.MAX_VALUE )  {
                System.out.println( " There is no object from Aircraft class in this array");
            }else {
                System.out.println("Most expensive aircraft details:\n" + mostExpensiveAircraft.toString());
                System.out.println( "Most expensive aircraft price: " + mostexp );
                System.out.println("Least expensive aircraft details:\n" + leastExpensiveAircraft.toString());
                System.out.println( "Least expensive aircraft price: " + leastexp );

            }
        }


    public static void printEqual ( Object object1, Object object2){
            if (object1.equals( object2 )) {
                System.out.println( "These two Object are equal" );
            } else {
                System.out.println( "These two Objet are not equal" );
            }
        }


}