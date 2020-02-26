package defpackage;

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

/* renamed from: cjs  reason: default package */
/* compiled from: PG */
public final class cjs {
    private static final LongSparseArray i = new LongSparseArray(0);
    public ckn a;
    public List b;
    public LongSparseArray c;
    public LongSparseArray d;
    public boolean e;
    public long f = -1;
    public long g;
    public int h;
    private final Context j;
    private final List k;
    private List l;
    private cjr m = new cjr((byte) 0);
    private long n;
    private boolean o;
    private Map p;
    private int q;
    private int r;
    private int s;
    private int t;

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v5 */
    public cjs(Context context, List list, int i2) {
        List list2 = list;
        ? r3 = 0;
        int i3 = -1;
        this.q = -1;
        this.r = -1;
        this.g = -1;
        this.s = -1;
        this.t = -1;
        this.h = -1;
        this.j = context.getApplicationContext();
        this.k = list2;
        this.r = i2;
        if (list2 != null && list.size() > 0) {
            this.p = new HashMap();
            int i4 = 0;
            while (i4 < list.size() && i4 < 20) {
                dai dai = (dai) list2.get(i4);
                if (this.p.containsKey(dai)) {
                    ((List) this.p.get(dai)).add(Integer.valueOf(i4));
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(i4));
                    this.p.put(dai, arrayList);
                }
                i4++;
            }
        }
        SharedPreferences sharedPreferences = this.j.getSharedPreferences("CHANNEL_ORDER_MANAGER", 0);
        String[] split = TextUtils.split(sharedPreferences.getString("ORDERED_CHANNEL_IDS", ""), ",");
        int length = split.length;
        this.c = new LongSparseArray(length);
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            String str = split[i5];
            try {
                int i7 = i6 + 1;
                try {
                    this.c.put(Long.parseLong(str), Integer.valueOf(i6));
                    i6 = i7;
                } catch (NumberFormatException e2) {
                    i6 = i7;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 44);
                    sb.append("Invalid channel ID: ");
                    sb.append(str);
                    sb.append(" at position ");
                    sb.append(i6);
                    Log.e("ChannelOrderManager", sb.toString());
                    i5++;
                    i3 = -1;
                    r3 = 0;
                }
            } catch (NumberFormatException e3) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 44);
                sb2.append("Invalid channel ID: ");
                sb2.append(str);
                sb2.append(" at position ");
                sb2.append(i6);
                Log.e("ChannelOrderManager", sb2.toString());
                i5++;
                i3 = -1;
                r3 = 0;
            }
            i5++;
            i3 = -1;
            r3 = 0;
        }
        String string = sharedPreferences.getString("ALL_CHANNELS_POSITIONS", "");
        if (string.isEmpty()) {
            this.d = this.c.clone();
        } else {
            this.d = new LongSparseArray(r9);
            for (String str2 : TextUtils.split(string, ",")) {
                try {
                    String[] split2 = TextUtils.split(str2, "=");
                    if (split2.length == 2) {
                        this.d.put(Long.parseLong(split2[r3]), Integer.valueOf(Integer.parseInt(split2[1])));
                    } else {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 44 + String.valueOf(string).length());
                        sb3.append("Error parsing all channel positions ");
                        sb3.append(str2);
                        sb3.append(" within ");
                        sb3.append(string);
                        Log.e("ChannelOrderManager", sb3.toString());
                    }
                } catch (NumberFormatException e4) {
                    String valueOf = String.valueOf(string);
                    Log.e("ChannelOrderManager", valueOf.length() == 0 ? new String("Invalid info in all channel positions ") : "Invalid info in all channel positions ".concat(valueOf));
                }
            }
        }
        this.o = sharedPreferences.getBoolean("USER_HAS_MANAGED_CHANNELS", r3);
        long j2 = sharedPreferences.getLong("FIRST_START_TIMESTAMP", -1);
        this.n = j2;
        if (j2 == -1) {
            this.n = System.currentTimeMillis();
            sharedPreferences.edit().putLong("FIRST_START_TIMESTAMP", this.n).apply();
        }
        this.q = sharedPreferences.getInt("LIVE_TV_CHANNEL_LAST_POSITION", i3);
        this.s = sharedPreferences.getInt("SPONSORED_GOOGLE_CHANNEL_LAST_POSITION", i3);
        this.t = sharedPreferences.getInt("SPONSORED_GOOGLE_CHANNEL_LAST_OOB_POSITION", i3);
    }

    /* access modifiers changed from: package-private */
    public final void a(List list) {
        LongSparseArray longSparseArray;
        boolean z;
        int i2;
        int i3;
        int i4;
        List list2 = list;
        long currentTimeMillis = System.currentTimeMillis() - this.n;
        if (!this.o && currentTimeMillis <= 172800000 && this.p != null) {
            HashMap hashMap = new HashMap();
            for (dai dai : this.p.keySet()) {
                hashMap.put(dai, ((List) this.p.get(dai)).iterator());
            }
            longSparseArray = new LongSparseArray(Math.min(this.k.size(), 20) + 1);
            for (int i5 = 0; i5 < list.size() && hashMap.size() != 0; i5++) {
                cxt cxt = (cxt) list2.get(i5);
                dai dai2 = new dai(cxt.f, cxt.d);
                if (!hashMap.containsKey(dai2)) {
                    dai2 = new dai(cxt.f, null);
                }
                Iterator it = (Iterator) hashMap.get(dai2);
                if (it != null) {
                    longSparseArray.put(cxt.a, (Integer) it.next());
                    if (!it.hasNext()) {
                        hashMap.remove(dai2);
                    }
                }
            }
            long j2 = this.f;
            if (!(j2 == -1 || (i4 = this.r) == -1)) {
                longSparseArray.put(j2, Integer.valueOf(i4));
            }
            long j3 = this.g;
            if (!(j3 == -1 || (i3 = this.h) == -1)) {
                longSparseArray.put(j3, Integer.valueOf(i3));
            }
        } else {
            longSparseArray = i;
        }
        if (longSparseArray == i) {
            ckn ckn = this.a;
            if (ckn.a.size() != 0) {
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int i6 = 0;
                boolean z2 = false;
                while (i6 < size) {
                    cxt cxt2 = (cxt) list2.get(i6);
                    int i7 = size;
                    if (ckn.b.get(cxt2.a) != null) {
                        ckn.d.add(Long.valueOf(cxt2.a));
                        z2 = true;
                    } else {
                        arrayList.add(cxt2);
                    }
                    i6++;
                    size = i7;
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
        if (longSparseArray == i) {
            long j4 = this.f;
            if (j4 != -1 && this.q == -1) {
                this.d.put(j4, Integer.valueOf(this.r));
            }
            long j5 = this.g;
            if (j5 != -1) {
                if (this.s == -1) {
                    this.d.put(j5, Integer.valueOf(this.h));
                } else if (this.h != this.t) {
                    SharedPreferences.Editor edit = this.j.getSharedPreferences("CHANNEL_ORDER_MANAGER", 0).edit();
                    int i8 = this.h;
                    this.t = i8;
                    edit.putInt("SPONSORED_GOOGLE_CHANNEL_LAST_OOB_POSITION", i8).apply();
                    if (this.d.get(this.g) != null && (i2 = this.h) > this.s) {
                        this.d.put(this.g, Integer.valueOf(i2 + 1));
                    } else {
                        this.d.put(this.g, Integer.valueOf(this.h));
                    }
                }
            }
        }
        cjr cjr = this.m;
        cjr.c = this.f;
        cjr.d = this.g;
        cjr.a = this.d;
        cjr.b = longSparseArray;
        list2.sort(cjr);
        if (z) {
            ckn ckn2 = this.a;
            for (cxt cxt3 : ckn2.a) {
                if (ckn2.d.contains(Long.valueOf(cxt3.a))) {
                    int i9 = ((dai) ckn2.b.get(cxt3.a)).c;
                    if (i9 > list.size()) {
                        i9 = list.size();
                    }
                    list2.add(i9, cxt3);
                }
            }
            ckn2.d.clear();
        }
        this.l = list2;
        b();
    }

    public final boolean c(long j2) {
        return a(j2, 1) != -1;
    }

    public final boolean b(long j2) {
        return a(j2, -1) != -1;
    }

    public final Integer a(long j2) {
        return (Integer) this.c.get(j2);
    }

    public final int a(long j2, int i2) {
        Integer num = (Integer) this.c.get(j2);
        if (num == null || this.a.a(j2)) {
            return -1;
        }
        int intValue = num.intValue() + i2;
        while (intValue >= 0 && intValue < this.l.size()) {
            if (!this.a.a(((cxt) this.l.get(intValue)).a)) {
                return intValue;
            }
            intValue += i2;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.o = true;
        this.j.getSharedPreferences("CHANNEL_ORDER_MANAGER", 0).edit().putBoolean("USER_HAS_MANAGED_CHANNELS", true).apply();
    }

    public final void b() {
        List list = this.l;
        if (list != null) {
            LongSparseArray longSparseArray = new LongSparseArray(list.size());
            List list2 = this.l;
            int size = list2.size();
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                longSparseArray.put(((cxt) list2.get(i2)).a, Integer.valueOf(i3));
                i2++;
                i3++;
            }
            this.c = longSparseArray;
            if (this.e) {
                this.d = longSparseArray.clone();
                this.e = false;
            }
            d();
            e();
            c();
            return;
        }
        throw new IllegalStateException("Channels must be set");
    }

    private final void c() {
        String str;
        SharedPreferences.Editor edit = this.j.getSharedPreferences("CHANNEL_ORDER_MANAGER", 0).edit();
        String str2 = "";
        if (this.c.size() > 0) {
            StringBuilder sb = new StringBuilder(this.l.size() * 12);
            List list = this.l;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append(((cxt) list.get(i2)).a);
                sb.append(',');
            }
            sb.setLength(sb.length() - 1);
            str = sb.toString();
        } else {
            str = str2;
        }
        if (this.d.size() > 0) {
            StringBuilder sb2 = new StringBuilder(this.d.size() * 15);
            for (int i3 = 0; i3 < this.d.size(); i3++) {
                sb2.append(this.d.keyAt(i3));
                sb2.append('=');
                sb2.append(this.d.valueAt(i3));
                sb2.append(',');
            }
            sb2.setLength(sb2.length() - 1);
            str2 = sb2.toString();
        }
        edit.putString("ORDERED_CHANNEL_IDS", str).putString("ALL_CHANNELS_POSITIONS", str2).putInt("LIVE_TV_CHANNEL_LAST_POSITION", this.q).putInt("SPONSORED_GOOGLE_CHANNEL_LAST_POSITION", this.s).putInt("SPONSORED_GOOGLE_CHANNEL_LAST_OOB_POSITION", this.t).apply();
        SharedPreferences sharedPreferences = this.j.getSharedPreferences("CHANNEL_ORDER_MANAGER", 0);
        String string = sharedPreferences.getString("LOGGED_CHANNEL_ID_ORDER", null);
        Intent putExtra = new Intent("com.google.android.tvrecommendations.CHANNEL_ORDER_CHANGE_LOG_EVENT").putExtra("channel_ids", str);
        putExtra.setPackage("com.google.android.tvrecommendations");
        if (string == null) {
            List<ResolveInfo> queryBroadcastReceivers = this.j.getPackageManager().queryBroadcastReceivers(putExtra, 0);
            if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
                this.j.sendBroadcast(putExtra);
                sharedPreferences.edit().putString("LOGGED_CHANNEL_ID_ORDER", str).apply();
            }
        } else if (!TextUtils.equals(str, string)) {
            this.j.sendBroadcast(putExtra);
            sharedPreferences.edit().putString("LOGGED_CHANNEL_ID_ORDER", str).apply();
        }
    }

    public final void a(int i2, int i3) {
        int i4;
        a();
        cxt cxt = (cxt) this.l.get(i2);
        cxt cxt2 = (cxt) this.l.get(i3);
        this.c.put(cxt.a, Integer.valueOf(i3));
        this.c.put(cxt2.a, Integer.valueOf(i2));
        this.l.set(i3, cxt);
        this.l.set(i2, cxt2);
        d();
        e();
        List<ckg> list = this.b;
        if (list != null) {
            for (ckg ckg : list) {
                int j2 = ckg.a.j(i2);
                int j3 = ckg.a.j(i3);
                cqp cqp = ckg.a;
                if (cqp.r == j2) {
                    cqp.r = j3;
                    cqp.i();
                }
                int h2 = ckg.a.h();
                if (i2 == 0 || i3 == 0 || i2 == h2 - 1 || i3 == i4) {
                    ckg.a.a(j2, "PAYLOAD_CHANNEL_MOVE_ACTION");
                    ckg.a.a(j3, "PAYLOAD_CHANNEL_MOVE_ACTION");
                }
                ckg.a.b(j2, j3);
            }
        }
        this.d = this.c.clone();
        c();
    }

    private final void d() {
        Integer num = (Integer) this.c.get(this.f);
        if (num != null) {
            this.q = num.intValue();
        }
    }

    private final void e() {
        Integer num = (Integer) this.c.get(this.g);
        if (num != null) {
            this.s = num.intValue();
        }
    }
}
