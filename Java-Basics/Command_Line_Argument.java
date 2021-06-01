public class Command_Line_Argument {
    public static void main(String[] args){
        if(args.length > 0){
            System.out.println("Arguments are there."); 
        } else {
            System.out.println("No arguments are there");
        }
    }
}