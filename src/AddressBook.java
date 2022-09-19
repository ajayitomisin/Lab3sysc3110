import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo newBuddy){
        buddies.add(newBuddy);
    }

    public void removeBuddy(BuddyInfo newBuddy){
        buddies.remove(newBuddy);
    }

    public static void main(String[] args){
        System.out.println("AddressBook");
    }
}
