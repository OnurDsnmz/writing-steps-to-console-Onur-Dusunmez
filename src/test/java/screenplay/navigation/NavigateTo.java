package screenplay.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import screenplay.navigation.TAPracticeHomePage;

public class NavigateTo {
    public static Performable theAutomationPracticeHomePage() {
        return Task.where("{0} opens the Ta practice home page",
                Open.browserOn().the(TAPracticeHomePage.class));
    }
}
