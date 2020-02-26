package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.preference.ListPreference;
import com.google.android.tvlauncher.R;

@Deprecated
/* renamed from: mc  reason: default package */
/* compiled from: PG */
public final class mc extends jp implements md {
    private final CharSequence[] b;
    private final CharSequence[] c;
    private CharSequence d;
    private final /* synthetic */ mf e;

    public mc(mf mfVar, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2, CharSequence charSequence) {
        this.e = mfVar;
        this.b = charSequenceArr;
        this.c = charSequenceArr2;
        this.d = charSequence;
    }

    public final int a() {
        return this.b.length;
    }

    public final /* bridge */ /* synthetic */ void a(km kmVar, int i) {
        me meVar = (me) kmVar;
        meVar.p.setChecked(this.c[i].equals(this.d));
        meVar.q.setText(this.b[i]);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final /* bridge */ /* synthetic */ km a(ViewGroup viewGroup, int i) {
        return new me(LayoutInflater.from(viewGroup.getContext()).inflate((int) R.layout.leanback_list_preference_item_single, viewGroup, false), this);
    }

    public final void a(me meVar) {
        int d2 = meVar.d();
        if (d2 != -1) {
            CharSequence charSequence = this.c[d2];
            ListPreference listPreference = (ListPreference) this.e.a();
            if (d2 >= 0) {
                String charSequence2 = this.c[d2].toString();
                if (listPreference.b((Object) charSequence2)) {
                    listPreference.a(charSequence2);
                    this.d = charSequence;
                }
            }
            this.e.getFragmentManager().popBackStack();
            O();
        }
    }
}
