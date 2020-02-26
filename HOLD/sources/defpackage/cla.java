package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.media.tv.TvContract;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* renamed from: cla  reason: default package */
/* compiled from: PG */
public final class cla implements cjx {
    private static cla A;
    private static final int N = 1000;
    public static /* synthetic */ int x;
    private static final String[] y = {"content_id", "package_name"};
    private static final LongSparseArray z = new LongSparseArray(0);
    private final dbh B;
    private final cke C;
    private Map D = new HashMap();
    private cjz E;
    private cjz F;
    private cjz G;
    private Queue H = new ArrayDeque();
    private Map I;
    private long J;
    private SharedPreferences K;
    private SharedPreferences L;
    private boolean M = true;
    private ckn O = new ckn();
    private final SharedPreferences.OnSharedPreferenceChangeListener P = new ckr(this);
    public final Context a;
    public List b = new LinkedList();
    public Map c = new HashMap();
    public List d = new LinkedList();
    public List e = new LinkedList();
    public List f = new LinkedList();
    public List g = new LinkedList();
    public cjz h;
    public Map i = new HashMap();
    public Map j = new HashMap();
    public List k;
    public Set l;
    public HashSet m = new HashSet();
    public boolean n = true;
    public Map o = new HashMap();
    public Set p = new HashSet();
    public List q;
    public cld r;
    public Set s = new HashSet();
    public boolean t = true;
    public String u;
    public Map v = Collections.synchronizedMap(new HashMap());
    public cjs w;

    public final boolean g() {
        return this.k != null;
    }

    public final boolean i() {
        return this.r != null;
    }

    private cla(Context context, dbh dbh) {
        new Handler();
        this.a = context.getApplicationContext();
        this.B = dbh;
        this.C = new cke(this.a, new ckx(this));
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.tvlauncher.data.TvDataManager.WATCH_NEXT_PREF_FILE_NAME", 0);
        sharedPreferences.registerOnSharedPreferenceChangeListener(this.P);
        this.u = a(sharedPreferences);
        o();
        SharedPreferences sharedPreferences2 = this.a.getSharedPreferences("com.google.android.tvlauncher.data.TvDataManager.LIVE_TV_CHANNEL_PREF", 0);
        this.K = sharedPreferences2;
        this.J = sharedPreferences2.getLong("live_tv_channel_id", -1);
        SharedPreferences sharedPreferences3 = this.a.getSharedPreferences("com.google.android.tvlauncher.data.TvDataManager.PREF", 0);
        this.L = sharedPreferences3;
        String string = sharedPreferences3.getString("non_empty_old_home_channel_ids", null);
        if (string != null) {
            for (String str : string.split(",")) {
                try {
                    this.m.add(Long.valueOf(Long.parseLong(str)));
                } catch (NumberFormatException e2) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61 + string.length());
                    sb.append("Invalid channel ID: [");
                    sb.append(str);
                    sb.append("] in old home channel ids shared pref [");
                    sb.append(string);
                    sb.append("]");
                    Log.e("TvDataManager", sb.toString());
                }
            }
        }
        this.l = (Set) this.m.clone();
    }

    public static void a(Map map, Object obj, Object obj2) {
        List list = (List) map.get(obj);
        if (list == null) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(obj2);
            map.put(obj, linkedList);
        } else if (!list.contains(obj2)) {
            list.add(obj2);
        }
    }

    public final boolean a(Long l2) {
        Integer a2;
        cjs cjs = this.w;
        if (cjs == null || (a2 = cjs.a(l2.longValue())) == null || a2.intValue() >= 5) {
            return false;
        }
        return true;
    }

    public static final String a(SharedPreferences sharedPreferences) {
        StringBuilder sb = new StringBuilder(" NOT IN (");
        boolean z2 = false;
        for (String next : sharedPreferences.getAll().keySet()) {
            if (next.startsWith("watch_next_package_key_prefix")) {
                sb.append("'");
                sb.append(next.substring(29));
                sb.append("',");
                z2 = true;
            }
        }
        if (!z2) {
            return "browsable=1 AND last_engagement_time_utc_millis<=?";
        }
        sb.setLength(sb.length() - 1);
        sb.append(")");
        String valueOf = String.valueOf(sb.toString());
        return valueOf.length() == 0 ? new String("browsable=1 AND last_engagement_time_utc_millis<=? AND package_name") : "browsable=1 AND last_engagement_time_utc_millis<=? AND package_name".concat(valueOf);
    }

    public final void a(cjp cjp, Long l2) {
        if (cjp != null) {
            cjp.a();
        }
        this.p.remove(l2);
        this.H.remove(l2);
    }

    public final void d() {
        if (this.d.size() == 0 && this.e.size() == 0) {
            cjz cjz = this.E;
            if (cjz != null) {
                cjz.c();
                this.E = null;
            }
            this.q = null;
            this.I = null;
        }
    }

    public final String a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        return sb.toString();
    }

    private static final dai a(dbf dbf, dck dck, String str, String str2) {
        dai dai;
        if (dbf != null) {
            dai = (dai) dbf.b.get(dai.a(str, str2));
        } else {
            dai = null;
        }
        return dai == null ? (dai) dck.e.Q.get(dai.a(str, str2)) : dai;
    }

    public final cxt b(int i2) {
        return (cxt) this.k.get(i2);
    }

    public final int h() {
        List list = this.k;
        if (list == null) {
            return -1;
        }
        return list.size();
    }

    public static cla a(Context context) {
        if (A == null) {
            cgg cgg = (cgg) context.getApplicationContext();
            if (cgg.h == null) {
                synchronized (cgg.g) {
                    if (cgg.h == null) {
                        cgg.h = new dbh(cgg);
                    }
                }
            }
            A = new cla(context, cgg.h);
        }
        return A;
    }

    /* access modifiers changed from: package-private */
    public final Set a(Set set) {
        int size = set.size();
        HashSet hashSet = new HashSet(set.size());
        ArrayList arrayList = new ArrayList(set);
        for (int i2 = 0; i2 < size; i2 += N) {
            List<Long> subList = arrayList.subList(i2, Math.min(N + i2, size));
            ContentResolver contentResolver = this.a.getContentResolver();
            Uri uri = TvContract.PreviewPrograms.CONTENT_URI;
            String[] strArr = {"channel_id"};
            StringBuilder sb = new StringBuilder(subList.size() * 5);
            sb.append("channel_id IN (");
            for (Long l2 : subList) {
                sb.append(l2.toString());
                sb.append(',');
            }
            sb.setLength(sb.length() - 1);
            sb.append(')');
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 38);
            sb3.append("browsable=1 AND ");
            sb3.append(sb2);
            sb3.append(") GROUP BY (channel_id");
            Cursor query = contentResolver.query(uri, strArr, sb3.toString(), null, null);
            if (query != null) {
                while (query.moveToNext()) {
                    try {
                        hashSet.add(Long.valueOf(query.getLong(0)));
                    } catch (Throwable th) {
                        dhr.a(th, th);
                    }
                }
            } else {
                int size2 = set.size();
                StringBuilder sb4 = new StringBuilder(70);
                sb4.append("Program count failed for ");
                sb4.append(size2);
                sb4.append(" channels. Returned cursor is null");
                Log.e("TvDataManager", sb4.toString());
            }
            if (query != null) {
                query.close();
            }
        }
        return hashSet;
        throw th;
    }

    public final List b(String str) {
        return (List) this.I.get(str);
    }

    public final cxu a(long j2, int i2) {
        if (i2 >= 0) {
            cjp cjp = (cjp) this.o.get(Long.valueOf(j2));
            if (cjp != null && i2 >= cjp.b()) {
                int b2 = cjp.b();
                StringBuilder sb = new StringBuilder(56);
                sb.append("Position [");
                sb.append(i2);
                sb.append("] is out of bounds [0, ");
                sb.append(b2 - 1);
                sb.append("]");
                throw new IllegalArgumentException(sb.toString());
            } else if (cjp != null) {
                return new cko(cjp, i2);
            } else {
                return null;
            }
        } else {
            throw new IllegalArgumentException("Position must be positive");
        }
    }

    public final int d(long j2) {
        Map map = this.o;
        Long valueOf = Long.valueOf(j2);
        if (map.containsKey(valueOf)) {
            return ((cjp) this.o.get(valueOf)).b();
        }
        return -1;
    }

    public final cxu c(int i2) {
        if (i2 >= 0) {
            cld cld = this.r;
            if (cld != null && i2 >= cld.b()) {
                int b2 = this.r.b();
                StringBuilder sb = new StringBuilder(56);
                sb.append("Position [");
                sb.append(i2);
                sb.append("] is out of bounds [0, ");
                sb.append(b2 - 1);
                sb.append("]");
                throw new IllegalArgumentException(sb.toString());
            }
            cld cld2 = this.r;
            if (cld2 != null) {
                return new cko(cld2, i2);
            }
            return null;
        }
        throw new IllegalArgumentException("Position must be positive");
    }

    public final int j() {
        cld cld = this.r;
        if (cld == null) {
            return 0;
        }
        return cld.b();
    }

    public final void b(long j2) {
        Integer a2 = this.w.a(j2);
        if (a2 != null) {
            cxt cxt = (cxt) this.k.remove(a2.intValue());
            this.m.remove(Long.valueOf(j2));
            cjs cjs = this.w;
            if (!cxt.k) {
                cjs.d.remove(cxt.a);
            }
            cjs.b();
            int intValue = a2.intValue();
            for (ckg ckg : this.b) {
                cqp cqp = ckg.a;
                cqp.i(cqp.j(intValue));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(Set set) {
        if (!set.isEmpty()) {
            new cks(this, new HashSet(set)).executeOnExecutor(daz.a, new Object[0]);
        }
    }

    public final boolean a(long j2) {
        return !this.l.contains(Long.valueOf(j2));
    }

    private static final boolean a(String str, String str2, dbf dbf, dai dai) {
        if (dbf != null && dbf.a.contains(dai.a(str, str2))) {
            return true;
        }
        return dai != null && dai.d;
    }

    private final boolean b(String str, String str2) {
        dai dai = dck.a(this.a).e.B;
        if (dai == null || !dai.a.equals(str)) {
            return false;
        }
        return TextUtils.isEmpty(dai.b) || TextUtils.equals(dai.b, str2);
    }

    public final boolean a(String str) {
        Map map = this.I;
        return map != null && map.containsKey(str);
    }

    public final boolean c(long j2) {
        return this.o.containsKey(Long.valueOf(j2));
    }

    public final void o() {
        if (this.G == null) {
            cjz a2 = cjz.a(this.a);
            a2.a(TvContract.WatchNextPrograms.CONTENT_URI);
            a2.d = y;
            a2.e = "browsable=1";
            a2.b = 5;
            a2.a(this);
            d(a2);
            a2.b();
        }
    }

    public final void k() {
        if (this.h == null) {
            cjz a2 = cjz.a(this.a);
            a2.a(TvContract.Channels.CONTENT_URI);
            a2.d = cxt.l;
            a2.e = "browsable=1 AND type='TYPE_PREVIEW'";
            a2.b = 0;
            a2.a(this);
            d(a2);
            a2.b();
        }
    }

    public final void e(long j2) {
        Map map = this.D;
        Long valueOf = Long.valueOf(j2);
        if (!map.containsKey(valueOf)) {
            if (!this.o.containsKey(valueOf) && this.o.size() >= 15) {
                Iterator it = this.H.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Long l2 = (Long) it.next();
                    if (!this.c.containsKey(l2) && !a(l2)) {
                        a((cjp) this.o.remove(l2), l2);
                        break;
                    }
                }
            }
            cjz a2 = cjz.a(this.a);
            a2.a(TvContract.PreviewPrograms.CONTENT_URI);
            a2.d = cxu.c;
            a2.e = "channel_id=? AND browsable=1";
            a2.a(String.valueOf(j2));
            a2.f = "weight DESC";
            a2.g = Long.valueOf(j2);
            a2.b = 1;
            a2.a(this);
            d(a2);
            a2.b();
        }
    }

    public final void l() {
        if (this.E == null) {
            cjz a2 = cjz.a(this.a);
            a2.a(TvContract.Channels.CONTENT_URI);
            a2.d = cxr.k;
            a2.e = "type='TYPE_PREVIEW'";
            a2.b = 2;
            a2.a(this);
            d(a2);
            a2.b();
        }
    }

    public final void m() {
        if (this.d.size() > 0 || this.e.size() > 0) {
            l();
        }
    }

    public final void n() {
        if (this.F == null) {
            cjz a2 = cjz.a(this.a);
            a2.a(TvContract.WatchNextPrograms.CONTENT_URI);
            a2.d = cxu.d;
            a2.e = this.u;
            a2.a(String.valueOf(System.currentTimeMillis() + 600000));
            a2.f = "last_engagement_time_utc_millis DESC LIMIT 1000";
            a2.b = 4;
            a2.a(this);
            d(a2);
            a2.b();
        }
    }

    public final void a(int i2) {
        int i3;
        for (ckg ckg : this.b) {
            int j2 = ckg.a.j(i2);
            long j3 = ckg.a.c.b(i2).a;
            cqp cqp = ckg.a;
            if (cqp.r != j2 || (!((i3 = cqp.p) == 2 || i3 == 3) || !cqp.c.a(j3))) {
                ckg.a.a(j2, "PAYLOAD_STATE");
            } else {
                if (!dcy.b(ckg.a.b)) {
                    ckg.a.p = 1;
                } else {
                    ckg.a.p = 0;
                }
                cqp cqp2 = ckg.a;
                cqp2.a(0, cqp2.a(), "PAYLOAD_STATE");
            }
            cox cox = ckg.a.G;
            if (cox.b.a(j3)) {
                cox.a(j3);
            } else {
                cox.b(j3);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cqp.b(int, boolean):void
     arg types: [int, int]
     candidates:
      jp.b(int, int):void
      cqp.b(int, boolean):void */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0084, code lost:
        if (r6 == r2.s) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r10 = this;
            java.util.List r0 = r10.b
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00a6
            java.lang.Object r1 = r0.next()
            ckg r1 = (defpackage.ckg) r1
            cqp r2 = r1.a
            cox r2 = r2.G
            r2.a()
            cqp r2 = r1.a
            cla r2 = r2.c
            int r2 = r2.h()
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 < 0) goto L_0x004e
            cft r6 = new cft
            java.lang.String r7 = "shown_channel_count"
            r6.<init>(r5, r7)
            dja r7 = r6.d()
            boolean r8 = r7.b
            if (r8 == 0) goto L_0x003a
            r7.b()
            r7.b = r4
        L_0x003a:
            dje r7 = r7.a
            dml r7 = (defpackage.dml) r7
            dml r8 = defpackage.dml.c
            int r8 = r7.a
            r8 = r8 | r3
            r7.a = r8
            r7.b = r2
            cqp r2 = r1.a
            cfp r2 = r2.d
            r2.a(r6)
        L_0x004e:
            cqp r2 = r1.a
            long r6 = r2.s
            int r8 = r2.r
            int r2 = r2.a()
            if (r8 < r2) goto L_0x0065
            cqp r2 = r1.a
            int r8 = r2.a()
            int r8 = r8 + -1
            r2.b(r8, r4)
        L_0x0065:
            cqp r2 = r1.a
            r2.i()
            cqp r2 = r1.a
            int r8 = r2.p
            r9 = 3
            if (r8 != r9) goto L_0x0072
            goto L_0x0074
        L_0x0072:
            if (r8 != r3) goto L_0x008c
        L_0x0074:
            cla r3 = r2.c
            long r8 = r2.s
            boolean r2 = r3.a(r8)
            if (r2 != 0) goto L_0x0088
            cqp r2 = r1.a
            long r8 = r2.s
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x0087
            goto L_0x008c
        L_0x0087:
            goto L_0x008a
        L_0x0088:
            cqp r2 = r1.a
        L_0x008a:
            r2.p = r5
        L_0x008c:
            cqp r2 = r1.a
            int r3 = r2.p
            if (r3 != r5) goto L_0x009f
            android.content.Context r2 = r2.b
            boolean r2 = defpackage.dcy.b(r2)
            if (r2 != 0) goto L_0x009b
            goto L_0x009f
        L_0x009b:
            cqp r2 = r1.a
            r2.p = r4
        L_0x009f:
            cqp r1 = r1.a
            r1.O()
            goto L_0x0006
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cla.e():void");
    }

    public final void f() {
        for (cle a2 : this.g) {
            a2.a();
        }
    }

    public final void c(cjz cjz) {
        e(cjz);
    }

    public final void b(cjz cjz) {
        int i2;
        cjz cjz2 = cjz;
        boolean z2 = true;
        if (cjz2.b == 0) {
            boolean z3 = this.n;
            cky cky = (cky) cjz2.i;
            List list = this.k;
            if (list == null) {
                this.k = new ArrayList();
            } else {
                list.clear();
            }
            HashSet hashSet = new HashSet(this.m.size());
            if (!this.M || this.L.getInt("boot_count", -1) >= (i2 = Settings.Global.getInt(this.a.getContentResolver(), "boot_count", 0))) {
                z2 = false;
            } else {
                this.L.edit().putInt("boot_count", i2).apply();
                this.M = false;
            }
            HashMap hashMap = new HashMap(cky.a.size());
            HashSet hashSet2 = new HashSet();
            for (cxt cxt : cky.a) {
                long j2 = cxt.a;
                HashSet hashSet3 = hashSet;
                if (this.J == -1 && b(cxt.f, cxt.d)) {
                    f(j2);
                }
                if (!z3) {
                    Map map = this.j;
                    Long valueOf = Long.valueOf(j2);
                    if (!map.containsKey(valueOf)) {
                        hashSet2.add(valueOf);
                    }
                }
                Long valueOf2 = Long.valueOf(j2);
                hashMap.put(valueOf2, cxt);
                if (!this.m.contains(valueOf2)) {
                    hashSet = hashSet3;
                } else if (z2 && cxt.k) {
                    hashSet = hashSet3;
                } else {
                    this.k.add(cxt);
                    hashSet = hashSet3;
                    hashSet.add(valueOf2);
                }
            }
            this.j = hashMap;
            this.m = hashSet;
            this.l.removeIf(new ckq(this));
            a();
            this.n = false;
            ckn ckn = this.O;
            List list2 = cky.d;
            LongSparseArray longSparseArray = cky.e;
            ckn.b = longSparseArray;
            ckm ckm = ckn.c;
            ckm.a = longSparseArray;
            list2.sort(ckm);
            ckn.a = list2;
            cjs cjs = this.w;
            if (cjs == null) {
                Context context = this.a;
                cjs = new cjs(context, dck.a(context).e.s, dck.a(this.a).e.C);
                this.w = cjs;
                cjs.b = this.b;
                cjs.a = this.O;
            }
            cjs.f = this.J;
            cjs.g = cky.b;
            cjs.h = cky.c;
            cjs.a(this.k);
            e();
            if (z3) {
                b(this.j.keySet());
            } else {
                b(hashSet2);
            }
        } else if (cjz2.b != 1) {
            if (cjz2.b == 2) {
                ckz ckz = (ckz) cjz2.i;
                this.q = ckz.a;
                Map map2 = ckz.b;
                this.I = map2;
                for (Map.Entry value : map2.entrySet()) {
                    for (cxr cxr : (List) value.getValue()) {
                        if (this.J == -1 && b(cxr.g, cxr.d)) {
                            f(cxr.a);
                        }
                    }
                }
                for (ckj ckj : this.d) {
                    ckj.a.b();
                }
                for (cki cki : this.e) {
                    cki.a.e();
                }
            } else if (cjz2.b == 3) {
                cxr cxr2 = (cxr) cjz2.i;
                for (ckp a2 : this.f) {
                    a2.a();
                }
            } else if (cjz2.b != 4) {
                if (cjz2.b == 5) {
                    this.s = (HashSet) cjz2.i;
                }
            } else if (cjz2.h == null) {
                Log.e("TvDataManager", "error loading watch next programs, cursor is null");
            } else {
                cld cld = this.r;
                if (cld != null) {
                    cld.a();
                }
                this.r = new cld(cjz2.h);
                this.t = false;
                f();
            }
        } else if (cjz2.h != null) {
            Long l2 = (Long) cjz2.g;
            a((cjp) this.o.remove(l2), l2);
            this.o.put(l2, new cjp(cjz2.h, (byte) 0));
            this.H.add(l2);
            List<cjt> list3 = (List) this.c.get(Long.valueOf(l2.longValue()));
            if (list3 != null) {
                for (cjt cjt : list3) {
                    coo coo = cjt.a;
                    coo.f = -1;
                    coo.O();
                }
            }
            int count = cjz2.h.getCount();
            if (count == 0) {
                z2 = false;
            }
            if (this.l.contains(l2) != z2) {
                if (count == 0) {
                    this.l.remove(l2);
                } else {
                    this.l.add(l2);
                }
                a();
                Integer a3 = this.w.a(l2.longValue());
                if (a3 != null) {
                    a(a3.intValue());
                }
            }
        }
        e(cjz);
    }

    public final void a(cjz cjz, Throwable th) {
        String valueOf = String.valueOf(cjz);
        String valueOf2 = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27 + String.valueOf(valueOf2).length());
        sb.append("onTaskFailed: ");
        sb.append(valueOf);
        sb.append(", throwable: ");
        sb.append(valueOf2);
        Log.e("TvDataManager", sb.toString());
        e(cjz);
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.cjz r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            long r2 = r0.b
            java.lang.String r4 = "sponsored.legacy"
            r5 = 0
            java.lang.String r6 = "TvDataManager"
            r7 = 0
            r8 = 1
            r9 = 0
            int r11 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x012a
            android.database.Cursor r2 = r0.h
            r9 = -1
            if (r2 == 0) goto L_0x00ef
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x011c }
            int r11 = r2.getCount()     // Catch:{ all -> 0x011c }
            r6.<init>(r11)     // Catch:{ all -> 0x011c }
            dbh r11 = r1.B     // Catch:{ all -> 0x011c }
            dbf r11 = r11.a()     // Catch:{ all -> 0x011c }
            android.content.Context r12 = r1.a     // Catch:{ all -> 0x011c }
            dck r12 = defpackage.dck.a(r12)     // Catch:{ all -> 0x011c }
            r13 = r9
            r10 = -1
            r9 = r7
        L_0x0031:
            boolean r15 = r2.moveToNext()     // Catch:{ all -> 0x011c }
            if (r15 == 0) goto L_0x00ea
            cxt r15 = new cxt     // Catch:{ all -> 0x011c }
            r15.<init>()     // Catch:{ all -> 0x011c }
            r16 = r4
            long r3 = r2.getLong(r5)     // Catch:{ all -> 0x011c }
            r15.a = r3     // Catch:{ all -> 0x011c }
            java.lang.String r3 = r2.getString(r8)     // Catch:{ all -> 0x011c }
            r15.b = r3     // Catch:{ all -> 0x011c }
            r3 = 2
            java.lang.String r3 = r2.getString(r3)     // Catch:{ all -> 0x011c }
            r15.c = r3     // Catch:{ all -> 0x011c }
            r3 = 3
            java.lang.String r3 = r2.getString(r3)     // Catch:{ all -> 0x011c }
            r15.d = r3     // Catch:{ all -> 0x011c }
            r3 = 4
            java.lang.String r3 = r2.getString(r3)     // Catch:{ all -> 0x011c }
            r15.e = r3     // Catch:{ all -> 0x011c }
            r3 = 5
            java.lang.String r3 = r2.getString(r3)     // Catch:{ all -> 0x011c }
            r15.f = r3     // Catch:{ all -> 0x011c }
            r3 = 6
            int r3 = r2.getInt(r3)     // Catch:{ all -> 0x011c }
            r15.h = r3     // Catch:{ all -> 0x011c }
            java.lang.String r3 = "com.google.android.tvrecommendations"
            java.lang.String r4 = r15.f     // Catch:{ all -> 0x011c }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x011c }
            if (r3 == 0) goto L_0x0095
            r3 = 7
            byte[] r3 = r2.getBlob(r3)     // Catch:{ all -> 0x011c }
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x011c }
            int r8 = r3.length     // Catch:{ all -> 0x011c }
            r17 = -1
            int r8 = r8 + -1
            r4.<init>(r3, r5, r8)     // Catch:{ all -> 0x011c }
            r3 = r16
            boolean r8 = r3.equals(r4)     // Catch:{ all -> 0x011c }
            if (r8 != 0) goto L_0x0099
            r15.f = r4     // Catch:{ all -> 0x011c }
            r4 = 1
            r15.k = r4     // Catch:{ all -> 0x011c }
            goto L_0x0099
        L_0x0095:
            r3 = r16
            r17 = -1
        L_0x0099:
            r6.add(r15)     // Catch:{ all -> 0x011c }
            java.lang.String r4 = r15.f     // Catch:{ all -> 0x011c }
            java.lang.String r8 = r15.d     // Catch:{ all -> 0x011c }
            dai r4 = a(r11, r12, r4, r8)     // Catch:{ all -> 0x011c }
            java.lang.String r8 = r15.f     // Catch:{ all -> 0x011c }
            java.lang.String r5 = r15.d     // Catch:{ all -> 0x011c }
            boolean r5 = a(r8, r5, r11, r4)     // Catch:{ all -> 0x011c }
            r15.g = r5     // Catch:{ all -> 0x011c }
            if (r4 != 0) goto L_0x00b2
            r8 = r6
            goto L_0x00e3
        L_0x00b2:
            boolean r5 = r4.d     // Catch:{ all -> 0x011c }
            if (r5 == 0) goto L_0x00be
            boolean r5 = r4.e     // Catch:{ all -> 0x011c }
            if (r5 == 0) goto L_0x00be
            long r13 = r15.a     // Catch:{ all -> 0x011c }
            int r10 = r4.c     // Catch:{ all -> 0x011c }
        L_0x00be:
            boolean r5 = r4.f     // Catch:{ all -> 0x011c }
            r15.i = r5     // Catch:{ all -> 0x011c }
            boolean r8 = r4.g     // Catch:{ all -> 0x011c }
            r15.j = r8     // Catch:{ all -> 0x011c }
            if (r5 != 0) goto L_0x00e2
            if (r8 != 0) goto L_0x00e2
            if (r9 != 0) goto L_0x00d6
            android.util.LongSparseArray r9 = new android.util.LongSparseArray     // Catch:{ all -> 0x011c }
            r9.<init>()     // Catch:{ all -> 0x011c }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x011c }
            r7.<init>()     // Catch:{ all -> 0x011c }
        L_0x00d6:
            r7.add(r15)     // Catch:{ all -> 0x011c }
            r8 = r6
            long r5 = r15.a     // Catch:{ all -> 0x011c }
            r9.put(r5, r4)     // Catch:{ all -> 0x011c }
            goto L_0x00e3
        L_0x00e2:
            r8 = r6
        L_0x00e3:
            r4 = r3
            r6 = r8
            r5 = 0
            r8 = 1
            goto L_0x0031
        L_0x00ea:
            r8 = r6
            r11 = r8
            r12 = r13
            r14 = r10
            goto L_0x00ff
        L_0x00ef:
            r17 = -1
            java.util.List r3 = java.util.Collections.emptyList()     // Catch:{ all -> 0x011c }
            java.lang.String r4 = "error loading home channels, cursor is null"
            android.util.Log.e(r6, r4)     // Catch:{ all -> 0x011c }
            r11 = r3
            r12 = r9
            r14 = -1
            r9 = r7
        L_0x00ff:
            if (r2 == 0) goto L_0x0104
            r2.close()
        L_0x0104:
            if (r7 != 0) goto L_0x010b
            java.util.List r7 = java.util.Collections.emptyList()
            goto L_0x010c
        L_0x010b:
        L_0x010c:
            r15 = r7
            if (r9 != 0) goto L_0x0111
            android.util.LongSparseArray r9 = defpackage.cla.z
        L_0x0111:
            r16 = r9
            cky r2 = new cky
            r10 = r2
            r10.<init>(r11, r12, r14, r15, r16)
            r0.i = r2
            return
        L_0x011c:
            r0 = move-exception
            r3 = r0
            if (r2 == 0) goto L_0x0129
            r2.close()     // Catch:{ all -> 0x0124 }
            goto L_0x0129
        L_0x0124:
            r0 = move-exception
            r2 = r0
            defpackage.dhr.a(r3, r2)
        L_0x0129:
            throw r3
        L_0x012a:
            r3 = r4
            long r4 = r0.b
            r8 = 1
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x02d8
            long r4 = r0.b
            r8 = 2
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x024e
            java.util.HashSet r2 = new java.util.HashSet
            r4 = 100
            r2.<init>(r4)
            android.database.Cursor r4 = r0.h
            if (r4 == 0) goto L_0x01c7
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0240 }
            int r6 = r4.getCount()     // Catch:{ all -> 0x0240 }
            r5.<init>(r6)     // Catch:{ all -> 0x0240 }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x0240 }
            int r7 = r4.getCount()     // Catch:{ all -> 0x0240 }
            r6.<init>(r7)     // Catch:{ all -> 0x0240 }
            dbh r7 = r1.B     // Catch:{ all -> 0x0240 }
            dbf r7 = r7.a()     // Catch:{ all -> 0x0240 }
            android.content.Context r8 = r1.a     // Catch:{ all -> 0x0240 }
            dck r8 = defpackage.dck.a(r8)     // Catch:{ all -> 0x0240 }
        L_0x0164:
            boolean r9 = r4.moveToNext()     // Catch:{ all -> 0x0240 }
            if (r9 == 0) goto L_0x0198
            cxr r9 = defpackage.cxr.a(r4)     // Catch:{ all -> 0x0240 }
            long r10 = r9.a     // Catch:{ all -> 0x0240 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0240 }
            r2.add(r10)     // Catch:{ all -> 0x0240 }
            java.lang.String r10 = r9.g     // Catch:{ all -> 0x0240 }
            java.lang.String r11 = r9.d     // Catch:{ all -> 0x0240 }
            dai r10 = a(r7, r8, r10, r11)     // Catch:{ all -> 0x0240 }
            java.lang.String r11 = r9.g     // Catch:{ all -> 0x0240 }
            java.lang.String r12 = r9.d     // Catch:{ all -> 0x0240 }
            boolean r11 = a(r11, r12, r7, r10)     // Catch:{ all -> 0x0240 }
            r9.i = r11     // Catch:{ all -> 0x0240 }
            java.lang.String r12 = r9.g     // Catch:{ all -> 0x0240 }
            if (r11 == 0) goto L_0x018e
            r12 = r3
        L_0x018e:
            if (r10 == 0) goto L_0x0194
            boolean r10 = r10.g     // Catch:{ all -> 0x0240 }
            r9.j = r10     // Catch:{ all -> 0x0240 }
        L_0x0194:
            a(r6, r12, r9)     // Catch:{ all -> 0x0240 }
            goto L_0x0164
        L_0x0198:
            java.util.Set r3 = r6.entrySet()     // Catch:{ all -> 0x0240 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0240 }
        L_0x01a0:
            boolean r7 = r3.hasNext()     // Catch:{ all -> 0x0240 }
            if (r7 == 0) goto L_0x01c5
            java.lang.Object r7 = r3.next()     // Catch:{ all -> 0x0240 }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ all -> 0x0240 }
            cxs r8 = new cxs     // Catch:{ all -> 0x0240 }
            java.lang.Object r9 = r7.getKey()     // Catch:{ all -> 0x0240 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0240 }
            java.lang.Object r7 = r7.getValue()     // Catch:{ all -> 0x0240 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x0240 }
            int r7 = r7.size()     // Catch:{ all -> 0x0240 }
            r8.<init>(r9, r7)     // Catch:{ all -> 0x0240 }
            r5.add(r8)     // Catch:{ all -> 0x0240 }
            goto L_0x01a0
        L_0x01c5:
            r3 = r6
            goto L_0x01d5
        L_0x01c7:
            java.util.List r5 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0240 }
            java.util.Map r3 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0240 }
            java.lang.String r7 = "error loading package channels, cursor is null"
            android.util.Log.e(r6, r7)     // Catch:{ all -> 0x0240 }
        L_0x01d5:
            if (r4 == 0) goto L_0x01da
            r4.close()
        L_0x01da:
            java.util.Set r2 = r1.a(r2)
            java.util.Iterator r4 = r5.iterator()
        L_0x01e2:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0238
            java.lang.Object r6 = r4.next()
            cxs r6 = (defpackage.cxs) r6
            java.lang.String r7 = r6.a
            java.lang.Object r7 = r3.get(r7)
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r8 = r7.iterator()
        L_0x01fa:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0215
            java.lang.Object r9 = r8.next()
            cxr r9 = (defpackage.cxr) r9
            long r10 = r9.a
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            boolean r10 = r2.contains(r10)
            r11 = 1
            r10 = r10 ^ r11
            r9.h = r10
            goto L_0x01fa
        L_0x0215:
            r11 = 1
            int r8 = r7.size()
            if (r8 != r11) goto L_0x01e2
            r8 = 0
            java.lang.Object r7 = r7.get(r8)
            cxr r7 = (defpackage.cxr) r7
            java.lang.String r8 = r7.b
            r6.c = r8
            long r8 = r7.a
            r6.d = r8
            boolean r8 = r7.c
            r6.e = r8
            boolean r8 = r7.h
            r6.f = r8
            boolean r7 = r7.j
            r6.g = r7
            goto L_0x01e2
        L_0x0238:
            ckz r2 = new ckz
            r2.<init>(r5, r3)
            r0.i = r2
            return
        L_0x0240:
            r0 = move-exception
            r2 = r0
            if (r4 == 0) goto L_0x024d
            r4.close()     // Catch:{ all -> 0x0248 }
            goto L_0x024d
        L_0x0248:
            r0 = move-exception
            r3 = r0
            defpackage.dhr.a(r2, r3)
        L_0x024d:
            throw r2
        L_0x024e:
            long r2 = r0.b
            r4 = 3
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x02ab
            long r2 = r0.b
            r4 = 5
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x02fa
            android.database.Cursor r2 = r0.h
            if (r2 != 0) goto L_0x026f
            java.lang.String r3 = "error loading watch next data into cache, cursor is null"
            android.util.Log.e(r6, r3)     // Catch:{ all -> 0x029d }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x029d }
            r3.<init>()     // Catch:{ all -> 0x029d }
            r0.i = r3     // Catch:{ all -> 0x029d }
            goto L_0x0297
        L_0x026f:
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x029d }
            r3.<init>()     // Catch:{ all -> 0x029d }
            int r4 = r2.getCount()     // Catch:{ all -> 0x029d }
            if (r4 <= 0) goto L_0x0295
            r2.moveToFirst()     // Catch:{ all -> 0x029d }
        L_0x027d:
            r4 = 0
            java.lang.String r5 = r2.getString(r4)     // Catch:{ all -> 0x029d }
            r4 = 1
            java.lang.String r6 = r2.getString(r4)     // Catch:{ all -> 0x029d }
            java.lang.String r4 = r1.a(r5, r6)     // Catch:{ all -> 0x029d }
            r3.add(r4)     // Catch:{ all -> 0x029d }
            boolean r4 = r2.moveToNext()     // Catch:{ all -> 0x029d }
            if (r4 != 0) goto L_0x027d
        L_0x0295:
            r0.i = r3     // Catch:{ all -> 0x029d }
        L_0x0297:
            if (r2 == 0) goto L_0x02fa
            r2.close()
            return
        L_0x029d:
            r0 = move-exception
            r3 = r0
            if (r2 == 0) goto L_0x02aa
            r2.close()     // Catch:{ all -> 0x02a5 }
            goto L_0x02aa
        L_0x02a5:
            r0 = move-exception
            r2 = r0
            defpackage.dhr.a(r3, r2)
        L_0x02aa:
            throw r3
        L_0x02ab:
            android.database.Cursor r2 = r0.h
            if (r2 != 0) goto L_0x02b5
            java.lang.String r3 = "error loading promo channel, cursor is null"
            android.util.Log.e(r6, r3)     // Catch:{ all -> 0x02ca }
            goto L_0x02c1
        L_0x02b5:
            boolean r3 = r2.moveToFirst()     // Catch:{ all -> 0x02ca }
            if (r3 == 0) goto L_0x02c0
            cxr r7 = defpackage.cxr.a(r2)     // Catch:{ all -> 0x02ca }
            goto L_0x02c2
        L_0x02c0:
        L_0x02c1:
        L_0x02c2:
            if (r2 == 0) goto L_0x02c7
            r2.close()
        L_0x02c7:
            r0.i = r7
            return
        L_0x02ca:
            r0 = move-exception
            r3 = r0
            if (r2 == 0) goto L_0x02d7
            r2.close()     // Catch:{ all -> 0x02d2 }
            goto L_0x02d7
        L_0x02d2:
            r0 = move-exception
            r2 = r0
            defpackage.dhr.a(r3, r2)
        L_0x02d7:
            throw r3
        L_0x02d8:
            android.database.Cursor r2 = r0.h
            if (r2 == 0) goto L_0x02fb
        L_0x02dc:
            boolean r0 = r2.moveToNext()
            if (r0 == 0) goto L_0x02fa
            java.util.Map r0 = r1.v
            r3 = 0
            long r4 = r2.getLong(r3)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 1
            long r6 = r2.getLong(r5)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r0.put(r4, r6)
            goto L_0x02dc
        L_0x02fa:
            return
        L_0x02fb:
            java.lang.Object r0 = r0.g
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 51
            r3.<init>(r2)
            java.lang.String r2 = "error loading programs for channel "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = ", cursor is null"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.e(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cla.a(cjz):void");
    }

    public final void b() {
        cke cke = this.C;
        if (!cke.d) {
            ContentResolver contentResolver = cke.b.getContentResolver();
            contentResolver.registerContentObserver(TvContract.Channels.CONTENT_URI, true, cke.l);
            contentResolver.registerContentObserver(TvContract.PreviewPrograms.CONTENT_URI, true, cke.l);
            contentResolver.registerContentObserver(TvContract.WatchNextPrograms.CONTENT_URI, true, cke.l);
            cke.d = true;
        }
    }

    public final void a(ckj ckj) {
        if (!this.d.contains(ckj)) {
            this.d.add(ckj);
        }
        b();
    }

    public final void a(cle cle) {
        if (!this.g.contains(cle)) {
            this.g.add(cle);
        }
        b();
    }

    private final void f(long j2) {
        this.J = j2;
        this.K.edit().putLong("live_tv_channel_id", this.J).apply();
    }

    public final void a() {
        SharedPreferences.Editor edit = this.L.edit();
        if (this.l.size() > 0) {
            StringBuilder sb = new StringBuilder(128);
            for (Long append : this.l) {
                sb.append(append);
                sb.append(",");
            }
            edit.putString("non_empty_old_home_channel_ids", sb.toString());
        } else {
            edit.putString("non_empty_old_home_channel_ids", "");
        }
        edit.apply();
    }

    public final void a(long j2, boolean z2, boolean z3) {
        cjs cjs = this.w;
        if (cjs != null) {
            if (!z2) {
                cjs.d.remove(j2);
                cjs.b();
            }
            this.w.a();
        }
        new ckt(this, z2, j2, z3).executeOnExecutor(daz.a, Boolean.valueOf(z2), Long.valueOf(j2));
    }

    private final void d(cjz cjz) {
        if (cjz.b == 0) {
            this.h = cjz;
        } else if (cjz.b == 1) {
            this.D.put((Long) cjz.g, cjz);
        } else if (cjz.b == 2) {
            this.E = cjz;
        } else if (cjz.b == 3) {
        } else {
            if (cjz.b == 4) {
                this.F = cjz;
            } else if (cjz.b == 5) {
                this.G = cjz;
            }
        }
    }

    private final void e(cjz cjz) {
        if (cjz.b == 0) {
            this.h = null;
        } else if (cjz.b == 1) {
            this.D.remove((Long) cjz.g);
        } else if (cjz.b == 2) {
            this.E = null;
        } else if (cjz.b == 3) {
        } else {
            if (cjz.b == 4) {
                this.F = null;
            } else if (cjz.b == 5) {
                this.G = null;
            }
        }
    }

    public final void a(long j2, cjt cjt) {
        Map map = this.c;
        Long valueOf = Long.valueOf(j2);
        List list = (List) map.get(valueOf);
        if (list != null) {
            list.remove(cjt);
            if (list.size() == 0) {
                map.remove(valueOf);
            }
        }
        c();
    }

    public final void c() {
        if (this.b.size() == 0 && this.c.size() == 0 && this.d.size() == 0 && this.e.size() == 0 && this.f.size() == 0 && this.g.size() == 0) {
            this.n = true;
            this.i.clear();
            this.p.addAll(this.o.keySet());
            this.t = true;
            cke cke = this.C;
            if (cke.d) {
                cke.b.getContentResolver().unregisterContentObserver(cke.l);
                cke.d = false;
            }
        }
    }

    public final void b(cle cle) {
        cjz cjz = this.F;
        if (cjz != null) {
            cjz.c();
            this.F = null;
        }
        this.g.remove(cle);
        c();
    }
}
