import java.util.Scanner;

class Engineer {
    public char work() {
        char tempans;
        System.out.println(" ");
        System.out.println("info:   Press c for Computer Engineers");
        System.out.println("info:   Press m for Mechanical Engineers");
        System.out.println(" ");
        System.out.println("Select your Engineering field");

        Scanner sc = new Scanner(System.in);
        tempans = sc.next().charAt(0);
        return tempans;
    }

    public void comman_work() {
        System.out.print("Firstly We Engineers & are main work to give Solution to the Problems");
    }
}

class Computerengi extends Engineer {

    public void com_work() {
        System.out.print(" and my specific area of work is upon problems related to Computers");
    }

}

class Mechengi extends Engineer {

    public void mech_work() {
        System.out.print(" and my specific area of work is upon problems related to Machines");
    }
}

public class TaskTwo {
    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("What is your Work as an Engineer??");
        Engineer eng = new Engineer();

        char cate = eng.work();

        if (cate == 'c') {
            eng.comman_work();
            Computerengi com_eng = new Computerengi();
            com_eng.com_work();
        } else if (cate == 'm') {
            eng.comman_work();
            Mechengi mechengi = new Mechengi();
            mechengi.mech_work();
        } else {
            System.out.println("Select Correct category of work.");
        }
    }
}