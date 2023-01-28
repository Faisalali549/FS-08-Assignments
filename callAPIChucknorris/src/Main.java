import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws Exception {
        String url = "https://api.chucknorris.io/";

//        Build a request

        HttpRequest httpRequest = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();

//      getting http client object

        HttpClient httpClient = HttpClient.newBuilder().build();

//      getting response

        HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

//      status code and body

        System.out.println(httpResponse.statusCode());
        System.out.println(httpResponse.body());
    }
}