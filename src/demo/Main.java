package demo;

import java.util.Scanner;

public class Main {
    Scanner in = new Scanner(System.in);

    public String inputtextforencryption() {
        System.out.println("Enter a text you want to encrypt ");
        String tekst = in.nextLine();
        return tekst;
    }

    public int inputshiftvalue() {
        System.out.println("Enter a shift value");
        int shiftværdi = in.nextInt();
        return shiftværdi;
    }

    /*public String inputTextForDecryption() {
        System.out.println("Enter a text you want to decrypt ");
        String tekst1 = in.nextLine();
        return tekst1;
    }

    public int inputShiftValueForDecryption() {
        System.out.println("Enter a shift value for the decryption");
        int shiftværdi1 = in.nextInt();
        return shiftværdi1;
    }

     */

    public void enkrypt(String tekst, int shiftValue) {
        char[] chars = tekst.toCharArray();
        for (char encryptedText : chars) {
            if (shiftValue == 1) {
                encryptedText += 1;
                System.out.print(encryptedText);
            } else if (shiftValue == 2) {
                encryptedText += 2;
                System.out.print(encryptedText);
            } else if (shiftValue == 3) {
                encryptedText += 3;
                System.out.print(encryptedText);
            } else if (shiftValue == 4) {
                encryptedText += 4;
                System.out.print(encryptedText);
            } else if (shiftValue == 5) {
                encryptedText += 5;
                System.out.print(encryptedText);
            } else if (shiftValue == 6) {
                encryptedText += 6;
                System.out.print(encryptedText);
            }

        }
    }

    public void encryptOrDecrypt() {
        System.out.println("Do you want to encrypt a text or decrypt a text ?");
        System.out.println("type \"encrypt\" to encrypt a tekst or type \"decrypt\" to decrypt a tekst: ");
        String encryptOrDecrypt = in.nextLine();
        if (encryptOrDecrypt.equals("encrypt")) {
            encryptText();
        } else if (encryptOrDecrypt.equals("decrypt")) {
            decrypt1();

        }
    }

    public void decrypt1 () {
        System.out.println("Enter a text you want to decrypt ");
        String tekst1 = in.nextLine();


        System.out.println("Enter a shift value for the decryption");
        int shiftValue = in.nextInt();

        char[] chars = tekst1.toCharArray();
        for (char encryptedText : chars) {
            if (shiftValue == 1) {
                encryptedText -= 1;
                System.out.print(encryptedText);
            } else if (shiftValue == 2) {
                encryptedText -= 2;
                System.out.print(encryptedText);
            } else if (shiftValue == 3) {
                encryptedText -= 3;
                System.out.print(encryptedText);
            } else if (shiftValue == 4) {
                encryptedText -= 4;
                System.out.print(encryptedText);
            } else if (shiftValue == 5) {
                encryptedText -= 5;
                System.out.print(encryptedText);
            } else if (shiftValue == 6) {
                encryptedText -= 6;
                System.out.print(encryptedText);
            }

        }
    }

    public void encryptText(){
        String text = inputtextforencryption();
        int shiftvalue = inputshiftvalue();
        enkrypt(text, shiftvalue);
    }

    public void go() {
        encryptOrDecrypt();
    }


    public static void main(String[] args) {
        new Main().go();
    }
}
