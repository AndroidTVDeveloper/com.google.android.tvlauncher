package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: asu */
/* compiled from: PG */
public final class asu {

    /* renamed from: a */
    public final int f2302a;

    /* renamed from: b */
    public final String f2303b;

    /* renamed from: c */
    public final List f2304c;

    /* renamed from: d */
    public final byte[] f2305d;

    public asu(int i, String str, List list, byte[] bArr) {
        List list2;
        this.f2302a = i;
        this.f2303b = str;
        if (list == null) {
            list2 = Collections.emptyList();
        } else {
            list2 = Collections.unmodifiableList(list);
        }
        this.f2304c = list2;
        this.f2305d = bArr;
    }
}
