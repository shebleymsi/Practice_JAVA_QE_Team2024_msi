package zqe_top_SDET_JAVA_Programs_QA_Stack_Junaid_Aziz_2025;

public class Problem_04_msi_return_type_space_count {
        public static void main(String[] args) {
            String name = "This is a string";
            nonSpaceCharacters(name);
        }

        public static int nonSpaceCharacters(String name) {
            int count = 0;
            for (int i = 0; i < name.length(); i++) {
                if (name.charAt(i) == ' ') {
                    count = count + 1;
                }
            }
            System.out.println("The count of non-space characters is: " + count);
            return count;
        }
}
