import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

public class Hilo5 extends Thread {

        ArrayList<Integer> temperatures = new ArrayList<>();


        int temperaturaMinima;


        public void run() {
            while (true) {
                try {
                    temperaturaMinima = Integer.valueOf(getAPI("192.168.4.31", "1880", "temperature"));
                    temperatures.add(temperaturaMinima);

                    for (int i=1; i<temperatures.size(); i++) {
                        temperatures.get(i);

                        if (temperaturaMinima<i) {
                            i=temperaturaMinima;
                        }


                    }

                    System.out.println(temperaturaMinima);

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

        public int getTemperaturaMinima() {
            return temperaturaMinima;
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
    }

