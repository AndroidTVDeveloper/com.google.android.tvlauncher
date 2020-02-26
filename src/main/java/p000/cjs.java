package p000;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: cjs */
/* compiled from: PG */
public final class cjs {

    /* renamed from: i */
    private static final LongSparseArray f5738i = new LongSparseArray(0);

    /* renamed from: a */
    public ckn f5739a;

    /* renamed from: b */
    public List f5740b;

    /* renamed from: c */
    public LongSparseArray f5741c;

    /* renamed from: d */
    public LongSparseArray f5742d;

    /* renamed from: e */
    public boolean f5743e;

    /* renamed from: f */
    public long f5744f = -1;

    /* renamed from: g */
    public long f5745g;

    /* renamed from: h */
    public int f5746h;

    /* renamed from: j */
    private final Context f5747j;

    /* renamed from: k */
    private final List f5748k;

    /* renamed from: l */
    private List f5749l;

    /* renamed from: m */
    private cjr f5750m = new cjr((byte) 0);

    /* renamed from: n */
    private long f5751n;

    /* renamed from: o */
    private boolean f5752o;

    /* renamed from: p */
    private Map f5753p;

    /* renamed from: q */
    private int f5754q;

    /* renamed from: r */
    private int f5755r;

    /* renamed from: s */
    private int f5756s;

    /* renamed from: t */
    private int f5757t;

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v5 */
    public cjs(Context context, List list, int i) {
        List list2 = list;
        ? r3 = 0;
        int i2 = -1;
        this.f5754q = -1;
        this.f5755r = -1;
        this.f5745g = -1;
        this.f5756s = -1;
        this.f5757t = -1;
        this.f5746h = -1;
        this.f5747j = context.getApplicationContext();
        this.f5748k = list2;
        this.f5755r = i;
        if (list2 != null && list.size() > 0) {
            this.f5753p = new HashMap();
            int i3 = 0;
            while (i3 < list.size() && i3 < 20) {
                dai dai = (dai) list2.get(i3);
                if (this.f5753p.containsKey(dai)) {
                    ((List) this.f5753p.get(dai)).add(Integer.valueOf(i3));
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(i3));
                    this.f5753p.put(dai, arrayList);
                }
                i3++;
            }
        }
        SharedPreferences sharedPreferences = this.f5747j.getSharedPreferences("CHANNEL_ORDER_MANAGER", 0);
        String[] split = TextUtils.split(sharedPreferences.getString("ORDERED_CHANNEL_IDS", ""), ",");
        int length = split.length;
        this.f5741c = new LongSparseArray(length);
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            String str = split[i4];
            try {
                int i6 = i5 + 1;
                try {
                    this.f5741c.put(Long.parseLong(str), Integer.valueOf(i5));
                    i5 = i6;
                } catch (NumberFormatException e) {
                    i5 = i6;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 44);
                    sb.append("Invalid channel ID: ");
                    sb.append(str);
                    sb.append(" at position ");
                    sb.append(i5);
                    Log.e("ChannelOrderManager", sb.toString());
                    i4++;
                    i2 = -1;
                    r3 = 0;
                }
            } catch (NumberFormatException e2) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 44);
                sb2.append("Invalid channel ID: ");
                sb2.append(str);
                sb2.append(" at position ");
                sb2.append(i5);
                Log.e("ChannelOrderManager", sb2.toString());
                i4++;
                i2 = -1;
                r3 = 0;
            }
            i4++;
            i2 = -1;
            r3 = 0;
        }
        String string = sharedPreferences.getString("ALL_CHANNELS_POSITIONS", "");
        if (string.isEmpty()) {
            this.f5742d = this.f5741c.clone();
        } else {
            this.f5742d = new LongSparseArray(r9);
            for (String str2 : TextUtils.split(string, ",")) {
                try {
                    String[] split2 = TextUtils.split(str2, "=");
                    if (split2.length == 2) {
                        this.f5742d.put(Long.parseLong(split2[r3]), Integer.valueOf(Integer.parseInt(split2[1])));
                    } else {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 44 + String.valueOf(string).length());
                        sb3.append("Error parsing all channel positions ");
                        sb3.append(str2);
                        sb3.append(" within ");
                        sb3.append(string);
                        Log.e("ChannelOrderManager", sb3.toString());
                    }
                } catch (NumberFormatException e3) {
                    String valueOf = String.valueOf(string);
                    Log.e("ChannelOrderManager", valueOf.length() == 0 ? new String("Invalid info in all channel positions ") : "Invalid info in all channel positions ".concat(valueOf));
                }
            }
        }
        this.f5752o = sharedPreferences.getBoolean("USER_HAS_MANAGED_CHANNELS", r3);
        long j = sharedPreferences.getLong("FIRST_START_TIMESTAMP", -1);
        this.f5751n = j;
        if (j == -1) {
            this.f5751n = System.currentTimeMillis();
            sharedPreferences.edit().putLong("FIRST_START_TIMESTAMP", this.f5751n).apply();
        }
        this.f5754q = sharedPreferences.getInt("LIVE_TV_CHANNEL_LAST_POSITION", i2);
        this.f5756s = sharedPreferences.getInt("SPONSORED_GOOGLE_CHANNEL_LAST_POSITION", i2);
        this.f5757t = sharedPreferences.getInt("SPONSORED_GOOGLE_CHANNEL_LAST_OOB_POSITION", i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2927a(List list) {
        LongSparseArray longSparseArray;
        boolean z;
        int i;
        int i2;
        int i3;
        List list2 = list;
        long currentTimeMillis = System.currentTimeMillis() - this.f5751n;
        if (!this.f5752o && currentTimeMillis <= 172800000 && this.f5753p != null) {
            HashMap hashMap = new HashMap();
            for (dai dai : this.f5753p.keySet()) {
                hashMap.put(dai, ((List) this.f5753p.get(dai)).iterator());
            }
            longSparseArray = new LongSparseArray(Math.min(this.f5748k.size(), 20) + 1);
            for (int i4 = 0; i4 < list.size() && hashMap.size() != 0; i4++) {
                cxt cxt = (cxt) list2.get(i4);
                dai dai2 = new dai(cxt.f7879f, cxt.f7877d);
                if (!hashMap.containsKey(dai2)) {
                    dai2 = new dai(cxt.f7879f, null);
                }
                Iterator it = (Iterator) hashMap.get(dai2);
                if (it != null) {
                    longSparseArray.put(cxt.f7874a, (Integer) it.next());
                    if (!it.hasNext()) {
                        hashMap.remove(dai2);
                    }
                }
            }
            long j = this.f5744f;
            if (!(j == -1 || (i3 = this.f5755r) == -1)) {
                longSparseArray.put(j, Integer.valueOf(i3));
            }
            long j2 = this.f5745g;
            if (!(j2 == -1 || (i2 = this.f5746h) == -1)) {
                longSparseArray.put(j2, Integer.valueOf(i2));
            }
        } else {
            longSparseArray = f5738i;
        }
        if (longSparseArray == f5738i) {
            ckn ckn = this.f5739a;
            if (ckn.f5823a.size() != 0) {
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int i5 = 0;
                boolean z2 = false;
                while (i5 < size) {
                    cxt cxt2 = (cxt) list2.get(i5);
                    int i6 = size;
                    if (ckn.f5824b.get(cxt2.f7874a) != null) {
                        ckn.f5826d.add(Long.valueOf(cxt2.f7874a));
                        z2 = true;
                    } else {
                        arrayList.add(cxt2);
                    }
                    i5++;
                    size = i6;
                }
                if (z2) {
                    list.clear();
                    list2.addAll(arrayList);
                }
            }
            z = true;
        } else {
            z = false;
        }
        if (longSparseArray == f5738i) {
            long j3 = this.f5744f;
            if (j3 != -1 && this.f5754q == -1) {
                this.f5742d.put(j3, Integer.valueOf(this.f5755r));
            }
            long j4 = this.f5745g;
            if (j4 != -1) {
                if (this.f5756s == -1) {
                    this.f5742d.put(j4, Integer.valueOf(this.f5746h));
                } else if (this.f5746h != this.f5757t) {
                    SharedPreferences.Editor edit = this.f5747j.getSharedPreferences("CHANNEL_ORDER_MANAGER", 0).edit();
                    int i7 = this.f5746h;
                    this.f5757t = i7;
                    edit.putInt("SPONSORED_GOOGLE_CHANNEL_LAST_OOB_POSITION", i7).apply();
                    if (this.f5742d.get(this.f5745g) != null && (i = this.f5746h) > this.f5756s) {
                        this.f5742d.put(this.f5745g, Integer.valueOf(i + 1));
                    } else {
                        this.f5742d.put(this.f5745g, Integer.valueOf(this.f5746h));
                    }
                }
            }
        }
        cjr cjr = this.f5750m;
        cjr.f5736c = this.f5744f;
        cjr.f5737d = this.f5745g;
        cjr.f5734a = this.f5742d;
        cjr.f5735b = longSparseArray;
        list2.sort(cjr);
        if (z) {
            ckn ckn2 = this.f5739a;
            for (cxt cxt3 : ckn2.f5823a) {
                if (ckn2.f5826d.contains(Long.valueOf(cxt3.f7874a))) {
                    int i8 = ((dai) ckn2.f5824b.get(cxt3.f7874a)).f8052c;
                    if (i8 > list.size()) {
                        i8 = list.size();
                    }
                    list2.add(i8, cxt3);
                }
            }
            ckn2.f5826d.clear();
        }
        this.f5749l = list2;
        mo2928b();
    }

    /* renamed from: c */
    public final boolean mo2930c(long j) {
        return mo2923a(j, 1) != -1;
    }

    /* renamed from: b */
    public final boolean mo2929b(long j) {
        return mo2923a(j, -1) != -1;
    }

    /* renamed from: a */
    public final Integer mo2924a(long j) {
        return (Integer) this.f5741c.get(j);
    }

    /* renamed from: a */
    public final int mo2923a(long j, int i) {
        Integer num = (Integer) this.f5741c.get(j);
        if (num == null || this.f5739a.mo2983a(j)) {
            return -1;
        }
        int intValue = num.intValue() + i;
        while (intValue >= 0 && intValue < this.f5749l.size()) {
            if (!this.f5739a.mo2983a(((cxt) this.f5749l.get(intValue)).f7874a)) {
                return intValue;
            }
            intValue += i;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2925a() {
        this.f5752o = true;
        this.f5747j.getSharedPreferences("CHANNEL_ORDER_MANAGER", 0).edit().putBoolean("USER_HAS_MANAGED_CHANNELS", true).apply();
    }

    /* renamed from: b */
    public final void mo2928b() {
        List list = this.f5749l;
        if (list != null) {
            LongSparseArray longSparseArray = new LongSparseArray(list.size());
            List list2 = this.f5749l;
            int size = list2.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                longSparseArray.put(((cxt) list2.get(i)).f7874a, Integer.valueOf(i2));
                i++;
                i2++;
            }
            this.f5741c = longSparseArray;
            if (this.f5743e) {
                this.f5742d = longSparseArray.clone();
                this.f5743e = false;
            }
            m4923d();
            m4924e();
            m4922c();
            return;
        }
        throw new IllegalStateException("Channels must be set");
    }

    /* renamed from: c */
    private final void m4922c() {
        String str;
        SharedPreferences.Editor edit = this.f5747j.getSharedPreferences("CHANNEL_ORDER_MANAGER", 0).edit();
        String str2 = "";
        if (this.f5741c.size() > 0) {
            StringBuilder sb = new StringBuilder(this.f5749l.size() * 12);
            List list = this.f5749l;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append(((cxt) list.get(i)).f7874a);
                sb.append(',');
            }
            sb.setLength(sb.length() - 1);
            str = sb.toString();
        } else {
            str = str2;
        }
        if (this.f5742d.size() > 0) {
            StringBuilder sb2 = new StringBuilder(this.f5742d.size() * 15);
            for (int i2 = 0; i2 < this.f5742d.size(); i2++) {
                sb2.append(this.f5742d.keyAt(i2));
                sb2.append('=');
                sb2.append(this.f5742d.valueAt(i2));
                sb2.append(',');
            }
            sb2.setLength(sb2.length() - 1);
            str2 = sb2.toString();
        }
        edit.putString("ORDERED_CHANNEL_IDS", str).putString("ALL_CHANNELS_POSITIONS", str2).putInt("LIVE_TV_CHANNEL_LAST_POSITION", this.f5754q).putInt("SPONSORED_GOOGLE_CHANNEL_LAST_POSITION", this.f5756s).putInt("SPONSORED_GOOGLE_CHANNEL_LAST_OOB_POSITION", this.f5757t).apply();
        SharedPreferences sharedPreferences = this.f5747j.getSharedPreferences("CHANNEL_ORDER_MANAGER", 0);
        String string = sharedPreferences.getString("LOGGED_CHANNEL_ID_ORDER", null);
        Intent putExtra = new Intent("com.google.android.tvrecommendations.CHANNEL_ORDER_CHANGE_LOG_EVENT").putExtra("channel_ids", str);
        putExtra.setPackage("com.google.android.tvrecommendations");
        if (string == null) {
            List<ResolveInfo> queryBroadcastReceivers = this.f5747j.getPackageManager().queryBroadcastReceivers(putExtra, 0);
            if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
                this.f5747j.sendBroadcast(putExtra);
                sharedPreferences.edit().putString("LOGGED_CHANNEL_ID_ORDER", str).apply();
            }
        } else if (!TextUtils.equals(str, string)) {
            this.f5747j.sendBroadcast(putExtra);
            sharedPreferences.edit().putString("LOGGED_CHANNEL_ID_ORDER", str).apply();
        }
    }

    /* renamed from: a */
    public final void mo2926a(int i, int i2) {
        int i3;
        mo2925a();
        cxt cxt = (cxt) this.f5749l.get(i);
        cxt cxt2 = (cxt) this.f5749l.get(i2);
        this.f5741c.put(cxt.f7874a, Integer.valueOf(i2));
        this.f5741c.put(cxt2.f7874a, Integer.valueOf(i));
        this.f5749l.set(i2, cxt);
        this.f5749l.set(i, cxt2);
        m4923d();
        m4924e();
        List<ckg> list = this.f5740b;
        if (list != null) {
            for (ckg ckg : list) {
                int j = ckg.f5813a.mo3606j(i);
                int j2 = ckg.f5813a.mo3606j(i2);
                cqp cqp = ckg.f5813a;
                if (cqp.f7026r == j) {
                    cqp.f7026r = j2;
                    cqp.mo3604i();
                }
                int h = ckg.f5813a.mo3602h();
                if (i == 0 || i2 == 0 || i == h - 1 || i2 == i3) {
                    ckg.f5813a.mo5306a(j, "PAYLOAD_CHANNEL_MOVE_ACTION");
                    ckg.f5813a.mo5306a(j2, "PAYLOAD_CHANNEL_MOVE_ACTION");
                }
                ckg.f5813a.mo5309b(j, j2);
            }
        }
        this.f5742d = this.f5741c.clone();
        m4922c();
    }

    /* renamed from: d */
    private final void m4923d() {
        Integer num = (Integer) this.f5741c.get(this.f5744f);
        if (num != null) {
            this.f5754q = num.intValue();
        }
    }

    /* renamed from: e */
    private final void m4924e() {
        Integer num = (Integer) this.f5741c.get(this.f5745g);
        if (num != null) {
            this.f5756s = num.intValue();
        }
    }
}
