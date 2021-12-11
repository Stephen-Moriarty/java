import java.util.*;
public class ArrayList2protoType {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        ArrayList<String> partyList = new ArrayList<String>();
        System.out.println("You know who NOT to invite.");
        System.out.println("Who you want in the party list?");
        // Who we not invite
        String blackSheep = "Adam";

        // Get invites
        do {
            System.out.print("> ");
            partyList.add(keyboard.next());
            // Remove blacksheep
            
            /*
            if (keyboard.next() == "Adam") {
                partyList.remove(blackSheep);
            }
            */
        } while(!partyList.get(partyList.size()-1).equalsIgnoreCase(blackSheep));
        keyboard.close();
        // Sort the list

        Collections.sort(partyList);
        //String name = "yeet";
        //name = keyboard.nextLine();
        // Check for black sheep
        // Grrrr.berate
        // Print list in abc order
        /*
        partyList.add("");
        partyList.add("");
        partyList.add(name);
        */
        // Print the stuff
        System.out.println("No '" + blackSheep + "' Here is who you invited before you messed up:");
        System.out.println(partyList);

        // The blacklist
        ArrayList<String> blackList = new ArrayList<String>();
        blackList.add("Temp");
        blackList.add("Mada");
        blackList.add("Derik");
        blackList.add("Jesus");
        blackList.add("Ashley");
        blackList.add("Omar");
        blackList.add("Adam");
        partyList.removeAll(blackList);
        System.out.println("Here is what is after filtering your list:\n" + partyList);
    }
}
