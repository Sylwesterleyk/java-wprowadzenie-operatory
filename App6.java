class App6 {
    public static void main(String args[]){
        int x = -676;
        int y = 676;
        int z = -676;

       int isSmaller = (x<0)? z:y;

        System.out.println("Jeśli liczba x wynosi |"+x+"|,to jej liczbą bezwzględną jest "+isSmaller);

    }
}