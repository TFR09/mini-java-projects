package week6.taskManager;

import java.util.*;

public class ListsManager {
    public ArrayList<String> highPriority, lowPriority;

    public ListsManager() {
        highPriority = new ArrayList<>();
        lowPriority = new ArrayList<>();
    }

    public void addTask(String task) {
        lowPriority.add(task);
    }

    public void removeLowPriorityTask(int index) {
        lowPriority.remove(index);
    }

    public void removeHighPriorityTask(int index) {
        highPriority.remove(index);
    }

    public void changePriority(boolean important, int index) {
        if (important) {
            String task = lowPriority.get(index);
            lowPriority.remove(index);
            highPriority.add(task);
        } else {
            String task = highPriority.get(index);
            highPriority.remove(index);
            lowPriority.add(0, task);
        }
    }

    public String toString() {
        String tasks = "High Priority \n";
        for (String task : highPriority) {
            tasks += ("-" + task + "\n");
        }
        tasks += "Low Priority \n";

        for (String task : lowPriority) {
            tasks += ("-" + task + "\n");
        }
        return tasks;
    }

    public void promote(int index) {
        if (index != 0) {
            String task = highPriority.get(index);
            highPriority.remove(index);
            highPriority.add((index - 1), task);
        }

    }
}
