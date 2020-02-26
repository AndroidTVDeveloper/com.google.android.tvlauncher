package p000;

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

/* renamed from: czu */
/* compiled from: PG */
public final class czu extends C0334mh implements C0447qm {
    /* renamed from: a */
    public final void mo3836a(Bundle bundle) {
        C0470ri riVar = this.f10224b;
        Context context = riVar.f10247a;
        PreferenceScreen a = riVar.mo5809a(context);
        a.mo1092b((int) R.string.settings_dialog_title);
        PreferenceCategory preferenceCategory = new PreferenceCategory(context);
        preferenceCategory.mo1092b((int) R.string.guide_view_title);
        a.mo1117a((Preference) preferenceCategory);
        Preference preference = new Preference(this.f10224b.f10247a);
        preference.mo1092b((int) R.string.add_channels_title);
        preference.f1366t = czm.class.getName();
        preference.mo1115r();
        a.mo1117a(preference);
        SwitchPreference switchPreference = new SwitchPreference(context);
        switchPreference.mo1098c("show_preview_video_key");
        switchPreference.mo1092b((int) R.string.home_screen_preview_video_enable);
        SharedPreferences sharedPreferences = getContext().getSharedPreferences("com.google.android.tvlauncher.data.TvDataManager.PREVIEW_VIDEO_PREF_FILE_NAME", 0);
        switchPreference.mo1131d(sharedPreferences.getBoolean("show_preview_video_key", true));
        switchPreference.mo1115r();
        switchPreference.f1360n = this;
        a.mo1117a((Preference) switchPreference);
        SwitchPreference switchPreference2 = new SwitchPreference(context);
        switchPreference2.mo1098c("enable_preview_audio_key");
        switchPreference2.mo1092b((int) R.string.home_screen_preview_audio_enable);
        switchPreference2.mo1131d(sharedPreferences.getBoolean("enable_preview_audio_key", true));
        switchPreference2.mo1115r();
        switchPreference2.f1360n = this;
        a.mo1117a((Preference) switchPreference2);
        PreferenceCategory preferenceCategory2 = new PreferenceCategory(context);
        preferenceCategory2.mo1092b((int) R.string.apps_view_title);
        a.mo1117a((Preference) preferenceCategory2);
        Preference preference2 = new Preference(context);
        preference2.mo1098c("reorderapps");
        preference2.mo1092b((int) R.string.customize_app_order_action_title);
        a.mo1117a(preference2);
        Preference preference3 = new Preference(context);
        preference3.mo1098c("reordergames");
        preference3.mo1092b((int) R.string.customize_game_order_action_title);
        a.mo1117a(preference3);
        mo5792a(a);
        PreferenceCategory preferenceCategory3 = new PreferenceCategory(context);
        preferenceCategory3.mo1092b((int) R.string.open_source_licenses_title);
        a.mo1117a((Preference) preferenceCategory3);
        Preference preference4 = new Preference(context);
        preference4.mo1092b((int) R.string.app_name);
        preference4.f1361o = new czs(this, context);
        preference4.mo1115r();
        a.mo1117a(preference4);
        Intent intent = new Intent("com.android.tv.action.VIEW_LICENSES");
        intent.setPackage("com.google.android.tvrecommendations");
        PackageManager packageManager = context.getPackageManager();
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
        if (resolveActivity != null) {
            Preference preference5 = new Preference(context);
            preference5.mo1094b(resolveActivity.loadLabel(packageManager));
            preference5.f1361o = new czt(this, intent);
            a.mo1117a(preference5);
        }
        mo5792a(a);
    }

    /* renamed from: a */
    public final boolean mo3997a(Preference preference, Object obj) {
        SharedPreferences sharedPreferences = getContext().getSharedPreferences("com.google.android.tvlauncher.data.TvDataManager.PREVIEW_VIDEO_PREF_FILE_NAME", 0);
        if ("show_preview_video_key".equals(preference.f1365s)) {
            sharedPreferences.edit().putBoolean(preference.f1365s, ((Boolean) obj).booleanValue()).apply();
            return true;
        } else if (!"enable_preview_audio_key".equals(preference.f1365s)) {
            return false;
        } else {
            sharedPreferences.edit().putBoolean(preference.f1365s, ((Boolean) obj).booleanValue()).apply();
            return true;
        }
    }

    /* renamed from: b */
    public final boolean mo4019b(Preference preference) {
        String str = preference.f1365s;
        if ("reorderapps".equals(str)) {
            AppsViewActivity.m5255a(0, getContext());
            return true;
        } else if (!"reordergames".equals(str)) {
            return super.mo4019b(preference);
        } else {
            AppsViewActivity.m5255a(1, getContext());
            return true;
        }
    }
}
