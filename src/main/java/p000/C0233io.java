package p000;

import android.support.p002v7.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: io */
/* compiled from: PG */
public final class C0233io implements C0268jw {

    /* renamed from: a */
    public int f9613a;

    /* renamed from: b */
    public int f9614b;

    /* renamed from: c */
    public int[] f9615c;

    /* renamed from: d */
    public int f9616d;

    /* renamed from: a */
    public final void mo5261a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        } else if (i2 >= 0) {
            int i3 = this.f9616d;
            int i4 = i3 + i3;
            int[] iArr = this.f9615c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f9615c = iArr2;
                Arrays.fill(iArr2, -1);
            } else {
                int length = iArr.length;
                if (i4 >= length) {
                    int[] iArr3 = new int[(i4 + i4)];
                    this.f9615c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, length);
                }
            }
            int[] iArr4 = this.f9615c;
            iArr4[i4] = i;
            iArr4[i4 + 1] = i2;
            this.f9616d++;
        } else {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5260a() {
        int[] iArr = this.f9615c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f9616d = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5262a(RecyclerView recyclerView, boolean z) {
        this.f9616d = 0;
        int[] iArr = this.f9615c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        C0269jx jxVar = recyclerView.f1068h;
        if (recyclerView.f1067g != null && jxVar != null && jxVar.f9712e) {
            if (z) {
                if (!recyclerView.f1062b.mo5090d()) {
                    jxVar.mo5335a(recyclerView.f1067g.mo2794a(), this);
                }
            } else if (!recyclerView.mo909q()) {
                jxVar.mo5334a(this.f9613a, this.f9614b, recyclerView.f1024D, this);
            }
            int i = this.f9616d;
            if (i > jxVar.f9713f) {
                jxVar.f9713f = i;
                jxVar.f9714g = z;
                recyclerView.f1041a.mo5397b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo5263a(int i) {
        if (this.f9615c != null) {
            int i2 = this.f9616d;
            int i3 = i2 + i2;
            for (int i4 = 0; i4 < i3; i4 += 2) {
                if (this.f9615c[i4] == i) {
                    return true;
                }
            }
        }
        return false;
    }
}
