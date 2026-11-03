import java.beans.*;

public class IntrospectorDemo {
    public static void main(String[] args) throws IntrospectionException {
        BeanInfo info = Introspector.getBeanInfo(StudentBean.class);

        System.out.println("--- Properties ---");
        for (PropertyDescriptor pd : info.getPropertyDescriptors())
            System.out.println(pd.getName() + " : " + pd.getPropertyType().getSimpleName());

        System.out.println("--- Methods ---");
        for (MethodDescriptor md : info.getMethodDescriptors())
            System.out.println(md.getMethod().getName());
    }
}