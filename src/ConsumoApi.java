import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.swing.Spring;

public class ConsumoApi {
    
    public static String buscarVeiculo(String marcas){
        String car = "https://parallelum.com.br/fipe/api/v1/carros/" + marcas;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(car)).build();
        HttpResponse <String> response;

        
        
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return "";

        

    }

    public static String buscarModelo(String modelos) {
        String marc = "https://parallelum.com.br/fipe/api/v1/carros/marcas/" + modelos +"/modelos";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(marc)).build();
        HttpResponse <String> response;

        
        
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return "";      


        
    }

    public static String buscarAno(String modelos, String ano) {
        String consultaAno = "https://parallelum.com.br/fipe/api/v1/carros/marcas/"+ modelos +"/modelos/" + ano +"/anos";
          HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(consultaAno)).build();
        HttpResponse <String> response;

        
        
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        return "";
    }

    public static String buscarCodModel(String modelos, String ano, String codigo, String codModel) {
        String consultaCodModel = "https://parallelum.com.br/fipe/api/v1/carros/marcas/" + modelos +"/modelos/" + ano +"/anos/" + codModel;

 HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(consultaCodModel)).build();
        HttpResponse <String> response;

        
        
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
            
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        return null ;

       
    }

    
}
