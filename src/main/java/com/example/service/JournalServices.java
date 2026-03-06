package com.example.service;

import com.example.entity.JournalEntity;
import com.example.repository.JournalRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JournalServices {
    private JournalRepo journalRepo;

    public JournalServices(JournalRepo journalRepo) {
        this.journalRepo = journalRepo;
    }
    public List<JournalEntity> getAll() {
        return journalRepo.findAll();
    }

    public JournalEntity addJournals(JournalEntity journal) {
        return journalRepo.addJournals(journal);
    }

    public JournalEntity updateJournal(int id,JournalEntity journal) {
        return journalRepo.updateJournal(id,journal);
    }
    public void deleteById(int id) {
        journalRepo.deleteById(id);
    }
}
