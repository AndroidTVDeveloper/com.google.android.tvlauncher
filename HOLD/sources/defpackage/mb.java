package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.preference.MultiSelectListPreference;
import com.google.android.tvlauncher.R;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* renamed from: mb  reason: default package */
/* compiled from: PG */
public final class mb extends jp implements md {
    private final CharSequence[] b;
    private final CharSequence[] c;
    private final Set d;
    private final /* synthetic */ mf e;

    public mb(mf mfVar, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2, Set set) {
        this.e = mfVar;
        this.b = charSequenceArr;
        this.c = charSequenceArr2;
        this.d = new HashSet(set);
    }

    public final int a() {
        return this.b.length;
    }

    public final /* bridge */ /* synthetic */ void a(km kmVar, int i) {
        me meVar = (me) kmVar;
        meVar.p.setChecked(this.d.contains(this.c[i].toString()));
        meVar.q.setText(this.b[i]);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final /* bridge */ /* synthetic */ km a(ViewGroup viewGroup, int i) {
        return new me(LayoutInflater.from(viewGroup.getContext()).inflate((int) R.layout.leanback_list_preference_item_multi, viewGroup, false), this);
    }

    public final void a(me meVar) {
        int d2 = meVar.d();
        if (d2 != -1) {
            String charSequence = this.c[d2].toString();
            if (this.d.contains(charSequence)) {
                this.d.remove(charSequence);
            } else {
                this.d.add(charSequence);
            }
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) this.e.a();
            if (multiSelectListPreference.b((Object) new HashSet(this.d))) {
                multiSelectListPreference.a((Set) new HashSet(this.d));
                this.e.a = this.d;
            } else if (this.d.contains(charSequence)) {
                this.d.remove(charSequence);
            } else {
                this.d.add(charSequence);
            }
            O();
        }
    }
}
