package p000;

import android.text.Layout;

/* renamed from: bdx */
/* compiled from: PG */
final class bdx extends bdj implements Comparable {

    /* renamed from: p */
    private final int f3474p;

    public bdx(CharSequence charSequence, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
        super(charSequence, alignment, f, 0, i, f2, i2, -3.4028235E38f, z, i3);
        this.f3474p = i4;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i = ((bdx) obj).f3474p;
        int i2 = this.f3474p;
        if (i >= i2) {
            return i <= i2 ? 0 : 1;
        }
        return -1;
    }
}
