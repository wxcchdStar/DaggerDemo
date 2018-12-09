package wxc.android.dagger.demo.modules.subcomponent;

import dagger.Subcomponent;

@Subcomponent(modules = SubcomponentModule.class)
public interface SubcomponentComponent {
    void inject(SubcomponentActivity activity);

    @Subcomponent.Builder
    interface Builder {
//        Builder subcomponentModule(SubcomponentModule module);

        SubcomponentComponent build();
    }
}
