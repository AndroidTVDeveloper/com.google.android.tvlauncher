package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.settings.CustomSwitchPreference;
import java.util.Comparator;
import java.util.List;

/* renamed from: czj  reason: default package */
/* compiled from: PG */
public final class czj extends mh implements qm {
    public static /* synthetic */ int h;
    private static final Comparator p = czi.a;
    private final cfr i = new cfr(this);
    private String j;
    private String k;
    private cla l;
    private boolean m;
    private boolean n;
    private final cki o;

    public czj() {
        int i2 = cla.x;
        this.o = new cki(this);
    }

    private final int h() {
        List<cxr> b = this.l.b(this.j);
        int i2 = 0;
        if (b != null) {
            for (cxr cxr : b) {
                if (cxr.c) {
                    i2++;
                }
            }
        }
        return i2;
    }

    private final int g() {
        List b = this.l.b(this.j);
        if (b == null) {
            return 0;
        }
        return b.size();
    }

    private final void a(int i2, int i3, int i4) {
        int i5;
        List b = this.l.b(this.j);
        String str = null;
        if (b != null) {
            String str2 = null;
            i5 = 0;
            for (int i6 = 0; i6 < b.size(); i6++) {
                cxr cxr = (cxr) b.get(i6);
                if (cxr.a == ((long) i2)) {
                    str2 = cxr.b;
                    i5 = i6;
                }
            }
            str = str2;
        } else {
            i5 = 0;
        }
        cfs cfs = new cfs(i3, (byte) 0);
        cfs.b(dhs.c);
        cfs.a(i5);
        cfs.a(dhs.f);
        if (str != null) {
            dja c = cfs.c();
            if (c.b) {
                c.b();
                c.b = false;
            }
            dmk dmk = (dmk) c.a;
            dmk dmk2 = dmk.f;
            str.getClass();
            dmk.a |= 2;
            dmk.c = str;
        }
        dja g = cfs.g();
        String str3 = this.j;
        if (g.b) {
            g.b();
            g.b = false;
        }
        dmj dmj = (dmj) g.a;
        dmj dmj2 = dmj.f;
        str3.getClass();
        dmj.a |= 1;
        dmj.b = str3;
        int g2 = g();
        if (g.b) {
            g.b();
            g.b = false;
        }
        dmj dmj3 = (dmj) g.a;
        int i7 = dmj3.a | 16;
        dmj3.a = i7;
        dmj3.d = g2;
        dmj3.a = i7 | 32;
        dmj3.e = i4;
        this.i.a(cfs);
    }

    public final void e() {
        if (isAdded()) {
            PreferenceScreen b = b();
            b.s();
            List<cxr> b2 = this.l.b(this.j);
            if (b2 != null && b2.size() > 0) {
                b2.sort(p);
                for (cxr cxr : b2) {
                    CustomSwitchPreference customSwitchPreference = new CustomSwitchPreference(this.b.a);
                    customSwitchPreference.y = R.layout.appchannel_channel_banner;
                    customSwitchPreference.c(Long.toString(cxr.a));
                    customSwitchPreference.b((CharSequence) cxr.b);
                    customSwitchPreference.d(cxr.c);
                    customSwitchPreference.d = cxr.j;
                    if (cxr.i) {
                        customSwitchPreference.a((CharSequence) cxr.f);
                        customSwitchPreference.e = true;
                    } else if (cxr.h) {
                        customSwitchPreference.c((int) R.string.empty_channel_message);
                    }
                    customSwitchPreference.r();
                    customSwitchPreference.n = this;
                    b.a((Preference) customSwitchPreference);
                }
            }
            if (!this.n) {
                cfs cfs = new cfs();
                cfs.b(dhs.f);
                dja g = cfs.g();
                String str = this.j;
                if (g.b) {
                    g.b();
                    g.b = false;
                }
                dmj dmj = (dmj) g.a;
                dmj dmj2 = dmj.f;
                str.getClass();
                dmj.a |= 1;
                dmj.b = str;
                int g2 = g();
                if (g.b) {
                    g.b();
                    g.b = false;
                }
                dmj dmj3 = (dmj) g.a;
                dmj3.a |= 16;
                dmj3.d = g2;
                int h2 = h();
                if (g.b) {
                    g.b();
                    g.b = false;
                }
                dmj dmj4 = (dmj) g.a;
                dmj4.a |= 32;
                dmj4.e = h2;
                this.i.a(cfs);
                this.n = true;
            }
        }
    }

    public final void a(Bundle bundle) {
        ri riVar = this.b;
        Context context = riVar.a;
        PreferenceScreen a = riVar.a(context);
        Bundle arguments = getArguments();
        if (bundle != null) {
            this.j = bundle.getString("channel_app");
            this.k = bundle.getString("app_name");
        } else if (arguments != null) {
            this.j = arguments.getString("channel_app");
            this.k = arguments.getString("app_name");
        }
        if ("sponsored.legacy".equals(this.j)) {
            a.b((CharSequence) getString(R.string.promotional_channel_setting_panel_title));
        } else {
            a.b((CharSequence) getString(R.string.select_channels_title_with_app_name, new Object[]{this.k}));
        }
        a(a);
        this.l = cla.a(context);
        f();
        this.m = true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cla.a(long, boolean, boolean):void
     arg types: [long, boolean, int]
     candidates:
      cla.a(java.util.Map, java.lang.Object, java.lang.Object):void
      cla.a(long, boolean, boolean):void */
    public final boolean a(Preference preference, Object obj) {
        String str = preference.s;
        if (str != null && str.startsWith("watch_next_package_key_prefix")) {
            SharedPreferences sharedPreferences = getContext().getSharedPreferences("com.google.android.tvlauncher.data.TvDataManager.WATCH_NEXT_PREF_FILE_NAME", 0);
            if (((Boolean) obj).booleanValue()) {
                sharedPreferences.edit().remove(preference.s).apply();
            } else {
                sharedPreferences.edit().putBoolean(preference.s, false).apply();
            }
            return true;
        } else if (!this.l.a(this.j)) {
            return false;
        } else {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                int parseInt = Integer.parseInt(preference.s);
                if (bool.booleanValue()) {
                    a(parseInt, 23, h() + 1);
                } else {
                    a(parseInt, 24, h() - 1);
                }
                this.l.a((long) parseInt, bool.booleanValue(), true);
            }
            return true;
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        String str = this.j;
        if (str != null) {
            bundle.putString("channel_app", str);
        }
        String str2 = this.k;
        if (str2 != null) {
            bundle.putString("app_name", str2);
        }
    }

    public final void onStart() {
        super.onStart();
        if (!this.m) {
            f();
            this.m = true;
        }
    }

    public final void onStop() {
        super.onStop();
        if (this.m) {
            cla cla = this.l;
            cla.e.remove(this.o);
            cla.d();
            cla.c();
            this.m = false;
        }
    }

    private final void f() {
        cla cla = this.l;
        cki cki = this.o;
        if (!cla.e.contains(cki)) {
            cla.e.add(cki);
        }
        cla.b();
        String str = this.j;
        if (str == null) {
            return;
        }
        if (!this.l.a(str)) {
            this.l.l();
        } else {
            e();
        }
    }
}
