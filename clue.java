import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        // Write your code here 💖
        String[] password={"ASDFDFA","34958234985234820934","243082304920394","ASDFAFMMMMMMMMM99999999","12212112","23094230482"};
        Arrays.sort(password);
        String passphrase="";
        String[] sortedPasswords=new String[3];
        for(int i=0;i<=2;i++){
            sortedPasswords[i]=password[i];
            passphrase +=sortedPasswords[i];
        }
        System.out.println(passphrase);
    }
}
