package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: bid  reason: default package */
/* compiled from: PG */
public final class bid implements bhn, bjf {
    public static final Map a;
    public static final long[] b = {5700000, 3500000, 2000000, 1100000, 470000};
    public static final long[] c = {200000, 148000, 132000, 115000, 95000};
    public static final long[] d = {2200000, 1300000, 970000, 810000, 490000};
    public static final long[] e = {5300000, 3200000, 2000000, 1400000, 690000};
    private static bid g;
    public final bkn f;
    private final Context h;
    private final SparseArray i;
    private final ble j;
    private int k;
    private long l;
    private long m;
    private int n;
    private long o;
    private long p;
    private long q;
    private long r;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("AD", new int[]{1, 1, 0, 0});
        hashMap.put("AE", new int[]{1, 4, 4, 4});
        hashMap.put("AF", new int[]{4, 4, 3, 3});
        hashMap.put("AG", new int[]{3, 1, 0, 1});
        hashMap.put("AI", new int[]{1, 0, 0, 3});
        hashMap.put("AL", new int[]{1, 2, 0, 1});
        hashMap.put("AM", new int[]{2, 2, 2, 2});
        hashMap.put("AO", new int[]{3, 4, 2, 0});
        hashMap.put("AR", new int[]{2, 3, 2, 2});
        hashMap.put("AS", new int[]{3, 0, 4, 2});
        hashMap.put("AT", new int[]{0, 3, 0, 0});
        hashMap.put("AU", new int[]{0, 3, 0, 1});
        hashMap.put("AW", new int[]{1, 1, 0, 3});
        hashMap.put("AX", new int[]{0, 3, 0, 2});
        hashMap.put("AZ", new int[]{3, 3, 3, 3});
        hashMap.put("BA", new int[]{1, 1, 0, 1});
        hashMap.put("BB", new int[]{0, 2, 0, 0});
        hashMap.put("BD", new int[]{2, 1, 3, 3});
        hashMap.put("BE", new int[]{0, 0, 0, 1});
        hashMap.put("BF", new int[]{4, 4, 4, 1});
        hashMap.put("BG", new int[]{0, 1, 0, 0});
        hashMap.put("BH", new int[]{2, 1, 3, 4});
        hashMap.put("BI", new int[]{4, 4, 4, 4});
        hashMap.put("BJ", new int[]{4, 4, 4, 4});
        hashMap.put("BL", new int[]{1, 0, 2, 2});
        hashMap.put("BM", new int[]{1, 2, 0, 0});
        hashMap.put("BN", new int[]{4, 1, 3, 2});
        hashMap.put("BO", new int[]{1, 2, 3, 2});
        hashMap.put("BQ", new int[]{1, 1, 2, 4});
        hashMap.put("BR", new int[]{2, 3, 3, 2});
        hashMap.put("BS", new int[]{2, 1, 1, 4});
        hashMap.put("BT", new int[]{3, 0, 3, 1});
        hashMap.put("BW", new int[]{4, 4, 1, 2});
        hashMap.put("BY", new int[]{0, 1, 1, 2});
        hashMap.put("BZ", new int[]{2, 2, 2, 1});
        hashMap.put("CA", new int[]{0, 3, 1, 3});
        hashMap.put("CD", new int[]{4, 4, 2, 2});
        hashMap.put("CF", new int[]{4, 4, 3, 0});
        hashMap.put("CG", new int[]{3, 4, 2, 4});
        hashMap.put("CH", new int[]{0, 0, 1, 0});
        hashMap.put("CI", new int[]{3, 4, 3, 3});
        hashMap.put("CK", new int[]{2, 4, 1, 0});
        hashMap.put("CL", new int[]{1, 2, 2, 3});
        hashMap.put("CM", new int[]{3, 4, 3, 1});
        hashMap.put("CN", new int[]{2, 0, 2, 3});
        hashMap.put("CO", new int[]{2, 3, 2, 2});
        hashMap.put("CR", new int[]{2, 3, 4, 4});
        hashMap.put("CU", new int[]{4, 4, 3, 1});
        hashMap.put("CV", new int[]{2, 3, 1, 2});
        hashMap.put("CW", new int[]{1, 1, 0, 0});
        hashMap.put("CY", new int[]{1, 1, 0, 0});
        hashMap.put("CZ", new int[]{0, 1, 0, 0});
        hashMap.put("DE", new int[]{0, 1, 1, 3});
        hashMap.put("DJ", new int[]{4, 3, 4, 1});
        hashMap.put("DK", new int[]{0, 0, 1, 1});
        hashMap.put("DM", new int[]{1, 0, 1, 3});
        hashMap.put("DO", new int[]{3, 3, 4, 4});
        hashMap.put("DZ", new int[]{3, 3, 4, 4});
        hashMap.put("EC", new int[]{2, 3, 4, 3});
        hashMap.put("EE", new int[]{0, 1, 0, 0});
        hashMap.put("EG", new int[]{3, 4, 2, 2});
        hashMap.put("EH", new int[]{2, 0, 3, 3});
        hashMap.put("ER", new int[]{4, 2, 2, 0});
        hashMap.put("ES", new int[]{0, 1, 1, 1});
        hashMap.put("ET", new int[]{4, 4, 4, 0});
        hashMap.put("FI", new int[]{0, 0, 1, 0});
        hashMap.put("FJ", new int[]{3, 0, 3, 3});
        hashMap.put("FK", new int[]{3, 4, 2, 2});
        hashMap.put("FM", new int[]{4, 0, 4, 0});
        hashMap.put("FO", new int[]{0, 0, 0, 0});
        hashMap.put("FR", new int[]{1, 0, 3, 1});
        hashMap.put("GA", new int[]{3, 3, 2, 2});
        hashMap.put("GB", new int[]{0, 1, 3, 3});
        hashMap.put("GD", new int[]{2, 0, 4, 4});
        hashMap.put("GE", new int[]{1, 1, 1, 4});
        hashMap.put("GF", new int[]{2, 3, 4, 4});
        hashMap.put("GG", new int[]{0, 1, 0, 0});
        hashMap.put("GH", new int[]{3, 3, 2, 2});
        hashMap.put("GI", new int[]{0, 0, 0, 1});
        hashMap.put("GL", new int[]{2, 2, 0, 2});
        hashMap.put("GM", new int[]{4, 4, 3, 4});
        hashMap.put("GN", new int[]{3, 4, 4, 2});
        hashMap.put("GP", new int[]{2, 1, 1, 4});
        hashMap.put("GQ", new int[]{4, 4, 3, 0});
        hashMap.put("GR", new int[]{1, 1, 0, 2});
        hashMap.put("GT", new int[]{3, 3, 3, 3});
        hashMap.put("GU", new int[]{1, 2, 4, 4});
        hashMap.put("GW", new int[]{4, 4, 4, 1});
        hashMap.put("GY", new int[]{3, 2, 1, 1});
        hashMap.put("HK", new int[]{0, 2, 3, 4});
        hashMap.put("HN", new int[]{3, 2, 3, 2});
        hashMap.put("HR", new int[]{1, 1, 0, 1});
        hashMap.put("HT", new int[]{4, 4, 4, 4});
        hashMap.put("HU", new int[]{0, 1, 0, 0});
        hashMap.put("ID", new int[]{3, 2, 3, 4});
        hashMap.put("IE", new int[]{1, 0, 1, 1});
        hashMap.put("IL", new int[]{0, 0, 2, 3});
        hashMap.put("IM", new int[]{0, 0, 0, 1});
        hashMap.put("IN", new int[]{2, 2, 4, 4});
        hashMap.put("IO", new int[]{4, 2, 2, 2});
        hashMap.put("IQ", new int[]{3, 3, 4, 2});
        hashMap.put("IR", new int[]{3, 0, 2, 2});
        hashMap.put("IS", new int[]{0, 1, 0, 0});
        hashMap.put("IT", new int[]{1, 0, 1, 2});
        hashMap.put("JE", new int[]{1, 0, 0, 1});
        hashMap.put("JM", new int[]{2, 3, 3, 1});
        hashMap.put("JO", new int[]{1, 2, 1, 2});
        hashMap.put("JP", new int[]{0, 2, 1, 1});
        hashMap.put("KE", new int[]{3, 4, 4, 3});
        hashMap.put("KG", new int[]{1, 1, 2, 2});
        hashMap.put("KH", new int[]{1, 0, 4, 4});
        hashMap.put("KI", new int[]{4, 4, 4, 4});
        hashMap.put("KM", new int[]{4, 3, 2, 3});
        hashMap.put("KN", new int[]{1, 0, 1, 3});
        hashMap.put("KP", new int[]{4, 2, 4, 2});
        hashMap.put("KR", new int[]{0, 1, 1, 1});
        hashMap.put("KW", new int[]{2, 3, 1, 1});
        hashMap.put("KY", new int[]{1, 1, 0, 1});
        hashMap.put("KZ", new int[]{1, 2, 2, 3});
        hashMap.put("LA", new int[]{2, 2, 1, 1});
        hashMap.put("LB", new int[]{3, 2, 0, 0});
        hashMap.put("LC", new int[]{1, 1, 0, 0});
        hashMap.put("LI", new int[]{0, 0, 2, 4});
        hashMap.put("LK", new int[]{2, 1, 2, 3});
        hashMap.put("LR", new int[]{3, 4, 3, 1});
        hashMap.put("LS", new int[]{3, 3, 2, 0});
        hashMap.put("LT", new int[]{0, 0, 0, 0});
        hashMap.put("LU", new int[]{0, 0, 0, 0});
        hashMap.put("LV", new int[]{0, 0, 0, 0});
        hashMap.put("LY", new int[]{4, 4, 4, 4});
        hashMap.put("MA", new int[]{2, 1, 2, 1});
        hashMap.put("MC", new int[]{0, 0, 0, 1});
        hashMap.put("MD", new int[]{1, 1, 0, 0});
        hashMap.put("ME", new int[]{1, 2, 1, 2});
        hashMap.put("MF", new int[]{1, 1, 1, 1});
        hashMap.put("MG", new int[]{3, 4, 2, 2});
        hashMap.put("MH", new int[]{4, 0, 2, 4});
        hashMap.put("MK", new int[]{1, 0, 0, 0});
        hashMap.put("ML", new int[]{4, 4, 2, 0});
        hashMap.put("MM", new int[]{3, 3, 1, 2});
        hashMap.put("MN", new int[]{2, 3, 2, 3});
        hashMap.put("MO", new int[]{0, 0, 4, 4});
        hashMap.put("MP", new int[]{0, 2, 4, 4});
        hashMap.put("MQ", new int[]{2, 1, 1, 4});
        hashMap.put("MR", new int[]{4, 2, 4, 2});
        hashMap.put("MS", new int[]{1, 2, 3, 3});
        hashMap.put("MT", new int[]{0, 1, 0, 0});
        hashMap.put("MU", new int[]{2, 2, 3, 4});
        hashMap.put("MV", new int[]{4, 3, 0, 2});
        hashMap.put("MW", new int[]{3, 2, 1, 0});
        hashMap.put("MX", new int[]{2, 4, 4, 3});
        hashMap.put("MY", new int[]{2, 2, 3, 3});
        hashMap.put("MZ", new int[]{3, 3, 2, 1});
        hashMap.put("NA", new int[]{3, 3, 2, 1});
        hashMap.put("NC", new int[]{2, 0, 3, 3});
        hashMap.put("NE", new int[]{4, 4, 4, 3});
        hashMap.put("NF", new int[]{1, 2, 2, 2});
        hashMap.put("NG", new int[]{3, 4, 3, 1});
        hashMap.put("NI", new int[]{3, 3, 4, 4});
        hashMap.put("NL", new int[]{0, 2, 3, 3});
        hashMap.put("NO", new int[]{0, 1, 1, 0});
        hashMap.put("NP", new int[]{2, 2, 2, 2});
        hashMap.put("NR", new int[]{4, 0, 3, 1});
        hashMap.put("NZ", new int[]{0, 0, 1, 2});
        hashMap.put("OM", new int[]{3, 2, 1, 3});
        hashMap.put("PA", new int[]{1, 3, 3, 4});
        hashMap.put("PE", new int[]{2, 3, 4, 4});
        hashMap.put("PF", new int[]{2, 2, 0, 1});
        hashMap.put("PG", new int[]{4, 3, 3, 1});
        hashMap.put("PH", new int[]{3, 0, 3, 4});
        hashMap.put("PK", new int[]{3, 3, 3, 3});
        hashMap.put("PL", new int[]{1, 0, 1, 3});
        hashMap.put("PM", new int[]{0, 2, 2, 0});
        hashMap.put("PR", new int[]{1, 2, 3, 3});
        hashMap.put("PS", new int[]{3, 3, 2, 4});
        hashMap.put("PT", new int[]{1, 1, 0, 0});
        hashMap.put("PW", new int[]{2, 1, 2, 0});
        hashMap.put("PY", new int[]{2, 0, 2, 3});
        hashMap.put("QA", new int[]{2, 2, 1, 2});
        hashMap.put("RE", new int[]{1, 0, 2, 2});
        hashMap.put("RO", new int[]{0, 1, 1, 2});
        hashMap.put("RS", new int[]{1, 2, 0, 0});
        hashMap.put("RU", new int[]{0, 1, 1, 1});
        hashMap.put("RW", new int[]{4, 4, 2, 4});
        hashMap.put("SA", new int[]{2, 2, 2, 1});
        hashMap.put("SB", new int[]{4, 4, 3, 0});
        hashMap.put("SC", new int[]{4, 2, 0, 1});
        hashMap.put("SD", new int[]{4, 4, 4, 3});
        hashMap.put("SE", new int[]{0, 1, 0, 0});
        hashMap.put("SG", new int[]{0, 2, 3, 3});
        hashMap.put("SH", new int[]{4, 4, 2, 3});
        hashMap.put("SI", new int[]{0, 0, 0, 0});
        hashMap.put("SJ", new int[]{2, 0, 2, 4});
        hashMap.put("SK", new int[]{0, 1, 0, 0});
        hashMap.put("SL", new int[]{4, 3, 3, 3});
        hashMap.put("SM", new int[]{0, 0, 2, 4});
        hashMap.put("SN", new int[]{3, 4, 4, 2});
        hashMap.put("SO", new int[]{3, 4, 4, 3});
        hashMap.put("SR", new int[]{2, 2, 1, 0});
        hashMap.put("SS", new int[]{4, 3, 4, 3});
        hashMap.put("ST", new int[]{3, 4, 2, 2});
        hashMap.put("SV", new int[]{2, 3, 3, 4});
        hashMap.put("SX", new int[]{2, 4, 1, 0});
        hashMap.put("SY", new int[]{4, 3, 2, 1});
        hashMap.put("SZ", new int[]{4, 4, 3, 4});
        hashMap.put("TC", new int[]{1, 2, 1, 1});
        hashMap.put("TD", new int[]{4, 4, 4, 2});
        hashMap.put("TG", new int[]{3, 3, 1, 0});
        hashMap.put("TH", new int[]{1, 3, 4, 4});
        hashMap.put("TJ", new int[]{4, 4, 4, 4});
        hashMap.put("TL", new int[]{4, 2, 4, 4});
        hashMap.put("TM", new int[]{4, 1, 2, 2});
        hashMap.put("TN", new int[]{2, 2, 1, 2});
        hashMap.put("TO", new int[]{3, 3, 3, 1});
        hashMap.put("TR", new int[]{2, 2, 1, 2});
        hashMap.put("TT", new int[]{1, 3, 1, 2});
        hashMap.put("TV", new int[]{4, 2, 2, 4});
        hashMap.put("TW", new int[]{0, 0, 0, 0});
        hashMap.put("TZ", new int[]{3, 3, 4, 3});
        hashMap.put("UA", new int[]{0, 2, 1, 2});
        hashMap.put("UG", new int[]{4, 3, 3, 2});
        hashMap.put("US", new int[]{1, 1, 3, 3});
        hashMap.put("UY", new int[]{2, 2, 1, 1});
        hashMap.put("UZ", new int[]{2, 2, 2, 2});
        hashMap.put("VA", new int[]{1, 2, 4, 2});
        hashMap.put("VC", new int[]{2, 0, 2, 4});
        hashMap.put("VE", new int[]{4, 4, 4, 3});
        hashMap.put("VG", new int[]{3, 0, 1, 3});
        hashMap.put("VI", new int[]{1, 1, 4, 4});
        hashMap.put("VN", new int[]{0, 2, 4, 4});
        hashMap.put("VU", new int[]{4, 1, 3, 1});
        hashMap.put("WS", new int[]{3, 3, 3, 2});
        hashMap.put("XK", new int[]{1, 2, 1, 0});
        hashMap.put("YE", new int[]{4, 4, 4, 3});
        hashMap.put("YT", new int[]{2, 2, 2, 3});
        hashMap.put("ZA", new int[]{2, 4, 2, 2});
        hashMap.put("ZM", new int[]{3, 2, 2, 1});
        hashMap.put("ZW", new int[]{3, 3, 2, 1});
        a = Collections.unmodifiableMap(hashMap);
    }

    public final synchronized long a() {
        return this.q;
    }

    public final void c() {
    }

    @Deprecated
    public bid() {
        this(null, new SparseArray(), false);
    }

    private bid(Context context, SparseArray sparseArray, boolean z) {
        Context context2;
        int i2;
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.h = context2;
        this.i = sparseArray;
        this.f = new bkn();
        this.j = new ble();
        if (context != null) {
            i2 = blm.a(context);
        } else {
            i2 = 0;
        }
        this.n = i2;
        this.q = a(i2);
        if (context != null && z) {
            bic.a(context).a(this);
        }
    }

    private /* synthetic */ bid(Context context, SparseArray sparseArray) {
        this(context, sparseArray, true);
    }

    private final long a(int i2) {
        Long l2 = (Long) this.i.get(i2);
        if (l2 == null) {
            l2 = (Long) this.i.get(0);
        }
        if (l2 == null) {
            l2 = 1000000L;
        }
        return l2.longValue();
    }

    public static synchronized bid a(Context context) {
        bid bid;
        synchronized (bid.class) {
            if (g == null) {
                bia bia = new bia(context);
                g = new bid(bia.a, bia.b);
            }
            bid = g;
        }
        return bid;
    }

    private final void a(int i2, long j2, long j3) {
        if (i2 != 0 || j2 != 0 || j3 != this.r) {
            this.r = j3;
            Iterator it = this.f.a.iterator();
            while (it.hasNext()) {
                bkm bkm = (bkm) it.next();
                bkm.a.post(new bkl(bkm));
            }
        }
    }

    public final synchronized void a(boolean z, int i2) {
        if (z) {
            this.m += (long) i2;
        }
    }

    public final synchronized void b() {
        Context context = this.h;
        int a2 = context != null ? blm.a(context) : 0;
        if (this.n != a2) {
            this.n = a2;
            if (!(a2 == 1 || a2 == 0 || a2 == 8)) {
                this.q = a(a2);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                a(this.k > 0 ? (int) (elapsedRealtime - this.l) : 0, this.m, this.q);
                this.l = elapsedRealtime;
                this.m = 0;
                this.p = 0;
                this.o = 0;
                ble ble = this.j;
                ble.d.clear();
                ble.f = -1;
                ble.g = 0;
                ble.h = 0;
            }
        }
    }

    public final synchronized void a(boolean z) {
        bld bld;
        float f2;
        if (z) {
            int i2 = 0;
            bks.b(this.k > 0);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i3 = (int) (elapsedRealtime - this.l);
            this.o += (long) i3;
            long j2 = this.p;
            long j3 = this.m;
            this.p = j2 + j3;
            if (i3 > 0) {
                float f3 = (((float) j3) * 8000.0f) / ((float) i3);
                ble ble = this.j;
                int sqrt = (int) Math.sqrt((double) j3);
                if (ble.f != 1) {
                    Collections.sort(ble.d, ble.a);
                    ble.f = 1;
                }
                int i4 = ble.i;
                if (i4 > 0) {
                    bld[] bldArr = ble.e;
                    int i5 = i4 - 1;
                    ble.i = i5;
                    bld = bldArr[i5];
                } else {
                    bld = new bld((byte) 0);
                }
                int i6 = ble.g;
                ble.g = i6 + 1;
                bld.a = i6;
                bld.b = sqrt;
                bld.c = f3;
                ble.d.add(bld);
                ble.h += sqrt;
                while (true) {
                    int i7 = ble.h;
                    int i8 = ble.c;
                    if (i7 <= 2000) {
                        break;
                    }
                    int i9 = i7 - 2000;
                    bld bld2 = (bld) ble.d.get(0);
                    int i10 = bld2.b;
                    if (i10 <= i9) {
                        ble.h -= i10;
                        ble.d.remove(0);
                        int i11 = ble.i;
                        if (i11 < 5) {
                            bld[] bldArr2 = ble.e;
                            ble.i = i11 + 1;
                            bldArr2[i11] = bld2;
                        }
                    } else {
                        bld2.b = i10 - i9;
                        ble.h -= i9;
                    }
                }
                if (this.o >= 2000 || this.p >= 524288) {
                    ble ble2 = this.j;
                    if (ble2.f != 0) {
                        Collections.sort(ble2.d, ble.b);
                        ble2.f = 0;
                    }
                    float f4 = ((float) ble2.h) * 0.5f;
                    int i12 = 0;
                    while (true) {
                        if (i2 < ble2.d.size()) {
                            bld bld3 = (bld) ble2.d.get(i2);
                            i12 += bld3.b;
                            if (((float) i12) >= f4) {
                                f2 = bld3.c;
                                break;
                            }
                            i2++;
                        } else if (!ble2.d.isEmpty()) {
                            ArrayList arrayList = ble2.d;
                            f2 = ((bld) arrayList.get(arrayList.size() - 1)).c;
                        } else {
                            f2 = Float.NaN;
                        }
                    }
                    this.q = (long) f2;
                }
                a(i3, this.m, this.q);
                this.l = elapsedRealtime;
                this.m = 0;
            }
            this.k--;
        }
    }

    public final synchronized void b(boolean z) {
        if (z) {
            if (this.k == 0) {
                this.l = SystemClock.elapsedRealtime();
            }
            this.k++;
        }
    }
}
