class Pattern{
    
    public static void main(String arr[]){

        // Pattern 1
        for(int i = 0; i < 4; i++){

            for(int j = 0; j < 4; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // ---------------------------------

        // Pattern 2
        for(int i = 0; i < 5; i++){

            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // ---------------------------------

        // Pattern 3
        for(int i = 1; i <= 5; i++){

            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        // ---------------------------------

        // Pattern 4
        for(int i = 1; i <= 5; i++){
            
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }

        // ---------------------------------

        // Pattern 5
        for(int i = 0; i < 5; i++){

            for(int j = 0; j < (5 - i); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // ----------------------------------

        // Pattern 6
        for(int i = 0; i < 5; i++){

            for(int j = 1; j <= (5 - i); j++){
                System.out.print(j);
            }
            System.out.println();
        }

        // ---------------------------------

        // Pattern 7
        for(int i = 0; i < 5; i++){

            // space
            for(int j = 0; j < (5 - i - 1); j++){
                System.out.print(" ");
            }

            // star
            for(int j = 0; j < (2*i + 1); j++){
                System.out.print("*");
            }

            // space
            for(int j = 0; j < (5 - i - 1); j++){
                System.out.print(" ");
            }
            System.out.println();


        }

        // -------------------------------------------

        // Pattern 8
        for(int i = 0; i < 5; i++){

            // space
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }

            // star
            for(int j = 0; j < (2*5 - 2*i - 1); j++){
                System.out.print("*");
            }

            // space
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }

        // --------------------------------------------

        // Pattern 9
        // (pattern 7 + pattern 8) Code

        // --------------------------------------------

        // Pattern 10
        int val = 0;
        for(int i = 0; i < (2*5 - 1); i++){
            
            if(i < 5){
                val++;
            }
            else{
                val--;
            }

            for(int j = 0; j < val; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // ---------------------------------------------

        // Pattern 11
        int val2 = 0;
        for(int i = 0; i < 5; i++){

            if(i % 2 == 0){
                val2 = 1;
            }
            else{
                val2 = 0;
            }

            for(int j = 0; j <= i; j++){
                System.out.print(val2);
                val2 = 1 - val2;
            }
            System.out.println();
        }

    }
}