package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: abm  reason: default package */
/* compiled from: PG */
public final class abm implements aaj {
    private static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    private final aaj b;

    public abm(aaj aaj) {
        this.b = aaj;
    }

    public final /* bridge */ /* synthetic */ aai a(Object obj, int i, int i2, tx txVar) {
        return this.b.a(new zv(((Uri) obj).toString()), i, i2, txVar);
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return a.contains(((Uri) obj).getScheme());
    }
}
