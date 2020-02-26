package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreference;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.appsview.AppsViewActivity;

/* renamed from: czu  reason: default package */
/* compiled from: PG */
public final class czu extends mh implements qm {
    public final void a(Bundle bundle) {
        ri riVar = this.b;
        Context context = riVar.a;
        PreferenceScreen a = riVar.a(context);
        a.b((int) R.string.settings_dialog_title);
        PreferenceCategory preferenceCategory = new PreferenceCategory(context);
        preferenceCategory.b((int) R.string.guide_view_title);
        a.a((Preference) preferenceCategory);
        Preference preference = new Preference(this.b.a);
        preference.b((int) R.string.add_channels_title);
        preference.t = czm.class.getName();
        preference.r();
        a.a(preference);
        SwitchPreference switchPreference = new SwitchPreference(context);
        switchPreference.c("show_preview_video_key");
        switchPreference.b((int) R.string.home_screen_preview_video_enable);
        SharedPreferences sharedPreferences = getContext().getSharedPreferences("com.google.android.tvlauncher.data.TvDataManager.PREVIEW_VIDEO_PREF_FILE_NAME", 0);
        switchPreference.d(sharedPreferences.getBoolean("show_preview_video_key", true));
        switchPreference.r();
        switchPreference.n = this;
        a.a((Preference) switchPreference);
        SwitchPreference switchPreference2 = new SwitchPreference(context);
        switchPreference2.c("enable_preview_audio_key");
        switchPreference2.b((int) R.string.home_screen_preview_audio_enable);
        switchPreference2.d(sharedPreferences.getBoolean("enable_preview_audio_key", true));
        switchPreference2.r();
        switchPreference2.n = this;
        a.a((Preference) switchPreference2);
        PreferenceCategory preferenceCategory2 = new PreferenceCategory(context);
        preferenceCategory2.b((int) R.string.apps_view_title);
        a.a((Preference) preferenceCategory2);
        Preference preference2 = new Preference(context);
        preference2.c("reorderapps");
        preference2.b((int) R.string.customize_app_order_action_title);
        a.a(preference2);
        Preference preference3 = new Preference(context);
        preference3.c("reordergames");
        preference3.b((int) R.string.customize_game_order_action_title);
        a.a(preference3);
        a(a);
        PreferenceCategory preferenceCategory3 = new PreferenceCategory(context);
        preferenceCategory3.b((int) R.string.open_source_licenses_title);
        a.a((Preference) preferenceCategory3);
        Preference preference4 = new Preference(context);
        preference4.b((int) R.string.app_name);
        preference4.o = new czs(this, context);
        preference4.r();
        a.a(preference4);
        Intent intent = new Intent("com.android.tv.action.VIEW_LICENSES");
        intent.setPackage("com.google.android.tvrecommendations");
        PackageManager packageManager = context.getPackageManager();
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
        if (resolveActivity != null) {
            Preference preference5 = new Preference(context);
            preference5.b(resolveActivity.loadLabel(packageManager));
            preference5.o = new czt(this, intent);
            a.a(preference5);
        }
        a(a);
    }

    public final boolean a(Preference preference, Object obj) {
        SharedPreferences sharedPreferences = getContext().getSharedPreferences("com.google.android.tvlauncher.data.TvDataManager.PREVIEW_VIDEO_PREF_FILE_NAME", 0);
        if ("show_preview_video_key".equals(preference.s)) {
            sharedPreferences.edit().putBoolean(preference.s, ((Boolean) obj).booleanValue()).apply();
            return true;
        } else if (!"enable_preview_audio_key".equals(preference.s)) {
            return false;
        } else {
            sharedPreferences.edit().putBoolean(preference.s, ((Boolean) obj).booleanValue()).apply();
            return true;
        }
    }

    public final boolean b(Preference preference) {
        String str = preference.s;
        if ("reorderapps".equals(str)) {
            AppsViewActivity.a(0, getContext());
            return true;
        } else if (!"reordergames".equals(str)) {
            return super.b(preference);
        } else {
            AppsViewActivity.a(1, getContext());
            return true;
        }
    }
}
