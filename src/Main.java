import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your level:");
        String levelInput = in.nextLine();
        int level = Integer.parseInt(levelInput);
        int x=1;
       // int age=55;

        switch(x)
        {
            case 1: if(level>=100)
                System.out.println("Pro");

            case 2: if(level>=60)
                System.out.println("Semi-Pro");

            case 3: if(level>=60)
                System.out.println("Novice");
                break;

            case 4: if(level<=10)
                System.out.println("Noob");
                break;
            default:
                System.out.println("No level");
        }
/*if (level>=100){
  System.out.println("Pro");
}else {
    if(level>=60){
    System.out.println("Semi-Pro");
    }else{
        if(level>30){
        System.out.println("Novice");
        }
        else{
            if(level<=10){
            System.out.println("Noob");

            }
        }
    }
}*/

        }
    }

