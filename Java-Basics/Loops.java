class Loops { // Loops in Java
    public static void main(String[] args){
        
        for(int i = 0; i<10; i++){ // example of for loop
            System.out.println("Snehomoy");
        }


        int i = 0;
        while (i < 10) { // example of while loop
            System.out.println("Snehomoy");
            i = i + 2;
        }
        
        int j = 0;
        do{ // example of do-while loop

            // this do block runs at least once, even if the condition inside of the while block is false
            System.out.println("SNEHOMOY MAITRA");
            j++;
        } while(j < 10);
    }
}



class InfiniteLoops {
    public static void main(String[] args) {

        for(;true;){ // example of infinite loop using for
            System.out.println("Maitra");
        }

        int j = 1; // example of infinite loop using while
        while (j < 15) {
            System.out.println("Hello");
            // reinitialisation part is missing
        }

        int k = 0;
        do{ // example of do-while loop

            // this do block runs at least once, even if the condition inside of the while block is false
            System.out.println("SNEHOMOY MAITRA");
            // reinitialisatio part is missing
        } while(k < 10);

    }
}