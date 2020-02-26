package p000;

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

/* renamed from: cla */
/* compiled from: PG */
public final class cla implements cjx {

    /* renamed from: A */
    private static cla f5854A;

    /* renamed from: N */
    private static final int f5855N = 1000;

    /* renamed from: x */
    public static /* synthetic */ int f5856x;

    /* renamed from: y */
    private static final String[] f5857y = {"content_id", "package_name"};

    /* renamed from: z */
    private static final LongSparseArray f5858z = new LongSparseArray(0);

    /* renamed from: B */
    private final dbh f5859B;

    /* renamed from: C */
    private final cke f5860C;

    /* renamed from: D */
    private Map f5861D = new HashMap();

    /* renamed from: E */
    private cjz f5862E;

    /* renamed from: F */
    private cjz f5863F;

    /* renamed from: G */
    private cjz f5864G;

    /* renamed from: H */
    private Queue f5865H = new ArrayDeque();

    /* renamed from: I */
    private Map f5866I;

    /* renamed from: J */
    private long f5867J;

    /* renamed from: K */
    private SharedPreferences f5868K;

    /* renamed from: L */
    private SharedPreferences f5869L;

    /* renamed from: M */
    private boolean f5870M = true;

    /* renamed from: O */
    private ckn f5871O = new ckn();

    /* renamed from: P */
    private final SharedPreferences.OnSharedPreferenceChangeListener f5872P = new ckr(this);

    /* renamed from: a */
    public final Context f5873a;

    /* renamed from: b */
    public List f5874b = new LinkedList();

    /* renamed from: c */
    public Map f5875c = new HashMap();

    /* renamed from: d */
    public List f5876d = new LinkedList();

    /* renamed from: e */
    public List f5877e = new LinkedList();

    /* renamed from: f */
    public List f5878f = new LinkedList();

    /* renamed from: g */
    public List f5879g = new LinkedList();

    /* renamed from: h */
    public cjz f5880h;

    /* renamed from: i */
    public Map f5881i = new HashMap();

    /* renamed from: j */
    public Map f5882j = new HashMap();

    /* renamed from: k */
    public List f5883k;

    /* renamed from: l */
    public Set f5884l;

    /* renamed from: m */
    public HashSet f5885m = new HashSet();

    /* renamed from: n */
    public boolean f5886n = true;

    /* renamed from: o */
    public Map f5887o = new HashMap();

    /* renamed from: p */
    public Set f5888p = new HashSet();

    /* renamed from: q */
    public List f5889q;

    /* renamed from: r */
    public cld f5890r;

    /* renamed from: s */
    public Set f5891s = new HashSet();

    /* renamed from: t */
    public boolean f5892t = true;

    /* renamed from: u */
    public String f5893u;

    /* renamed from: v */
    public Map f5894v = Collections.synchronizedMap(new HashMap());

    /* renamed from: w */
    public cjs f5895w;

    /* renamed from: g */
    public final boolean mo3073g() {
        return this.f5883k != null;
    }

    /* renamed from: i */
    public final boolean mo3075i() {
        return this.f5890r != null;
    }

    private cla(Context context, dbh dbh) {
        new Handler();
        this.f5873a = context.getApplicationContext();
        this.f5859B = dbh;
        this.f5860C = new cke(this.f5873a, new ckx(this));
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.tvlauncher.data.TvDataManager.WATCH_NEXT_PREF_FILE_NAME", 0);
        sharedPreferences.registerOnSharedPreferenceChangeListener(this.f5872P);
        this.f5893u = m5027a(sharedPreferences);
        mo3081o();
        SharedPreferences sharedPreferences2 = this.f5873a.getSharedPreferences("com.google.android.tvlauncher.data.TvDataManager.LIVE_TV_CHANNEL_PREF", 0);
        this.f5868K = sharedPreferences2;
        this.f5867J = sharedPreferences2.getLong("live_tv_channel_id", -1);
        SharedPreferences sharedPreferences3 = this.f5873a.getSharedPreferences("com.google.android.tvlauncher.data.TvDataManager.PREF", 0);
        this.f5869L = sharedPreferences3;
        String string = sharedPreferences3.getString("non_empty_old_home_channel_ids", null);
        if (string != null) {
            for (String str : string.split(",")) {
                try {
                    this.f5885m.add(Long.valueOf(Long.parseLong(str)));
                } catch (NumberFormatException e) {
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
        this.f5884l = (Set) this.f5885m.clone();
    }

    /* renamed from: a */
    public static void m5028a(Map map, Object obj, Object obj2) {
        List list = (List) map.get(obj);
        if (list == null) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(obj2);
            map.put(obj, linkedList);
        } else if (!list.contains(obj2)) {
            list.add(obj2);
        }
    }

    /* renamed from: a */
    public final boolean mo3057a(Long l) {
        Integer a;
        cjs cjs = this.f5895w;
        if (cjs == null || (a = cjs.mo2924a(l.longValue())) == null || a.intValue() >= 5) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final String m5027a(SharedPreferences sharedPreferences) {
        StringBuilder sb = new StringBuilder(" NOT IN (");
        boolean z = false;
        for (String next : sharedPreferences.getAll().keySet()) {
            if (next.startsWith("watch_next_package_key_prefix")) {
                sb.append("'");
                sb.append(next.substring(29));
                sb.append("',");
                z = true;
            }
        }
        if (!z) {
            return "browsable=1 AND last_engagement_time_utc_millis<=?";
        }
        sb.setLength(sb.length() - 1);
        sb.append(")");
        String valueOf = String.valueOf(sb.toString());
        return valueOf.length() == 0 ? new String("browsable=1 AND last_engagement_time_utc_millis<=? AND package_name") : "browsable=1 AND last_engagement_time_utc_millis<=? AND package_name".concat(valueOf);
    }

    /* renamed from: a */
    public final void mo3053a(cjp cjp, Long l) {
        if (cjp != null) {
            cjp.mo2917a();
        }
        this.f5888p.remove(l);
        this.f5865H.remove(l);
    }

    /* renamed from: d */
    public final void mo3069d() {
        if (this.f5876d.size() == 0 && this.f5877e.size() == 0) {
            cjz cjz = this.f5862E;
            if (cjz != null) {
                cjz.mo2951c();
                this.f5862E = null;
            }
            this.f5889q = null;
            this.f5866I = null;
        }
    }

    /* renamed from: a */
    public final String mo3047a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    private static final dai m5026a(dbf dbf, dck dck, String str, String str2) {
        dai dai;
        if (dbf != null) {
            dai = (dai) dbf.f8140b.get(dai.m6054a(str, str2));
        } else {
            dai = null;
        }
        return dai == null ? (dai) dck.f8228e.f8252Q.get(dai.m6054a(str, str2)) : dai;
    }

    /* renamed from: b */
    public final cxt mo3059b(int i) {
        return (cxt) this.f5883k.get(i);
    }

    /* renamed from: h */
    public final int mo3074h() {
        List list = this.f5883k;
        if (list == null) {
            return -1;
        }
        return list.size();
    }

    /* renamed from: a */
    public static cla m5025a(Context context) {
        if (f5854A == null) {
            cgg cgg = (cgg) context.getApplicationContext();
            if (cgg.f5462h == null) {
                synchronized (cgg.f5461g) {
                    if (cgg.f5462h == null) {
                        cgg.f5462h = new dbh(cgg);
                    }
                }
            }
            f5854A = new cla(context, cgg.f5462h);
        }
        return f5854A;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Set mo3048a(Set set) {
        int size = set.size();
        HashSet hashSet = new HashSet(set.size());
        ArrayList arrayList = new ArrayList(set);
        for (int i = 0; i < size; i += f5855N) {
            List<Long> subList = arrayList.subList(i, Math.min(f5855N + i, size));
            ContentResolver contentResolver = this.f5873a.getContentResolver();
            Uri uri = TvContract.PreviewPrograms.CONTENT_URI;
            String[] strArr = {"channel_id"};
            StringBuilder sb = new StringBuilder(subList.size() * 5);
            sb.append("channel_id IN (");
            for (Long l : subList) {
                sb.append(l.toString());
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
                        dhr.m6455a(th, th);
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

    /* renamed from: b */
    public final List mo3060b(String str) {
        return (List) this.f5866I.get(str);
    }

    /* renamed from: a */
    public final cxu mo3046a(long j, int i) {
        if (i >= 0) {
            cjp cjp = (cjp) this.f5887o.get(Long.valueOf(j));
            if (cjp != null && i >= cjp.mo2918b()) {
                int b = cjp.mo2918b();
                StringBuilder sb = new StringBuilder(56);
                sb.append("Position [");
                sb.append(i);
                sb.append("] is out of bounds [0, ");
                sb.append(b - 1);
                sb.append("]");
                throw new IllegalArgumentException(sb.toString());
            } else if (cjp != null) {
                return new cko(cjp, i);
            } else {
                return null;
            }
        } else {
            throw new IllegalArgumentException("Position must be positive");
        }
    }

    /* renamed from: d */
    public final int mo3068d(long j) {
        Map map = this.f5887o;
        Long valueOf = Long.valueOf(j);
        if (map.containsKey(valueOf)) {
            return ((cjp) this.f5887o.get(valueOf)).mo2918b();
        }
        return -1;
    }

    /* renamed from: c */
    public final cxu mo3065c(int i) {
        if (i >= 0) {
            cld cld = this.f5890r;
            if (cld != null && i >= cld.mo2918b()) {
                int b = this.f5890r.mo2918b();
                StringBuilder sb = new StringBuilder(56);
                sb.append("Position [");
                sb.append(i);
                sb.append("] is out of bounds [0, ");
                sb.append(b - 1);
                sb.append("]");
                throw new IllegalArgumentException(sb.toString());
            }
            cld cld2 = this.f5890r;
            if (cld2 != null) {
                return new cko(cld2, i);
            }
            return null;
        }
        throw new IllegalArgumentException("Position must be positive");
    }

    /* renamed from: j */
    public final int mo3076j() {
        cld cld = this.f5890r;
        if (cld == null) {
            return 0;
        }
        return cld.mo2918b();
    }

    /* renamed from: b */
    public final void mo3062b(long j) {
        Integer a = this.f5895w.mo2924a(j);
        if (a != null) {
            cxt cxt = (cxt) this.f5883k.remove(a.intValue());
            this.f5885m.remove(Long.valueOf(j));
            cjs cjs = this.f5895w;
            if (!cxt.f7884k) {
                cjs.f5742d.remove(cxt.f7874a);
            }
            cjs.mo2928b();
            int intValue = a.intValue();
            for (ckg ckg : this.f5874b) {
                cqp cqp = ckg.f5813a;
                cqp.mo3605i(cqp.mo3606j(intValue));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo3064b(Set set) {
        if (!set.isEmpty()) {
            new cks(this, new HashSet(set)).executeOnExecutor(daz.f8124a, new Object[0]);
        }
    }

    /* renamed from: a */
    public final boolean mo3056a(long j) {
        return !this.f5884l.contains(Long.valueOf(j));
    }

    /* renamed from: a */
    private static final boolean m5029a(String str, String str2, dbf dbf, dai dai) {
        if (dbf != null && dbf.f8139a.contains(dai.m6054a(str, str2))) {
            return true;
        }
        return dai != null && dai.f8053d;
    }

    /* renamed from: b */
    private final boolean m5030b(String str, String str2) {
        dai dai = dck.m6123a(this.f5873a).f8228e.f8237B;
        if (dai == null || !dai.f8050a.equals(str)) {
            return false;
        }
        return TextUtils.isEmpty(dai.f8051b) || TextUtils.equals(dai.f8051b, str2);
    }

    /* renamed from: a */
    public final boolean mo3058a(String str) {
        Map map = this.f5866I;
        return map != null && map.containsKey(str);
    }

    /* renamed from: c */
    public final boolean mo3067c(long j) {
        return this.f5887o.containsKey(Long.valueOf(j));
    }

    /* renamed from: o */
    public final void mo3081o() {
        if (this.f5864G == null) {
            cjz a = cjz.m4941a(this.f5873a);
            a.mo2947a(TvContract.WatchNextPrograms.CONTENT_URI);
            a.f5779d = f5857y;
            a.f5780e = "browsable=1";
            a.f5777b = 5;
            a.mo2948a(this);
            m5031d(a);
            a.mo2950b();
        }
    }

    /* renamed from: k */
    public final void mo3077k() {
        if (this.f5880h == null) {
            cjz a = cjz.m4941a(this.f5873a);
            a.mo2947a(TvContract.Channels.CONTENT_URI);
            a.f5779d = cxt.f7873l;
            a.f5780e = "browsable=1 AND type='TYPE_PREVIEW'";
            a.f5777b = 0;
            a.mo2948a(this);
            m5031d(a);
            a.mo2950b();
        }
    }

    /* renamed from: e */
    public final void mo3071e(long j) {
        Map map = this.f5861D;
        Long valueOf = Long.valueOf(j);
        if (!map.containsKey(valueOf)) {
            if (!this.f5887o.containsKey(valueOf) && this.f5887o.size() >= 15) {
                Iterator it = this.f5865H.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Long l = (Long) it.next();
                    if (!this.f5875c.containsKey(l) && !mo3057a(l)) {
                        mo3053a((cjp) this.f5887o.remove(l), l);
                        break;
                    }
                }
            }
            cjz a = cjz.m4941a(this.f5873a);
            a.mo2947a(TvContract.PreviewPrograms.CONTENT_URI);
            a.f5779d = cxu.f7885c;
            a.f5780e = "channel_id=? AND browsable=1";
            a.mo2949a(String.valueOf(j));
            a.f5781f = "weight DESC";
            a.f5782g = Long.valueOf(j);
            a.f5777b = 1;
            a.mo2948a(this);
            m5031d(a);
            a.mo2950b();
        }
    }

    /* renamed from: l */
    public final void mo3078l() {
        if (this.f5862E == null) {
            cjz a = cjz.m4941a(this.f5873a);
            a.mo2947a(TvContract.Channels.CONTENT_URI);
            a.f5779d = cxr.f7855k;
            a.f5780e = "type='TYPE_PREVIEW'";
            a.f5777b = 2;
            a.mo2948a(this);
            m5031d(a);
            a.mo2950b();
        }
    }

    /* renamed from: m */
    public final void mo3079m() {
        if (this.f5876d.size() > 0 || this.f5877e.size() > 0) {
            mo3078l();
        }
    }

    /* renamed from: n */
    public final void mo3080n() {
        if (this.f5863F == null) {
            cjz a = cjz.m4941a(this.f5873a);
            a.mo2947a(TvContract.WatchNextPrograms.CONTENT_URI);
            a.f5779d = cxu.f7886d;
            a.f5780e = this.f5893u;
            a.mo2949a(String.valueOf(System.currentTimeMillis() + 600000));
            a.f5781f = "last_engagement_time_utc_millis DESC LIMIT 1000";
            a.f5777b = 4;
            a.mo2948a(this);
            m5031d(a);
            a.mo2950b();
        }
    }

    /* renamed from: a */
    public final void mo3050a(int i) {
        int i2;
        for (ckg ckg : this.f5874b) {
            int j = ckg.f5813a.mo3606j(i);
            long j2 = ckg.f5813a.f7011c.mo3059b(i).f7874a;
            cqp cqp = ckg.f5813a;
            if (cqp.f7026r != j || (!((i2 = cqp.f7024p) == 2 || i2 == 3) || !cqp.f7011c.mo3056a(j2))) {
                ckg.f5813a.mo5306a(j, "PAYLOAD_STATE");
            } else {
                if (!dcy.m6193b(ckg.f5813a.f7010b)) {
                    ckg.f5813a.f7024p = 1;
                } else {
                    ckg.f5813a.f7024p = 0;
                }
                cqp cqp2 = ckg.f5813a;
                cqp2.mo5305a(0, cqp2.mo2794a(), "PAYLOAD_STATE");
            }
            cox cox = ckg.f5813a.f6981G;
            if (cox.f6856b.mo3056a(j2)) {
                cox.mo3535a(j2);
            } else {
                cox.mo3537b(j2);
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
        if (r6 == r2.f7027s) goto L_0x008c;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3070e() {
        /*
            r10 = this;
            java.util.List r0 = r10.f5874b
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00a6
            java.lang.Object r1 = r0.next()
            ckg r1 = (p000.ckg) r1
            cqp r2 = r1.f5813a
            cox r2 = r2.f6981G
            r2.mo3534a()
            cqp r2 = r1.f5813a
            cla r2 = r2.f7011c
            int r2 = r2.mo3074h()
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 < 0) goto L_0x004e
            cft r6 = new cft
            java.lang.String r7 = "shown_channel_count"
            r6.<init>(r5, r7)
            dja r7 = r6.mo2731d()
            boolean r8 = r7.f8673b
            if (r8 == 0) goto L_0x003a
            r7.mo4505b()
            r7.f8673b = r4
        L_0x003a:
            dje r7 = r7.f8672a
            dml r7 = (p000.dml) r7
            dml r8 = p000.dml.f8844c
            int r8 = r7.f8845a
            r8 = r8 | r3
            r7.f8845a = r8
            r7.f8846b = r2
            cqp r2 = r1.f5813a
            cfp r2 = r2.f7012d
            r2.mo2714a(r6)
        L_0x004e:
            cqp r2 = r1.f5813a
            long r6 = r2.f7027s
            int r8 = r2.f7026r
            int r2 = r2.mo2794a()
            if (r8 < r2) goto L_0x0065
            cqp r2 = r1.f5813a
            int r8 = r2.mo2794a()
            int r8 = r8 + -1
            r2.mo3593b(r8, r4)
        L_0x0065:
            cqp r2 = r1.f5813a
            r2.mo3604i()
            cqp r2 = r1.f5813a
            int r8 = r2.f7024p
            r9 = 3
            if (r8 != r9) goto L_0x0072
            goto L_0x0074
        L_0x0072:
            if (r8 != r3) goto L_0x008c
        L_0x0074:
            cla r3 = r2.f7011c
            long r8 = r2.f7027s
            boolean r2 = r3.mo3056a(r8)
            if (r2 != 0) goto L_0x0088
            cqp r2 = r1.f5813a
            long r8 = r2.f7027s
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x0087
            goto L_0x008c
        L_0x0087:
            goto L_0x008a
        L_0x0088:
            cqp r2 = r1.f5813a
        L_0x008a:
            r2.f7024p = r5
        L_0x008c:
            cqp r2 = r1.f5813a
            int r3 = r2.f7024p
            if (r3 != r5) goto L_0x009f
            android.content.Context r2 = r2.f7010b
            boolean r2 = p000.dcy.m6193b(r2)
            if (r2 != 0) goto L_0x009b
            goto L_0x009f
        L_0x009b:
            cqp r2 = r1.f5813a
            r2.f7024p = r4
        L_0x009f:
            cqp r1 = r1.f5813a
            r1.mo5303O()
            goto L_0x0006
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cla.mo3070e():void");
    }

    /* renamed from: f */
    public final void mo3072f() {
        for (cle a : this.f5879g) {
            a.mo3083a();
        }
    }

    /* renamed from: c */
    public final void mo2944c(cjz cjz) {
        m5032e(cjz);
    }

    /* renamed from: b */
    public final void mo2943b(cjz cjz) {
        int i;
        cjz cjz2 = cjz;
        boolean z = true;
        if (cjz2.f5777b == 0) {
            boolean z2 = this.f5886n;
            cky cky = (cky) cjz2.f5784i;
            List list = this.f5883k;
            if (list == null) {
                this.f5883k = new ArrayList();
            } else {
                list.clear();
            }
            HashSet hashSet = new HashSet(this.f5885m.size());
            if (!this.f5870M || this.f5869L.getInt("boot_count", -1) >= (i = Settings.Global.getInt(this.f5873a.getContentResolver(), "boot_count", 0))) {
                z = false;
            } else {
                this.f5869L.edit().putInt("boot_count", i).apply();
                this.f5870M = false;
            }
            HashMap hashMap = new HashMap(cky.f5846a.size());
            HashSet hashSet2 = new HashSet();
            for (cxt cxt : cky.f5846a) {
                long j = cxt.f7874a;
                HashSet hashSet3 = hashSet;
                if (this.f5867J == -1 && m5030b(cxt.f7879f, cxt.f7877d)) {
                    m5033f(j);
                }
                if (!z2) {
                    Map map = this.f5882j;
                    Long valueOf = Long.valueOf(j);
                    if (!map.containsKey(valueOf)) {
                        hashSet2.add(valueOf);
                    }
                }
                Long valueOf2 = Long.valueOf(j);
                hashMap.put(valueOf2, cxt);
                if (!this.f5885m.contains(valueOf2)) {
                    hashSet = hashSet3;
                } else if (z && cxt.f7884k) {
                    hashSet = hashSet3;
                } else {
                    this.f5883k.add(cxt);
                    hashSet = hashSet3;
                    hashSet.add(valueOf2);
                }
            }
            this.f5882j = hashMap;
            this.f5885m = hashSet;
            this.f5884l.removeIf(new ckq(this));
            mo3049a();
            this.f5886n = false;
            ckn ckn = this.f5871O;
            List list2 = cky.f5849d;
            LongSparseArray longSparseArray = cky.f5850e;
            ckn.f5824b = longSparseArray;
            ckm ckm = ckn.f5825c;
            ckm.f5822a = longSparseArray;
            list2.sort(ckm);
            ckn.f5823a = list2;
            cjs cjs = this.f5895w;
            if (cjs == null) {
                Context context = this.f5873a;
                cjs = new cjs(context, dck.m6123a(context).f8228e.f8284s, dck.m6123a(this.f5873a).f8228e.f8238C);
                this.f5895w = cjs;
                cjs.f5740b = this.f5874b;
                cjs.f5739a = this.f5871O;
            }
            cjs.f5744f = this.f5867J;
            cjs.f5745g = cky.f5847b;
            cjs.f5746h = cky.f5848c;
            cjs.mo2927a(this.f5883k);
            mo3070e();
            if (z2) {
                mo3064b(this.f5882j.keySet());
            } else {
                mo3064b(hashSet2);
            }
        } else if (cjz2.f5777b != 1) {
            if (cjz2.f5777b == 2) {
                ckz ckz = (ckz) cjz2.f5784i;
                this.f5889q = ckz.f5851a;
                Map map2 = ckz.f5852b;
                this.f5866I = map2;
                for (Map.Entry value : map2.entrySet()) {
                    for (cxr cxr : (List) value.getValue()) {
                        if (this.f5867J == -1 && m5030b(cxr.f7862g, cxr.f7859d)) {
                            m5033f(cxr.f7856a);
                        }
                    }
                }
                for (ckj ckj : this.f5876d) {
                    ckj.f5816a.mo4004b();
                }
                for (cki cki : this.f5877e) {
                    cki.f5815a.mo4006e();
                }
            } else if (cjz2.f5777b == 3) {
                cxr cxr2 = (cxr) cjz2.f5784i;
                for (ckp a : this.f5878f) {
                    a.mo3028a();
                }
            } else if (cjz2.f5777b != 4) {
                if (cjz2.f5777b == 5) {
                    this.f5891s = (HashSet) cjz2.f5784i;
                }
            } else if (cjz2.f5783h == null) {
                Log.e("TvDataManager", "error loading watch next programs, cursor is null");
            } else {
                cld cld = this.f5890r;
                if (cld != null) {
                    cld.mo2917a();
                }
                this.f5890r = new cld(cjz2.f5783h);
                this.f5892t = false;
                mo3072f();
            }
        } else if (cjz2.f5783h != null) {
            Long l = (Long) cjz2.f5782g;
            mo3053a((cjp) this.f5887o.remove(l), l);
            this.f5887o.put(l, new cjp(cjz2.f5783h, (byte) 0));
            this.f5865H.add(l);
            List<cjt> list3 = (List) this.f5875c.get(Long.valueOf(l.longValue()));
            if (list3 != null) {
                for (cjt cjt : list3) {
                    coo coo = cjt.f5758a;
                    coo.f6789f = -1;
                    coo.mo5303O();
                }
            }
            int count = cjz2.f5783h.getCount();
            if (count == 0) {
                z = false;
            }
            if (this.f5884l.contains(l) != z) {
                if (count == 0) {
                    this.f5884l.remove(l);
                } else {
                    this.f5884l.add(l);
                }
                mo3049a();
                Integer a2 = this.f5895w.mo2924a(l.longValue());
                if (a2 != null) {
                    mo3050a(a2.intValue());
                }
            }
        }
        m5032e(cjz);
    }

    /* renamed from: a */
    public final void mo2942a(cjz cjz, Throwable th) {
        String valueOf = String.valueOf(cjz);
        String valueOf2 = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27 + String.valueOf(valueOf2).length());
        sb.append("onTaskFailed: ");
        sb.append(valueOf);
        sb.append(", throwable: ");
        sb.append(valueOf2);
        Log.e("TvDataManager", sb.toString());
        m5032e(cjz);
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2941a(p000.cjz r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            long r2 = r0.f5777b
            java.lang.String r4 = "sponsored.legacy"
            r5 = 0
            java.lang.String r6 = "TvDataManager"
            r7 = 0
            r8 = 1
            r9 = 0
            int r11 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x012a
            android.database.Cursor r2 = r0.f5783h
            r9 = -1
            if (r2 == 0) goto L_0x00ef
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x011c }
            int r11 = r2.getCount()     // Catch:{ all -> 0x011c }
            r6.<init>(r11)     // Catch:{ all -> 0x011c }
            dbh r11 = r1.f5859B     // Catch:{ all -> 0x011c }
            dbf r11 = r11.mo4066a()     // Catch:{ all -> 0x011c }
            android.content.Context r12 = r1.f5873a     // Catch:{ all -> 0x011c }
            dck r12 = p000.dck.m6123a(r12)     // Catch:{ all -> 0x011c }
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
            r15.f7874a = r3     // Catch:{ all -> 0x011c }
            java.lang.String r3 = r2.getString(r8)     // Catch:{ all -> 0x011c }
            r15.f7875b = r3     // Catch:{ all -> 0x011c }
            r3 = 2
            java.lang.String r3 = r2.getString(r3)     // Catch:{ all -> 0x011c }
            r15.f7876c = r3     // Catch:{ all -> 0x011c }
            r3 = 3
            java.lang.String r3 = r2.getString(r3)     // Catch:{ all -> 0x011c }
            r15.f7877d = r3     // Catch:{ all -> 0x011c }
            r3 = 4
            java.lang.String r3 = r2.getString(r3)     // Catch:{ all -> 0x011c }
            r15.f7878e = r3     // Catch:{ all -> 0x011c }
            r3 = 5
            java.lang.String r3 = r2.getString(r3)     // Catch:{ all -> 0x011c }
            r15.f7879f = r3     // Catch:{ all -> 0x011c }
            r3 = 6
            int r3 = r2.getInt(r3)     // Catch:{ all -> 0x011c }
            r15.f7881h = r3     // Catch:{ all -> 0x011c }
            java.lang.String r3 = "com.google.android.tvrecommendations"
            java.lang.String r4 = r15.f7879f     // Catch:{ all -> 0x011c }
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
            r15.f7879f = r4     // Catch:{ all -> 0x011c }
            r4 = 1
            r15.f7884k = r4     // Catch:{ all -> 0x011c }
            goto L_0x0099
        L_0x0095:
            r3 = r16
            r17 = -1
        L_0x0099:
            r6.add(r15)     // Catch:{ all -> 0x011c }
            java.lang.String r4 = r15.f7879f     // Catch:{ all -> 0x011c }
            java.lang.String r8 = r15.f7877d     // Catch:{ all -> 0x011c }
            dai r4 = m5026a(r11, r12, r4, r8)     // Catch:{ all -> 0x011c }
            java.lang.String r8 = r15.f7879f     // Catch:{ all -> 0x011c }
            java.lang.String r5 = r15.f7877d     // Catch:{ all -> 0x011c }
            boolean r5 = m5029a(r8, r5, r11, r4)     // Catch:{ all -> 0x011c }
            r15.f7880g = r5     // Catch:{ all -> 0x011c }
            if (r4 != 0) goto L_0x00b2
            r8 = r6
            goto L_0x00e3
        L_0x00b2:
            boolean r5 = r4.f8053d     // Catch:{ all -> 0x011c }
            if (r5 == 0) goto L_0x00be
            boolean r5 = r4.f8054e     // Catch:{ all -> 0x011c }
            if (r5 == 0) goto L_0x00be
            long r13 = r15.f7874a     // Catch:{ all -> 0x011c }
            int r10 = r4.f8052c     // Catch:{ all -> 0x011c }
        L_0x00be:
            boolean r5 = r4.f8055f     // Catch:{ all -> 0x011c }
            r15.f7882i = r5     // Catch:{ all -> 0x011c }
            boolean r8 = r4.f8056g     // Catch:{ all -> 0x011c }
            r15.f7883j = r8     // Catch:{ all -> 0x011c }
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
            long r5 = r15.f7874a     // Catch:{ all -> 0x011c }
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
            android.util.LongSparseArray r9 = p000.cla.f5858z
        L_0x0111:
            r16 = r9
            cky r2 = new cky
            r10 = r2
            r10.<init>(r11, r12, r14, r15, r16)
            r0.f5784i = r2
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
            p000.dhr.m6455a(r3, r2)
        L_0x0129:
            throw r3
        L_0x012a:
            r3 = r4
            long r4 = r0.f5777b
            r8 = 1
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x02d8
            long r4 = r0.f5777b
            r8 = 2
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x024e
            java.util.HashSet r2 = new java.util.HashSet
            r4 = 100
            r2.<init>(r4)
            android.database.Cursor r4 = r0.f5783h
            if (r4 == 0) goto L_0x01c7
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0240 }
            int r6 = r4.getCount()     // Catch:{ all -> 0x0240 }
            r5.<init>(r6)     // Catch:{ all -> 0x0240 }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x0240 }
            int r7 = r4.getCount()     // Catch:{ all -> 0x0240 }
            r6.<init>(r7)     // Catch:{ all -> 0x0240 }
            dbh r7 = r1.f5859B     // Catch:{ all -> 0x0240 }
            dbf r7 = r7.mo4066a()     // Catch:{ all -> 0x0240 }
            android.content.Context r8 = r1.f5873a     // Catch:{ all -> 0x0240 }
            dck r8 = p000.dck.m6123a(r8)     // Catch:{ all -> 0x0240 }
        L_0x0164:
            boolean r9 = r4.moveToNext()     // Catch:{ all -> 0x0240 }
            if (r9 == 0) goto L_0x0198
            cxr r9 = p000.cxr.m5909a(r4)     // Catch:{ all -> 0x0240 }
            long r10 = r9.f7856a     // Catch:{ all -> 0x0240 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0240 }
            r2.add(r10)     // Catch:{ all -> 0x0240 }
            java.lang.String r10 = r9.f7862g     // Catch:{ all -> 0x0240 }
            java.lang.String r11 = r9.f7859d     // Catch:{ all -> 0x0240 }
            dai r10 = m5026a(r7, r8, r10, r11)     // Catch:{ all -> 0x0240 }
            java.lang.String r11 = r9.f7862g     // Catch:{ all -> 0x0240 }
            java.lang.String r12 = r9.f7859d     // Catch:{ all -> 0x0240 }
            boolean r11 = m5029a(r11, r12, r7, r10)     // Catch:{ all -> 0x0240 }
            r9.f7864i = r11     // Catch:{ all -> 0x0240 }
            java.lang.String r12 = r9.f7862g     // Catch:{ all -> 0x0240 }
            if (r11 == 0) goto L_0x018e
            r12 = r3
        L_0x018e:
            if (r10 == 0) goto L_0x0194
            boolean r10 = r10.f8056g     // Catch:{ all -> 0x0240 }
            r9.f7865j = r10     // Catch:{ all -> 0x0240 }
        L_0x0194:
            m5028a(r6, r12, r9)     // Catch:{ all -> 0x0240 }
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
            java.util.Set r2 = r1.mo3048a(r2)
            java.util.Iterator r4 = r5.iterator()
        L_0x01e2:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0238
            java.lang.Object r6 = r4.next()
            cxs r6 = (p000.cxs) r6
            java.lang.String r7 = r6.f7866a
            java.lang.Object r7 = r3.get(r7)
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r8 = r7.iterator()
        L_0x01fa:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0215
            java.lang.Object r9 = r8.next()
            cxr r9 = (p000.cxr) r9
            long r10 = r9.f7856a
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            boolean r10 = r2.contains(r10)
            r11 = 1
            r10 = r10 ^ r11
            r9.f7863h = r10
            goto L_0x01fa
        L_0x0215:
            r11 = 1
            int r8 = r7.size()
            if (r8 != r11) goto L_0x01e2
            r8 = 0
            java.lang.Object r7 = r7.get(r8)
            cxr r7 = (p000.cxr) r7
            java.lang.String r8 = r7.f7857b
            r6.f7868c = r8
            long r8 = r7.f7856a
            r6.f7869d = r8
            boolean r8 = r7.f7858c
            r6.f7870e = r8
            boolean r8 = r7.f7863h
            r6.f7871f = r8
            boolean r7 = r7.f7865j
            r6.f7872g = r7
            goto L_0x01e2
        L_0x0238:
            ckz r2 = new ckz
            r2.<init>(r5, r3)
            r0.f5784i = r2
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
            p000.dhr.m6455a(r2, r3)
        L_0x024d:
            throw r2
        L_0x024e:
            long r2 = r0.f5777b
            r4 = 3
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x02ab
            long r2 = r0.f5777b
            r4 = 5
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x02fa
            android.database.Cursor r2 = r0.f5783h
            if (r2 != 0) goto L_0x026f
            java.lang.String r3 = "error loading watch next data into cache, cursor is null"
            android.util.Log.e(r6, r3)     // Catch:{ all -> 0x029d }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x029d }
            r3.<init>()     // Catch:{ all -> 0x029d }
            r0.f5784i = r3     // Catch:{ all -> 0x029d }
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
            java.lang.String r4 = r1.mo3047a(r5, r6)     // Catch:{ all -> 0x029d }
            r3.add(r4)     // Catch:{ all -> 0x029d }
            boolean r4 = r2.moveToNext()     // Catch:{ all -> 0x029d }
            if (r4 != 0) goto L_0x027d
        L_0x0295:
            r0.f5784i = r3     // Catch:{ all -> 0x029d }
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
            p000.dhr.m6455a(r3, r2)
        L_0x02aa:
            throw r3
        L_0x02ab:
            android.database.Cursor r2 = r0.f5783h
            if (r2 != 0) goto L_0x02b5
            java.lang.String r3 = "error loading promo channel, cursor is null"
            android.util.Log.e(r6, r3)     // Catch:{ all -> 0x02ca }
            goto L_0x02c1
        L_0x02b5:
            boolean r3 = r2.moveToFirst()     // Catch:{ all -> 0x02ca }
            if (r3 == 0) goto L_0x02c0
            cxr r7 = p000.cxr.m5909a(r2)     // Catch:{ all -> 0x02ca }
            goto L_0x02c2
        L_0x02c0:
        L_0x02c1:
        L_0x02c2:
            if (r2 == 0) goto L_0x02c7
            r2.close()
        L_0x02c7:
            r0.f5784i = r7
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
            p000.dhr.m6455a(r3, r2)
        L_0x02d7:
            throw r3
        L_0x02d8:
            android.database.Cursor r2 = r0.f5783h
            if (r2 == 0) goto L_0x02fb
        L_0x02dc:
            boolean r0 = r2.moveToNext()
            if (r0 == 0) goto L_0x02fa
            java.util.Map r0 = r1.f5894v
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
            java.lang.Object r0 = r0.f5782g
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
        throw new UnsupportedOperationException("Method not decompiled: p000.cla.mo2941a(cjz):void");
    }

    /* renamed from: b */
    public final void mo3061b() {
        cke cke = this.f5860C;
        if (!cke.f5799d) {
            ContentResolver contentResolver = cke.f5797b.getContentResolver();
            contentResolver.registerContentObserver(TvContract.Channels.CONTENT_URI, true, cke.f5807l);
            contentResolver.registerContentObserver(TvContract.PreviewPrograms.CONTENT_URI, true, cke.f5807l);
            contentResolver.registerContentObserver(TvContract.WatchNextPrograms.CONTENT_URI, true, cke.f5807l);
            cke.f5799d = true;
        }
    }

    /* renamed from: a */
    public final void mo3054a(ckj ckj) {
        if (!this.f5876d.contains(ckj)) {
            this.f5876d.add(ckj);
        }
        mo3061b();
    }

    /* renamed from: a */
    public final void mo3055a(cle cle) {
        if (!this.f5879g.contains(cle)) {
            this.f5879g.add(cle);
        }
        mo3061b();
    }

    /* renamed from: f */
    private final void m5033f(long j) {
        this.f5867J = j;
        this.f5868K.edit().putLong("live_tv_channel_id", this.f5867J).apply();
    }

    /* renamed from: a */
    public final void mo3049a() {
        SharedPreferences.Editor edit = this.f5869L.edit();
        if (this.f5884l.size() > 0) {
            StringBuilder sb = new StringBuilder(128);
            for (Long append : this.f5884l) {
                sb.append(append);
                sb.append(",");
            }
            edit.putString("non_empty_old_home_channel_ids", sb.toString());
        } else {
            edit.putString("non_empty_old_home_channel_ids", "");
        }
        edit.apply();
    }

    /* renamed from: a */
    public final void mo3052a(long j, boolean z, boolean z2) {
        cjs cjs = this.f5895w;
        if (cjs != null) {
            if (!z) {
                cjs.f5742d.remove(j);
                cjs.mo2928b();
            }
            this.f5895w.mo2925a();
        }
        new ckt(this, z, j, z2).executeOnExecutor(daz.f8124a, Boolean.valueOf(z), Long.valueOf(j));
    }

    /* renamed from: d */
    private final void m5031d(cjz cjz) {
        if (cjz.f5777b == 0) {
            this.f5880h = cjz;
        } else if (cjz.f5777b == 1) {
            this.f5861D.put((Long) cjz.f5782g, cjz);
        } else if (cjz.f5777b == 2) {
            this.f5862E = cjz;
        } else if (cjz.f5777b == 3) {
        } else {
            if (cjz.f5777b == 4) {
                this.f5863F = cjz;
            } else if (cjz.f5777b == 5) {
                this.f5864G = cjz;
            }
        }
    }

    /* renamed from: e */
    private final void m5032e(cjz cjz) {
        if (cjz.f5777b == 0) {
            this.f5880h = null;
        } else if (cjz.f5777b == 1) {
            this.f5861D.remove((Long) cjz.f5782g);
        } else if (cjz.f5777b == 2) {
            this.f5862E = null;
        } else if (cjz.f5777b == 3) {
        } else {
            if (cjz.f5777b == 4) {
                this.f5863F = null;
            } else if (cjz.f5777b == 5) {
                this.f5864G = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo3051a(long j, cjt cjt) {
        Map map = this.f5875c;
        Long valueOf = Long.valueOf(j);
        List list = (List) map.get(valueOf);
        if (list != null) {
            list.remove(cjt);
            if (list.size() == 0) {
                map.remove(valueOf);
            }
        }
        mo3066c();
    }

    /* renamed from: c */
    public final void mo3066c() {
        if (this.f5874b.size() == 0 && this.f5875c.size() == 0 && this.f5876d.size() == 0 && this.f5877e.size() == 0 && this.f5878f.size() == 0 && this.f5879g.size() == 0) {
            this.f5886n = true;
            this.f5881i.clear();
            this.f5888p.addAll(this.f5887o.keySet());
            this.f5892t = true;
            cke cke = this.f5860C;
            if (cke.f5799d) {
                cke.f5797b.getContentResolver().unregisterContentObserver(cke.f5807l);
                cke.f5799d = false;
            }
        }
    }

    /* renamed from: b */
    public final void mo3063b(cle cle) {
        cjz cjz = this.f5863F;
        if (cjz != null) {
            cjz.mo2951c();
            this.f5863F = null;
        }
        this.f5879g.remove(cle);
        mo3066c();
    }
}
