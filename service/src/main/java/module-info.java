import org.example.currency.CurrencyConverter;
import org.example.service.EuroToSek;
import org.example.service.SekToEuro;

module org.example.service{
    requires org.example.api;
    provides CurrencyConverter with SekToEuro, EuroToSek;
}