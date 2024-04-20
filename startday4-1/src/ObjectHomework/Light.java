package ObjectHomework;

import org.testng.annotations.Test;

/**
 * Package: ObjectHomework
 * Description:
 *
 * @Author ENZO
 * @Create 2024年4月14日 18:03
 */
public class Light {
    public String color;
    public int time;

    public void getInfo(){
        System.out.println(color + "颜色的灯亮" + time + "秒。");
    }
}

