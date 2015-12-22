package io.swagger.model;

import io.swagger.model.ErrorListItem;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Error  {
  
  private Long code = null;
  private String message = null;
  private String description = null;
  private String moreInfo = null;
  private List<ErrorListItem> error = new ArrayList<ErrorListItem>() ;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("code")
  public Long getCode() {
    return code;
  }
  public void setCode(Long code) {
    this.code = code;
  }

  
  /**
   * Error message.
   **/
  @ApiModelProperty(required = true, value = "Error message.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   * A detail description about the error message.
   **/
  @ApiModelProperty(required = false, value = "A detail description about the error message.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Preferably an url with more details about the error.
   **/
  @ApiModelProperty(required = false, value = "Preferably an url with more details about the error.")
  @JsonProperty("moreInfo")
  public String getMoreInfo() {
    return moreInfo;
  }
  public void setMoreInfo(String moreInfo) {
    this.moreInfo = moreInfo;
  }

  
  /**
   * If there are more than one error list them out. Ex. list out validation errors by each field.
   **/
  @ApiModelProperty(required = false, value = "If there are more than one error list them out. Ex. list out validation errors by each field.")
  @JsonProperty("error")
  public List<ErrorListItem> getError() {
    return error;
  }
  public void setError(List<ErrorListItem> error) {
    this.error = error;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  moreInfo: ").append(moreInfo).append("\n");
    sb.append("  error: ").append(error).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
