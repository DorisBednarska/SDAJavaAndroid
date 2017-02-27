package pl.sda.mvcModel;

import java.util.List;

/**
 * Created by RENT on 2017-02-27.
 */
public class ModelFacade {

    public static List<Integer> getValues() {
        return Model.getValues();
    }

    public static void addValue(int newValue) {
        Model.addValue(newValue);
    }
}
