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
import java.math.BigDecimal;
/**
 * AudioAnalysisObjectTrack
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-11-02T18:14:56.554260212Z[GMT]")

public class AudioAnalysisObjectTrack {
  @SerializedName("num_samples")
  private Integer numSamples = null;

  @SerializedName("duration")
  private BigDecimal duration = null;

  @SerializedName("sample_md5")
  private String sampleMd5 = null;

  @SerializedName("offset_seconds")
  private Integer offsetSeconds = null;

  @SerializedName("window_seconds")
  private Integer windowSeconds = null;

  @SerializedName("analysis_sample_rate")
  private Integer analysisSampleRate = null;

  @SerializedName("analysis_channels")
  private Integer analysisChannels = null;

  @SerializedName("end_of_fade_in")
  private BigDecimal endOfFadeIn = null;

  @SerializedName("start_of_fade_out")
  private BigDecimal startOfFadeOut = null;

  @SerializedName("loudness")
  private Float loudness = null;

  @SerializedName("tempo")
  private Float tempo = null;

  @SerializedName("tempo_confidence")
  private BigDecimal tempoConfidence = null;

  @SerializedName("time_signature")
  private Integer timeSignature = null;

  @SerializedName("time_signature_confidence")
  private BigDecimal timeSignatureConfidence = null;

  @SerializedName("key")
  private Integer key = null;

  @SerializedName("key_confidence")
  private BigDecimal keyConfidence = null;

  @SerializedName("mode")
  private Integer mode = null;

  @SerializedName("mode_confidence")
  private BigDecimal modeConfidence = null;

  @SerializedName("codestring")
  private String codestring = null;

  @SerializedName("code_version")
  private BigDecimal codeVersion = null;

  @SerializedName("echoprintstring")
  private String echoprintstring = null;

  @SerializedName("echoprint_version")
  private BigDecimal echoprintVersion = null;

  @SerializedName("synchstring")
  private String synchstring = null;

  @SerializedName("synch_version")
  private BigDecimal synchVersion = null;

  @SerializedName("rhythmstring")
  private String rhythmstring = null;

  @SerializedName("rhythm_version")
  private BigDecimal rhythmVersion = null;

  public AudioAnalysisObjectTrack numSamples(Integer numSamples) {
    this.numSamples = numSamples;
    return this;
  }

   /**
   * The exact number of audio samples analyzed from this track. See also &#x60;analysis_sample_rate&#x60;.
   * @return numSamples
  **/
  @Schema(example = "4585515", description = "The exact number of audio samples analyzed from this track. See also `analysis_sample_rate`.")
  public Integer getNumSamples() {
    return numSamples;
  }

  public void setNumSamples(Integer numSamples) {
    this.numSamples = numSamples;
  }

  public AudioAnalysisObjectTrack duration(BigDecimal duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Length of the track in seconds.
   * @return duration
  **/
  @Schema(example = "207.95985", description = "Length of the track in seconds.")
  public BigDecimal getDuration() {
    return duration;
  }

  public void setDuration(BigDecimal duration) {
    this.duration = duration;
  }

  public AudioAnalysisObjectTrack sampleMd5(String sampleMd5) {
    this.sampleMd5 = sampleMd5;
    return this;
  }

   /**
   * This field will always contain the empty string.
   * @return sampleMd5
  **/
  @Schema(description = "This field will always contain the empty string.")
  public String getSampleMd5() {
    return sampleMd5;
  }

  public void setSampleMd5(String sampleMd5) {
    this.sampleMd5 = sampleMd5;
  }

  public AudioAnalysisObjectTrack offsetSeconds(Integer offsetSeconds) {
    this.offsetSeconds = offsetSeconds;
    return this;
  }

   /**
   * An offset to the start of the region of the track that was analyzed. (As the entire track is analyzed, this should always be 0.)
   * @return offsetSeconds
  **/
  @Schema(example = "0", description = "An offset to the start of the region of the track that was analyzed. (As the entire track is analyzed, this should always be 0.)")
  public Integer getOffsetSeconds() {
    return offsetSeconds;
  }

  public void setOffsetSeconds(Integer offsetSeconds) {
    this.offsetSeconds = offsetSeconds;
  }

  public AudioAnalysisObjectTrack windowSeconds(Integer windowSeconds) {
    this.windowSeconds = windowSeconds;
    return this;
  }

   /**
   * The length of the region of the track was analyzed, if a subset of the track was analyzed. (As the entire track is analyzed, this should always be 0.)
   * @return windowSeconds
  **/
  @Schema(example = "0", description = "The length of the region of the track was analyzed, if a subset of the track was analyzed. (As the entire track is analyzed, this should always be 0.)")
  public Integer getWindowSeconds() {
    return windowSeconds;
  }

  public void setWindowSeconds(Integer windowSeconds) {
    this.windowSeconds = windowSeconds;
  }

  public AudioAnalysisObjectTrack analysisSampleRate(Integer analysisSampleRate) {
    this.analysisSampleRate = analysisSampleRate;
    return this;
  }

   /**
   * The sample rate used to decode and analyze this track. May differ from the actual sample rate of this track available on Spotify.
   * @return analysisSampleRate
  **/
  @Schema(example = "22050", description = "The sample rate used to decode and analyze this track. May differ from the actual sample rate of this track available on Spotify.")
  public Integer getAnalysisSampleRate() {
    return analysisSampleRate;
  }

  public void setAnalysisSampleRate(Integer analysisSampleRate) {
    this.analysisSampleRate = analysisSampleRate;
  }

  public AudioAnalysisObjectTrack analysisChannels(Integer analysisChannels) {
    this.analysisChannels = analysisChannels;
    return this;
  }

   /**
   * The number of channels used for analysis. If 1, all channels are summed together to mono before analysis.
   * @return analysisChannels
  **/
  @Schema(example = "1", description = "The number of channels used for analysis. If 1, all channels are summed together to mono before analysis.")
  public Integer getAnalysisChannels() {
    return analysisChannels;
  }

  public void setAnalysisChannels(Integer analysisChannels) {
    this.analysisChannels = analysisChannels;
  }

  public AudioAnalysisObjectTrack endOfFadeIn(BigDecimal endOfFadeIn) {
    this.endOfFadeIn = endOfFadeIn;
    return this;
  }

   /**
   * The time, in seconds, at which the track&#x27;s fade-in period ends. If the track has no fade-in, this will be 0.0.
   * @return endOfFadeIn
  **/
  @Schema(example = "0", description = "The time, in seconds, at which the track's fade-in period ends. If the track has no fade-in, this will be 0.0.")
  public BigDecimal getEndOfFadeIn() {
    return endOfFadeIn;
  }

  public void setEndOfFadeIn(BigDecimal endOfFadeIn) {
    this.endOfFadeIn = endOfFadeIn;
  }

  public AudioAnalysisObjectTrack startOfFadeOut(BigDecimal startOfFadeOut) {
    this.startOfFadeOut = startOfFadeOut;
    return this;
  }

   /**
   * The time, in seconds, at which the track&#x27;s fade-out period starts. If the track has no fade-out, this should match the track&#x27;s length.
   * @return startOfFadeOut
  **/
  @Schema(example = "201.13705", description = "The time, in seconds, at which the track's fade-out period starts. If the track has no fade-out, this should match the track's length.")
  public BigDecimal getStartOfFadeOut() {
    return startOfFadeOut;
  }

  public void setStartOfFadeOut(BigDecimal startOfFadeOut) {
    this.startOfFadeOut = startOfFadeOut;
  }

  public AudioAnalysisObjectTrack loudness(Float loudness) {
    this.loudness = loudness;
    return this;
  }

   /**
   * Get loudness
   * @return loudness
  **/
  @Schema(description = "")
  public Float getLoudness() {
    return loudness;
  }

  public void setLoudness(Float loudness) {
    this.loudness = loudness;
  }

  public AudioAnalysisObjectTrack tempo(Float tempo) {
    this.tempo = tempo;
    return this;
  }

   /**
   * Get tempo
   * @return tempo
  **/
  @Schema(description = "")
  public Float getTempo() {
    return tempo;
  }

  public void setTempo(Float tempo) {
    this.tempo = tempo;
  }

  public AudioAnalysisObjectTrack tempoConfidence(BigDecimal tempoConfidence) {
    this.tempoConfidence = tempoConfidence;
    return this;
  }

   /**
   * The confidence, from 0.0 to 1.0, of the reliability of the &#x60;tempo&#x60;.
   * minimum: 0
   * maximum: 1
   * @return tempoConfidence
  **/
  @Schema(example = "0.73", description = "The confidence, from 0.0 to 1.0, of the reliability of the `tempo`.")
  public BigDecimal getTempoConfidence() {
    return tempoConfidence;
  }

  public void setTempoConfidence(BigDecimal tempoConfidence) {
    this.tempoConfidence = tempoConfidence;
  }

  public AudioAnalysisObjectTrack timeSignature(Integer timeSignature) {
    this.timeSignature = timeSignature;
    return this;
  }

   /**
   * Get timeSignature
   * @return timeSignature
  **/
  @Schema(description = "")
  public Integer getTimeSignature() {
    return timeSignature;
  }

  public void setTimeSignature(Integer timeSignature) {
    this.timeSignature = timeSignature;
  }

  public AudioAnalysisObjectTrack timeSignatureConfidence(BigDecimal timeSignatureConfidence) {
    this.timeSignatureConfidence = timeSignatureConfidence;
    return this;
  }

   /**
   * The confidence, from 0.0 to 1.0, of the reliability of the &#x60;time_signature&#x60;.
   * minimum: 0
   * maximum: 1
   * @return timeSignatureConfidence
  **/
  @Schema(example = "0.994", description = "The confidence, from 0.0 to 1.0, of the reliability of the `time_signature`.")
  public BigDecimal getTimeSignatureConfidence() {
    return timeSignatureConfidence;
  }

  public void setTimeSignatureConfidence(BigDecimal timeSignatureConfidence) {
    this.timeSignatureConfidence = timeSignatureConfidence;
  }

  public AudioAnalysisObjectTrack key(Integer key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @Schema(description = "")
  public Integer getKey() {
    return key;
  }

  public void setKey(Integer key) {
    this.key = key;
  }

  public AudioAnalysisObjectTrack keyConfidence(BigDecimal keyConfidence) {
    this.keyConfidence = keyConfidence;
    return this;
  }

   /**
   * The confidence, from 0.0 to 1.0, of the reliability of the &#x60;key&#x60;.
   * minimum: 0
   * maximum: 1
   * @return keyConfidence
  **/
  @Schema(example = "0.408", description = "The confidence, from 0.0 to 1.0, of the reliability of the `key`.")
  public BigDecimal getKeyConfidence() {
    return keyConfidence;
  }

  public void setKeyConfidence(BigDecimal keyConfidence) {
    this.keyConfidence = keyConfidence;
  }

  public AudioAnalysisObjectTrack mode(Integer mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @Schema(description = "")
  public Integer getMode() {
    return mode;
  }

  public void setMode(Integer mode) {
    this.mode = mode;
  }

  public AudioAnalysisObjectTrack modeConfidence(BigDecimal modeConfidence) {
    this.modeConfidence = modeConfidence;
    return this;
  }

   /**
   * The confidence, from 0.0 to 1.0, of the reliability of the &#x60;mode&#x60;.
   * minimum: 0
   * maximum: 1
   * @return modeConfidence
  **/
  @Schema(example = "0.485", description = "The confidence, from 0.0 to 1.0, of the reliability of the `mode`.")
  public BigDecimal getModeConfidence() {
    return modeConfidence;
  }

  public void setModeConfidence(BigDecimal modeConfidence) {
    this.modeConfidence = modeConfidence;
  }

  public AudioAnalysisObjectTrack codestring(String codestring) {
    this.codestring = codestring;
    return this;
  }

   /**
   * An [Echo Nest Musical Fingerprint (ENMFP)](https://academiccommons.columbia.edu/doi/10.7916/D8Q248M4) codestring for this track.
   * @return codestring
  **/
  @Schema(description = "An [Echo Nest Musical Fingerprint (ENMFP)](https://academiccommons.columbia.edu/doi/10.7916/D8Q248M4) codestring for this track.")
  public String getCodestring() {
    return codestring;
  }

  public void setCodestring(String codestring) {
    this.codestring = codestring;
  }

  public AudioAnalysisObjectTrack codeVersion(BigDecimal codeVersion) {
    this.codeVersion = codeVersion;
    return this;
  }

   /**
   * A version number for the Echo Nest Musical Fingerprint format used in the codestring field.
   * @return codeVersion
  **/
  @Schema(example = "3.15", description = "A version number for the Echo Nest Musical Fingerprint format used in the codestring field.")
  public BigDecimal getCodeVersion() {
    return codeVersion;
  }

  public void setCodeVersion(BigDecimal codeVersion) {
    this.codeVersion = codeVersion;
  }

  public AudioAnalysisObjectTrack echoprintstring(String echoprintstring) {
    this.echoprintstring = echoprintstring;
    return this;
  }

   /**
   * An [EchoPrint](https://github.com/spotify/echoprint-codegen) codestring for this track.
   * @return echoprintstring
  **/
  @Schema(description = "An [EchoPrint](https://github.com/spotify/echoprint-codegen) codestring for this track.")
  public String getEchoprintstring() {
    return echoprintstring;
  }

  public void setEchoprintstring(String echoprintstring) {
    this.echoprintstring = echoprintstring;
  }

  public AudioAnalysisObjectTrack echoprintVersion(BigDecimal echoprintVersion) {
    this.echoprintVersion = echoprintVersion;
    return this;
  }

   /**
   * A version number for the EchoPrint format used in the echoprintstring field.
   * @return echoprintVersion
  **/
  @Schema(example = "4.15", description = "A version number for the EchoPrint format used in the echoprintstring field.")
  public BigDecimal getEchoprintVersion() {
    return echoprintVersion;
  }

  public void setEchoprintVersion(BigDecimal echoprintVersion) {
    this.echoprintVersion = echoprintVersion;
  }

  public AudioAnalysisObjectTrack synchstring(String synchstring) {
    this.synchstring = synchstring;
    return this;
  }

   /**
   * A [Synchstring](https://github.com/echonest/synchdata) for this track.
   * @return synchstring
  **/
  @Schema(description = "A [Synchstring](https://github.com/echonest/synchdata) for this track.")
  public String getSynchstring() {
    return synchstring;
  }

  public void setSynchstring(String synchstring) {
    this.synchstring = synchstring;
  }

  public AudioAnalysisObjectTrack synchVersion(BigDecimal synchVersion) {
    this.synchVersion = synchVersion;
    return this;
  }

   /**
   * A version number for the Synchstring used in the synchstring field.
   * @return synchVersion
  **/
  @Schema(example = "1", description = "A version number for the Synchstring used in the synchstring field.")
  public BigDecimal getSynchVersion() {
    return synchVersion;
  }

  public void setSynchVersion(BigDecimal synchVersion) {
    this.synchVersion = synchVersion;
  }

  public AudioAnalysisObjectTrack rhythmstring(String rhythmstring) {
    this.rhythmstring = rhythmstring;
    return this;
  }

   /**
   * A Rhythmstring for this track. The format of this string is similar to the Synchstring.
   * @return rhythmstring
  **/
  @Schema(description = "A Rhythmstring for this track. The format of this string is similar to the Synchstring.")
  public String getRhythmstring() {
    return rhythmstring;
  }

  public void setRhythmstring(String rhythmstring) {
    this.rhythmstring = rhythmstring;
  }

  public AudioAnalysisObjectTrack rhythmVersion(BigDecimal rhythmVersion) {
    this.rhythmVersion = rhythmVersion;
    return this;
  }

   /**
   * A version number for the Rhythmstring used in the rhythmstring field.
   * @return rhythmVersion
  **/
  @Schema(example = "1", description = "A version number for the Rhythmstring used in the rhythmstring field.")
  public BigDecimal getRhythmVersion() {
    return rhythmVersion;
  }

  public void setRhythmVersion(BigDecimal rhythmVersion) {
    this.rhythmVersion = rhythmVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudioAnalysisObjectTrack audioAnalysisObjectTrack = (AudioAnalysisObjectTrack) o;
    return Objects.equals(this.numSamples, audioAnalysisObjectTrack.numSamples) &&
        Objects.equals(this.duration, audioAnalysisObjectTrack.duration) &&
        Objects.equals(this.sampleMd5, audioAnalysisObjectTrack.sampleMd5) &&
        Objects.equals(this.offsetSeconds, audioAnalysisObjectTrack.offsetSeconds) &&
        Objects.equals(this.windowSeconds, audioAnalysisObjectTrack.windowSeconds) &&
        Objects.equals(this.analysisSampleRate, audioAnalysisObjectTrack.analysisSampleRate) &&
        Objects.equals(this.analysisChannels, audioAnalysisObjectTrack.analysisChannels) &&
        Objects.equals(this.endOfFadeIn, audioAnalysisObjectTrack.endOfFadeIn) &&
        Objects.equals(this.startOfFadeOut, audioAnalysisObjectTrack.startOfFadeOut) &&
        Objects.equals(this.loudness, audioAnalysisObjectTrack.loudness) &&
        Objects.equals(this.tempo, audioAnalysisObjectTrack.tempo) &&
        Objects.equals(this.tempoConfidence, audioAnalysisObjectTrack.tempoConfidence) &&
        Objects.equals(this.timeSignature, audioAnalysisObjectTrack.timeSignature) &&
        Objects.equals(this.timeSignatureConfidence, audioAnalysisObjectTrack.timeSignatureConfidence) &&
        Objects.equals(this.key, audioAnalysisObjectTrack.key) &&
        Objects.equals(this.keyConfidence, audioAnalysisObjectTrack.keyConfidence) &&
        Objects.equals(this.mode, audioAnalysisObjectTrack.mode) &&
        Objects.equals(this.modeConfidence, audioAnalysisObjectTrack.modeConfidence) &&
        Objects.equals(this.codestring, audioAnalysisObjectTrack.codestring) &&
        Objects.equals(this.codeVersion, audioAnalysisObjectTrack.codeVersion) &&
        Objects.equals(this.echoprintstring, audioAnalysisObjectTrack.echoprintstring) &&
        Objects.equals(this.echoprintVersion, audioAnalysisObjectTrack.echoprintVersion) &&
        Objects.equals(this.synchstring, audioAnalysisObjectTrack.synchstring) &&
        Objects.equals(this.synchVersion, audioAnalysisObjectTrack.synchVersion) &&
        Objects.equals(this.rhythmstring, audioAnalysisObjectTrack.rhythmstring) &&
        Objects.equals(this.rhythmVersion, audioAnalysisObjectTrack.rhythmVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numSamples, duration, sampleMd5, offsetSeconds, windowSeconds, analysisSampleRate, analysisChannels, endOfFadeIn, startOfFadeOut, loudness, tempo, tempoConfidence, timeSignature, timeSignatureConfidence, key, keyConfidence, mode, modeConfidence, codestring, codeVersion, echoprintstring, echoprintVersion, synchstring, synchVersion, rhythmstring, rhythmVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudioAnalysisObjectTrack {\n");
    
    sb.append("    numSamples: ").append(toIndentedString(numSamples)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    sampleMd5: ").append(toIndentedString(sampleMd5)).append("\n");
    sb.append("    offsetSeconds: ").append(toIndentedString(offsetSeconds)).append("\n");
    sb.append("    windowSeconds: ").append(toIndentedString(windowSeconds)).append("\n");
    sb.append("    analysisSampleRate: ").append(toIndentedString(analysisSampleRate)).append("\n");
    sb.append("    analysisChannels: ").append(toIndentedString(analysisChannels)).append("\n");
    sb.append("    endOfFadeIn: ").append(toIndentedString(endOfFadeIn)).append("\n");
    sb.append("    startOfFadeOut: ").append(toIndentedString(startOfFadeOut)).append("\n");
    sb.append("    loudness: ").append(toIndentedString(loudness)).append("\n");
    sb.append("    tempo: ").append(toIndentedString(tempo)).append("\n");
    sb.append("    tempoConfidence: ").append(toIndentedString(tempoConfidence)).append("\n");
    sb.append("    timeSignature: ").append(toIndentedString(timeSignature)).append("\n");
    sb.append("    timeSignatureConfidence: ").append(toIndentedString(timeSignatureConfidence)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    keyConfidence: ").append(toIndentedString(keyConfidence)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    modeConfidence: ").append(toIndentedString(modeConfidence)).append("\n");
    sb.append("    codestring: ").append(toIndentedString(codestring)).append("\n");
    sb.append("    codeVersion: ").append(toIndentedString(codeVersion)).append("\n");
    sb.append("    echoprintstring: ").append(toIndentedString(echoprintstring)).append("\n");
    sb.append("    echoprintVersion: ").append(toIndentedString(echoprintVersion)).append("\n");
    sb.append("    synchstring: ").append(toIndentedString(synchstring)).append("\n");
    sb.append("    synchVersion: ").append(toIndentedString(synchVersion)).append("\n");
    sb.append("    rhythmstring: ").append(toIndentedString(rhythmstring)).append("\n");
    sb.append("    rhythmVersion: ").append(toIndentedString(rhythmVersion)).append("\n");
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
