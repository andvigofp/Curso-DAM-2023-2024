import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.HashMap;

public class Hilo1 extends Thread{

    String color;

    //ArrayList<Integer> temperatures = new ArrayList<>();
    //ArrayList<Integer> humidities = new ArrayList<>();
    //HashMap<String, Integer> colors = new HashMap<>();

    //EJEMPLOS DE COMO ACCEDER A LA API

    //Enviar una petición POST
    //postAPI("localhost", "1880", "color", "orange");

    //Realizar una petición GET y mostrarla por pantalla


    public void run(){
        while(true){
            try {
                color =getAPI("localhost", "1880", "color");
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (URISyntaxException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public String getColor(){
        return color;
    }

    public String getAPI(String ip, String port, String path) throws URISyntaxException, IOException, InterruptedException {
        URI targetURI = new URI("http://" + ip + ":" + port + "/" + path);
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(targetURI).GET().build();
        //HttpClient httpClient = HttpClient.newHttpClient();
        HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .build();
        HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
    public String postAPI(String ip, String port, String path, String message) throws URISyntaxException, IOException, InterruptedException {
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create("http://" + ip + ":" + port +"/" + path))
                .POST(HttpRequest.BodyPublishers.ofString(message))
                .build();
        HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .build();
        HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}
