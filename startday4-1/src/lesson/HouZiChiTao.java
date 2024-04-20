package lesson;

/**
 * Package: lesson
 * Description:
 *
 * @Author ENZO
 * @Create 2024Äê4ÔÂ12ÈÕ 15:34
 */
public class HouZiChiTao {
    public static int peach(int day) {
        if (day > 10 || day < 1) {
            return 0;
        }
        if (day == 1) {
            return 1;
        }
        return peach((peach(day + 1) + 1) * 2);

    }
}
