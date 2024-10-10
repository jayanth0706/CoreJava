package maccess;
import java.util.*;
import test.StudentValues;
import test.StudentResult;

public class DemoMap1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try (s;) {
            Map<String, StudentValues> m = null;
            String nm = null;
            while (true) {
                System.out.println("=====Choice=====");
                System.out.println("\t1.HashMap"
                        + "\n\t2.LinkedHashMap"
                        + "\n\t3.TreeMap"
                        + "\n\t4.Hashtable"
                        + "\n\t5.Exit");

                System.out.println("Enter the Choice:");
                switch (Integer.parseInt(s.nextLine())) {
                    case 1:
                        m = new HashMap<String, StudentValues>();
                        nm = "HashMap";
                        break;
                    case 2:
                        m = new LinkedHashMap<String, StudentValues>();
                        nm = "LinkedHashMap";
                        break;
                    case 3:
                        m = new TreeMap<String, StudentValues>();
                        nm = "TreeMap";
                        break;
                    case 4:
                        m = new Hashtable<String, StudentValues>();
                        nm = "Hashtable";
                        break;
                    case 5:
                        System.out.println("Program stopped...");
                        System.exit(0);
                    default:
                        System.out.println("Invalid Choice...");
                        continue;
                }// end of switch
                System.out.println("Perform Operations on " + nm);
                pqr: while (true) {
                    System.out.println("====Choice(Operations on " + nm + ")");
                    System.out.println("\t1.put(K,V)"
                            + "\n\t2.remove(Object)"
                            + "\n\t3.get(Object)"
                            + "\n\t4.keySet()"
                            + "\n\t5.values()"
                            + "\n\t6.Exit");
                    System.out.println("Enter the Choice:");
                    switch (Integer.parseInt(s.nextLine())) {
                        case 1:
                            System.out.println("------Student Details------");
                            System.out.println("Enter the RollNo:");
                            String rollNo = s.nextLine();
                            System.out.println("Enter the Name:");
                            String name = s.nextLine();
                            System.out.println("Enter the Branch:");
                            String branch = s.nextLine();
                            System.out.println("-----Enter 6 Subject Marks----");
                            int i = 1, totM = 0;
                            while (i <= 6) {
                                System.out.println("Enter the marks of Subject-" + i);
                                int sub = Integer.parseInt(s.nextLine());
                                totM = totM + sub;
                                i++;
                            }// end of loop
                            float per = (float) totM / 6;
                            String result = new StudentResult().generate(per);
                            m.put(new String(rollNo),
                                    new StudentValues(name, branch, totM, per, result));
                            System.out.println("=====StudentDetials=====");
                            m.forEach((k, v) -> {
                                System.out.println(k.toString() + "\t" + v.toString());
                            });
                            break;
                        case 2:
                            System.out.println("Enter the RollNo to delete student details");
                            String rNo = s.nextLine();
                            if (m.containsKey(rNo)) {
                                m.remove(rNo);
                                System.out.println("Student detials removed Successfully..");
                                System.out.println("=====StudentDetials=====");
                                m.forEach((k, v) -> {
                                    System.out.println(k.toString() + "\t" + v.toString());
                                });
                            } else {
                                System.out.println("Invalid RollNo...");
                            }
                            break;
                        case 3:
                            System.out.println("Enter the RollNo to get student values:");
                            String rNo2 = s.nextLine();
                            if (m.containsKey(rNo2)) {
                                StudentValues sv = m.get(rNo2);
                                System.out.println(sv.toString());
                                System.out.println("=====StudentDetials=====");
                                m.forEach((k, v) -> {
                                    System.out.println(k.toString() + "\t" + v.toString());
                                });
                            } else {
                                System.out.println("Invalid rollNo...");
                            }
                            break;
                        case 4:
                            if (m.isEmpty()) {
                                System.out.println("Map is empty....");
                            } else {
                                Set<String> ks = m.keySet();
                                System.out.println("-----keySet()------");
                                ks.forEach((k) -> {
                                    System.out.println(k.toString());
                                });
                            }
                            System.out.println("=====StudentDetials=====");
                            m.forEach((k, v) -> {
                                System.out.println(k.toString() + "\t" + v.toString());
                            });
                            break;
                        case 5:
                            if (m.isEmpty()) {
                                System.out.println("Map is empty....");
                            } else {
                                Collection<StudentValues> c = m.values(); // Corrected line
                                System.out.println("-----values()-----");
                                c.forEach((v) -> {
                                    System.out.println(v.toString());
                                });
                            }
                            System.out.println("=====StudentDetials=====");
                            m.forEach((k, v) -> {
                                System.out.println(k.toString() + "\t" + v.toString());
                            });
                            break;
                        case 6:
                            System.out.println("Operations Stopped on " + nm);
                            break pqr;
                        default:
                            System.out.println("Invalid Choice...");
                    }// end of switch
                }// end of InnerLoop
            }// end of OuterLoop
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
