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
import java.util.ArrayList;
import java.util.List;
/**
 * QueueObject
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-11-02T18:14:56.554260212Z[GMT]")

public class QueueObject {
  @SerializedName("currently_playing")
  private OneOfQueueObjectCurrentlyPlaying currentlyPlaying = null;

  @SerializedName("queue")
  private List<OneOfQueueObjectQueueItems> queue = null;

  public QueueObject currentlyPlaying(OneOfQueueObjectCurrentlyPlaying currentlyPlaying) {
    this.currentlyPlaying = currentlyPlaying;
    return this;
  }

   /**
   * The currently playing track or episode. Can be &#x60;null&#x60;.
   * @return currentlyPlaying
  **/
  @Schema(description = "The currently playing track or episode. Can be `null`.")
  public OneOfQueueObjectCurrentlyPlaying getCurrentlyPlaying() {
    return currentlyPlaying;
  }

  public void setCurrentlyPlaying(OneOfQueueObjectCurrentlyPlaying currentlyPlaying) {
    this.currentlyPlaying = currentlyPlaying;
  }

  public QueueObject queue(List<OneOfQueueObjectQueueItems> queue) {
    this.queue = queue;
    return this;
  }

  public QueueObject addQueueItem(OneOfQueueObjectQueueItems queueItem) {
    if (this.queue == null) {
      this.queue = new ArrayList<OneOfQueueObjectQueueItems>();
    }
    this.queue.add(queueItem);
    return this;
  }

   /**
   * The tracks or episodes in the queue. Can be empty.
   * @return queue
  **/
  @Schema(description = "The tracks or episodes in the queue. Can be empty.")
  public List<OneOfQueueObjectQueueItems> getQueue() {
    return queue;
  }

  public void setQueue(List<OneOfQueueObjectQueueItems> queue) {
    this.queue = queue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueObject queueObject = (QueueObject) o;
    return Objects.equals(this.currentlyPlaying, queueObject.currentlyPlaying) &&
        Objects.equals(this.queue, queueObject.queue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentlyPlaying, queue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueObject {\n");
    
    sb.append("    currentlyPlaying: ").append(toIndentedString(currentlyPlaying)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
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
