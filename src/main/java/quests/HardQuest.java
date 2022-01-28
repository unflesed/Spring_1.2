package quests;

import interfaces.Quest;

public class HardQuest implements Quest {
    @Override
    public void success() {
        System.out.println("You succeed in hard quest!");
    }
}
