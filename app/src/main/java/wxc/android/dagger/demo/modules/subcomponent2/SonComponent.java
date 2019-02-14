package wxc.android.dagger.demo.modules.subcomponent2;

import dagger.Subcomponent;
import wxc.android.dagger.demo.base.ActivityScope;

@ActivityScope
@Subcomponent
public interface SonComponent {
    void inject(SonActivity activity);

    @Subcomponent.Builder
    interface Builder {
        SonComponent build();
    }
}
