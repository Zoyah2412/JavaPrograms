import java.util.*;
class BlankCharacterException extends Exception {
    public BlankCharacterException(String s) {
        super(s);
    }
}
class sessionalq2{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        try{
            System.out.println("Enter a character :");
            String s=sc.nextLine();
            char c=s.charAt(0);
            if(c==' '){
                sc.close();
                throw new BlankCharacterException("Blank Character entered");
            }
            else{
                if(Character.isLowerCase(c))
                    s=s.toUpperCase();
                else if(Character.isUpperCase(c))
                    s=s.toLowerCase();
                System.out.println(s.charAt(0));
            }
        }
        catch(BlankCharacterException e){
            System.out.println(e.getMessage());
        }
    }
}