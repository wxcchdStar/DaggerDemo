package wxc.android.dagger.demo.modules.subcomponent;

import java.util.ArrayList;
import java.util.List;

import dagger.Module;
import dagger.Provides;

@Module
public class SubcomponentModule {

    @Provides
    public static StringBuilder provideStringBuilder() {
        StringBuilder sb = new StringBuilder();
        sb.append("Subcomponent");
        return sb;
    }
}
