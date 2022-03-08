import java.util.Scanner;

public class Sim {
    private final int Pref = 349;
    private final int numP = 5793081;
    private € credito;
    public int prefC;
    public int numC;
    public int[] chiamateEff = new int[100];
    private int count;


    public Sim(€ credito, int prefC, int numC) {
        this.credito = credito;
        this.prefC = prefC;
        this.numC = numC;
    }


    public int getPref() {
        return Pref;
    }

    public int getNumP() {
        return numP;
    }

    public € getCredito() {
        return credito;
    }

    public void setCredito(€ credito) {
        this.credito = credito;
    }

    public int getPrefC() {
        return prefC;
    }

    public void setPrefC(int prefC) {
        this.prefC = prefC;
    }

    public int getNumC() {
        return numC;
    }

    public void setNumC(int numC) {
        this.numC = numC;
    }

    public void Chiamata(int prefC, int numC){
        this.prefC=prefC;
        this.numC=numC;

        for (int i = count; i < count+2; i++) {
            chiamateEff[i] = prefC;
            chiamateEff[i+1] = numC;

        }

        while (true){
            System.out.println("Premi 5 per chiudere la chiamata");
            Scanner inn = new Scanner(System.in);
            int t = inn.nextInt();
            if (t==5){
                count++;
                break;
            }
        }
    }




}
