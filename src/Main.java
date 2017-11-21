import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String humanName = "";
        String humanCity = "";
        int humanAge = 0;
        String humanHobby = "";
        int menuSelection = 0;
        boolean mainMenu = true;

        while (mainMenu){
            System.out.println("1.Add human");
            System.out.println("2.List # 1");
            System.out.println("3.List # 2");
            System.out.println("4.List # 3");
            menuSelection = sc.nextInt();
            switch (menuSelection){
                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;
            }
        }
    }
}
