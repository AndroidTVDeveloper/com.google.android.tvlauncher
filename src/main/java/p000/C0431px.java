package p000;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.preference.EditTextPreference;

@Deprecated
/* renamed from: px */
/* compiled from: PG */
public final class C0431px extends C0451qq {

    /* renamed from: a */
    private EditText f10192a;

    /* renamed from: b */
    private CharSequence f10193b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo5767a() {
        return true;
    }

    /* renamed from: c */
    private final EditTextPreference m8215c() {
        return (EditTextPreference) mo5785b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5765a(View view) {
        super.mo5765a(view);
        EditText editText = (EditText) view.findViewById(16908291);
        this.f10192a = editText;
        editText.requestFocus();
        EditText editText2 = this.f10192a;
        if (editText2 != null) {
            editText2.setText(this.f10193b);
            EditText editText3 = this.f10192a;
            editText3.setSelection(editText3.getText().length());
            return;
        }
        throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f10193b = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        } else {
            this.f10193b = m8215c().f1325g;
        }
    }

    @Deprecated
    /* renamed from: a */
    public final void mo5766a(boolean z) {
        if (z) {
            String obj = this.f10192a.getText().toString();
            if (m8215c().mo1095b((Object) obj)) {
                m8215c().mo1075a(obj);
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f10193b);
    }
}
