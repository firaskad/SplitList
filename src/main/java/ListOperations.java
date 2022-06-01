import java.util.ArrayList;
import java.util.List;

public class ListOperations {

    public static List<List<Object>> partition(List<Object> mainList, int splitSize){
        if (splitSize <= 0){
            throw new IllegalArgumentException("Split size can not be 0 or negative");
        }
        if (mainList != null && !mainList.isEmpty()) {
            List<List<Object>> l = new ArrayList<>();
            int currentIndex = 0;
            List<Object> temp = new ArrayList<>();
            for (Object object : mainList) {
                temp.add(object);
                currentIndex++;
                if (currentIndex >= splitSize) {
                    l.add(temp);
                    currentIndex = 0;
                    temp = new ArrayList<>();
                }
            }
            if (l.size() != Math.round((double) mainList.size() / splitSize)) {
                l.add(temp);
            }
            return l;
        } else {
            throw new IllegalArgumentException("List is null or empty");
        }
    }
}
