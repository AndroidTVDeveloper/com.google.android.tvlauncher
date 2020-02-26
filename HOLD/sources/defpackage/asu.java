package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: asu  reason: default package */
/* compiled from: PG */
public final class asu {
    public final int a;
    public final String b;
    public final List c;
    public final byte[] d;

    public asu(int i, String str, List list, byte[] bArr) {
        List list2;
        this.a = i;
        this.b = str;
        if (list == null) {
            list2 = Collections.emptyList();
        } else {
            list2 = Collections.unmodifiableList(list);
        }
        this.c = list2;
        this.d = bArr;
    }
}
