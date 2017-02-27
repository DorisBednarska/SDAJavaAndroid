package pl.sda.mvcController;

import pl.sda.mvcModel.Model;
import pl.sda.mvcModel.ModelFacade;

import java.util.List;
import java.util.Random;

/**
 * Created by RENT on 2017-02-25.
 */
public class Controller {
    public int getFibValue(int n) {
        Random random = new Random();
        int val = random.nextInt(20000);
        ModelFacade.addValue(val);
        return val;
    }

    public double average() {
        double sum = 0;

        List<Integer> values = ModelFacade.getValues();
        for (int val : values) {
            sum = sum + val;
        }
        return sum / values.size();

    }
}
