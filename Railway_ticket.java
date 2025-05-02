import java.util.Scanner;

class Train {

    int train_No;
    String train_Name;
    String[] stations;
    int[] distance;
    int S1 = 72, S2 = 72, B1 = 72, A1 = 48, H1 = 24;

    public Train(int train_No, String train_Name, String[] stations, int[] distance) {
        this.train_No = train_No;
        this.train_Name = train_Name;
        this.stations = stations;
        this.distance = distance;
    }

    public int isFound(String startingPoint, String destinationPoint) {

        int available_train = 0;
        boolean isStartingPoint = false;
        boolean isDestinationPoint = false;

        for (int i = 0; i < this.stations.length; i++) {
            if (startingPoint.equals(this.stations[i])) {
                isStartingPoint = true;
            }
            if (isStartingPoint && destinationPoint.equals(this.stations[i])) {
                isDestinationPoint = true;
            }
        }
        if (isStartingPoint && isDestinationPoint) {
            // System.out.println("Train Is Found...");
            available_train++;

            // return true ;

            return available_train;
        }
        return available_train;
    }

}

class Ticket {

    int PVR_No;
    String passenger_Name;
    int starting_Point;
    int destination_point;
    String class_Of_Train;
    double price;

}

class Coaches {

    int no_Of_Seat;
    int coach;

}

class Passenger {

    String passenger_Name;
    int age;
    int DOB;
    String email;
    String adhar_No;

}

public class Railway_ticket {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // For Train1

        String[] stations1 = { "HAPA", "ADI", "RTM", "KOTA", "NDLS", "SVDK" };
        int[] distance1 = { 0, 323, 673, 939, 1404, 2058 };

        Train t1 = new Train(12475, "HAPA SVDK EXP", stations1, distance1);

        // For Train2

        String[] stations2 = { "OKHA", "RJT", "WKR", "ADI", "RTM", "NDT" };
        int[] distance2 = { 0, 252, 294, 499, 849, 1124 };

        Train t2 = new Train(19575, "OKHA NDT EXP", stations2, distance2);

        // For Train3

        String[] stations3 = { "OKHA", "RJT", "SUNR", "ADI", "KOTA", "LKO", "BSB", "PNBE", "NJP", "GHY" };
        int[] distance3 = { 0, 252, 368, 499, 1115, 1776, 2099, 2327, 2816, 3224 };

        Train t3 = new Train(15635, "GUWAHATI EXPRES", stations3, distance3);

        // For Train4

        String[] stations4 = { "PBR", "RJT", "SUNR", "ADI", "BRC", "ST", "BSR", "PNVL", "NJP", "MAO","MAJN","CLT","KCVL" };
        int[] distance4 = { 0, 216, 333, 463, 563, 692, 907, 974, 1671, 2101, 2327, 2719 };

        Train t4 = new Train(20910, "PBR KCVL EXP", stations4, distance4);

        // For Train5

        // String[] stations5 = { "OKHA", "RJT", "SUNR", "ADI", "KOTA", "LKO", "BSB", "PNBE", "NJP", "GHY" };
        // int[] distance5 = { 0, 252, 368, 499, 1115, 1776, 2099, 2327, 2816, 3224 };

        // Train t5 = new Train(15635, "GUWAHATI EXPRES", stations5, distance5);

        System.out.println("Enter Your Starting Point :");
        String startingPoint = sc.nextLine();

        System.out.println("Enter Your Destination Point:");
        String destinationPoint = sc.nextLine();

        boolean flage = false;

        // for(int i=1 ; i<6 ; i++){
        // if(ti.isFound){
        // System.out.println("Train Found...");
        // flage = true ;
        // }
        // else{
        // flage = false;
        // }
        // }

        if (t1.isFound(startingPoint, destinationPoint) != 0) {

            flage = true;
        }

        else if (t2.isFound(startingPoint, destinationPoint) != 0) {

            flage = true;

        } 

        else if (t3.isFound(startingPoint, destinationPoint) != 0) {

            flage = true;

        } 

        else if (t4.isFound(startingPoint, destinationPoint) != 0) {

            flage = true;

        } 

        else {

            flage = false;
        }

        if (!flage) {
            System.out.println("Train Doesn't Found.");
        } else {
            System.out.println("Train Found...");
        }

        sc.close();

    }
}