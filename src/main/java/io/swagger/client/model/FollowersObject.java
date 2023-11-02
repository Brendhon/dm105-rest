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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * FollowersObject
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-11-02T18:14:56.554260212Z[GMT]")

public class FollowersObject {
  @SerializedName("href")
  private String href = null;

  @SerializedName("total")
  private Integer total = null;

  public FollowersObject href(String href) {
    this.href = href;
    return this;
  }

   /**
   * This will always be set to null, as the Web API does not support it at the moment. 
   * @return href
  **/
  @Schema(description = "This will always be set to null, as the Web API does not support it at the moment. ")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public FollowersObject total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * The total number of followers. 
   * @return total
  **/
  @Schema(description = "The total number of followers. ")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FollowersObject followersObject = (FollowersObject) o;
    return Objects.equals(this.href, followersObject.href) &&
        Objects.equals(this.total, followersObject.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FollowersObject {\n");
    
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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