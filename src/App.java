import java.lang.reflect.Executable;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Program be fog kérni egy összeget, majd megkérdezni mennyi napra szeretnénk azt beszotani
        //Ezen belül, azt is kérdezni fogja mennyit szeretnénk elrakni ebből, és azt le fogja vonni a teljes összegből.
        //Megkérdezi azt is, mennyi hónapon keresztül fogjuk elrakni ezt a pénzt.
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Adj meg egy összeget: ");
            int moneyOverall = scanner.nextInt();
            System.out.println("Mennyit szeretnél ebből elrakni?: ");
            int savedMoney = scanner.nextInt();
            int moneyCutted = moneyOverall - savedMoney;
            System.out.println("Mennyi napra szeretnéd beosztani? "+moneyCutted+" Forintot: ");
            int numberOfDays = scanner.nextInt();
            System.out.println("Mennyi hónapig fogsz ennyi pénzt elrakni? ");
            int numberOfMonths = scanner.nextInt();
            int calculationResult = moneyCutted / numberOfDays;
            System.out.println("Ha ennyi napra osztod be a pénzed: "+numberOfDays);
            System.out.println("Akkor egy napra ennyi forint jut: "+calculationResult+"Ft");
            System.out.println("Emellet ennyi pénzt raksz el: "+ savedMoney * numberOfMonths+"Ft "+numberOfMonths+" hónap alatt.");

        }
        catch(Exception exception){
            System.out.println("Helytelen bevitel!");
        }
    }
}
