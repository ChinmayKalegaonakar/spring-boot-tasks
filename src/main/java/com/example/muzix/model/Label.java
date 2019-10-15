package com.example.muzix.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Label {
  @Id
  private int labelId;
  @GeneratedValue
  private String labelName;
  private String labelOwner;

  public Label() {
  }

  public Label(int labelId, String labelName, String labelOwner) {
    this.labelId = labelId;
    this.labelName = labelName;
    this.labelOwner = labelOwner;
  }

  public int getLabelId() {
    return labelId;
  }

  public void setLabelId(int labelId) {
    this.labelId = labelId;
  }

  public String getLabelName() {
    return labelName;
  }

  public void setLabelName(String labelName) {
    this.labelName = labelName;
  }

  public String getLabelOwner() {
    return labelOwner;
  }

  public void setLabelOwner(String labelOwner) {
    this.labelOwner = labelOwner;
  }
}
