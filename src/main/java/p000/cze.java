package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreference;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.settings.AppBannerSwitchPreference;
import com.google.android.tvlauncher.settings.SummaryPreferenceCategory;
import java.util.Collections;
import java.util.List;

/* renamed from: cze */
/* compiled from: PG */
public final class cze extends C0334mh implements czg, C0447qm {

    /* renamed from: h */
    private int f7957h;

    /* renamed from: i */
    private int f7958i;

    /* renamed from: j */
    private Drawable f7959j;

    /* renamed from: k */
    private czh f7960k;

    /* renamed from: l */
    private SummaryPreferenceCategory f7961l;

    /* renamed from: m */
    private final cfr f7962m = new cfr(this);

    /* renamed from: n */
    private agj f7963n;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cfs.<init>(int, char):void
     arg types: [int, int]
     candidates:
      cfs.<init>(int, byte):void
      cfs.<init>(int, char):void */
    /* renamed from: a */
    public final void mo3996a(List list) {
        if (isAdded()) {
            Context context = this.f10224b.f10247a;
            this.f7961l.mo1123s();
            if (list.size() > 0) {
                Collections.sort(list);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    czf czf = (czf) list.get(i);
                    AppBannerSwitchPreference appBannerSwitchPreference = new AppBannerSwitchPreference(context);
                    String concat = "watch_next_package_key_prefix".concat(czf.f7964a);
                    appBannerSwitchPreference.mo1098c(concat);
                    appBannerSwitchPreference.mo1094b(czf.f7965b);
                    SharedPreferences sharedPreferences = getContext().getSharedPreferences("com.google.android.tvlauncher.data.TvDataManager.WATCH_NEXT_PREF_FILE_NAME", 0);
                    if (sharedPreferences == null || !sharedPreferences.contains(concat)) {
                        appBannerSwitchPreference.mo1131d(true);
                    } else {
                        appBannerSwitchPreference.mo1131d(false);
                    }
                    appBannerSwitchPreference.mo1115r();
                    C0497si.m8296c(getContext()).mo5944a(new cje(czf.f7964a, czf.f7967d, cjd.BANNER, dbq.m6093a(getContext()).mo2902h())).mo202b(this.f7963n).mo5937a((ahg) new czd(this.f7958i, this.f7957h, appBannerSwitchPreference));
                    this.f7961l.mo1117a((Preference) appBannerSwitchPreference);
                    appBannerSwitchPreference.f1360n = this;
                }
            }
            this.f7962m.mo2714a(new cfs(21, 0));
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context context = getContext();
        Resources resources = context.getResources();
        this.f7957h = resources.getDimensionPixelSize(R.dimen.preference_item_banner_height);
        this.f7958i = resources.getDimensionPixelSize(R.dimen.preference_item_banner_width);
        this.f7959j = new ColorDrawable(C0035bg.m3116b(context, R.color.app_banner_background_color));
        this.f7963n = new agj((byte) 0).mo195a(this.f7959j).mo205c(this.f7959j).mo199a(C0594vy.f10649a).mo198a((C0544ub) new dae(getContext().getColor(R.color.app_banner_background_color), true));
    }

    /* renamed from: a */
    public final void mo3836a(Bundle bundle) {
        int i;
        C0470ri riVar = this.f10224b;
        Context context = riVar.f10247a;
        PreferenceScreen a = riVar.mo5809a(context);
        a.mo1092b((int) R.string.play_next_settings_panel_title);
        mo5792a(a);
        SummaryPreferenceCategory summaryPreferenceCategory = new SummaryPreferenceCategory(context);
        this.f7961l = summaryPreferenceCategory;
        summaryPreferenceCategory.mo1092b((int) R.string.watch_next_sources_title);
        this.f7961l.mo1097c((int) R.string.watch_next_sources_summary_message);
        PreferenceScreen b = mo5793b();
        SwitchPreference switchPreference = new SwitchPreference(this.f10224b.f10247a);
        switchPreference.mo1098c("show_watch_next_row_key");
        switchPreference.mo1115r();
        SharedPreferences sharedPreferences = getContext().getSharedPreferences("com.google.android.tvlauncher.data.TvDataManager.WATCH_NEXT_PREF_FILE_NAME", 0);
        dck.m6123a(getContext());
        boolean z = sharedPreferences.getBoolean("show_watch_next_row_key", dck.m6124m());
        switchPreference.mo1131d(z);
        if (!z) {
            i = R.string.off;
        } else {
            i = R.string.on;
        }
        switchPreference.mo1092b(i);
        this.f7961l.mo1131d(z);
        switchPreference.f1360n = this;
        b.mo1117a((Preference) switchPreference);
        a.mo1117a((Preference) this.f7961l);
        this.f7960k = new czh(context);
    }

    public final void onPause() {
        super.onPause();
        this.f7960k.mo4002a();
    }

    /* renamed from: a */
    public final boolean mo3997a(Preference preference, Object obj) {
        int i;
        Boolean bool = (Boolean) obj;
        SharedPreferences sharedPreferences = getContext().getSharedPreferences("com.google.android.tvlauncher.data.TvDataManager.WATCH_NEXT_PREF_FILE_NAME", 0);
        String str = preference.f1365s;
        if (str != null && str.startsWith("watch_next_package_key_prefix")) {
            if (bool.booleanValue()) {
                sharedPreferences.edit().remove(preference.f1365s).apply();
            } else {
                sharedPreferences.edit().putBoolean(preference.f1365s, false).apply();
            }
            return true;
        } else if (!"show_watch_next_row_key".equals(preference.f1365s)) {
            return false;
        } else {
            sharedPreferences.edit().putBoolean("show_watch_next_row_key", bool.booleanValue()).apply();
            if (!bool.booleanValue()) {
                i = R.string.off;
            } else {
                i = R.string.on;
            }
            preference.mo1092b(i);
            this.f7961l.mo1131d(bool.booleanValue());
            return true;
        }
    }

    public final void onResume() {
        super.onResume();
        this.f7960k.mo4003a(this);
    }
}
