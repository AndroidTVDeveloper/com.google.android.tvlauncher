package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.preference.EditTextPreference;

@Deprecated
/* renamed from: px  reason: default package */
/* compiled from: PG */
public final class px extends qq {
    private EditText a;
    private CharSequence b;

    /* access modifiers changed from: protected */
    public final boolean a() {
        return true;
    }

    private final EditTextPreference c() {
        return (EditTextPreference) b();
    }

    /* access modifiers changed from: protected */
    public final void a(View view) {
        super.a(view);
        EditText editText = (EditText) view.findViewById(16908291);
        this.a = editText;
        editText.requestFocus();
        EditText editText2 = this.a;
        if (editText2 != null) {
            editText2.setText(this.b);
            EditText editText3 = this.a;
            editText3.setSelection(editText3.getText().length());
            return;
        }
        throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.b = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        } else {
            this.b = c().g;
        }
    }

    @Deprecated
    public final void a(boolean z) {
        if (z) {
            String obj = this.a.getText().toString();
            if (c().b((Object) obj)) {
                c().a(obj);
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.b);
    }
}
