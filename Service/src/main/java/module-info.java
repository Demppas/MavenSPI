import org.example.currency.CurrencyConverter;
import org.example.service.EuroToSek;
import org.example.service.SekToEuro;

module org.example.Service{
    requires org.example.Interface;
    provides CurrencyConverter with SekToEuro, EuroToSek;
}