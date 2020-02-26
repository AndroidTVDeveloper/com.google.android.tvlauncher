package defpackage;

import android.graphics.Color;

/* renamed from: os  reason: default package */
/* compiled from: PG */
public final class os {
    public final int a;
    public final int b;
    public final int c;

    public os(int i, int i2, int i3) {
        this.a = i;
        if (i2 == i) {
            i2 = Color.argb((int) ((((float) Color.alpha(i)) * 0.85f) + 38.25f), (int) ((((float) Color.red(i)) * 0.85f) + 38.25f), (int) ((((float) Color.green(i)) * 0.85f) + 38.25f), (int) ((((float) Color.blue(i)) * 0.85f) + 38.25f));
        }
        this.b = i2;
        this.c = i3;
    }
}
