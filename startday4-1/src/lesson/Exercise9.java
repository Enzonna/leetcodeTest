package lesson;

/**
 * Package: lesson
 * Description:
 *
 * @Author ENZO
 * @Create 2024年4月8日 19:30
 */
public class Exercise9 {
    public static void main(String[] args) {
        String[][] employees = {
                {"10", "1", "段誉", "22", "3000"},
                {"13", "2", "令狐冲", "32", "18000", "15000", "2000"},
                {"11", "3", "任我行", "23", "7000"},
                {"11", "4", "张三丰", "24", "7300"},
                {"12", "5", "周芷若", "28", "10000", "5000"},
                {"11", "6", "赵敏", "22", "6800"},
                {"12", "7", "张无忌", "29", "10800","5200"},
                {"13", "8", "韦小宝", "30", "19800", "15000", "2500"},
                {"12", "9", "杨过", "26", "9800", "5500"},
                {"11", "10", "小龙女", "21", "6600"},
                {"11", "11", "郭靖", "25", "7100"},
                {"12", "12", "黄蓉", "27", "9600", "4800"}
        };
        System.out.println("员工类型\t编号\t姓名\t年龄\t薪资\t奖金\t股票\t");
        for (int i = 0; i < employees.length; i++) {
            switch(employees[i][0]){
                case "10":
                    System.out.print("普通职员");
                    break;
                case "11":
                    System.out.print("程序员");
                    break;
                case "12":
                    System.out.print("设计师");
                    break;
                case "13":
                    System.out.print("架构师");
                    break;
            }
            for (int j = 1; j < employees[i].length; j++) {
                System.out.print("\t" + employees[i][j]);
            }
            System.out.println();
        }
    }
}