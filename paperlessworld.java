
    import java.io.*;
import java.util.*;

public class PaperlessWorld {

    private static Map<String, String> documentStorage = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("---- Paperless World ----");
            System.out.println("1. Upload Document");
            System.out.println("2. Retrieve Document");
            System.out.println("3. List All Documents");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    uploadDocument(scanner);
                    break;
                case 2:
                    retrieveDocument(scanner);
                    break;
                case 3:
                    listDocuments();
                    break;
                case 4:
                    System.out.println("Exiting Paperless World...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    // Upload document (simulated by storing the file name and path in memory)
    private static void uploadDocument(Scanner scanner) {
        System.out.print("Enter document name: ");
        String docName = scanner.nextLine();
        System.out.print("Enter document path: ");
        String docPath = scanner.nextLine();

        documentStorage.put(docName, docPath);
        System.out.println("Document uploaded successfully!");
    }

    // Retrieve document (simulated by checking if the document exists in storage)
    private static void retrieveDocument(Scanner scanner) {
        System.out.print("Enter document name to retrieve: ");
        String docName = scanner.nextLine();

        if (documentStorage.containsKey(docName)) {
            System.out.println("Document found! Path: " + documentStorage.get(docName));
        } else {
            System.out.println("Document not found!");
        }
    }

    // List all stored documents
    private static void listDocuments() {
        if (documentStorage.isEmpty()) {
            System.out.println("No documents stored.");
        } else {
            System.out.println("List of stored documents:");
            for (Map.Entry<String, String> entry : documentStorage.entrySet()) {
                System.out.println("Document Name: " + entry.getKey() + ", Path: " + entry.getValue());
            }
        }
    }
}


