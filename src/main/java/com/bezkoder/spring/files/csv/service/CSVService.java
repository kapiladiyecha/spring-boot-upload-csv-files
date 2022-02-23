package com.bezkoder.spring.files.csv.service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.bezkoder.spring.files.csv.helper.CSVHelper;
import com.bezkoder.spring.files.csv.model.Player;
import com.bezkoder.spring.files.csv.repository.PlayerRepository;

@Service
public class CSVService {
  @Autowired
  PlayerRepository repository;

  public void save(MultipartFile file) {
    try {
      List<Player> players = CSVHelper.csvToPlayers(file.getInputStream());
      repository.saveAll(players);
    } catch (IOException e) {
      throw new RuntimeException("fail to store csv data: " + e.getMessage());
    }
  }

  public ByteArrayInputStream load() {
    List<Player> players = repository.findAll();

    ByteArrayInputStream in = CSVHelper.playersToCSV(players);
    return in;
  }

  public List<Player> getAllPlayers() {
    return repository.findAll();
  }
}
