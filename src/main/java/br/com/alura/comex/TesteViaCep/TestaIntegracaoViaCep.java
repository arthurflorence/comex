package br.com.alura.comex.TesteViaCep;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class TestaIntegracaoViaCep {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu Cep: ");
        String Cep = scanner.nextLine();

        String url = "https://viacep.com.br/ws/" + Cep + "/json/";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {

                System.out.println("Dados recebidos:");
                System.out.println(response.body());
            } else {
                System.out.println("Erro na requisição. Código: " + response.statusCode());
            }

        } catch (Exception e) {
            System.out.println("Erro na integração com o ViaCEP: " + e.getMessage());
        }
    }
}