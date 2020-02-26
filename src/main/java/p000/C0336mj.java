package p000;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.preference.LeanbackSettingsRootView;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import com.google.android.tvlauncher.R;

@Deprecated
/* renamed from: mj */
/* compiled from: PG */
public abstract class C0336mj extends Fragment implements C0456qv, C0457qw, C0455qu {

    /* renamed from: a */
    private final C0335mi f9964a = new C0335mi(this);

    /* renamed from: a */
    public abstract void mo3832a();

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate((int) R.layout.leanback_settings_fragment, viewGroup, false);
    }

    public final void onPause() {
        super.onPause();
        LeanbackSettingsRootView leanbackSettingsRootView = (LeanbackSettingsRootView) getView();
        if (leanbackSettingsRootView != null) {
            leanbackSettingsRootView.f1168a = null;
        }
    }

    /* renamed from: a */
    public final boolean mo5585a(C0458qx qxVar, Preference preference) {
        if (preference instanceof ListPreference) {
            String str = ((ListPreference) preference).f1365s;
            Bundle bundle = new Bundle(1);
            bundle.putString("key", str);
            C0332mf mfVar = new C0332mf();
            mfVar.setArguments(bundle);
            mfVar.setTargetFragment(qxVar, 0);
            mo5584a(mfVar);
        } else if (!(preference instanceof MultiSelectListPreference)) {
            return false;
        } else {
            String str2 = ((MultiSelectListPreference) preference).f1365s;
            Bundle bundle2 = new Bundle(1);
            bundle2.putString("key", str2);
            C0332mf mfVar2 = new C0332mf();
            mfVar2.setArguments(bundle2);
            mfVar2.setTargetFragment(qxVar, 0);
            mo5584a(mfVar2);
        }
        return true;
    }

    public final void onResume() {
        super.onResume();
        LeanbackSettingsRootView leanbackSettingsRootView = (LeanbackSettingsRootView) getView();
        if (leanbackSettingsRootView != null) {
            leanbackSettingsRootView.f1168a = this.f9964a;
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            mo3832a();
        }
    }

    /* renamed from: a */
    public final void mo5584a(Fragment fragment) {
        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
        if (getChildFragmentManager().findFragmentByTag("androidx.leanback.preference.LeanbackSettingsFragment.PREFERENCE_FRAGMENT") != null) {
            beginTransaction.addToBackStack(null).replace(R.id.settings_preference_fragment_container, fragment, "androidx.leanback.preference.LeanbackSettingsFragment.PREFERENCE_FRAGMENT");
        } else {
            beginTransaction.add(R.id.settings_preference_fragment_container, fragment, "androidx.leanback.preference.LeanbackSettingsFragment.PREFERENCE_FRAGMENT");
        }
        beginTransaction.commit();
    }
}
