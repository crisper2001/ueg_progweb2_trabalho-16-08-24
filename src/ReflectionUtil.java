import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class ReflectionUtil {
    public static ArrayList<Field> getHierarchyFields(Object object) {
        Class<?> c = object.getClass();
        ArrayList<Field> fieldsList = new ArrayList<Field>();
        while (c != Object.class) {
            fieldsList.addAll(Arrays.asList(c.getDeclaredFields()));
            c = c.getSuperclass();
        }
        return fieldsList;
    }
    public static ArrayList<Method> getHierarchyMethods(Object object) {
        Class<?> c = object.getClass();
        ArrayList<Method> methodsList = new ArrayList<Method>();
        while (c != Object.class) {
            methodsList.addAll(Arrays.asList(c.getDeclaredMethods()));
            c = c.getSuperclass();
        }
        return methodsList;
    }
}
