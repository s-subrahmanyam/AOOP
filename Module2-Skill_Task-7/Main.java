public class Main {
    public static void main(String[] args) {
        ContactManager manager = new ContactManager();

        // Adding contacts
        manager.addContact(new Contact("Alice", "123-456-7890", "alice@example.com"));
        manager.addContact(new Contact("Bob", "987-654-3210", "bob@example.com"));
        manager.addContact(new Contact("Charlie", "555-555-5555", "charlie@example.com"));

        // Listing all contacts
        System.out.println("All Contacts:");
        manager.listContacts();

        // Retrieving a contact
        System.out.println("\nRetrieving contact Bob:");
        System.out.println(manager.getContact("Bob"));

        // Removing a contact
        manager.removeContact("Alice");
        System.out.println("\nAll Contacts after removing Alice:");
        manager.listContacts();
    }
}
