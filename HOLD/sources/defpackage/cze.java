package defpackage;

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

/* renamed from: cze  reason: default package */
/* compiled from: PG */
public final class cze extends mh implements czg, qm {
    private int h;
    private int i;
    private Drawable j;
    private czh k;
    private SummaryPreferenceCategory l;
    private final cfr m = new cfr(this);
    private agj n;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cfs.<init>(int, char):void
     arg types: [int, int]
     candidates:
      cfs.<init>(int, byte):void
      cfs.<init>(int, char):void */
    public final void a(List list) {
        if (isAdded()) {
            Context context = this.b.a;
            this.l.s();
            if (list.size() > 0) {
                Collections.sort(list);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    czf czf = (czf) list.get(i2);
                    AppBannerSwitchPreference appBannerSwitchPreference = new AppBannerSwitchPreference(context);
                    String concat = "watch_next_package_key_prefix".concat(czf.a);
                    appBannerSwitchPreference.c(concat);
                    appBannerSwitchPreference.b(czf.b);
                    SharedPreferences sharedPreferences = getContext().getSharedPreferences("com.google.android.tvlauncher.data.TvDataManager.WATCH_NEXT_PREF_FILE_NAME", 0);
                    if (sharedPreferences == null || !sharedPreferences.contains(concat)) {
                        appBannerSwitchPreference.d(true);
                    } else {
                        appBannerSwitchPreference.d(false);
                    }
                    appBannerSwitchPreference.r();
                    si.c(getContext()).a(new cje(czf.a, czf.d, cjd.BANNER, dbq.a(getContext()).h())).b(this.n).a((ahg) new czd(this.i, this.h, appBannerSwitchPreference));
                    this.l.a((Preference) appBannerSwitchPreference);
                    appBannerSwitchPreference.n = this;
                }
            }
            this.m.a(new cfs(21, 0));
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context context = getContext();
        Resources resources = context.getResources();
        this.h = resources.getDimensionPixelSize(R.dimen.preference_item_banner_height);
        this.i = resources.getDimensionPixelSize(R.dimen.preference_item_banner_width);
        this.j = new ColorDrawable(bg.b(context, R.color.app_banner_background_color));
        this.n = new agj((byte) 0).a(this.j).c(this.j).a(vy.a).a((ub) new dae(getContext().getColor(R.color.app_banner_background_color), true));
    }

    public final void a(Bundle bundle) {
        int i2;
        ri riVar = this.b;
        Context context = riVar.a;
        PreferenceScreen a = riVar.a(context);
        a.b((int) R.string.play_next_settings_panel_title);
        a(a);
        SummaryPreferenceCategory summaryPreferenceCategory = new SummaryPreferenceCategory(context);
        this.l = summaryPreferenceCategory;
        summaryPreferenceCategory.b((int) R.string.watch_next_sources_title);
        this.l.c((int) R.string.watch_next_sources_summary_message);
        PreferenceScreen b = b();
        SwitchPreference switchPreference = new SwitchPreference(this.b.a);
        switchPreference.c("show_watch_next_row_key");
        switchPreference.r();
        SharedPreferences sharedPreferences = getContext().getSharedPreferences("com.google.android.tvlauncher.data.TvDataManager.WATCH_NEXT_PREF_FILE_NAME", 0);
        dck.a(getContext());
        boolean z = sharedPreferences.getBoolean("show_watch_next_row_key", dck.m());
        switchPreference.d(z);
        if (!z) {
            i2 = R.string.off;
        } else {
            i2 = R.string.on;
        }
        switchPreference.b(i2);
        this.l.d(z);
        switchPreference.n = this;
        b.a((Preference) switchPreference);
        a.a((Preference) this.l);
        this.k = new czh(context);
    }

    public final void onPause() {
        super.onPause();
        this.k.a();
    }

    public final boolean a(Preference preference, Object obj) {
        int i2;
        Boolean bool = (Boolean) obj;
        SharedPreferences sharedPreferences = getContext().getSharedPreferences("com.google.android.tvlauncher.data.TvDataManager.WATCH_NEXT_PREF_FILE_NAME", 0);
        String str = preference.s;
        if (str != null && str.startsWith("watch_next_package_key_prefix")) {
            if (bool.booleanValue()) {
                sharedPreferences.edit().remove(preference.s).apply();
            } else {
                sharedPreferences.edit().putBoolean(preference.s, false).apply();
            }
            return true;
        } else if (!"show_watch_next_row_key".equals(preference.s)) {
            return false;
        } else {
            sharedPreferences.edit().putBoolean("show_watch_next_row_key", bool.booleanValue()).apply();
            if (!bool.booleanValue()) {
                i2 = R.string.off;
            } else {
                i2 = R.string.on;
            }
            preference.b(i2);
            this.l.d(bool.booleanValue());
            return true;
        }
    }

    public final void onResume() {
        super.onResume();
        this.k.a(this);
    }
}
