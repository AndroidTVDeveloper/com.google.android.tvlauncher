package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class DropDownPreference extends ListPreference {

    /* renamed from: D */
    private final Context f1321D;

    /* renamed from: E */
    private final ArrayAdapter f1322E;

    /* renamed from: F */
    private Spinner f1323F;

    /* renamed from: G */
    private final AdapterView.OnItemSelectedListener f1324G = new C0427pt(this);

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        this.f1321D = context;
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.f1321D, 17367049);
        this.f1322E = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.f1328g;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                this.f1322E.add(charSequence.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo1071b() {
        super.mo1071b();
        ArrayAdapter arrayAdapter = this.f1322E;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo1069a(C0473rl rlVar) {
        Spinner spinner = (Spinner) rlVar.f9783a.findViewById(R.id.spinner);
        this.f1323F = spinner;
        spinner.setAdapter((SpinnerAdapter) this.f1322E);
        this.f1323F.setOnItemSelectedListener(this.f1324G);
        Spinner spinner2 = this.f1323F;
        String str = this.f1330i;
        CharSequence[] charSequenceArr = this.f1329h;
        int i = -1;
        if (str != null && charSequenceArr != null) {
            int length = charSequenceArr.length - 1;
            while (true) {
                if (length >= 0) {
                    if (charSequenceArr[length].equals(str)) {
                        i = length;
                        break;
                    }
                    length--;
                } else {
                    break;
                }
            }
        }
        spinner2.setSelection(i);
        super.mo1069a(rlVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1070a() {
        this.f1323F.performClick();
    }
}
