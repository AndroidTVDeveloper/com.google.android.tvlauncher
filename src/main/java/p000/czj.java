package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.settings.CustomSwitchPreference;
import java.util.Comparator;
import java.util.List;

/* renamed from: czj */
/* compiled from: PG */
public final class czj extends C0334mh implements C0447qm {

    /* renamed from: h */
    public static /* synthetic */ int f7973h;

    /* renamed from: p */
    private static final Comparator f7974p = czi.f7972a;

    /* renamed from: i */
    private final cfr f7975i = new cfr(this);

    /* renamed from: j */
    private String f7976j;

    /* renamed from: k */
    private String f7977k;

    /* renamed from: l */
    private cla f7978l;

    /* renamed from: m */
    private boolean f7979m;

    /* renamed from: n */
    private boolean f7980n;

    /* renamed from: o */
    private final cki f7981o;

    public czj() {
        int i = cla.f5856x;
        this.f7981o = new cki(this);
    }

    /* renamed from: h */
    private final int m6004h() {
        List<cxr> b = this.f7978l.mo3060b(this.f7976j);
        int i = 0;
        if (b != null) {
            for (cxr cxr : b) {
                if (cxr.f7858c) {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: g */
    private final int m6003g() {
        List b = this.f7978l.mo3060b(this.f7976j);
        if (b == null) {
            return 0;
        }
        return b.size();
    }

    /* renamed from: a */
    private final void m6001a(int i, int i2, int i3) {
        int i4;
        List b = this.f7978l.mo3060b(this.f7976j);
        String str = null;
        if (b != null) {
            String str2 = null;
            i4 = 0;
            for (int i5 = 0; i5 < b.size(); i5++) {
                cxr cxr = (cxr) b.get(i5);
                if (cxr.f7856a == ((long) i)) {
                    str2 = cxr.f7857b;
                    i4 = i5;
                }
            }
            str = str2;
        } else {
            i4 = 0;
        }
        cfs cfs = new cfs(i2, (byte) 0);
        cfs.mo2729b(dhs.f8539c);
        cfs.mo2724a(i4);
        cfs.mo2725a(dhs.f8542f);
        if (str != null) {
            dja c = cfs.mo2730c();
            if (c.f8673b) {
                c.mo4505b();
                c.f8673b = false;
            }
            dmk dmk = (dmk) c.f8672a;
            dmk dmk2 = dmk.f8838f;
            str.getClass();
            dmk.f8839a |= 2;
            dmk.f8841c = str;
        }
        dja g = cfs.mo2734g();
        String str3 = this.f7976j;
        if (g.f8673b) {
            g.mo4505b();
            g.f8673b = false;
        }
        dmj dmj = (dmj) g.f8672a;
        dmj dmj2 = dmj.f8832f;
        str3.getClass();
        dmj.f8833a |= 1;
        dmj.f8834b = str3;
        int g2 = m6003g();
        if (g.f8673b) {
            g.mo4505b();
            g.f8673b = false;
        }
        dmj dmj3 = (dmj) g.f8672a;
        int i6 = dmj3.f8833a | 16;
        dmj3.f8833a = i6;
        dmj3.f8836d = g2;
        dmj3.f8833a = i6 | 32;
        dmj3.f8837e = i3;
        this.f7975i.mo2714a(cfs);
    }

    /* renamed from: e */
    public final void mo4006e() {
        if (isAdded()) {
            PreferenceScreen b = mo5793b();
            b.mo1123s();
            List<cxr> b2 = this.f7978l.mo3060b(this.f7976j);
            if (b2 != null && b2.size() > 0) {
                b2.sort(f7974p);
                for (cxr cxr : b2) {
                    CustomSwitchPreference customSwitchPreference = new CustomSwitchPreference(this.f10224b.f10247a);
                    customSwitchPreference.f1371y = R.layout.appchannel_channel_banner;
                    customSwitchPreference.mo1098c(Long.toString(cxr.f7856a));
                    customSwitchPreference.mo1094b((CharSequence) cxr.f7857b);
                    customSwitchPreference.mo1131d(cxr.f7858c);
                    customSwitchPreference.f6687d = cxr.f7865j;
                    if (cxr.f7864i) {
                        customSwitchPreference.mo1078a((CharSequence) cxr.f7861f);
                        customSwitchPreference.f6688e = true;
                    } else if (cxr.f7863h) {
                        customSwitchPreference.mo1097c((int) R.string.empty_channel_message);
                    }
                    customSwitchPreference.mo1115r();
                    customSwitchPreference.f1360n = this;
                    b.mo1117a((Preference) customSwitchPreference);
                }
            }
            if (!this.f7980n) {
                cfs cfs = new cfs();
                cfs.mo2729b(dhs.f8542f);
                dja g = cfs.mo2734g();
                String str = this.f7976j;
                if (g.f8673b) {
                    g.mo4505b();
                    g.f8673b = false;
                }
                dmj dmj = (dmj) g.f8672a;
                dmj dmj2 = dmj.f8832f;
                str.getClass();
                dmj.f8833a |= 1;
                dmj.f8834b = str;
                int g2 = m6003g();
                if (g.f8673b) {
                    g.mo4505b();
                    g.f8673b = false;
                }
                dmj dmj3 = (dmj) g.f8672a;
                dmj3.f8833a |= 16;
                dmj3.f8836d = g2;
                int h = m6004h();
                if (g.f8673b) {
                    g.mo4505b();
                    g.f8673b = false;
                }
                dmj dmj4 = (dmj) g.f8672a;
                dmj4.f8833a |= 32;
                dmj4.f8837e = h;
                this.f7975i.mo2714a(cfs);
                this.f7980n = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo3836a(Bundle bundle) {
        C0470ri riVar = this.f10224b;
        Context context = riVar.f10247a;
        PreferenceScreen a = riVar.mo5809a(context);
        Bundle arguments = getArguments();
        if (bundle != null) {
            this.f7976j = bundle.getString("channel_app");
            this.f7977k = bundle.getString("app_name");
        } else if (arguments != null) {
            this.f7976j = arguments.getString("channel_app");
            this.f7977k = arguments.getString("app_name");
        }
        if ("sponsored.legacy".equals(this.f7976j)) {
            a.mo1094b((CharSequence) getString(R.string.promotional_channel_setting_panel_title));
        } else {
            a.mo1094b((CharSequence) getString(R.string.select_channels_title_with_app_name, new Object[]{this.f7977k}));
        }
        mo5792a(a);
        this.f7978l = cla.m5025a(context);
        m6002f();
        this.f7979m = true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cla.a(long, boolean, boolean):void
     arg types: [long, boolean, int]
     candidates:
      cla.a(java.util.Map, java.lang.Object, java.lang.Object):void
      cla.a(long, boolean, boolean):void */
    /* renamed from: a */
    public final boolean mo3997a(Preference preference, Object obj) {
        String str = preference.f1365s;
        if (str != null && str.startsWith("watch_next_package_key_prefix")) {
            SharedPreferences sharedPreferences = getContext().getSharedPreferences("com.google.android.tvlauncher.data.TvDataManager.WATCH_NEXT_PREF_FILE_NAME", 0);
            if (((Boolean) obj).booleanValue()) {
                sharedPreferences.edit().remove(preference.f1365s).apply();
            } else {
                sharedPreferences.edit().putBoolean(preference.f1365s, false).apply();
            }
            return true;
        } else if (!this.f7978l.mo3058a(this.f7976j)) {
            return false;
        } else {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                int parseInt = Integer.parseInt(preference.f1365s);
                if (bool.booleanValue()) {
                    m6001a(parseInt, 23, m6004h() + 1);
                } else {
                    m6001a(parseInt, 24, m6004h() - 1);
                }
                this.f7978l.mo3052a((long) parseInt, bool.booleanValue(), true);
            }
            return true;
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        String str = this.f7976j;
        if (str != null) {
            bundle.putString("channel_app", str);
        }
        String str2 = this.f7977k;
        if (str2 != null) {
            bundle.putString("app_name", str2);
        }
    }

    public final void onStart() {
        super.onStart();
        if (!this.f7979m) {
            m6002f();
            this.f7979m = true;
        }
    }

    public final void onStop() {
        super.onStop();
        if (this.f7979m) {
            cla cla = this.f7978l;
            cla.f5877e.remove(this.f7981o);
            cla.mo3069d();
            cla.mo3066c();
            this.f7979m = false;
        }
    }

    /* renamed from: f */
    private final void m6002f() {
        cla cla = this.f7978l;
        cki cki = this.f7981o;
        if (!cla.f5877e.contains(cki)) {
            cla.f5877e.add(cki);
        }
        cla.mo3061b();
        String str = this.f7976j;
        if (str == null) {
            return;
        }
        if (!this.f7978l.mo3058a(str)) {
            this.f7978l.mo3078l();
        } else {
            mo4006e();
        }
    }
}
