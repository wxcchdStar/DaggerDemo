package wxc.android.dagger.demo.modules.multibindings;

import java.util.Map;

import dagger.Component;

@Component(modules = MultibindingsModule.class)
public interface MultibindingsComponent {
    void inject(MultibindingsActivity activity);

    Map<String, Long> longMaxValueByString();
    Map<String, Integer> intMaxValueByString();
    Map<Class<?>, String> stringByClass();
//    Map<MyKey, String> myKeyStringMap();
}
