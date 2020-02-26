package p000;

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

/* renamed from: cip */
/* compiled from: PG */
public final class cip implements cit {

    /* renamed from: a */
    public final Map f5652a = new HashMap();

    /* renamed from: b */
    public final Map f5653b = new HashMap();

    /* renamed from: c */
    public final SharedPreferences f5654c;

    /* renamed from: d */
    public final Context f5655d;

    /* renamed from: e */
    public civ f5656e;

    /* renamed from: f */
    public boolean f5657f;

    /* renamed from: g */
    public Map f5658g;

    /* renamed from: h */
    public chn[] f5659h;

    /* renamed from: i */
    private final SharedPreferences f5660i;

    /* renamed from: j */
    private final SharedPreferences f5661j;

    /* renamed from: k */
    private final chn f5662k;

    public cip(Context context) {
        this.f5654c = context.getSharedPreferences("com.google.android.tvlauncher.appsview.FavoriteItemsManager.PREFERENCE_KEY", 0);
        this.f5660i = context.getSharedPreferences("com.google.android.tvlauncher.appsview.FavoriteItemsManager.USER_CUSTOMIZATION_KEY", 0);
        this.f5661j = context.getSharedPreferences("FAVORITE_APPS_ANALYTICS", 0);
        this.f5655d = context;
        String string = context.getString(R.string.favorite_more_apps);
        Intent intent = new Intent(this.f5655d, FavoriteLaunchItemsActivity.class);
        chn chn = new chn();
        chn.f5562b = string;
        chn.f5563c = "com.google.android.tvlauncher.appsview.FavoriteItemsManager.MORE_FAVORITES_PKGNAME";
        chn.f5561a = intent;
        this.f5662k = chn;
        this.f5657f = this.f5660i.getBoolean("com.google.android.tvlauncher.appsview.FavoriteItemsManager.USER_CUSTOMIZATION_KEY", false);
    }

    /* renamed from: a */
    public final void mo2798a(boolean z, Pair pair) {
    }

    /* renamed from: d */
    private final boolean m4820d(chn chn) {
        Integer num;
        Map map = this.f5658g;
        if (map == null || (num = (Integer) map.get(chn.f5563c)) == null) {
            return false;
        }
        this.f5659h[num.intValue()] = chn;
        return true;
    }

    /* renamed from: a */
    public final List mo2865a() {
        List b = mo2869b();
        if (b.size() < 100 && !b.contains(this.f5662k)) {
            b.add(this.f5662k);
        }
        chn[] chnArr = this.f5659h;
        if (chnArr != null) {
            for (int length = chnArr.length - 1; length >= 0; length--) {
                chn chn = this.f5659h[length];
                if (chn != null) {
                    b.add(0, chn);
                }
            }
        }
        return b;
    }

    /* renamed from: b */
    public final List mo2869b() {
        ArrayList arrayList = new ArrayList(this.f5652a.keySet());
        Collections.sort(arrayList, new cio(this));
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo2871c(chn chn) {
        Map map = this.f5658g;
        if (map != null) {
            return map.containsKey(chn.f5563c);
        }
        return false;
    }

    /* renamed from: e */
    private final void m4821e() {
        civ civ = this.f5656e;
        if (civ != null) {
            cpo cpo = ((coy) civ).f6858a;
            cpo.f6898d = -1;
            cpo.mo5303O();
        }
    }

    /* renamed from: c */
    public final void mo2870c() {
        if (!this.f5657f) {
            this.f5660i.edit().putBoolean("com.google.android.tvlauncher.appsview.FavoriteItemsManager.USER_CUSTOMIZATION_KEY", true).apply();
            this.f5657f = true;
            m4819c(mo2869b());
        }
    }

    /* renamed from: a */
    public final void mo2796a(ArrayList arrayList) {
        int size = arrayList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            chn chn = (chn) arrayList.get(i);
            boolean z2 = true;
            if (this.f5652a.containsKey(chn)) {
                Map map = this.f5652a;
                map.put(chn, (Integer) map.get(chn));
            } else if (this.f5657f || !this.f5653b.containsKey(chn.f5563c)) {
                z2 = z;
            } else {
                this.f5652a.put(chn, (Integer) this.f5653b.get(chn.f5563c));
            }
            if (this.f5658g == null) {
                z = z2;
            } else {
                z = m4820d(chn) | z2;
            }
        }
        if (z) {
            List b = mo2869b();
            m4818b(b);
            mo2865a();
            m4821e();
            mo2867a(b);
        }
    }

    /* renamed from: d */
    public final void mo2801d() {
        this.f5652a.clear();
        Map<String, ?> all = this.f5654c.getAll();
        cja a = dbq.m6093a(this.f5655d);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(a.f5688j);
        arrayList.addAll(a.f5687i);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            chn chn = (chn) arrayList.get(i);
            m4820d(chn);
            if (all.keySet().contains(chn.f5563c) && !mo2871c(chn)) {
                this.f5652a.put(chn, (Integer) all.get(chn.f5563c));
            }
        }
        civ civ = this.f5656e;
        if (civ != null) {
            cpo cpo = ((coy) civ).f6858a;
            cpo.f6898d = -1;
            cpo.mo5303O();
        }
        mo2867a(mo2869b());
    }

    /* renamed from: b */
    public final void mo2799b(ArrayList arrayList) {
        Integer num;
        int size = arrayList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            chn chn = (chn) arrayList.get(i);
            z |= mo2868b(chn) == -1;
            Map map = this.f5658g;
            if (!(map == null || (num = (Integer) map.get(chn.f5563c)) == null)) {
                this.f5659h[num.intValue()] = null;
                z = true;
            }
        }
        if (z) {
            mo2865a();
            m4821e();
            mo2867a(mo2869b());
        }
    }

    /* renamed from: b */
    public final int mo2868b(chn chn) {
        Integer num = (Integer) this.f5652a.remove(chn);
        if (num != null) {
            m4818b(mo2869b());
            m4821e();
        }
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* renamed from: c */
    private final void m4819c(List list) {
        SharedPreferences.Editor edit = this.f5654c.edit();
        edit.clear();
        for (int i = 0; i < list.size(); i++) {
            chn chn = (chn) list.get(i);
            this.f5652a.put(chn, Integer.valueOf(i));
            edit.putInt(chn.f5563c, i);
        }
        edit.apply();
    }

    /* renamed from: b */
    private final void m4818b(List list) {
        if (this.f5657f) {
            m4819c(list);
        }
    }

    /* renamed from: a */
    public final void mo2867a(List list) {
        int i;
        StringBuilder sb = new StringBuilder(list.size() * 25);
        chn[] chnArr = this.f5659h;
        if (chnArr != null) {
            i = 0;
            for (chn chn : chnArr) {
                if (chn != null) {
                    i++;
                    sb.append(chn.f5563c);
                    sb.append(",");
                }
            }
        } else {
            i = 0;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append(((chn) it.next()).f5563c);
            sb.append(",");
        }
        if (sb.length() != 0) {
            sb.setLength(sb.length() - 1);
        }
        String sb2 = sb.toString();
        String string = this.f5661j.getString("LOGGED_FAVORITE_APPS_ORDER", null);
        int i2 = this.f5661j.getInt("LOGGED_NUMBER_OF_PINNED_APPS", 0);
        Intent intent = new Intent("com.google.android.tvrecommendations.FAVORITE_APPS_STATE_CHANGE_LOG_EVENT").putExtra("favorite_apps_package_names", sb2).putExtra("pinned_favorite_app_count", i).setPackage("com.google.android.tvrecommendations");
        List<ResolveInfo> queryBroadcastReceivers = this.f5655d.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.isEmpty()) {
            if (string != null) {
                this.f5661j.edit().remove("LOGGED_FAVORITE_APPS_ORDER").remove("LOGGED_NUMBER_OF_PINNED_APPS").apply();
            }
        } else if (string == null || !TextUtils.equals(sb2, string) || i != i2) {
            this.f5655d.sendBroadcast(intent);
            this.f5661j.edit().putString("LOGGED_FAVORITE_APPS_ORDER", sb2).putInt("LOGGED_NUMBER_OF_PINNED_APPS", i).apply();
        }
    }

    /* renamed from: a */
    public final void mo2866a(chn chn) {
        if (!this.f5652a.containsKey(chn) && this.f5652a.size() < 100) {
            mo2870c();
            this.f5652a.put(chn, Integer.valueOf(this.f5652a.keySet().size()));
            List b = mo2869b();
            m4819c(b);
            m4821e();
            mo2867a(b);
        }
    }
}
