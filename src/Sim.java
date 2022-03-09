import java.util.Arrays;
import java.util.Scanner;

public class Sim {
    private operatore operatore;

    private static long numP ;
    private € credito;
    public int prefC;
    public long numC;
    private static int count;
    public long[] chiamateEff = new long[10];

    public double contaS;
    public double Minchiamata;
    public boolean attStacc;


    public Sim(€ credito,long numP, operatore operatore) {
        this.credito = credito;

        this.numP= numP;
        this.operatore=operatore;

    }




    public € getCredito() {
        return credito;
    }

    public void setCredito(€ credito) {
        this.credito = credito;
    }


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void Chiamata(long numC){

        this.numC=numC;


            chiamateEff[getCount()]=numC;


        attStacc=false;
        for (int j = 0;attStacc==true; j++)
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
