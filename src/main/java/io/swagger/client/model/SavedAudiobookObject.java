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
import org.threeten.bp.OffsetDateTime;
/**
 * SavedAudiobookObject
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-11-02T18:14:56.554260212Z[GMT]")

public class SavedAudiobookObject {
  @SerializedName("added_at")
  private OffsetDateTime addedAt = null;

  @SerializedName("audiobook")
  private AllOfSavedAudiobookObjectAudiobook audiobook = null;

  public SavedAudiobookObject addedAt(OffsetDateTime addedAt) {
    this.addedAt = addedAt;
    return this;
  }

   /**
   * The date and time the audiobook was saved Timestamps are returned in ISO 8601 format as Coordinated Universal Time (UTC) with a zero offset: YYYY-MM-DDTHH:MM:SSZ. If the time is imprecise (for example, the date/time of an album release), an additional field indicates the precision; see for example, release_date in an album object. 
   * @return addedAt
  **/
  @Schema(description = "The date and time the audiobook was saved Timestamps are returned in ISO 8601 format as Coordinated Universal Time (UTC) with a zero offset: YYYY-MM-DDTHH:MM:SSZ. If the time is imprecise (for example, the date/time of an album release), an additional field indicates the precision; see for example, release_date in an album object. ")
  public OffsetDateTime getAddedAt() {
    return addedAt;
  }

  public void setAddedAt(OffsetDateTime addedAt) {
    this.addedAt = addedAt;
  }

  public SavedAudiobookObject audiobook(AllOfSavedAudiobookObjectAudiobook audiobook) {
    this.audiobook = audiobook;
    return this;
  }

   /**
   * Information about the audiobook.
   * @return audiobook
  **/
  @Schema(description = "Information about the audiobook.")
  public AllOfSavedAudiobookObjectAudiobook getAudiobook() {
    return audiobook;
  }

  public void setAudiobook(AllOfSavedAudiobookObjectAudiobook audiobook) {
    this.audiobook = audiobook;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavedAudiobookObject savedAudiobookObject = (SavedAudiobookObject) o;
    return Objects.equals(this.addedAt, savedAudiobookObject.addedAt) &&
        Objects.equals(this.audiobook, savedAudiobookObject.audiobook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addedAt, audiobook);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavedAudiobookObject {\n");
    
    sb.append("    addedAt: ").append(toIndentedString(addedAt)).append("\n");
    sb.append("    audiobook: ").append(toIndentedString(audiobook)).append("\n");
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
