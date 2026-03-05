package com.example.controler;

import com.example.entity.JournalEntity;
import com.example.service.JournalServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class JournalController {

    private final JournalServices journalServices;

    public JournalController(JournalServices journalServices) {
        this.journalServices = journalServices;
    }

    @GetMapping("/all")
    public List<JournalEntity> getAllJournal() {
        return journalServices.getAll();
    }

    @PostMapping("/add")
    public JournalEntity addAllJournals(@RequestBody JournalEntity journal){
        return journalServices.addAllJournals(journal);
    }
    @PutMapping("/{id}")
    public JournalEntity updateAllJournals(@PathVariable int id,@RequestBody JournalEntity journal){
        return journalServices.updateJournal(id,journal);
    }


}
