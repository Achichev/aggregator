package aggregator;

import aggregator.model.HHStrategy;
import aggregator.model.HabrCareerStrategy;
import aggregator.model.Model;
import aggregator.model.Provider;
import aggregator.view.HtmlView;

public class Aggregator {
    public static void main(String[] args) {
        HtmlView view = new HtmlView();
        Model model = new Model(view, new Provider(new HHStrategy()), new Provider(new HabrCareerStrategy()));
        Controller controller = new Controller(model);

        view.setController(controller);

        view.userCitySelectEmulationMethod();

    }
}
