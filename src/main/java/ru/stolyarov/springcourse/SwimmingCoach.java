package ru.stolyarov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SwimmingCoach implements Coach {

    private final FortuneService fortuneService;

    public SwimmingCoach(@Qualifier("fileFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim!Swim!Swim! You should have more practice!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
