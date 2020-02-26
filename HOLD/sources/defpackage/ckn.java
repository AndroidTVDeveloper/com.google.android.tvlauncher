package defpackage;

import android.util.LongSparseArray;
import java.util.HashSet;
import java.util.List;

/* renamed from: ckn  reason: default package */
/* compiled from: PG */
final class ckn {
    public List a;
    public LongSparseArray b;
    public final ckm c = new ckm((byte) 0);
    public final HashSet d = new HashSet();

    /* access modifiers changed from: package-private */
    public final boolean a(long j) {
        return this.b.get(j) != null;
    }
}
