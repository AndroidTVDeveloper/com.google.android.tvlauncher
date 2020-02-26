package p000;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseArray;

/* renamed from: lz */
/* compiled from: PG */
public final class C0325lz {

    /* renamed from: b */
    private static final SparseArray f9941b = new SparseArray();

    /* renamed from: a */
    public final PorterDuffColorFilter[] f9942a = new PorterDuffColorFilter[256];

    private C0325lz(int i, int i2, int i3) {
        for (int i4 = 0; i4 <= 255; i4++) {
            this.f9942a[i4] = new PorterDuffColorFilter(Color.argb(i4, i, i2, i3), PorterDuff.Mode.SRC_ATOP);
        }
    }

    /* renamed from: a */
    public static C0325lz m7938a(int i) {
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        int rgb = Color.rgb(red, green, blue);
        C0325lz lzVar = (C0325lz) f9941b.get(rgb);
        if (lzVar != null) {
            return lzVar;
        }
        C0325lz lzVar2 = new C0325lz(red, green, blue);
        f9941b.put(rgb, lzVar2);
        return lzVar2;
    }
}
