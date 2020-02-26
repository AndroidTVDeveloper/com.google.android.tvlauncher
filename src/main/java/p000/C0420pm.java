package p000;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;

/* renamed from: pm */
/* compiled from: PG */
public final class C0420pm {

    /* renamed from: a */
    private final Bitmap f10160a;

    /* renamed from: b */
    private final List f10161b = new ArrayList();

    /* renamed from: c */
    private final List f10162c = new ArrayList();

    public C0420pm(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            throw new IllegalArgumentException("Bitmap is not valid");
        }
        this.f10162c.add(C0423pp.f10172f);
        this.f10160a = bitmap;
        this.f10161b.add(C0424pq.f10178a);
        this.f10161b.add(C0424pq.f10179b);
        this.f10161b.add(C0424pq.f10180c);
        this.f10161b.add(C0424pq.f10181d);
        this.f10161b.add(C0424pq.f10182e);
        this.f10161b.add(C0424pq.f10183f);
    }

    /* renamed from: a */
    public final C0423pp mo5747a() {
        double d;
        C0421pn[] pnVarArr;
        float f;
        Bitmap bitmap = this.f10160a;
        int width = bitmap.getWidth() * bitmap.getHeight();
        if (width > 12544) {
            double d2 = (double) width;
            Double.isNaN(d2);
            d = Math.sqrt(12544.0d / d2);
        } else {
            d = -1.0d;
        }
        char c = 0;
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
        if (!this.f10162c.isEmpty()) {
            List list = this.f10162c;
            pnVarArr = (C0421pn[]) list.toArray(new C0421pn[list.size()]);
        } else {
            pnVarArr = null;
        }
        C0418pk pkVar = new C0418pk(iArr, pnVarArr);
        if (bitmap != this.f10160a) {
            bitmap.recycle();
        }
        C0423pp ppVar = new C0423pp(pkVar.f10157c, this.f10161b);
        int size = ppVar.f10174b.size();
        int i = 0;
        while (i < size) {
            C0424pq pqVar = (C0424pq) ppVar.f10174b.get(i);
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (float f4 : pqVar.f10186i) {
                if (f4 > 0.0f) {
                    f3 += f4;
                }
            }
            if (f3 != 0.0f) {
                int length = pqVar.f10186i.length;
                for (int i2 = 0; i2 < length; i2++) {
                    float[] fArr = pqVar.f10186i;
                    float f5 = fArr[i2];
                    if (f5 > 0.0f) {
                        fArr[i2] = f5 / f3;
                    }
                }
            }
            C0087dd ddVar = ppVar.f10175c;
            int size2 = ppVar.f10173a.size();
            int i3 = 0;
            C0422po poVar = null;
            float f6 = 0.0f;
            while (i3 < size2) {
                C0422po poVar2 = (C0422po) ppVar.f10173a.get(i3);
                float[] a = poVar2.mo5748a();
                float f7 = a[1];
                float[] fArr2 = pqVar.f10184g;
                if (f7 >= fArr2[c] && f7 <= fArr2[2]) {
                    float f8 = a[2];
                    float[] fArr3 = pqVar.f10185h;
                    if (f8 >= fArr3[c] && f8 <= fArr3[2] && !ppVar.f10176d.get(poVar2.f10163a)) {
                        float[] a2 = poVar2.mo5748a();
                        C0422po poVar3 = ppVar.f10177e;
                        int i4 = poVar3 != null ? poVar3.f10164b : 1;
                        float abs = pqVar.mo5754a() > f2 ? (1.0f - Math.abs(a2[1] - pqVar.f10184g[1])) * pqVar.mo5754a() : 0.0f;
                        if (pqVar.mo5755b() > f2) {
                            f = pqVar.mo5755b() * (1.0f - Math.abs(a2[2] - pqVar.f10185h[1]));
                        } else {
                            f = 0.0f;
                        }
                        float c2 = abs + f + (pqVar.mo5756c() > 0.0f ? pqVar.mo5756c() * (((float) poVar2.f10164b) / ((float) i4)) : 0.0f);
                        if (poVar != null && c2 <= f6) {
                            i3++;
                            c = 0;
                            f2 = 0.0f;
                        } else {
                            f6 = c2;
                            poVar = poVar2;
                            i3++;
                            c = 0;
                            f2 = 0.0f;
                        }
                    }
                }
                i3++;
                c = 0;
                f2 = 0.0f;
            }
            if (poVar != null) {
                boolean z = pqVar.f10187j;
                ppVar.f10176d.append(poVar.f10163a, true);
            }
            ddVar.put(pqVar, poVar);
            i++;
            c = 0;
        }
        ppVar.f10176d.clear();
        return ppVar;
    }
}
