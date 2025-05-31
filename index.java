import java.util.ArrayList;
import java.util.Scanner;

class index
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        int choice;
        do{
            System.out.println("\n To-Do-App");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Task");
            System.out.println("4. Exit");
            System.out.println("Choose an Option");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter your task");
                    String task = sc.nextLine();
                    tasks.add(task);
                    System.out.println("Task Added");
                    break;

                case 2:
                    System.out.println("Enter task number to remove");
                    int n  = sc.nextInt();
                    if(n <= tasks.size() && n > 0)
                    {
                    tasks.remove(n-1);
                    System.out.println("Task removed");
                    }
                    else
                    {
                        System.out.println("Invalid task number");
                    }
                    break;

                case 3: 
                    if(tasks.isEmpty())
                    {
                        System.out.println("No tasks");
                    }
                    else
                    {
                        System.out.println("Your Tasks");
                        for(int i = 0 ; i<tasks.size(); i++)
                        {
                            System.out.println((i+1) + ". " +tasks.get(i));
                        }
                    }
                    break;

                case 4 :
                System.out.println("Bye");
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }   
        while(choice != 4);
        sc.close();
    }

}