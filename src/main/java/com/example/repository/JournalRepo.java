package com.example.repository;

import com.example.entity.JournalEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JournalRepo {

    private final List<JournalEntity> list=new ArrayList<JournalEntity>();
    public List<JournalEntity> findAll() {
        return list;
    }

    public JournalEntity addAllJournals(JournalEntity journal) {

        list.add(journal);
        return journal;
    }

    public JournalEntity updateJournal(int id, JournalEntity journal) {

        for (JournalEntity j : list) {
            if (j.getId() == id) {

                j.setTitle(journal.getTitle());
                j.setDate(journal.getDate());
                j.setLastUpdated(journal.getLastUpdated());
                j.setDescription(journal.getDescription());

                return j;
            }
        }

        return null;
    }
}
