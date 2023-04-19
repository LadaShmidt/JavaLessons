package Generic;
import java.util.ArrayList;

public class ParameterizedMethod {
    public static <T> T getSecondElement(ArrayList<T> arrayList) {
        return arrayList.get(1);
    }
}
