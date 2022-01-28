package knights;

import interfaces.Quest;

public class Knight {
    Quest quest;

    public Knight() {
    }

    public Knight(Quest quest) {
        this.quest = quest;
    }

    public Quest getQuest() {
        return quest;
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }
}
