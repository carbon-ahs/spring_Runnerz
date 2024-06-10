package com.axiagroups.runnerz.run;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class RunRepository {

    
//    private List<Run> runs = new ArrayList<>();
//
//    void create(Run run) {
//        runs.add(run);
//    }
//
//    void update(Run run, Integer id) {
//        Optional<Run> exitingRun = findById(id);
//        if(exitingRun.isPresent()) {
//            runs.set(runs.indexOf(exitingRun.get()), run);
//        }
//    }
//
//    void delete(Integer id) {
//        runs.removeIf(run -> run.id().equals(id));
//    }
//
//    List<Run> findAll() {
//        return runs;
//    }
//
//    Optional<Run> findById(Integer id) {
//        return runs.stream()
//                .filter(run -> run.id() == id)
//                .findFirst();
//    }
//
//    @PostConstruct
//    private void init() {
//        runs.add(new Run(1,
//                "Yoo",
//                LocalDateTime.now(),
//                LocalDateTime.now().plus(1, ChronoUnit.HOURS),
//                5,
//                Location.INDOOR));
//
//
//        runs.add(new Run(2,
//                "Yoo 2",
//                LocalDateTime.now(),
//                LocalDateTime.now().plus(2, ChronoUnit.HOURS),
//                2,
//                Location.OUTDOOR));
//    }
}
