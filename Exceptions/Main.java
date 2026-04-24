
public class Main {
    public static void main(String[] args) {
        int[] x=new int[3]
        x[0]=17;
        x[1]=123;
        x[2]=42;

        try {
            System.out.println(x[2]);
            System.out.println(x[3]);
            System.out.println(x[0]);
            int[] v=new int[-5]
        }
        catch(NegativeArraySizeException f){
            System.out.println("Fehler: Arraygröße darf niemals Negativ sein. ");
            f.printStackTrace();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Indexfehler");
            e.printStackTrace();
        }

        
    }
}