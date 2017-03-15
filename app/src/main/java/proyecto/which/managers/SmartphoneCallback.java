package proyecto.which.managers;

import java.util.List;
import proyecto.which.model.Smartphone;

public interface SmartphoneCallback {
    void onSuccess(List<Smartphone> smartphoneList);
    void onSucces();
    void onSuccess(Smartphone smartphone);
    void onFailure(Throwable t);
}
