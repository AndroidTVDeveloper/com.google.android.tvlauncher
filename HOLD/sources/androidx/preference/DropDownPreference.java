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
    private final Context D;
    private final ArrayAdapter E;
    private Spinner F;
    private final AdapterView.OnItemSelectedListener G = new pt(this);

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        this.D = context;
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.D, 17367049);
        this.E = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.g;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                this.E.add(charSequence.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        super.b();
        ArrayAdapter arrayAdapter = this.E;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    public final void a(rl rlVar) {
        Spinner spinner = (Spinner) rlVar.a.findViewById(R.id.spinner);
        this.F = spinner;
        spinner.setAdapter((SpinnerAdapter) this.E);
        this.F.setOnItemSelectedListener(this.G);
        Spinner spinner2 = this.F;
        String str = this.i;
        CharSequence[] charSequenceArr = this.h;
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
        super.a(rlVar);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.F.performClick();
    }
}
