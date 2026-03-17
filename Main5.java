public class Main5 {


    static char[][] getO() {
        char[][] O = {
                {' ', '*', '*', '*', ' '},
                {'*', ' ', ' ', ' ', '*'},
                {'*', ' ', ' ', ' ', '*'},
                {'*', ' ', ' ', ' ', '*'},
                {' ', '*', '*', '*', ' '}
        };
        return O;
    }

    
    static char[][] getP() {
        char[][] P = {
                {'*', '*', '*', ' ', ' '},
                {'*', ' ', ' ', '*', ' '},
                {'*', '*', '*', ' ', ' '},
                {'*', ' ', ' ', ' ', ' '},
                {'*', ' ', ' ', ' ', ' '}
        };
        return P;
    }

    
    static char[][] getS() {
        char[][] S = {
                {' ', '*', '*', '*', ' '},
                {'*', ' ', ' ', ' ', ' '},
                {' ', '*', '*', '*', ' '},
                {' ', ' ', ' ', ' ', '*'},
                {' ', '*', '*', '*', ' '}
        };
        return S;
    }

    public static void main(String[] args) {

        
        char[][] O = getO();
        
        char[][] P = getP();
        char[][] S = getS();

        
        char[][][] banner = {O, O, P, S};

        
        for (int row = 0; row < 5; row++) {

            for (int letter = 0; letter < banner.length; letter++) {

                for (int col = 0; col < 5; col++) {
                    System.out.print(banner[letter][row][col]);
                }

                System.out.print("  "); 
            }

            System.out.println();
        }
    }
}
    

