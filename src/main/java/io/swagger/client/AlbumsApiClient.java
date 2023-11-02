package io.swagger.client;

import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AlbumsApi;
import java.io.FileWriter;
import java.io.IOException;

public class AlbumsApiClient {
  public static void main(String[] args) {
    // Init client
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    // Configure OAuth2 access token for authorization: oauth_2_0
    OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");

    // In a real app, you would have a more secure way than hardcoding the access token here
    String accessToken = "BQA95purUjP-JlkeHjoS-8XzyUt6phsIACYrYOoW5G8MvRdEfKH8jFrpF1TnRB4RBW3zISKYbyDSfjaaV6TkI-Cz-enzmYzu81R3X0ynrYCJlVgwIRE";

    // Set access token
    oauth_2_0.setAccessToken(accessToken);

    // Init album API
    AlbumsApi apiInstance = new AlbumsApi();

    // The country: an ISO 3166-1 alpha-2 country code. Default: US. Note: If a country code is specified, only artists, albums, and tracks with content that is playable in that market is returned. For example:
    String country = "BR";

    // The maximum number of results to return. Default: 20. Minimum: 1. Maximum: 50.
    Integer limit = 20; // Integer
    Integer offset = 5; // Integer

    // Get new releases
    try {
      // Make API call
      InlineResponse20010 result = apiInstance.getNewReleases(country, limit, offset);

      System.out.println("Resultado gravado em " + result.getAlbums());

      // Write JSON string to a file
      writeToFile("RESULTADO_ALBUNS.txt", result.toString());
    } catch (ApiException e) {

      // Handle error
      System.err.println("Exception when calling AlbumsApi#getNewReleases");
      e.printStackTrace();
    }
  }

  /**
   * Write JSON string to a file
   * @param fileName
   * @param content
   */
  private static void writeToFile(String fileName, String content) {
    try {
      // Initialize file writer
      FileWriter fileWriter = new FileWriter(fileName);

      // Write JSON string to file
      fileWriter.write(content);

      // Close file writer
      fileWriter.close();

      // Print success message
      System.out.println("Resultado gravado em " + fileName);
    } catch (IOException e) {

      // Handle error
      System.err.println("Erro ao escrever no arquivo " + fileName);
      e.printStackTrace();
    }
  }
}
