public class SortEmployeeIds {
    public static void main(String[] args) {
        int[] employeeIds = {101, 105, 102, 103, 104};
        String[] names = {"John", "David", "Peter", "Alice", "Bob"};

        for (int i = 1; i < employeeIds.length; i++) {
            int key = employeeIds[i];
            String keyName = names[i];
            int j = i - 1;

            while (j >= 0 && employeeIds[j] > key) {
                employeeIds[j + 1] = employeeIds[j];
                names[j + 1] = names[j];
                j = j - 1;
            }
            employeeIds[j + 1] = key;
            names[j + 1] = keyName;
        }

        for (int i = 0; i < employeeIds.length; i++) {
            System.out.println(names[i] + " : " + employeeIds[i]);
        }
    }
}
