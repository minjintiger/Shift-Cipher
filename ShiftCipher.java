import java.util.Scanner;
//This code will do Shift Cipher encryption and decryption
//It will take a string and a key as input and return the encrypted or decrypted string
//The key should be an integer between 0 and 25
//The string should be a string of alphabets
//The code will ignore any non-alphabetic characters in the string
//The code will ignore the case of the alphabets
//The code will return the encrypted or decrypted string in uppercase
//The code will return an error message if the key is not between 0 and 25
//The code will return an error message if the string is empty
//The code will return an error message if the string contains non-alphabetic characters
public class ShiftCipher {
    public static void main(String[] args){
        // Create a Scanner object to read input.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Shift Cipher");

        while(true) {
            int result = 0;
            System.out.println("Would you like to encrypt(1) or decrypt(2)? Enter 1 or 2");
            int choice = scanner.nextInt();
            if(choice == 1){
                result = encryption();
            }
            else if(choice == 2){
                result = decryption();
            }
            else {
                System.out.println("Invalid choice");
            }
            if(result == 1){
                break;
            }

        }

        scanner.close();
    }
    //This function will take a string and a key as input and return the encrypted string
    //if it is able to encrypt the string, return 1
    //if it is not able to encrypt the string, return 0
    private static int encryption(){
        Scanner input_Scanner = new Scanner(System.in);
        System.out.println("Enter the string to encrypt: ");
        String input_String = input_Scanner.nextLine();
        System.out.println("Enter the key: ");
        int key = input_Scanner.nextInt();
        if(key < 0 || key > 25){
            System.out.println("Invalid key");
            input_Scanner.close();
            return 0;
        }
        if(input_String.length() == 0 || !input_String.matches("[a-zA-Z]+")){
            System.out.println("Invalid string");
            input_Scanner.close();
            return 0;
        }
        input_String = input_String.toUpperCase();
        String encrypted_String = "";
        for(int i = 0; i < input_String.length(); i++){
            char c = input_String.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                c = (char)(c + key);
                if(c > 'Z'){
                    c = (char)(c - 'Z' + 'A' - 1);
                }
                encrypted_String += c;
            }
            else {
                encrypted_String += c;
            }
        }

        System.out.println("Original string: " + input_String);
        System.out.println("Key: " + key);
        System.out.println("Encrypted string: " + encrypted_String);
        input_Scanner.close();

        return 1;
    }
    //This function will take a string and a key as input and return the decrypted string
    //if it is able to decrypt the string, return 1
    //if it is not able to decrypt the string, return 0
    private static int decryption(){
        Scanner input_Scanner = new Scanner(System.in);
        System.out.println("Enter the string to decrypt: ");
        String input_String = input_Scanner.nextLine();
        System.out.println("Enter the key: ");
        int key = input_Scanner.nextInt();
        if(key < 0 || key > 25){
            System.out.println("Invalid key");
            input_Scanner.close();
            return 0;
        }
        if(input_String.length() == 0 || !input_String.matches("[a-zA-Z]+")){
            System.out.println("Invalid string");
            input_Scanner.close();
            return 0;
        }
        input_String = input_String.toUpperCase();
        String decrypted_String = "";
        for(int i = 0; i < input_String.length(); i++){
            char c = input_String.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                c = (char)(c - key);
                if(c < 'A'){
                    c = (char)(c + 'Z' - 'A' + 1);
                }
                decrypted_String += c;
            }
            else {
                decrypted_String += c;
            }
        }

        System.out.println("Original string: " + input_String);
        System.out.println("Key: " + key);
        System.out.println("Decrypted string: " + decrypted_String);
        input_Scanner.close();
        return 1;
    }
}