package org.juzu.removemyaccount.commons.models;

/**
 * Created by exoplatform on 08/01/15.
 */
public class Account {
  private String username;
  private String reason;
  private Boolean unsubscibeMarketingEmail;

  public Account(String username){
    this.setUsername(username);
    this.setUnsubscibeMarketingEmail(false);
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public Boolean getUnsubscibeMarketingEmail() {
    return unsubscibeMarketingEmail;
  }

  public void setUnsubscibeMarketingEmail(Boolean unsubscibeMarketingEmail) {
    this.unsubscibeMarketingEmail = unsubscibeMarketingEmail;
  }
  public boolean checkValid(){
    if(null == this.getUsername() || "".equals(this.getUsername())){
      return false;
    }else if (null == this.getReason() || "".equals(this.getReason()))
      return false;
    return true;
  }
}
