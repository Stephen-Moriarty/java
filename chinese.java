import java.util.Scanner;
public class chinese {
    public static void main(String[] args){
        //Creates Scanner object:
        Scanner tkIn = new Scanner(System.in);
        //Creates Scanner object^
        System.out.println("你好");
        System.out.print("这是我的名字是？》");
        //Asking for input/name
        String userName1 = tkIn.nextLine();
        //Prints out what name is and complements the name
        System.out.println("啊，你的名字" + userName1 + "? " + "我喜欢了！");
        




        //Closes Scanner:
        tkIn.close();
        //Closes Scanner ^
    }
}