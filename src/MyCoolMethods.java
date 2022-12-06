import java.util.ArrayList;
import java.util.Comparator;

public class MyCoolMethods {
    public static UserClassForTest sortUserListRemoveCopiesGetOldestUser(ArrayList<UserClassForTest> userClassForTests) {
        userClassForTests.sort(new Comparator<UserClassForTest>() {
            @Override
            public int compare(UserClassForTest o1, UserClassForTest o2) {
                return o2.age - o1.age;
            }
        });
        for (int i = 0; i < userClassForTests.size() - 1; i++) {
            try {
                while (userClassForTests.get(i).equals(userClassForTests.get(i + 1)))
                    userClassForTests.remove(userClassForTests.get(i));
            } catch (IndexOutOfBoundsException e) {
                break;
            }
        }
        return userClassForTests.get(0);
    }

    public static int getWordCountFromString(String string) {
        int i = 0;
        while (string.contains(" ")) {
            string = string.substring(0, string.indexOf(" ")) + string.substring(string.indexOf(" ") + 1);
            i++;
        }
        return i + 1;
    }
}
