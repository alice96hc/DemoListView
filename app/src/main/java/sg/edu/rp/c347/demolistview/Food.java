package sg.edu.rp.c347.demolistview;

/**
 * Created by 15017199 on 28/4/2017.
 */

    public class Food {
    private String name;
    private boolean star;
    public Food(String name, boolean star) {
        this.name = name;
        this.star = star;
    }
    public String getName() {
        return name;
    }
    public boolean isStar() {
        return star;
    }

}
