package defpackage;

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
/* renamed from: mj  reason: default package */
/* compiled from: PG */
public abstract class mj extends Fragment implements qv, qw, qu {
    private final mi a = new mi(this);

    public abstract void a();

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
            leanbackSettingsRootView.a = null;
        }
    }

    public final boolean a(qx qxVar, Preference preference) {
        if (preference instanceof ListPreference) {
            String str = ((ListPreference) preference).s;
            Bundle bundle = new Bundle(1);
            bundle.putString("key", str);
            mf mfVar = new mf();
            mfVar.setArguments(bundle);
            mfVar.setTargetFragment(qxVar, 0);
            a(mfVar);
        } else if (!(preference instanceof MultiSelectListPreference)) {
            return false;
        } else {
            String str2 = ((MultiSelectListPreference) preference).s;
            Bundle bundle2 = new Bundle(1);
            bundle2.putString("key", str2);
            mf mfVar2 = new mf();
            mfVar2.setArguments(bundle2);
            mfVar2.setTargetFragment(qxVar, 0);
            a(mfVar2);
        }
        return true;
    }

    public final void onResume() {
        super.onResume();
        LeanbackSettingsRootView leanbackSettingsRootView = (LeanbackSettingsRootView) getView();
        if (leanbackSettingsRootView != null) {
            leanbackSettingsRootView.a = this.a;
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            a();
        }
    }

    public final void a(Fragment fragment) {
        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
        if (getChildFragmentManager().findFragmentByTag("androidx.leanback.preference.LeanbackSettingsFragment.PREFERENCE_FRAGMENT") != null) {
            beginTransaction.addToBackStack(null).replace(R.id.settings_preference_fragment_container, fragment, "androidx.leanback.preference.LeanbackSettingsFragment.PREFERENCE_FRAGMENT");
        } else {
            beginTransaction.add(R.id.settings_preference_fragment_container, fragment, "androidx.leanback.preference.LeanbackSettingsFragment.PREFERENCE_FRAGMENT");
        }
        beginTransaction.commit();
    }
}
