/*
 * Spotify Web API with fixes and improvements from sonallux
 * You can use Spotify's Web API to discover music and podcasts, manage your Spotify library, control audio playback, and much more. Browse our available Web API endpoints using the sidebar at left, or via the navigation bar on top of this page on smaller screens.  In order to make successful Web API requests your app will need a valid access token. One can be obtained through <a href=\"https://developer.spotify.com/documentation/general/guides/authorization-guide/\">OAuth 2.0</a>.  The base URI for all Web API requests is `https://api.spotify.com/v1`.  Need help? See our <a href=\"https://developer.spotify.com/documentation/web-api/guides/\">Web API guides</a> for more information, or visit the <a href=\"https://community.spotify.com/t5/Spotify-for-Developers/bd-p/Spotify_Developer\">Spotify for Developers community forum</a> to ask questions and connect with other developers. 
 *
 * OpenAPI spec version: 2023.8.30
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.AlbumBase;
import io.swagger.client.model.ImageObject;
import io.swagger.client.model.SimplifiedArtistObject;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * SimplifiedAlbumObject
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-11-02T18:14:56.554260212Z[GMT]")

public class SimplifiedAlbumObject extends AlbumBase {
  @SerializedName("artists")
  private List<SimplifiedArtistObject> artists = new ArrayList<SimplifiedArtistObject>();

  public SimplifiedAlbumObject artists(List<SimplifiedArtistObject> artists) {
    this.artists = artists;
    return this;
  }

  public SimplifiedAlbumObject addArtistsItem(SimplifiedArtistObject artistsItem) {
    this.artists.add(artistsItem);
    return this;
  }

   /**
   * The artists of the album. Each artist object includes a link in &#x60;href&#x60; to more detailed information about the artist. 
   * @return artists
  **/
  @Schema(required = true, description = "The artists of the album. Each artist object includes a link in `href` to more detailed information about the artist. ")
  public List<SimplifiedArtistObject> getArtists() {
    return artists;
  }

  public void setArtists(List<SimplifiedArtistObject> artists) {
    this.artists = artists;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimplifiedAlbumObject simplifiedAlbumObject = (SimplifiedAlbumObject) o;
    return Objects.equals(this.artists, simplifiedAlbumObject.artists) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artists, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimplifiedAlbumObject {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    artists: ").append(toIndentedString(artists)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}