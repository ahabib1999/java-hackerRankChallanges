import java.util.List;

public class GradingStudents {

    public List<Integer> willRound(List<Integer> grades) {

        for (int i = 0; i < grades.size(); i++) {

            int currentGrade = grades.get(i);

            if (currentGrade < 38 || currentGrade % 5 == 0) {
                continue;
            }

            if (currentGrade % 10 < 5) {
                int multipleOfFive = (currentGrade / 10) * 10;
                multipleOfFive += 5;

                if (multipleOfFive - currentGrade < 3) {
                    grades.remove(i);
                    grades.add(i, multipleOfFive);
                }
            }

            else {
                int multipleOfFive = (currentGrade / 10 + 1) * 10;

                if (multipleOfFive - currentGrade < 3) {
                    grades.remove(i);
                    grades.add(i, multipleOfFive);
                }
            }
        }
        return grades;
    }
}
