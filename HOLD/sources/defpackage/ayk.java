package defpackage;

import android.util.Log;

/* renamed from: ayk  reason: default package */
/* compiled from: PG */
public final class ayk implements ayn {
    public final axw[] a;
    private final int[] b;

    public ayk(int[] iArr, axw[] axwArr) {
        this.b = iArr;
        this.a = axwArr;
    }

    public final void a(long j) {
        for (axw axw : this.a) {
            if (axw != null) {
                axw.b(j);
            }
        }
    }

    public final aov a(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.b;
            if (i2 >= iArr.length) {
                StringBuilder sb = new StringBuilder(36);
                sb.append("Unmatched track of type: ");
                sb.append(i);
                Log.e("BaseMediaChunkOutput", sb.toString());
                return new aoh();
            } else if (i == iArr[i2]) {
                return this.a[i2];
            } else {
                i2++;
            }
        }
    }
}
