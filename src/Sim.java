import java.util.Arrays;
import java.util.Scanner;

public class Sim {
    private operatore operatore;
    private static int Pref ;
    private static int numP ;
    private € credito;
    public int prefC;
    public int numC;
    public int[] chiamateEff = new int[100];
    private int count;
    public int contaS;
    public double Minchiamata = contaS/60;




    public Sim(€ credito,int Prefisso,int numP, operatore operatore) {
        this.credito = credito;
        this.Pref=Prefisso;
        this.numP=numP;
        this.operatore=operatore;

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
            int t = 0;
            if (t==0){
                contaS++;
            }
            Scanner inn = new Scanner(System.in);
            t = inn.nextInt();
            if (t==5){
                count++;
                break;
            }
        }
    }

    public String registoChiamate() {
        return "Hai chiamato questi numeri: "+Arrays.toString(chiamateEff)+" Totale min chiamate: "+Minchiamata;

    }


    @Override
    public String toString() {
        return "Sim{" +
                "operatore=" + operatore +
                ", credito=" + credito +
                ", prefC=" + prefC +
                ", numC=" + numC +
                ", chiamateEff=" + Arrays.toString(chiamateEff) +
                ", count=" + count +
                ", contaS=" + contaS +
                ", Minchiamata=" + Minchiamata +
                '}';
    }
}
