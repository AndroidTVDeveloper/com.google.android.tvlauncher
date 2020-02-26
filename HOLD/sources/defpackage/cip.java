package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.settings.FavoriteLaunchItemsActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: cip  reason: default package */
/* compiled from: PG */
public final class cip implements cit {
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public final SharedPreferences c;
    public final Context d;
    public civ e;
    public boolean f;
    public Map g;
    public chn[] h;
    private final SharedPreferences i;
    private final SharedPreferences j;
    private final chn k;

    public cip(Context context) {
        this.c = context.getSharedPreferences("com.google.android.tvlauncher.appsview.FavoriteItemsManager.PREFERENCE_KEY", 0);
        this.i = context.getSharedPreferences("com.google.android.tvlauncher.appsview.FavoriteItemsManager.USER_CUSTOMIZATION_KEY", 0);
        this.j = context.getSharedPreferences("FAVORITE_APPS_ANALYTICS", 0);
        this.d = context;
        String string = context.getString(R.string.favorite_more_apps);
        Intent intent = new Intent(this.d, FavoriteLaunchItemsActivity.class);
        chn chn = new chn();
        chn.b = string;
        chn.c = "com.google.android.tvlauncher.appsview.FavoriteItemsManager.MORE_FAVORITES_PKGNAME";
        chn.a = intent;
        this.k = chn;
        this.f = this.i.getBoolean("com.google.android.tvlauncher.appsview.FavoriteItemsManager.USER_CUSTOMIZATION_KEY", false);
    }

    public final void a(boolean z, Pair pair) {
    }

    private final boolean d(chn chn) {
        Integer num;
        Map map = this.g;
        if (map == null || (num = (Integer) map.get(chn.c)) == null) {
            return false;
        }
        this.h[num.intValue()] = chn;
        return true;
    }

    public final List a() {
        List b2 = b();
        if (b2.size() < 100 && !b2.contains(this.k)) {
            b2.add(this.k);
        }
        chn[] chnArr = this.h;
        if (chnArr != null) {
            for (int length = chnArr.length - 1; length >= 0; length--) {
                chn chn = this.h[length];
                if (chn != null) {
                    b2.add(0, chn);
                }
            }
        }
        return b2;
    }

    public final List b() {
        ArrayList arrayList = new ArrayList(this.a.keySet());
        Collections.sort(arrayList, new cio(this));
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final boolean c(chn chn) {
        Map map = this.g;
        if (map != null) {
            return map.containsKey(chn.c);
        }
        return false;
    }

    private final void e() {
        civ civ = this.e;
        if (civ != null) {
            cpo cpo = ((coy) civ).a;
            cpo.d = -1;
            cpo.O();
        }
    }

    public final void c() {
        if (!this.f) {
            this.i.edit().putBoolean("com.google.android.tvlauncher.appsview.FavoriteItemsManager.USER_CUSTOMIZATION_KEY", true).apply();
            this.f = true;
            c(b());
        }
    }

    public final void a(ArrayList arrayList) {
        int size = arrayList.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            chn chn = (chn) arrayList.get(i2);
            boolean z2 = true;
            if (this.a.containsKey(chn)) {
                Map map = this.a;
                map.put(chn, (Integer) map.get(chn));
            } else if (this.f || !this.b.containsKey(chn.c)) {
                z2 = z;
            } else {
                this.a.put(chn, (Integer) this.b.get(chn.c));
            }
            if (this.g == null) {
                z = z2;
            } else {
                z = d(chn) | z2;
            }
        }
        if (z) {
            List b2 = b();
            b(b2);
            a();
            e();
            a(b2);
        }
    }

    public final void d() {
        this.a.clear();
        Map<String, ?> all = this.c.getAll();
        cja a2 = dbq.a(this.d);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(a2.j);
        arrayList.addAll(a2.i);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            chn chn = (chn) arrayList.get(i2);
            d(chn);
            if (all.keySet().contains(chn.c) && !c(chn)) {
                this.a.put(chn, (Integer) all.get(chn.c));
            }
        }
        civ civ = this.e;
        if (civ != null) {
            cpo cpo = ((coy) civ).a;
            cpo.d = -1;
            cpo.O();
        }
        a(b());
    }

    public final void b(ArrayList arrayList) {
        Integer num;
        int size = arrayList.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            chn chn = (chn) arrayList.get(i2);
            z |= b(chn) == -1;
            Map map = this.g;
            if (!(map == null || (num = (Integer) map.get(chn.c)) == null)) {
                this.h[num.intValue()] = null;
                z = true;
            }
        }
        if (z) {
            a();
            e();
            a(b());
        }
    }

    public final int b(chn chn) {
        Integer num = (Integer) this.a.remove(chn);
        if (num != null) {
            b(b());
            e();
        }
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    private final void c(List list) {
        SharedPreferences.Editor edit = this.c.edit();
        edit.clear();
        for (int i2 = 0; i2 < list.size(); i2++) {
            chn chn = (chn) list.get(i2);
            this.a.put(chn, Integer.valueOf(i2));
            edit.putInt(chn.c, i2);
        }
        edit.apply();
    }

    private final void b(List list) {
        if (this.f) {
            c(list);
        }
    }

    public final void a(List list) {
        int i2;
        StringBuilder sb = new StringBuilder(list.size() * 25);
        chn[] chnArr = this.h;
        if (chnArr != null) {
            i2 = 0;
            for (chn chn : chnArr) {
                if (chn != null) {
                    i2++;
                    sb.append(chn.c);
                    sb.append(",");
                }
            }
        } else {
            i2 = 0;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append(((chn) it.next()).c);
            sb.append(",");
        }
        if (sb.length() != 0) {
            sb.setLength(sb.length() - 1);
        }
        String sb2 = sb.toString();
        String string = this.j.getString("LOGGED_FAVORITE_APPS_ORDER", null);
        int i3 = this.j.getInt("LOGGED_NUMBER_OF_PINNED_APPS", 0);
        Intent intent = new Intent("com.google.android.tvrecommendations.FAVORITE_APPS_STATE_CHANGE_LOG_EVENT").putExtra("favorite_apps_package_names", sb2).putExtra("pinned_favorite_app_count", i2).setPackage("com.google.android.tvrecommendations");
        List<ResolveInfo> queryBroadcastReceivers = this.d.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.isEmpty()) {
            if (string != null) {
                this.j.edit().remove("LOGGED_FAVORITE_APPS_ORDER").remove("LOGGED_NUMBER_OF_PINNED_APPS").apply();
            }
        } else if (string == null || !TextUtils.equals(sb2, string) || i2 != i3) {
            this.d.sendBroadcast(intent);
            this.j.edit().putString("LOGGED_FAVORITE_APPS_ORDER", sb2).putInt("LOGGED_NUMBER_OF_PINNED_APPS", i2).apply();
        }
    }

    public final void a(chn chn) {
        if (!this.a.containsKey(chn) && this.a.size() < 100) {
            c();
            this.a.put(chn, Integer.valueOf(this.a.keySet().size()));
            List b2 = b();
            c(b2);
            e();
            a(b2);
        }
    }
}
