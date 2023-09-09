package BuiltIn;

public class Enums {
    public enum DayOfWeek {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }
    
    public static void main(String[] args) {
        DayOfWeek today = DayOfWeek.MONDAY;
        
        System.out.println("Today is " + today);
        
        switch (today) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("It's a regular workday.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend!");
                break;
        }
    }
}
