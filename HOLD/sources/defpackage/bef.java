package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bef  reason: default package */
/* compiled from: PG */
public final class bef extends anm {
    private final beo d;

    public bef(List list) {
        bky bky = new bky((byte[]) list.get(0));
        this.d = new beo(bky.e(), bky.e());
    }

    /* access modifiers changed from: protected */
    public final bdl a(byte[] bArr, int i, boolean z) {
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
            ben ben = this.d.f;
            ben.c.clear();
            ben.d.clear();
            ben.e.clear();
            ben.f.clear();
            ben.g.clear();
            ben.h = null;
            ben.i = null;
        }
        beo beo = this.d;
        bkx bkx = new bkx(bArr, i);
        while (true) {
            boolean z2 = true;
            if (bkx.a() < 48 || bkx.c(8) != 15) {
                ben ben2 = beo.f;
            } else {
                ben ben3 = beo.f;
                int c = bkx.c(8);
                int i8 = 16;
                int c2 = bkx.c(16);
                int c3 = bkx.c(16);
                int c4 = bkx.c() + c3;
                if ((c3 << 3) > bkx.a()) {
                    Log.w("DvbParser", "Data field length exceeds limit");
                    bkx.b(bkx.a());
                } else {
                    switch (c) {
                        case 16:
                            if (c2 == ben3.a) {
                                bej bej = ben3.i;
                                bkx.c(8);
                                int c5 = bkx.c(4);
                                int c6 = bkx.c(2);
                                bkx.b(2);
                                int i9 = c3 - 2;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i9 > 0) {
                                    int c7 = bkx.c(8);
                                    bkx.b(8);
                                    i9 -= 6;
                                    sparseArray3.put(c7, new bek(bkx.c(16), bkx.c(16)));
                                }
                                bej bej2 = new bej(c5, c6, sparseArray3);
                                if (bej2.b == 0) {
                                    if (!(bej == null || bej.a == bej2.a)) {
                                        ben3.i = bej2;
                                        break;
                                    }
                                } else {
                                    ben3.i = bej2;
                                    ben3.c.clear();
                                    ben3.d.clear();
                                    ben3.e.clear();
                                    break;
                                }
                            }
                            break;
                        case 17:
                            bej bej3 = ben3.i;
                            if (c2 == ben3.a && bej3 != null) {
                                int c8 = bkx.c(8);
                                bkx.b(4);
                                boolean e = bkx.e();
                                bkx.b(3);
                                int c9 = bkx.c(16);
                                int c10 = bkx.c(16);
                                bkx.c(3);
                                int c11 = bkx.c(3);
                                bkx.b(2);
                                int c12 = bkx.c(8);
                                int c13 = bkx.c(8);
                                int c14 = bkx.c(4);
                                int c15 = bkx.c(2);
                                bkx.b(2);
                                int i10 = c3 - 10;
                                SparseArray sparseArray4 = new SparseArray();
                                while (i10 > 0) {
                                    int c16 = bkx.c(i8);
                                    int c17 = bkx.c(2);
                                    bkx.c(2);
                                    int c18 = bkx.c(12);
                                    bkx.b(4);
                                    int c19 = bkx.c(12);
                                    i10 -= 6;
                                    if (c17 == 1 || c17 == 2) {
                                        bkx.c(8);
                                        bkx.c(8);
                                        i10 -= 2;
                                    }
                                    sparseArray4.put(c16, new bem(c18, c19));
                                    i8 = 16;
                                }
                                bel bel2 = new bel(c8, e, c9, c10, c11, c12, c13, c14, c15, sparseArray4);
                                if (bej3.b == 0 && (bel = (bel) ben3.c.get(bel2.a)) != null) {
                                    SparseArray sparseArray5 = bel.j;
                                    for (int i11 = 0; i11 < sparseArray5.size(); i11++) {
                                        bel2.j.put(sparseArray5.keyAt(i11), (bem) sparseArray5.valueAt(i11));
                                    }
                                }
                                ben3.c.put(bel2.a, bel2);
                                break;
                            }
                        case 18:
                            if (c2 != ben3.a) {
                                if (c2 == ben3.b) {
                                    beg a = beo.a(bkx, c3);
                                    ben3.f.put(a.a, a);
                                    break;
                                }
                            } else {
                                beg a2 = beo.a(bkx, c3);
                                ben3.d.put(a2.a, a2);
                                break;
                            }
                            break;
                        case 19:
                            if (c2 != ben3.a) {
                                if (c2 == ben3.b) {
                                    bei a3 = beo.a(bkx);
                                    ben3.g.put(a3.a, a3);
                                    break;
                                }
                            } else {
                                bei a4 = beo.a(bkx);
                                ben3.e.put(a4.a, a4);
                                break;
                            }
                            break;
                        case 20:
                            if (c2 == ben3.a) {
                                bkx.b(4);
                                boolean e2 = bkx.e();
                                bkx.b(3);
                                int c20 = bkx.c(16);
                                int c21 = bkx.c(16);
                                if (e2) {
                                    int c22 = bkx.c(16);
                                    i6 = bkx.c(16);
                                    i5 = bkx.c(16);
                                    i7 = c22;
                                    i4 = bkx.c(16);
                                } else {
                                    i6 = c20;
                                    i4 = c21;
                                    i7 = 0;
                                    i5 = 0;
                                }
                                ben3.h = new beh(c20, c21, i7, i6, i5, i4);
                                break;
                            }
                            break;
                    }
                    int c23 = c4 - bkx.c();
                    if (bkx.c != 0) {
                        z2 = false;
                    }
                    bks.b(z2);
                    bkx.b += c23;
                    bkx.g();
                }
            }
        }
        ben ben22 = beo.f;
        if (ben22.i == null) {
            list = Collections.emptyList();
            bep2 = bep;
        } else {
            beh beh = ben22.h;
            if (beh == null) {
                beh = beo.d;
            }
            Bitmap bitmap = beo.g;
            if (!(bitmap != null && beh.a + 1 == bitmap.getWidth() && beh.b + 1 == beo.g.getHeight())) {
                beo.g = Bitmap.createBitmap(beh.a + 1, beh.b + 1, Bitmap.Config.ARGB_8888);
                beo.c.setBitmap(beo.g);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray6 = beo.f.i.c;
            int i12 = 0;
            while (i12 < sparseArray6.size()) {
                beo.c.save();
                bek bek = (bek) sparseArray6.valueAt(i12);
                bel bel3 = (bel) beo.f.c.get(sparseArray6.keyAt(i12));
                int i13 = bek.a + beh.c;
                int i14 = bek.b + beh.e;
                beo.c.clipRect(i13, i14, Math.min(bel3.c + i13, beh.d), Math.min(bel3.d + i14, beh.f));
                beg beg = (beg) beo.f.d.get(bel3.f);
                if (beg == null && (beg = (beg) beo.f.f.get(bel3.f)) == null) {
                    beg = beo.e;
                }
                SparseArray sparseArray7 = bel3.j;
                int i15 = 0;
                while (i15 < sparseArray7.size()) {
                    int keyAt = sparseArray7.keyAt(i15);
                    bem bem = (bem) sparseArray7.valueAt(i15);
                    bei bei = (bei) beo.f.e.get(keyAt);
                    if (bei == null) {
                        bei = (bei) beo.f.g.get(keyAt);
                    }
                    if (bei == null) {
                        bep3 = bep;
                        sparseArray2 = sparseArray6;
                        i3 = i12;
                        sparseArray = sparseArray7;
                    } else {
                        if (!bei.b) {
                            paint = beo.a;
                        } else {
                            paint = null;
                        }
                        int i16 = bel3.e;
                        sparseArray2 = sparseArray6;
                        int i17 = bem.a + i13;
                        int i18 = bem.b + i14;
                        sparseArray = sparseArray7;
                        Canvas canvas = beo.c;
                        bep3 = bep;
                        if (i16 == 3) {
                            iArr = beg.d;
                        } else if (i16 != 2) {
                            iArr = beg.b;
                        } else {
                            iArr = beg.c;
                        }
                        i3 = i12;
                        int[] iArr2 = iArr;
                        int i19 = i16;
                        int i20 = i17;
                        Paint paint2 = paint;
                        Canvas canvas2 = canvas;
                        beo.a(bei.c, iArr2, i19, i20, i18, paint2, canvas2);
                        beo.a(bei.d, iArr2, i19, i20, i18 + 1, paint2, canvas2);
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
                if (bel3.b) {
                    int i22 = bel3.e;
                    if (i22 == 3) {
                        i2 = beg.d[bel3.g];
                    } else {
                        i2 = i22 == 2 ? beg.c[bel3.h] : beg.b[bel3.i];
                    }
                    beo.b.setColor(i2);
                    beo.c.drawRect((float) i13, (float) i14, (float) (bel3.c + i13), (float) (bel3.d + i14), beo.b);
                }
                Bitmap createBitmap = Bitmap.createBitmap(beo.g, i13, i14, bel3.c, bel3.d);
                float f = (float) beh.a;
                float f2 = (float) beh.b;
                arrayList.add(new bdj(createBitmap, ((float) i13) / f, ((float) i14) / f2, 0, ((float) bel3.c) / f, ((float) bel3.d) / f2));
                beo.c.drawColor(0, PorterDuff.Mode.CLEAR);
                beo.c.restore();
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
