package wxc.android.dagger.demo.modules.multibindings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.ClassKey;
import dagger.multibindings.ElementsIntoSet;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import dagger.multibindings.StringKey;

@Module
public class MultibindingsModule {

    @Provides
    @IntoSet
    static String provideOneString() {
        return "ABC";
    }

    @Provides
    @ElementsIntoSet
    static Set<String> provideSomeStrings() {
        return new HashSet<String>(Arrays.asList("DEF", "GHI"));
    }

    @Provides
    @IntoMap
    @StringKey("longMaxValue")
    public static Long provideLong() {
        return Long.MAX_VALUE;
    }

    @Provides
    @IntoMap
    @StringKey("intMaxValue")
    public static Integer provideInteger() {
        return Integer.MAX_VALUE;
    }

    @Provides
    @IntoMap
    @ClassKey(String.class)
    public static String provideString() {
        return "String";
    }

    @Provides
    @IntoMap
    @ClassKey(StringBuilder.class)
    public static String provideStringBuilder() {
        return "StringBuilder";
    }

//    @Provides
//    @IntoMap
//    @MyKey(name = "abc", implementingClass = String.class, thresholds = {1, 5, 10})
//    static String provideAbc1510Value() {
//        return "foo";
//    }
}
