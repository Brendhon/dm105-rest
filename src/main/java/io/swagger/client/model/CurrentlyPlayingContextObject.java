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
 * CurrentlyPlayingContextObject
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-11-02T18:14:56.554260212Z[GMT]")

public class CurrentlyPlayingContextObject {
  @SerializedName("device")
  private AllOfCurrentlyPlayingContextObjectDevice device = null;

  @SerializedName("repeat_state")
  private String repeatState = null;

  @SerializedName("shuffle_state")
  private Boolean shuffleState = null;

  @SerializedName("context")
  private AllOfCurrentlyPlayingContextObjectContext context = null;

  @SerializedName("timestamp")
  private Integer timestamp = null;

  @SerializedName("progress_ms")
  private Integer progressMs = null;

  @SerializedName("is_playing")
  private Boolean isPlaying = null;

  @SerializedName("item")
  private OneOfCurrentlyPlayingContextObjectItem item = null;

  @SerializedName("currently_playing_type")
  private String currentlyPlayingType = null;

  @SerializedName("actions")
  private AllOfCurrentlyPlayingContextObjectActions actions = null;

  public CurrentlyPlayingContextObject device(AllOfCurrentlyPlayingContextObjectDevice device) {
    this.device = device;
    return this;
  }

   /**
   * The device that is currently active. 
   * @return device
  **/
  @Schema(description = "The device that is currently active. ")
  public AllOfCurrentlyPlayingContextObjectDevice getDevice() {
    return device;
  }

  public void setDevice(AllOfCurrentlyPlayingContextObjectDevice device) {
    this.device = device;
  }

  public CurrentlyPlayingContextObject repeatState(String repeatState) {
    this.repeatState = repeatState;
    return this;
  }

   /**
   * off, track, context
   * @return repeatState
  **/
  @Schema(description = "off, track, context")
  public String getRepeatState() {
    return repeatState;
  }

  public void setRepeatState(String repeatState) {
    this.repeatState = repeatState;
  }

  public CurrentlyPlayingContextObject shuffleState(Boolean shuffleState) {
    this.shuffleState = shuffleState;
    return this;
  }

   /**
   * If shuffle is on or off.
   * @return shuffleState
  **/
  @Schema(description = "If shuffle is on or off.")
  public Boolean isShuffleState() {
    return shuffleState;
  }

  public void setShuffleState(Boolean shuffleState) {
    this.shuffleState = shuffleState;
  }

  public CurrentlyPlayingContextObject context(AllOfCurrentlyPlayingContextObjectContext context) {
    this.context = context;
    return this;
  }

   /**
   * A Context Object. Can be &#x60;null&#x60;.
   * @return context
  **/
  @Schema(description = "A Context Object. Can be `null`.")
  public AllOfCurrentlyPlayingContextObjectContext getContext() {
    return context;
  }

  public void setContext(AllOfCurrentlyPlayingContextObjectContext context) {
    this.context = context;
  }

  public CurrentlyPlayingContextObject timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Unix Millisecond Timestamp when data was fetched.
   * @return timestamp
  **/
  @Schema(description = "Unix Millisecond Timestamp when data was fetched.")
  public Integer getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }

  public CurrentlyPlayingContextObject progressMs(Integer progressMs) {
    this.progressMs = progressMs;
    return this;
  }

   /**
   * Progress into the currently playing track or episode. Can be &#x60;null&#x60;.
   * @return progressMs
  **/
  @Schema(description = "Progress into the currently playing track or episode. Can be `null`.")
  public Integer getProgressMs() {
    return progressMs;
  }

  public void setProgressMs(Integer progressMs) {
    this.progressMs = progressMs;
  }

  public CurrentlyPlayingContextObject isPlaying(Boolean isPlaying) {
    this.isPlaying = isPlaying;
    return this;
  }

   /**
   * If something is currently playing, return &#x60;true&#x60;.
   * @return isPlaying
  **/
  @Schema(description = "If something is currently playing, return `true`.")
  public Boolean isIsPlaying() {
    return isPlaying;
  }

  public void setIsPlaying(Boolean isPlaying) {
    this.isPlaying = isPlaying;
  }

  public CurrentlyPlayingContextObject item(OneOfCurrentlyPlayingContextObjectItem item) {
    this.item = item;
    return this;
  }

   /**
   * The currently playing track or episode. Can be &#x60;null&#x60;.
   * @return item
  **/
  @Schema(description = "The currently playing track or episode. Can be `null`.")
  public OneOfCurrentlyPlayingContextObjectItem getItem() {
    return item;
  }

  public void setItem(OneOfCurrentlyPlayingContextObjectItem item) {
    this.item = item;
  }

  public CurrentlyPlayingContextObject currentlyPlayingType(String currentlyPlayingType) {
    this.currentlyPlayingType = currentlyPlayingType;
    return this;
  }

   /**
   * The object type of the currently playing item. Can be one of &#x60;track&#x60;, &#x60;episode&#x60;, &#x60;ad&#x60; or &#x60;unknown&#x60;. 
   * @return currentlyPlayingType
  **/
  @Schema(description = "The object type of the currently playing item. Can be one of `track`, `episode`, `ad` or `unknown`. ")
  public String getCurrentlyPlayingType() {
    return currentlyPlayingType;
  }

  public void setCurrentlyPlayingType(String currentlyPlayingType) {
    this.currentlyPlayingType = currentlyPlayingType;
  }

  public CurrentlyPlayingContextObject actions(AllOfCurrentlyPlayingContextObjectActions actions) {
    this.actions = actions;
    return this;
  }

   /**
   * Allows to update the user interface based on which playback actions are available within the current context. 
   * @return actions
  **/
  @Schema(description = "Allows to update the user interface based on which playback actions are available within the current context. ")
  public AllOfCurrentlyPlayingContextObjectActions getActions() {
    return actions;
  }

  public void setActions(AllOfCurrentlyPlayingContextObjectActions actions) {
    this.actions = actions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentlyPlayingContextObject currentlyPlayingContextObject = (CurrentlyPlayingContextObject) o;
    return Objects.equals(this.device, currentlyPlayingContextObject.device) &&
        Objects.equals(this.repeatState, currentlyPlayingContextObject.repeatState) &&
        Objects.equals(this.shuffleState, currentlyPlayingContextObject.shuffleState) &&
        Objects.equals(this.context, currentlyPlayingContextObject.context) &&
        Objects.equals(this.timestamp, currentlyPlayingContextObject.timestamp) &&
        Objects.equals(this.progressMs, currentlyPlayingContextObject.progressMs) &&
        Objects.equals(this.isPlaying, currentlyPlayingContextObject.isPlaying) &&
        Objects.equals(this.item, currentlyPlayingContextObject.item) &&
        Objects.equals(this.currentlyPlayingType, currentlyPlayingContextObject.currentlyPlayingType) &&
        Objects.equals(this.actions, currentlyPlayingContextObject.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(device, repeatState, shuffleState, context, timestamp, progressMs, isPlaying, item, currentlyPlayingType, actions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentlyPlayingContextObject {\n");
    
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    repeatState: ").append(toIndentedString(repeatState)).append("\n");
    sb.append("    shuffleState: ").append(toIndentedString(shuffleState)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    progressMs: ").append(toIndentedString(progressMs)).append("\n");
    sb.append("    isPlaying: ").append(toIndentedString(isPlaying)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    currentlyPlayingType: ").append(toIndentedString(currentlyPlayingType)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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
