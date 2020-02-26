package p000;

import android.support.p002v7.widget.RecyclerView;

/* renamed from: ig */
/* compiled from: PG */
final class C0225ig extends atc {

    /* renamed from: a */
    private final /* synthetic */ C0228ij f9567a;

    public C0225ig(C0228ij ijVar) {
        this.f9567a = ijVar;
    }

    /* renamed from: a */
    public final void mo1315a(RecyclerView recyclerView) {
        C0228ij ijVar = this.f9567a;
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        int computeVerticalScrollRange = ijVar.f9587j.computeVerticalScrollRange();
        int i = ijVar.f9586i;
        ijVar.f9588k = computeVerticalScrollRange - i > 0 && i >= ijVar.f9578a;
        int computeHorizontalScrollRange = ijVar.f9587j.computeHorizontalScrollRange();
        int i2 = ijVar.f9585h;
        boolean z = computeHorizontalScrollRange - i2 > 0 && i2 >= ijVar.f9578a;
        ijVar.f9589l = z;
        if (ijVar.f9588k) {
            float f = (float) i;
            ijVar.f9582e = (int) ((f * (((float) computeVerticalScrollOffset) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
            ijVar.f9581d = Math.min(i, (i * i) / computeVerticalScrollRange);
        } else if (!z) {
            if (ijVar.f9590m != 0) {
                ijVar.mo5249a(0);
                return;
            }
            return;
        }
        if (ijVar.f9589l) {
            float f2 = (float) i2;
            ijVar.f9584g = (int) ((f2 * (((float) computeHorizontalScrollOffset) + (f2 / 2.0f))) / ((float) computeHorizontalScrollRange));
            ijVar.f9583f = Math.min(i2, (i2 * i2) / computeHorizontalScrollRange);
        }
        int i3 = ijVar.f9590m;
        if (i3 == 0 || i3 == 1) {
            ijVar.mo5249a(1);
        }
    }
}
