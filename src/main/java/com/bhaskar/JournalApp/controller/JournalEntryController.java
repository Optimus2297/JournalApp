//package com.bhaskar.JournalApp.controller;
//
//import com.bhaskar.JournalApp.entity.JournalEntry;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("_journal")
//public class JournalEntryController {
//
//    private Map<String, JournalEntry> journalList = new HashMap<>();
//
//    @GetMapping
//    public List<JournalEntry> getAll(){
//        return new ArrayList<>(journalList.values());
//    }
//
//    @PostMapping
//    public boolean createEntry(@RequestBody JournalEntry myEntry){
//        journalList.put(myEntry.getId(), myEntry);
//        return true;
//    }
//    @GetMapping("id/{myID}")
//    public JournalEntry getJournalEntryById(@PathVariable String myID){
//        return journalList.get(myID);
//    }
//
//    @DeleteMapping("id/{myID}")
//    public JournalEntry deleteJournalEntryById(@PathVariable String myID){
//        return journalList.remove(myID);
//    }
//
//    @PutMapping("id/{myID}")
//    public JournalEntry updateJournalEntryById(@PathVariable String myID, @RequestBody JournalEntry myEntry){
//        return journalList.put(myID, myEntry);
//    }
//}
