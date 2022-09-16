import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nameA = new ArrayList<>();
        ArrayList<String> nameB = new ArrayList<>();
        ArrayList<String> nameC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {


            System.out.println("Введите 5 имён, чтоб я заполнил список А ");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.next();
            nameA.add(name);
        }

        System.out.println("Список А : " + nameA);

        for (int i = 0; i < 5; i++) {


            System.out.println("Введите 5 имён , чтоб я заполнил список B");
            Scanner scanner = new Scanner(System.in);
            String name2 = scanner.next();
            nameB.add(name2);

        }
        System.out.println("Список B : " + nameB);


        System.out.println("Общий список С: ");
        Integer I = 0;
        while (nameC.size() < nameA.size() + nameB.size()){
            nameC.add(nameA.get(I));
            nameC.add(nameB.get(I));
            I++;
        }
        System.out.println(nameC);
        nameC.add(nameA.get(0));
        nameC.add(nameB.get(1));


        Collections.sort(nameC, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(nameC);
    }






        }

















   // Scanner scanner = new Scanner(System.in);
