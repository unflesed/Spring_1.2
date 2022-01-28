import knights.Knight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import quests.HardQuest;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");

        Knight knight = ctx.getBean(Knight.class);

        knight.setQuest(ctx.getBean(HardQuest.class));

        knight.getQuest().success();

    }
}
