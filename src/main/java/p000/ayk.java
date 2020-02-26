package p000;

import android.util.Log;

/* renamed from: ayk */
/* compiled from: PG */
public final class ayk implements ayn {

    /* renamed from: a */
    public final axw[] f2765a;

    /* renamed from: b */
    private final int[] f2766b;

    public ayk(int[] iArr, axw[] axwArr) {
        this.f2766b = iArr;
        this.f2765a = axwArr;
    }

    /* renamed from: a */
    public final void mo1623a(long j) {
        for (axw axw : this.f2765a) {
            if (axw != null) {
                axw.mo1587b(j);
            }
        }
    }

    /* renamed from: a */
    public final aov mo1622a(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.f2766b;
            if (i2 >= iArr.length) {
                StringBuilder sb = new StringBuilder(36);
                sb.append("Unmatched track of type: ");
                sb.append(i);
                Log.e("BaseMediaChunkOutput", sb.toString());
                return new aoh();
            } else if (i == iArr[i2]) {
                return this.f2765a[i2];
            } else {
                i2++;
            }
        }
    }
}
