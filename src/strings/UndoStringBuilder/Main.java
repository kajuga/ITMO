//package strings.UndoStringBuilder;
//
//
//
///*
//    1. static
//    2. nested, inner, local and anonym classes
//    3. varargs
//    4. final
//    5. Object!
// */
//
////import com.company.list.List;
////import com.company.shapes.simple.Ball;
////import com.company.shapes.simple.Cylinder;
////import com.company.shapes.simple.Shape;
//
//import java.util.List;
////import java.util.shapes.simple.Ball;
//import java.util.List;
//import java.util.List;
//
//public class Main {
//
//
//
//    static {
//        String s = "efef";
//        System.out.println(s);
//    }
//
//    private final String value;
//
//    public Main(String value) {
//        this.value = value;
//    }
//
//    private static class A {
//        public A() {
//            doSome(1);
//            doSome(1, 2);
//        }
//
//        public void doSome(int... value) {
//            // int[] p = value;
//            for(int i : value){
//                System.out.println();
//            }
//        }
//    }
//
//    class B {
//        public B() {
//            System.out.println(value);
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "I'm Main class with value "  +value;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Main main = (Main) o;
//
//        return value != null ? value.equals(main.value) : main.value == null;
//    }
//
//    @Override
//    public int hashCode() {
//        return value != null ? value.hashCode() : 0;
//    }
//
//    public static void main(String[] strings) {
//
//        Object o = "ef";
////        o = new List().toString();
//
//
//
//        double pi = Math.PI;
//
//        final String name = "sdrfgreg";
//        // name = "new name";
//        final List list = new List();
//        list.add("grg");
//
//        boolean isString = name instanceof Object;
//
//        class C {
//            String value;
//
//            public C(String value) {
//                this.value = value;
//            }
//
//            private void doSome() {
//
//            }
//        }
//
//
//
//
//        String array[] =
//                new String[]{"1rewf ", "feefewf", "a", null, "1"};
//
//        Object[] newArray = Arrays.filter(array, new Arrays.Filter() {
//            @Override
//            public boolean apply(Object o) {
//                return o != null;
//            }
//        });
//
//        newArray = Arrays.filter(array, new Arrays.Filter() {
//            @Override
//            public boolean apply(Object o) {
//                return o.toString().length() > 1;
//            }
//        });
//
//
////        Shape shapes[] = new Shape[100];
////        Arrays.fill(shapes, new Arrays.Converter() {
//            @Override
//            public Object get(int index) {
//                if(index % 2 == 0){
////                    return new Cylinder(10, 34);
//                } else {
////                    return new Ball(index);
//                }
//            }
//        });
//
//        UndoStringBuilder builder = new UndoStringBuilder("Hello, ");
//        UndoStringBuilder builder2 = new UndoStringBuilder("Hello, ");
//
////        builder2.setOnChangeListener(new UndoStringBuilder.OnChangeListener() {
//            @Override
//            public void onChange(UndoStringBuilder undoStringBuilder) {
//                //if(...)
//            }
//        });
//
////        builder.setOnChangeListener(new UndoStringBuilder.OnChangeListener() {
////            @Override
////            public void onChange(UndoStringBuilder uBuilder) {
////                System.out.println("new state:");
////                System.out.println(uBuilder.toString());
////            }
////        });
////
////        builder.append("World!");
////
////    }
