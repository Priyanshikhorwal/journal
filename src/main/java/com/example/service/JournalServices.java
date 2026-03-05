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

    public JournalEntity addAllJournals(JournalEntity journal) {
        return journalRepo.addAllJournals(journal);
    }

    public JournalEntity updateJournal(int id,JournalEntity journal) {
        return journalRepo.updateJournal(id,journal);
    }
}
