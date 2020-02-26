package defpackage;

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
/* renamed from: mf  reason: default package */
/* compiled from: PG */
public final class mf extends mg {
    public Set a;
    private boolean b;
    private CharSequence[] c;
    private CharSequence[] d;
    private CharSequence e;
    private CharSequence f;
    private String g;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = 0;
        if (bundle == null) {
            DialogPreference a2 = a();
            this.e = a2.a;
            this.f = a2.b;
            if (a2 instanceof ListPreference) {
                this.b = false;
                ListPreference listPreference = (ListPreference) a2;
                this.c = listPreference.g;
                this.d = listPreference.h;
                this.g = listPreference.i;
            } else if (a2 instanceof MultiSelectListPreference) {
                this.b = true;
                MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) a2;
                this.c = multiSelectListPreference.g;
                this.d = multiSelectListPreference.h;
                this.a = multiSelectListPreference.i;
            } else {
                throw new IllegalArgumentException("Preference must be a ListPreference or MultiSelectListPreference");
            }
        } else {
            this.e = bundle.getCharSequence("LeanbackListPreferenceDialogFragment.title");
            this.f = bundle.getCharSequence("LeanbackListPreferenceDialogFragment.message");
            this.b = bundle.getBoolean("LeanbackListPreferenceDialogFragment.isMulti");
            this.c = bundle.getCharSequenceArray("LeanbackListPreferenceDialogFragment.entries");
            this.d = bundle.getCharSequenceArray("LeanbackListPreferenceDialogFragment.entryValues");
            if (this.b) {
                String[] stringArray = bundle.getStringArray("LeanbackListPreferenceDialogFragment.initialSelections");
                if (stringArray != null) {
                    i = stringArray.length;
                }
                cn cnVar = new cn(i);
                this.a = cnVar;
                if (stringArray != null) {
                    Collections.addAll(cnVar, stringArray);
                    return;
                }
                return;
            }
            this.g = bundle.getString("LeanbackListPreferenceDialogFragment.initialSelection");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jp jpVar;
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlayLeanback;
        }
        View inflate = layoutInflater.cloneInContext(new ContextThemeWrapper(getActivity(), i)).inflate((int) R.layout.leanback_list_preference_fragment, viewGroup, false);
        VerticalGridView verticalGridView = (VerticalGridView) inflate.findViewById(16908298);
        verticalGridView.g(3);
        verticalGridView.requestLayout();
        if (!this.b) {
            jpVar = new mc(this, this.c, this.d, this.g);
        } else {
            jpVar = new mb(this, this.c, this.d, this.a);
        }
        verticalGridView.a(jpVar);
        verticalGridView.requestFocus();
        CharSequence charSequence = this.e;
        if (!TextUtils.isEmpty(charSequence)) {
            ((TextView) inflate.findViewById(R.id.decor_title)).setText(charSequence);
        }
        CharSequence charSequence2 = this.f;
        if (!TextUtils.isEmpty(charSequence2)) {
            TextView textView = (TextView) inflate.findViewById(16908299);
            textView.setVisibility(0);
            textView.setText(charSequence2);
        }
        return inflate;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("LeanbackListPreferenceDialogFragment.title", this.e);
        bundle.putCharSequence("LeanbackListPreferenceDialogFragment.message", this.f);
        bundle.putBoolean("LeanbackListPreferenceDialogFragment.isMulti", this.b);
        bundle.putCharSequenceArray("LeanbackListPreferenceDialogFragment.entries", this.c);
        bundle.putCharSequenceArray("LeanbackListPreferenceDialogFragment.entryValues", this.d);
        if (this.b) {
            Set set = this.a;
            bundle.putStringArray("LeanbackListPreferenceDialogFragment.initialSelections", (String[]) set.toArray(new String[set.size()]));
            return;
        }
        bundle.putString("LeanbackListPreferenceDialogFragment.initialSelection", this.g);
    }
}
