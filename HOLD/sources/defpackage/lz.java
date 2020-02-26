package defpackage;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseArray;

/* renamed from: lz  reason: default package */
/* compiled from: PG */
public final class lz {
    private static final SparseArray b = new SparseArray();
    public final PorterDuffColorFilter[] a = new PorterDuffColorFilter[256];

    private lz(int i, int i2, int i3) {
        for (int i4 = 0; i4 <= 255; i4++) {
            this.a[i4] = new PorterDuffColorFilter(Color.argb(i4, i, i2, i3), PorterDuff.Mode.SRC_ATOP);
        }
    }

    public static lz a(int i) {
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        int rgb = Color.rgb(red, green, blue);
        lz lzVar = (lz) b.get(rgb);
        if (lzVar != null) {
            return lzVar;
        }
        lz lzVar2 = new lz(red, green, blue);
        b.put(rgb, lzVar2);
        return lzVar2;
    }
}
