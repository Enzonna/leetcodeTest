package lesson;

/**
 * Package: lesson
 * Description:
 *
 * @Author ENZO
 * @Create 2024��4��8�� 19:30
 */
public class Exercise9 {
    public static void main(String[] args) {
        String[][] employees = {
                {"10", "1", "����", "22", "3000"},
                {"13", "2", "�����", "32", "18000", "15000", "2000"},
                {"11", "3", "������", "23", "7000"},
                {"11", "4", "������", "24", "7300"},
                {"12", "5", "������", "28", "10000", "5000"},
                {"11", "6", "����", "22", "6800"},
                {"12", "7", "���޼�", "29", "10800","5200"},
                {"13", "8", "ΤС��", "30", "19800", "15000", "2500"},
                {"12", "9", "���", "26", "9800", "5500"},
                {"11", "10", "С��Ů", "21", "6600"},
                {"11", "11", "����", "25", "7100"},
                {"12", "12", "����", "27", "9600", "4800"}
        };
        System.out.println("Ա������\t���\t����\t����\tн��\t����\t��Ʊ\t");
        for (int i = 0; i < employees.length; i++) {
            switch(employees[i][0]){
                case "10":
                    System.out.print("��ְͨԱ");
                    break;
                case "11":
                    System.out.print("����Ա");
                    break;
                case "12":
                    System.out.print("���ʦ");
                    break;
                case "13":
                    System.out.print("�ܹ�ʦ");
                    break;
            }
            for (int j = 1; j < employees[i].length; j++) {
                System.out.print("\t" + employees[i][j]);
            }
            System.out.println();
        }
    }
}