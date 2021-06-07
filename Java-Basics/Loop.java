class Loop { // Loops in Java
    public static void main(String[] args){
        for(int i = 0; i<10; i++){ // example of for loop
            System.out.println("Snehomoy");
        }


        int i = 0;
        while (i < 10) { // example of while loop
            System.out.println("Snehomoy");
            i = i + 2;
        }
    }
}



class InfiniteLoop {
    public static void main(String[] args) {

        for(;true;){ // example of infinite loop using for
            System.out.println("Maitra");
        }

        int j = 1; // example of infinite loop using while
        while (j < 15) {
            System.out.println("Hello");
            // reinitialisation part is missing
        }
    }
}