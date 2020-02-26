package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bef */
/* compiled from: PG */
public final class bef extends anm {

    /* renamed from: d */
    private final beo f3526d;

    public bef(List list) {
        bky bky = new bky((byte[]) list.get(0));
        this.f3526d = new beo(bky.mo2076e(), bky.mo2076e());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bdl mo1155a(byte[] bArr, int i, boolean z) {
        bep bep;
        bep bep2;
        List list;
        int i2;
        int i3;
        bep bep3;
        SparseArray sparseArray;
        SparseArray sparseArray2;
        Paint paint;
        int[] iArr;
        bel bel;
        int i4;
        int i5;
        int i6;
        int i7;
        if (z) {
            ben ben = this.f3526d.f3575f;
            ben.f3560c.clear();
            ben.f3561d.clear();
            ben.f3562e.clear();
            ben.f3563f.clear();
            ben.f3564g.clear();
            ben.f3565h = null;
            ben.f3566i = null;
        }
        beo beo = this.f3526d;
        bkx bkx = new bkx(bArr, i);
        while (true) {
            boolean z2 = true;
            if (bkx.mo2049a() < 48 || bkx.mo2057c(8) != 15) {
                ben ben2 = beo.f3575f;
            } else {
                ben ben3 = beo.f3575f;
                int c = bkx.mo2057c(8);
                int i8 = 16;
                int c2 = bkx.mo2057c(16);
                int c3 = bkx.mo2057c(16);
                int c4 = bkx.mo2056c() + c3;
                if ((c3 << 3) > bkx.mo2049a()) {
                    Log.w("DvbParser", "Data field length exceeds limit");
                    bkx.mo2054b(bkx.mo2049a());
                } else {
                    switch (c) {
                        case 16:
                            if (c2 == ben3.f3558a) {
                                bej bej = ben3.f3566i;
                                bkx.mo2057c(8);
                                int c5 = bkx.mo2057c(4);
                                int c6 = bkx.mo2057c(2);
                                bkx.mo2054b(2);
                                int i9 = c3 - 2;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i9 > 0) {
                                    int c7 = bkx.mo2057c(8);
                                    bkx.mo2054b(8);
                                    i9 -= 6;
                                    sparseArray3.put(c7, new bek(bkx.mo2057c(16), bkx.mo2057c(16)));
                                }
                                bej bej2 = new bej(c5, c6, sparseArray3);
                                if (bej2.f3542b == 0) {
                                    if (!(bej == null || bej.f3541a == bej2.f3541a)) {
                                        ben3.f3566i = bej2;
                                        break;
                                    }
                                } else {
                                    ben3.f3566i = bej2;
                                    ben3.f3560c.clear();
                                    ben3.f3561d.clear();
                                    ben3.f3562e.clear();
                                    break;
                                }
                            }
                            break;
                        case 17:
                            bej bej3 = ben3.f3566i;
                            if (c2 == ben3.f3558a && bej3 != null) {
                                int c8 = bkx.mo2057c(8);
                                bkx.mo2054b(4);
                                boolean e = bkx.mo2060e();
                                bkx.mo2054b(3);
                                int c9 = bkx.mo2057c(16);
                                int c10 = bkx.mo2057c(16);
                                bkx.mo2057c(3);
                                int c11 = bkx.mo2057c(3);
                                bkx.mo2054b(2);
                                int c12 = bkx.mo2057c(8);
                                int c13 = bkx.mo2057c(8);
                                int c14 = bkx.mo2057c(4);
                                int c15 = bkx.mo2057c(2);
                                bkx.mo2054b(2);
                                int i10 = c3 - 10;
                                SparseArray sparseArray4 = new SparseArray();
                                while (i10 > 0) {
                                    int c16 = bkx.mo2057c(i8);
                                    int c17 = bkx.mo2057c(2);
                                    bkx.mo2057c(2);
                                    int c18 = bkx.mo2057c(12);
                                    bkx.mo2054b(4);
                                    int c19 = bkx.mo2057c(12);
                                    i10 -= 6;
                                    if (c17 == 1 || c17 == 2) {
                                        bkx.mo2057c(8);
                                        bkx.mo2057c(8);
                                        i10 -= 2;
                                    }
                                    sparseArray4.put(c16, new bem(c18, c19));
                                    i8 = 16;
                                }
                                bel bel2 = new bel(c8, e, c9, c10, c11, c12, c13, c14, c15, sparseArray4);
                                if (bej3.f3542b == 0 && (bel = (bel) ben3.f3560c.get(bel2.f3546a)) != null) {
                                    SparseArray sparseArray5 = bel.f3555j;
                                    for (int i11 = 0; i11 < sparseArray5.size(); i11++) {
                                        bel2.f3555j.put(sparseArray5.keyAt(i11), (bem) sparseArray5.valueAt(i11));
                                    }
                                }
                                ben3.f3560c.put(bel2.f3546a, bel2);
                                break;
                            }
                        case 18:
                            if (c2 != ben3.f3558a) {
                                if (c2 == ben3.f3559b) {
                                    beg a = beo.m2984a(bkx, c3);
                                    ben3.f3563f.put(a.f3527a, a);
                                    break;
                                }
                            } else {
                                beg a2 = beo.m2984a(bkx, c3);
                                ben3.f3561d.put(a2.f3527a, a2);
                                break;
                            }
                            break;
                        case 19:
                            if (c2 != ben3.f3558a) {
                                if (c2 == ben3.f3559b) {
                                    bei a3 = beo.m2985a(bkx);
                                    ben3.f3564g.put(a3.f3537a, a3);
                                    break;
                                }
                            } else {
                                bei a4 = beo.m2985a(bkx);
                                ben3.f3562e.put(a4.f3537a, a4);
                                break;
                            }
                            break;
                        case 20:
                            if (c2 == ben3.f3558a) {
                                bkx.mo2054b(4);
                                boolean e2 = bkx.mo2060e();
                                bkx.mo2054b(3);
                                int c20 = bkx.mo2057c(16);
                                int c21 = bkx.mo2057c(16);
                                if (e2) {
                                    int c22 = bkx.mo2057c(16);
                                    i6 = bkx.mo2057c(16);
                                    i5 = bkx.mo2057c(16);
                                    i7 = c22;
                                    i4 = bkx.mo2057c(16);
                                } else {
                                    i6 = c20;
                                    i4 = c21;
                                    i7 = 0;
                                    i5 = 0;
                                }
                                ben3.f3565h = new beh(c20, c21, i7, i6, i5, i4);
                                break;
                            }
                            break;
                    }
                    int c23 = c4 - bkx.mo2056c();
                    if (bkx.f4256c != 0) {
                        z2 = false;
                    }
                    bks.m3512b(z2);
                    bkx.f4255b += c23;
                    bkx.mo2062g();
                }
            }
        }
        ben ben22 = beo.f3575f;
        if (ben22.f3566i == null) {
            list = Collections.emptyList();
            bep2 = bep;
        } else {
            beh beh = ben22.f3565h;
            if (beh == null) {
                beh = beo.f3573d;
            }
            Bitmap bitmap = beo.f3576g;
            if (!(bitmap != null && beh.f3531a + 1 == bitmap.getWidth() && beh.f3532b + 1 == beo.f3576g.getHeight())) {
                beo.f3576g = Bitmap.createBitmap(beh.f3531a + 1, beh.f3532b + 1, Bitmap.Config.ARGB_8888);
                beo.f3572c.setBitmap(beo.f3576g);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray6 = beo.f3575f.f3566i.f3543c;
            int i12 = 0;
            while (i12 < sparseArray6.size()) {
                beo.f3572c.save();
                bek bek = (bek) sparseArray6.valueAt(i12);
                bel bel3 = (bel) beo.f3575f.f3560c.get(sparseArray6.keyAt(i12));
                int i13 = bek.f3544a + beh.f3533c;
                int i14 = bek.f3545b + beh.f3535e;
                beo.f3572c.clipRect(i13, i14, Math.min(bel3.f3548c + i13, beh.f3534d), Math.min(bel3.f3549d + i14, beh.f3536f));
                beg beg = (beg) beo.f3575f.f3561d.get(bel3.f3551f);
                if (beg == null && (beg = (beg) beo.f3575f.f3563f.get(bel3.f3551f)) == null) {
                    beg = beo.f3574e;
                }
                SparseArray sparseArray7 = bel3.f3555j;
                int i15 = 0;
                while (i15 < sparseArray7.size()) {
                    int keyAt = sparseArray7.keyAt(i15);
                    bem bem = (bem) sparseArray7.valueAt(i15);
                    bei bei = (bei) beo.f3575f.f3562e.get(keyAt);
                    if (bei == null) {
                        bei = (bei) beo.f3575f.f3564g.get(keyAt);
                    }
                    if (bei == null) {
                        bep3 = bep;
                        sparseArray2 = sparseArray6;
                        i3 = i12;
                        sparseArray = sparseArray7;
                    } else {
                        if (!bei.f3538b) {
                            paint = beo.f3570a;
                        } else {
                            paint = null;
                        }
                        int i16 = bel3.f3550e;
                        sparseArray2 = sparseArray6;
                        int i17 = bem.f3556a + i13;
                        int i18 = bem.f3557b + i14;
                        sparseArray = sparseArray7;
                        Canvas canvas = beo.f3572c;
                        bep3 = bep;
                        if (i16 == 3) {
                            iArr = beg.f3530d;
                        } else if (i16 != 2) {
                            iArr = beg.f3528b;
                        } else {
                            iArr = beg.f3529c;
                        }
                        i3 = i12;
                        int[] iArr2 = iArr;
                        int i19 = i16;
                        int i20 = i17;
                        Paint paint2 = paint;
                        Canvas canvas2 = canvas;
                        beo.m2986a(bei.f3539c, iArr2, i19, i20, i18, paint2, canvas2);
                        beo.m2986a(bei.f3540d, iArr2, i19, i20, i18 + 1, paint2, canvas2);
                    }
                    i15++;
                    sparseArray6 = sparseArray2;
                    sparseArray7 = sparseArray;
                    bep = bep3;
                    i12 = i3;
                }
                bep bep4 = bep;
                SparseArray sparseArray8 = sparseArray6;
                int i21 = i12;
                if (bel3.f3547b) {
                    int i22 = bel3.f3550e;
                    if (i22 == 3) {
                        i2 = beg.f3530d[bel3.f3552g];
                    } else {
                        i2 = i22 == 2 ? beg.f3529c[bel3.f3553h] : beg.f3528b[bel3.f3554i];
                    }
                    beo.f3571b.setColor(i2);
                    beo.f3572c.drawRect((float) i13, (float) i14, (float) (bel3.f3548c + i13), (float) (bel3.f3549d + i14), beo.f3571b);
                }
                Bitmap createBitmap = Bitmap.createBitmap(beo.f3576g, i13, i14, bel3.f3548c, bel3.f3549d);
                float f = (float) beh.f3531a;
                float f2 = (float) beh.f3532b;
                arrayList.add(new bdj(createBitmap, ((float) i13) / f, ((float) i14) / f2, 0, ((float) bel3.f3548c) / f, ((float) bel3.f3549d) / f2));
                beo.f3572c.drawColor(0, PorterDuff.Mode.CLEAR);
                beo.f3572c.restore();
                i12 = i21 + 1;
                sparseArray6 = sparseArray8;
                bep = bep4;
            }
            bep2 = bep;
            list = Collections.unmodifiableList(arrayList);
        }
        return new bep(list);
    }
}
