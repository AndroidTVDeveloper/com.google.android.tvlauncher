package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;

/* renamed from: pm  reason: default package */
/* compiled from: PG */
public final class pm {
    private final Bitmap a;
    private final List b = new ArrayList();
    private final List c = new ArrayList();

    public pm(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            throw new IllegalArgumentException("Bitmap is not valid");
        }
        this.c.add(pp.f);
        this.a = bitmap;
        this.b.add(pq.a);
        this.b.add(pq.b);
        this.b.add(pq.c);
        this.b.add(pq.d);
        this.b.add(pq.e);
        this.b.add(pq.f);
    }

    public final pp a() {
        double d;
        pn[] pnVarArr;
        float f;
        Bitmap bitmap = this.a;
        int width = bitmap.getWidth() * bitmap.getHeight();
        if (width > 12544) {
            double d2 = (double) width;
            Double.isNaN(d2);
            d = Math.sqrt(12544.0d / d2);
        } else {
            d = -1.0d;
        }
        char c2 = 0;
        if (d > 0.0d) {
            double width2 = (double) bitmap.getWidth();
            Double.isNaN(width2);
            double height = (double) bitmap.getHeight();
            Double.isNaN(height);
            bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(width2 * d), (int) Math.ceil(height * d), false);
        }
        int width3 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        int[] iArr = new int[(width3 * height2)];
        bitmap.getPixels(iArr, 0, width3, 0, 0, width3, height2);
        if (!this.c.isEmpty()) {
            List list = this.c;
            pnVarArr = (pn[]) list.toArray(new pn[list.size()]);
        } else {
            pnVarArr = null;
        }
        pk pkVar = new pk(iArr, pnVarArr);
        if (bitmap != this.a) {
            bitmap.recycle();
        }
        pp ppVar = new pp(pkVar.c, this.b);
        int size = ppVar.b.size();
        int i = 0;
        while (i < size) {
            pq pqVar = (pq) ppVar.b.get(i);
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (float f4 : pqVar.i) {
                if (f4 > 0.0f) {
                    f3 += f4;
                }
            }
            if (f3 != 0.0f) {
                int length = pqVar.i.length;
                for (int i2 = 0; i2 < length; i2++) {
                    float[] fArr = pqVar.i;
                    float f5 = fArr[i2];
                    if (f5 > 0.0f) {
                        fArr[i2] = f5 / f3;
                    }
                }
            }
            dd ddVar = ppVar.c;
            int size2 = ppVar.a.size();
            int i3 = 0;
            po poVar = null;
            float f6 = 0.0f;
            while (i3 < size2) {
                po poVar2 = (po) ppVar.a.get(i3);
                float[] a2 = poVar2.a();
                float f7 = a2[1];
                float[] fArr2 = pqVar.g;
                if (f7 >= fArr2[c2] && f7 <= fArr2[2]) {
                    float f8 = a2[2];
                    float[] fArr3 = pqVar.h;
                    if (f8 >= fArr3[c2] && f8 <= fArr3[2] && !ppVar.d.get(poVar2.a)) {
                        float[] a3 = poVar2.a();
                        po poVar3 = ppVar.e;
                        int i4 = poVar3 != null ? poVar3.b : 1;
                        float abs = pqVar.a() > f2 ? (1.0f - Math.abs(a3[1] - pqVar.g[1])) * pqVar.a() : 0.0f;
                        if (pqVar.b() > f2) {
                            f = pqVar.b() * (1.0f - Math.abs(a3[2] - pqVar.h[1]));
                        } else {
                            f = 0.0f;
                        }
                        float c3 = abs + f + (pqVar.c() > 0.0f ? pqVar.c() * (((float) poVar2.b) / ((float) i4)) : 0.0f);
                        if (poVar != null && c3 <= f6) {
                            i3++;
                            c2 = 0;
                            f2 = 0.0f;
                        } else {
                            f6 = c3;
                            poVar = poVar2;
                            i3++;
                            c2 = 0;
                            f2 = 0.0f;
                        }
                    }
                }
                i3++;
                c2 = 0;
                f2 = 0.0f;
            }
            if (poVar != null) {
                boolean z = pqVar.j;
                ppVar.d.append(poVar.a, true);
            }
            ddVar.put(pqVar, poVar);
            i++;
            c2 = 0;
        }
        ppVar.d.clear();
        return ppVar;
    }
}
