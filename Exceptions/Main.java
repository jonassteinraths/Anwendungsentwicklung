
public class Main {
    public static void main(String[] args) {

        try {
            int[] a = new int[5];
            a[2] = 10;

            //fehler einbauen
            int[] b = new int[-5];

        }
        catch(NegativeArraySizeException e){
            System.out.println("Fehler: Arraygröße darf niemals Negativ sein. ")
        }
        finally {
            
        }
    }
}