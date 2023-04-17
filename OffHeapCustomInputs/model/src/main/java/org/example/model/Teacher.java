package org.example.model;

public class Teacher implements SchoolMember {

  public Long getId() {
    return id;
  }

  public void setID(Long id) {
    this.id = id;
  }

  private Long id;

  public Teacher() {
  }
}