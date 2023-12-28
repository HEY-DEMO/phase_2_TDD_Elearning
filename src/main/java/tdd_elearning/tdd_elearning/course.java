package tdd_elearning.tdd_elearning;

import java.util.ArrayList;
import java.util.List;

public class course {

    private String title;
    private List<module> modules;

    public course(String title) {
        this.title = title;
        this.modules = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public List<module> getModules() {
        return modules;
    }

    public void addModule(module module) {
        modules.add(module);
    }
}