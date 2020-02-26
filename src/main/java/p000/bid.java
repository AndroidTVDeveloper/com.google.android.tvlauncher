package p000;

import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: bid */
/* compiled from: PG */
public final class bid implements bhn, bjf {

    /* renamed from: a */
    public static final Map f4023a;

    /* renamed from: b */
    public static final long[] f4024b = {5700000, 3500000, 2000000, 1100000, 470000};

    /* renamed from: c */
    public static final long[] f4025c = {200000, 148000, 132000, 115000, 95000};

    /* renamed from: d */
    public static final long[] f4026d = {2200000, 1300000, 970000, 810000, 490000};

    /* renamed from: e */
    public static final long[] f4027e = {5300000, 3200000, 2000000, 1400000, 690000};

    /* renamed from: g */
    private static bid f4028g;

    /* renamed from: f */
    public final bkn f4029f;

    /* renamed from: h */
    private final Context f4030h;

    /* renamed from: i */
    private final SparseArray f4031i;

    /* renamed from: j */
    private final ble f4032j;

    /* renamed from: k */
    private int f4033k;

    /* renamed from: l */
    private long f4034l;

    /* renamed from: m */
    private long f4035m;

    /* renamed from: n */
    private int f4036n;

    /* renamed from: o */
    private long f4037o;

    /* renamed from: p */
    private long f4038p;

    /* renamed from: q */
    private long f4039q;

    /* renamed from: r */
    private long f4040r;

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
        f4023a = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public final synchronized long mo1941a() {
        return this.f4039q;
    }

    /* renamed from: c */
    public final void mo1971c() {
    }

    @Deprecated
    public bid() {
        this(null, new SparseArray(), false);
    }

    private bid(Context context, SparseArray sparseArray, boolean z) {
        Context context2;
        int i;
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.f4030h = context2;
        this.f4031i = sparseArray;
        this.f4029f = new bkn();
        this.f4032j = new ble();
        if (context != null) {
            i = blm.m3625a(context);
        } else {
            i = 0;
        }
        this.f4036n = i;
        this.f4039q = m3310a(i);
        if (context != null && z) {
            bic.m3307a(context).mo1965a(this);
        }
    }

    private /* synthetic */ bid(Context context, SparseArray sparseArray) {
        this(context, sparseArray, true);
    }

    /* renamed from: a */
    private final long m3310a(int i) {
        Long l = (Long) this.f4031i.get(i);
        if (l == null) {
            l = (Long) this.f4031i.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    /* renamed from: a */
    public static synchronized bid m3311a(Context context) {
        bid bid;
        synchronized (bid.class) {
            if (f4028g == null) {
                bia bia = new bia(context);
                f4028g = new bid(bia.f4016a, bia.f4017b);
            }
            bid = f4028g;
        }
        return bid;
    }

    /* renamed from: a */
    private final void m3312a(int i, long j, long j2) {
        if (i != 0 || j != 0 || j2 != this.f4040r) {
            this.f4040r = j2;
            Iterator it = this.f4029f.f4226a.iterator();
            while (it.hasNext()) {
                bkm bkm = (bkm) it.next();
                bkm.f4223a.post(new bkl(bkm));
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo1968a(boolean z, int i) {
        if (z) {
            this.f4035m += (long) i;
        }
    }

    /* renamed from: b */
    public final synchronized void mo1969b() {
        Context context = this.f4030h;
        int a = context != null ? blm.m3625a(context) : 0;
        if (this.f4036n != a) {
            this.f4036n = a;
            if (!(a == 1 || a == 0 || a == 8)) {
                this.f4039q = m3310a(a);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                m3312a(this.f4033k > 0 ? (int) (elapsedRealtime - this.f4034l) : 0, this.f4035m, this.f4039q);
                this.f4034l = elapsedRealtime;
                this.f4035m = 0;
                this.f4038p = 0;
                this.f4037o = 0;
                ble ble = this.f4032j;
                ble.f4274d.clear();
                ble.f4276f = -1;
                ble.f4277g = 0;
                ble.f4278h = 0;
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo1967a(boolean z) {
        bld bld;
        float f;
        if (z) {
            int i = 0;
            bks.m3512b(this.f4033k > 0);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i2 = (int) (elapsedRealtime - this.f4034l);
            this.f4037o += (long) i2;
            long j = this.f4038p;
            long j2 = this.f4035m;
            this.f4038p = j + j2;
            if (i2 > 0) {
                float f2 = (((float) j2) * 8000.0f) / ((float) i2);
                ble ble = this.f4032j;
                int sqrt = (int) Math.sqrt((double) j2);
                if (ble.f4276f != 1) {
                    Collections.sort(ble.f4274d, ble.f4271a);
                    ble.f4276f = 1;
                }
                int i3 = ble.f4279i;
                if (i3 > 0) {
                    bld[] bldArr = ble.f4275e;
                    int i4 = i3 - 1;
                    ble.f4279i = i4;
                    bld = bldArr[i4];
                } else {
                    bld = new bld((byte) 0);
                }
                int i5 = ble.f4277g;
                ble.f4277g = i5 + 1;
                bld.f4268a = i5;
                bld.f4269b = sqrt;
                bld.f4270c = f2;
                ble.f4274d.add(bld);
                ble.f4278h += sqrt;
                while (true) {
                    int i6 = ble.f4278h;
                    int i7 = ble.f4273c;
                    if (i6 <= 2000) {
                        break;
                    }
                    int i8 = i6 - 2000;
                    bld bld2 = (bld) ble.f4274d.get(0);
                    int i9 = bld2.f4269b;
                    if (i9 <= i8) {
                        ble.f4278h -= i9;
                        ble.f4274d.remove(0);
                        int i10 = ble.f4279i;
                        if (i10 < 5) {
                            bld[] bldArr2 = ble.f4275e;
                            ble.f4279i = i10 + 1;
                            bldArr2[i10] = bld2;
                        }
                    } else {
                        bld2.f4269b = i9 - i8;
                        ble.f4278h -= i8;
                    }
                }
                if (this.f4037o >= 2000 || this.f4038p >= 524288) {
                    ble ble2 = this.f4032j;
                    if (ble2.f4276f != 0) {
                        Collections.sort(ble2.f4274d, ble.f4272b);
                        ble2.f4276f = 0;
                    }
                    float f3 = ((float) ble2.f4278h) * 0.5f;
                    int i11 = 0;
                    while (true) {
                        if (i < ble2.f4274d.size()) {
                            bld bld3 = (bld) ble2.f4274d.get(i);
                            i11 += bld3.f4269b;
                            if (((float) i11) >= f3) {
                                f = bld3.f4270c;
                                break;
                            }
                            i++;
                        } else if (!ble2.f4274d.isEmpty()) {
                            ArrayList arrayList = ble2.f4274d;
                            f = ((bld) arrayList.get(arrayList.size() - 1)).f4270c;
                        } else {
                            f = Float.NaN;
                        }
                    }
                    this.f4039q = (long) f;
                }
                m3312a(i2, this.f4035m, this.f4039q);
                this.f4034l = elapsedRealtime;
                this.f4035m = 0;
            }
            this.f4033k--;
        }
    }

    /* renamed from: b */
    public final synchronized void mo1970b(boolean z) {
        if (z) {
            if (this.f4033k == 0) {
                this.f4034l = SystemClock.elapsedRealtime();
            }
            this.f4033k++;
        }
    }
}
