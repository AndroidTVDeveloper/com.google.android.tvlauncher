package defpackage;

import java.util.List;

/* renamed from: az  reason: default package */
/* compiled from: PG */
public final class az {
    public final int[] a;
    public final float[] b;

    public az(int i, int i2) {
        this.a = new int[]{i, i2};
        this.b = new float[]{0.0f, 1.0f};
    }

    public az(int i, int i2, int i3) {
        this.a = new int[]{i, i2, i3};
        this.b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public az(List list, List list2) {
        int size = list.size();
        this.a = new int[size];
        this.b = new float[size];
        for (int i = 0; i < size; i++) {
            this.a[i] = ((Integer) list.get(i)).intValue();
            this.b[i] = ((Float) list2.get(i)).floatValue();
        }
    }
}
