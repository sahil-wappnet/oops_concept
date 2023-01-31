import java.util.Scanner;

interface FrontendDev {
    public static String frontworking(String abc) {
        return abc;
    }
}

interface BackendDev {
    public static void backworking() {

    }
}

class Developer implements FrontendDev, BackendDev {

    public String cateselection() {
        String mytemp;
        System.out.println("info:   Write Front for Frontend Developer");
        System.out.println("info:   Write Back for Backend Developer");
        System.out.println("info:   Write Data for DBA");
        System.out.println("info:   Write UI/UX for Testing work");
        System.out.println("info:   Write Test for Testing work");

        Scanner sc = new Scanner(System.in);
        mytemp = sc.nextLine();
        mytemp.toLowerCase();
        return mytemp;
    }

}

class TaskThree {
    public static void main(String[] args) {
        String ans;
        String fro = "FrontEnd Developer";
        Developer dev = new Developer();
        System.out.println("Select Your Working Category");
        String category = dev.cateselection();

        if (category == "frontend") {

            ans = FrontendDev.frontworking(fro);
            System.out.println(ans);
        } else if (category == "backend") {

        } else if (category == "data") {

        } else if (category == "test") {

        } else if (category == "ui/ux") {

        }

    }
}