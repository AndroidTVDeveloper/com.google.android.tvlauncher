package p000;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: abk */
/* compiled from: PG */
public final class abk implements aaj {

    /* renamed from: a */
    private static final Set f49a = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));

    /* renamed from: b */
    private final abi f50b;

    public abk(abi abi) {
        this.f50b = abi;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ aai mo11a(Object obj, int i, int i2, C0539tx txVar) {
        Uri uri = (Uri) obj;
        return new aai(new aho(uri), this.f50b.mo31a(uri));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo12a(Object obj) {
        return f49a.contains(((Uri) obj).getScheme());
    }
}
