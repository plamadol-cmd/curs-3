package teachers;

public class TeacherFactory {

    public ITeacher getTeacher(String teacherType){
        if(teacherType == null){
            return null;
        }

        if(teacherType.equalsIgnoreCase("Math")){
            return new MathTeacher();
        }

        if(teacherType.equalsIgnoreCase("History")){
            return new HistoryTeacher();
        }

        if(teacherType.equalsIgnoreCase("Java")){
            return new JavaTeacher();
        }

        return null;
    }
}
