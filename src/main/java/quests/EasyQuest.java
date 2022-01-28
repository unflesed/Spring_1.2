package quests;

import interfaces.Quest;

public class EasyQuest implements Quest {
    @Override
    public void success() {
        System.out.println("You succeed in easy quest!");
    }
}
