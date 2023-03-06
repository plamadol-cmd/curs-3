package teachers;

public class MathTeacher implements ITeacher {
    private WisdomWordsService wisdomService;

    @Override
    public String getHomework() {
        return "Solve 100 calculus problems";
    }

    @Override
    public String getWisdom() {
        return wisdomService.getMessage();
    }
}
