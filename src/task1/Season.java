package task1;

import java.util.Arrays;

public enum Season {
    SPRING("Wiosna", new String[]{"mar", "kwi", "maj"}),
    SUMMER("Lato", new String[]{"cze", "lip", "sie"}),
    AUTUMN("Jesień", new String[]{"wrz", "paz", "lis"}),
    WINTER("Zima", new String[]{"gru", "sty", "lut"});

    private final String name;
    private final String[] monthTab;

    Season(String name, String[] monthTab){
        this.name = name;
        this.monthTab = monthTab;
    }

    public String getName() {
        return name;
    }

    public String[] getMonthTab() {
        return monthTab;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", monthTab=" + Arrays.toString(monthTab) +
                '}';
    }
}
