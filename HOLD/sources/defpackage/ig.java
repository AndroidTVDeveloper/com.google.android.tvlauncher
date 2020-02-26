package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: ig  reason: default package */
/* compiled from: PG */
final class ig extends atc {
    private final /* synthetic */ ij a;

    public ig(ij ijVar) {
        this.a = ijVar;
    }

    public final void a(RecyclerView recyclerView) {
        ij ijVar = this.a;
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        int computeVerticalScrollRange = ijVar.j.computeVerticalScrollRange();
        int i = ijVar.i;
        ijVar.k = computeVerticalScrollRange - i > 0 && i >= ijVar.a;
        int computeHorizontalScrollRange = ijVar.j.computeHorizontalScrollRange();
        int i2 = ijVar.h;
        boolean z = computeHorizontalScrollRange - i2 > 0 && i2 >= ijVar.a;
        ijVar.l = z;
        if (ijVar.k) {
            float f = (float) i;
            ijVar.e = (int) ((f * (((float) computeVerticalScrollOffset) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
            ijVar.d = Math.min(i, (i * i) / computeVerticalScrollRange);
        } else if (!z) {
            if (ijVar.m != 0) {
                ijVar.a(0);
                return;
            }
            return;
        }
        if (ijVar.l) {
            float f2 = (float) i2;
            ijVar.g = (int) ((f2 * (((float) computeHorizontalScrollOffset) + (f2 / 2.0f))) / ((float) computeHorizontalScrollRange));
            ijVar.f = Math.min(i2, (i2 * i2) / computeHorizontalScrollRange);
        }
        int i3 = ijVar.m;
        if (i3 == 0 || i3 == 1) {
            ijVar.a(1);
        }
    }
}
