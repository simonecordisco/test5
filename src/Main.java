//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//aggiungi un anno
//sottrai un mese
//aggiungi 7 giorni
//Stampa il risultato localizzata per l'Italia
//Crea dei test per questo esercizio
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println(data);
        System.out.println(giorni(data));
        System.out.println(mesi(data));
        System.out.println(anno(data));
        }
    public static String giorni (OffsetDateTime data){

        return String.valueOf(data.plusDays(7));
    }
    public static String mesi(OffsetDateTime data){

        return String.valueOf(data.minusMonths(1));

    }
    public static String anno(OffsetDateTime data){

        return String.valueOf(data.plusYears(1));

    }
}