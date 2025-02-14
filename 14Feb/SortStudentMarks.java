public class SortStudentMarks {
    public static void main(String[] args) {
        int[] marks = { 90, 70, 50, 80, 85 };
        String[] names = { "John", "David", "Peter", "Alice", "Bob" };

        for (int i = 0; i < marks.length; i++) {
            for (int j = i + 1; j < marks.length; j++) {
                if (marks[i] < marks[j]) {
                    int temp = marks[i];
                    marks[i] = marks[j];
                    marks[j] = temp;

                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }

        for (int i = 0; i < marks.length; i++) {
            System.out.println(names[i] + " : " + marks[i]);
        }
    }
}
