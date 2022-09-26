public class BuddyInfo {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        BuddyInfo buddy = new BuddyInfo();
        String name = buddy.getName();
        System.out.println("Hello " + name +  "!");
    }

    public String getName() {
        return name;
    }


    private String name;

    private String address;

    private String phoneNumber;

    public BuddyInfo(String name,String address, String phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public BuddyInfo(){
        name = "Eno";
        address = "Envie";
        phoneNumber = "6132334457";
    }
}
