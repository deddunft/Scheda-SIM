import java.util.Arrays;
import java.util.Scanner;

public class Sim {
    private operatore operatore;
    private static int Pref ;
    private static int numP ;
    private € credito;
    public int prefC;
    public int numC;
    private int count;
    public int[] chiamateEff = new int[count+2];
    public double contaS;
    public double Minchiamata;
    public boolean attStacc;




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




    public void Chiamata(int prefC, int numC){
        this.prefC=prefC;
        this.numC=numC;

        for (int i = count; i < count+1; i++) {
            chiamateEff[i] = prefC;
            chiamateEff[i+1] = numC;
        }
        attStacc=false;
        for (double j = 0.0;attStacc==true; j++)
            contaS=j;

        while (true){

            System.out.println("Premi 5 per chiudere la chiamata");
            int t = 0;



            Scanner inn = new Scanner(System.in);
            t = inn.nextInt();
            if (t==5){
                count++;
                attStacc=true;
                break;
            }
        }

    }


    public String registoChiamate() {
        return "Hai chiamato questi numeri: "+Arrays.toString(chiamateEff)+" Totale min chiamate: "+contaS/60;

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
