package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: abk  reason: default package */
/* compiled from: PG */
public final class abk implements aaj {
    private static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));
    private final abi b;

    public abk(abi abi) {
        this.b = abi;
    }

    public final /* bridge */ /* synthetic */ aai a(Object obj, int i, int i2, tx txVar) {
        Uri uri = (Uri) obj;
        return new aai(new aho(uri), this.b.a(uri));
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return a.contains(((Uri) obj).getScheme());
    }
}
