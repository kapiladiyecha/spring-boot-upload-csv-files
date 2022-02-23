package com.bezkoder.spring.files.csv.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "players")
public class Player {

  @Id
  @Column(name = "id")
  private Long id;

  @Column(name = "name")
  private String name;

  @Column(name = "height")
  private double height;

  @Column(name = "playing")
  private boolean playing;

  public Player() {

  }

  public Player(Long id, String name, double height, boolean playing) {
    this.id = id;
    this.name = name;
    this.height = height;
    this.playing = playing;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String title) {
    this.name = title;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public boolean isPlaying() {
    return playing;
  }

  public void setPlaying(boolean isPublished) {
    this.playing = isPublished;
  }

  @Override
  public String toString() {
    return "Player{" +
            "id=" + id +
            ", title='" + name + '\'' +
            ", description='" + height + '\'' +
            ", playing=" + playing +
            '}';
  }
}
