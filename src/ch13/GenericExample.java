package ch13;

public class GenericExample {
    // Generic Method
    public static <T> Box<T> boxing(T t){
        Box<T> box = new Box<T>();
        box.set(t);
        return box;
    }

    public static <T extends Number> boolean compare(T t1, T t2){
        System.out.println("compare("+t1.getClass().getSimpleName() + ", " +
                t2.getClass().getSimpleName() +")");

        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();

        return v1 == v2;
    }

    public static void main(String[] args){
//        Box<Integer> box1 = boxing(100);
//        int intValue = box1.get();
//        System.out.println(intValue);
//
//        Box<String> box2 = boxing("홍길동");
//        String strValue = box2.get();
//        System.out.println(strValue);
//
//
//        boolean result1 = compare(10, 20);
//        System.out.println(result1);
//
//        boolean result2 = compare(5.5, 5.5);
//        System.out.println(result2);

        Course.registerCourse1(new Applicant<Person>(new Person()));
        Course.registerCourse1(new Applicant<Worker>(new Worker()));
        Course.registerCourse1(new Applicant<Student>(new Student()));
        Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
        Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
        System.out.println();

//        Course.registerCourse2(new Applicant<Person>(new Person()));
//        Course.registerCourse2(new Applicant<Worker>(new Worker()));
        Course.registerCourse2(new Applicant<Student>(new Student()));
        Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
        Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
        System.out.println();

        Course.registerCourse3(new Applicant<Person>(new Person()));
        Course.registerCourse3(new Applicant<Worker>(new Worker()));
//        Course.registerCourse3(new Applicant<Student>(new Student()));
//        Course.registerCourse3(new Applicant<HighStudent>(new HighStudent()));
//        Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
        System.out.println();


    }
}
