import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContactManager {
    private Set<Contact> contactsSet;
    private Map<String, Contact> contactsMap;

    public ContactManager() {
        contactsSet = new HashSet<>();
        contactsMap = new HashMap<>();
    }

    public void addContact(Contact contact) {
        if (contactsSet.add(contact)) {
            contactsMap.put(contact.getName(), contact);
        } else {
            System.out.println("Contact with this name already exists: " + contact.getName());
        }
    }

    public void removeContact(String name) {
        Contact contact = contactsMap.remove(name);
        if (contact != null) {
            contactsSet.remove(contact);
        } else {
            System.out.println("No contact found with the name: " + name);
        }
    }

    public Contact getContact(String name) {
        return contactsMap.get(name);
    }

    public void listContacts() {
        for (Contact contact : contactsSet) {
            System.out.println(contact);
        }
    }
}
