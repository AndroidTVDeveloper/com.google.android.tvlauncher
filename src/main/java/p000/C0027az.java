package p000;

import java.util.List;

/* renamed from: az */
/* compiled from: PG */
public final class C0027az {

    /* renamed from: a */
    public final int[] f2834a;

    /* renamed from: b */
    public final float[] f2835b;

    public C0027az(int i, int i2) {
        this.f2834a = new int[]{i, i2};
        this.f2835b = new float[]{0.0f, 1.0f};
    }

    public C0027az(int i, int i2, int i3) {
        this.f2834a = new int[]{i, i2, i3};
        this.f2835b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C0027az(List list, List list2) {
        int size = list.size();
        this.f2834a = new int[size];
        this.f2835b = new float[size];
        for (int i = 0; i < size; i++) {
            this.f2834a[i] = ((Integer) list.get(i)).intValue();
            this.f2835b[i] = ((Float) list2.get(i)).floatValue();
        }
    }
}
