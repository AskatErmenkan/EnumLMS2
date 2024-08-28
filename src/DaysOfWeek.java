public enum DaysOfWeek {
    MONDAY("Дүйшөмбү күнү жава окуйм"),
    TUESDAY("Шейшемби күнү англис тили сабагын окуйм"),
    WEDNESDAY("Шаршемби күнү математика сабагын окуйм"),
    THURSDAY("Бейшемби күнү тарых сабагын окуйм"),
    FRIDAY("Жума күнү физика сабагын окуйм"),
    SATURDAY("Ишемби күнү бардык сабактарды кайталайм"),
    SUNDAY("Жекшемби күнү эс алам");

    private final String lesson;

    DaysOfWeek(String lesson){
        this.lesson = lesson;
    }

    public String getLesson(){
        return lesson;
    }
}

