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
            System.out.println("___________________");

            menuSelection = sc.nextInt();

            switch (menuSelection){
                case 1:
                    System.out.println("___Add human___");
                    System.out.println("enter human name ..");
                    humanName = sc.next();

                    System.out.println("enter city of residence ..");
                    humanCity = sc.next();

                    System.out.println("enter human age .. ");
                    humanAge = sc.nextInt();

                    System.out.println("enter human hobby ..");
                    humanHobby = sc.next();
                    break;

                case 2:
                    System.out.println("___List # 1___");
                    System.out.println("Имя: " + humanName);
                    System.out.println("Город: " + humanCity);
                    System.out.println("Возраст: " + humanAge);
                    System.out.println("Хобби: " + humanHobby);
                    System.out.println("___________________");
                    break;

                case 3:
                    break;

                case 4:
                    break;
            }
        }
    }
}
