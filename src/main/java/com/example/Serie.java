package com.example;

public class Serie extends Title {
  private int seasons;
  private int episodes;
  private int episodeDuration;

  public int getEpisodeDuration() {
    return episodeDuration;
  }

  public void setEpisodeDuration(int episodeDuration) {
    this.episodeDuration = episodeDuration;
  }

  public int getEpisodes() {
    return episodes;
  }

  public void setEpisodes(int episodes) {
    this.episodes = episodes;
  }

  public int getSeasons() {
    return seasons;
  }

  public void setSeasons(int seasons) {
    this.seasons = seasons;
  }

  @Override
  public int getDurationInMinutes() {
    return getSeasons() * getEpisodes() * getEpisodeDuration();
  }
}
