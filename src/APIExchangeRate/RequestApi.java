package APIExchangeRate;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RequestApi {
    String endereco = "https://v6.exchangerate-api.com/v6/" + ExchangeRateApi.getMyapikey() + "/pair/" + inputCurrency + "/"+ outputCurrency +"/" + currency;

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(endereco))
            .build();
    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());

    String json = response.body();
        System.out.println(json);
        
    }


}
