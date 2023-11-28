package Examinations;

import java.time.LocalDate;

public abstract class examination {
    LocalDate examDate;

    public examination(LocalDate examDate){
        this.examDate =examDate;
    }

    public LocalDate getExamDate(){
        return examDate;
    }
}
