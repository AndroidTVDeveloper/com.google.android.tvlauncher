package p000;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.leanback.widget.VerticalGridView;
import androidx.preference.DialogPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import com.google.android.tvlauncher.R;
import java.util.Collections;
import java.util.Set;

@Deprecated
/* renamed from: mf */
/* compiled from: PG */
public final class C0332mf extends C0333mg {

    /* renamed from: a */
    public Set f9955a;

    /* renamed from: b */
    private boolean f9956b;

    /* renamed from: c */
    private CharSequence[] f9957c;

    /* renamed from: d */
    private CharSequence[] f9958d;

    /* renamed from: e */
    private CharSequence f9959e;

    /* renamed from: f */
    private CharSequence f9960f;

    /* renamed from: g */
    private String f9961g;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = 0;
        if (bundle == null) {
            DialogPreference a = mo5580a();
            this.f9959e = a.f1315a;
            this.f9960f = a.f1316b;
            if (a instanceof ListPreference) {
                this.f9956b = false;
                ListPreference listPreference = (ListPreference) a;
                this.f9957c = listPreference.f1328g;
                this.f9958d = listPreference.f1329h;
                this.f9961g = listPreference.f1330i;
            } else if (a instanceof MultiSelectListPreference) {
                this.f9956b = true;
                MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) a;
                this.f9957c = multiSelectListPreference.f1331g;
                this.f9958d = multiSelectListPreference.f1332h;
                this.f9955a = multiSelectListPreference.f1333i;
            } else {
                throw new IllegalArgumentException("Preference must be a ListPreference or MultiSelectListPreference");
            }
        } else {
            this.f9959e = bundle.getCharSequence("LeanbackListPreferenceDialogFragment.title");
            this.f9960f = bundle.getCharSequence("LeanbackListPreferenceDialogFragment.message");
            this.f9956b = bundle.getBoolean("LeanbackListPreferenceDialogFragment.isMulti");
            this.f9957c = bundle.getCharSequenceArray("LeanbackListPreferenceDialogFragment.entries");
            this.f9958d = bundle.getCharSequenceArray("LeanbackListPreferenceDialogFragment.entryValues");
            if (this.f9956b) {
                String[] stringArray = bundle.getStringArray("LeanbackListPreferenceDialogFragment.initialSelections");
                if (stringArray != null) {
                    i = stringArray.length;
                }
                C0069cn cnVar = new C0069cn(i);
                this.f9955a = cnVar;
                if (stringArray != null) {
                    Collections.addAll(cnVar, stringArray);
                    return;
                }
                return;
            }
            this.f9961g = bundle.getString("LeanbackListPreferenceDialogFragment.initialSelection");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C0261jp jpVar;
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlayLeanback;
        }
        View inflate = layoutInflater.cloneInContext(new ContextThemeWrapper(getActivity(), i)).inflate((int) R.layout.leanback_list_preference_fragment, viewGroup, false);
        VerticalGridView verticalGridView = (VerticalGridView) inflate.findViewById(16908298);
        verticalGridView.mo5613g(3);
        verticalGridView.requestLayout();
        if (!this.f9956b) {
            jpVar = new C0329mc(this, this.f9957c, this.f9958d, this.f9961g);
        } else {
            jpVar = new C0328mb(this, this.f9957c, this.f9958d, this.f9955a);
        }
        verticalGridView.mo831a(jpVar);
        verticalGridView.requestFocus();
        CharSequence charSequence = this.f9959e;
        if (!TextUtils.isEmpty(charSequence)) {
            ((TextView) inflate.findViewById(R.id.decor_title)).setText(charSequence);
        }
        CharSequence charSequence2 = this.f9960f;
        if (!TextUtils.isEmpty(charSequence2)) {
            TextView textView = (TextView) inflate.findViewById(16908299);
            textView.setVisibility(0);
            textView.setText(charSequence2);
        }
        return inflate;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("LeanbackListPreferenceDialogFragment.title", this.f9959e);
        bundle.putCharSequence("LeanbackListPreferenceDialogFragment.message", this.f9960f);
        bundle.putBoolean("LeanbackListPreferenceDialogFragment.isMulti", this.f9956b);
        bundle.putCharSequenceArray("LeanbackListPreferenceDialogFragment.entries", this.f9957c);
        bundle.putCharSequenceArray("LeanbackListPreferenceDialogFragment.entryValues", this.f9958d);
        if (this.f9956b) {
            Set set = this.f9955a;
            bundle.putStringArray("LeanbackListPreferenceDialogFragment.initialSelections", (String[]) set.toArray(new String[set.size()]));
            return;
        }
        bundle.putString("LeanbackListPreferenceDialogFragment.initialSelection", this.f9961g);
    }
}
