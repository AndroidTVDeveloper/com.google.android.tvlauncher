package defpackage;

import android.text.Layout;

/* renamed from: bdx  reason: default package */
/* compiled from: PG */
final class bdx extends bdj implements Comparable {
    private final int p;

    public bdx(CharSequence charSequence, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
        super(charSequence, alignment, f, 0, i, f2, i2, -3.4028235E38f, z, i3);
        this.p = i4;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i = ((bdx) obj).p;
        int i2 = this.p;
        if (i >= i2) {
            return i <= i2 ? 0 : 1;
        }
        return -1;
    }
}
