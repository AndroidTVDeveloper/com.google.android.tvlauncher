package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.tvlauncher.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
public class Preference implements Comparable {

    /* renamed from: A */
    public C0446ql f1334A;

    /* renamed from: B */
    public PreferenceGroup f1335B;

    /* renamed from: C */
    public C0450qp f1336C;

    /* renamed from: D */
    private boolean f1337D;

    /* renamed from: E */
    private boolean f1338E;

    /* renamed from: F */
    private boolean f1339F;

    /* renamed from: G */
    private boolean f1340G;

    /* renamed from: H */
    private boolean f1341H;

    /* renamed from: I */
    private boolean f1342I;

    /* renamed from: J */
    private List f1343J;

    /* renamed from: K */
    private boolean f1344K;

    /* renamed from: L */
    private C0449qo f1345L;

    /* renamed from: M */
    private final View.OnClickListener f1346M;

    /* renamed from: a */
    private CharSequence f1347a;

    /* renamed from: b */
    private Drawable f1348b;

    /* renamed from: c */
    private Bundle f1349c;

    /* renamed from: d */
    private boolean f1350d;

    /* renamed from: e */
    private boolean f1351e;

    /* renamed from: f */
    private String f1352f;

    /* renamed from: g */
    private Object f1353g;

    /* renamed from: h */
    private boolean f1354h;

    /* renamed from: i */
    private boolean f1355i;

    /* renamed from: j */
    public Context f1356j;

    /* renamed from: k */
    public C0470ri f1357k;

    /* renamed from: l */
    public long f1358l;

    /* renamed from: m */
    public boolean f1359m;

    /* renamed from: n */
    public C0447qm f1360n;

    /* renamed from: o */
    public C0448qn f1361o;

    /* renamed from: p */
    public int f1362p;

    /* renamed from: q */
    public CharSequence f1363q;

    /* renamed from: r */
    public int f1364r;

    /* renamed from: s */
    public String f1365s;

    /* renamed from: t */
    public String f1366t;

    /* renamed from: u */
    public boolean f1367u;

    /* renamed from: v */
    public boolean f1368v;

    /* renamed from: w */
    public boolean f1369w;

    /* renamed from: x */
    public boolean f1370x;

    /* renamed from: y */
    public int f1371y;

    /* renamed from: z */
    public int f1372z;

    public Preference(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo1072a(TypedArray typedArray, int i) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1070a() {
    }

    @Deprecated
    /* renamed from: a */
    public void mo1087a(C0114ed edVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1074a(Object obj) {
    }

    /* renamed from: e */
    public long mo1103e() {
        return this.f1358l;
    }

    /* renamed from: i */
    public boolean mo1106i() {
        return this.f1367u && this.f1354h && this.f1355i;
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0035bg.m3102a(context, (int) R.attr.preferenceStyle, 16842894));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bg.a(android.content.res.TypedArray, int, int, boolean):boolean
     arg types: [android.content.res.TypedArray, int, int, int]
     candidates:
      bg.a(android.content.res.TypedArray, int, int, int):int
      bg.a(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int):int
      bg.a(android.content.res.Resources, android.content.res.Resources$Theme, android.util.AttributeSet, int[]):android.content.res.TypedArray
      bg.a(android.content.res.TypedArray, int, int, boolean):boolean */
    public Preference(Context context, AttributeSet attributeSet, int i) {
        this.f1362p = Integer.MAX_VALUE;
        this.f1367u = true;
        this.f1350d = true;
        this.f1368v = true;
        this.f1354h = true;
        this.f1355i = true;
        this.f1369w = true;
        this.f1337D = true;
        this.f1338E = true;
        this.f1340G = true;
        this.f1342I = true;
        this.f1371y = R.layout.preference;
        this.f1346M = new C0443qi(this);
        this.f1356j = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0474rm.f10268g, i, 0);
        this.f1364r = C0035bg.m3103a(obtainStyledAttributes, 23, 0, 0);
        this.f1365s = C0035bg.m3109a(obtainStyledAttributes, 26, 6);
        this.f1363q = C0035bg.m3117b(obtainStyledAttributes, 34, 4);
        this.f1347a = C0035bg.m3117b(obtainStyledAttributes, 33, 7);
        this.f1362p = C0035bg.m3119d(obtainStyledAttributes, 28, 8);
        this.f1366t = C0035bg.m3109a(obtainStyledAttributes, 22, 13);
        this.f1371y = C0035bg.m3103a(obtainStyledAttributes, 27, 3, (int) R.layout.preference);
        this.f1372z = C0035bg.m3103a(obtainStyledAttributes, 35, 9, 0);
        this.f1367u = C0035bg.m3111a(obtainStyledAttributes, 21, 2, true);
        this.f1350d = C0035bg.m3111a(obtainStyledAttributes, 30, 5, true);
        this.f1368v = C0035bg.m3111a(obtainStyledAttributes, 29, 1, true);
        this.f1352f = C0035bg.m3109a(obtainStyledAttributes, 19, 10);
        this.f1337D = C0035bg.m3111a(obtainStyledAttributes, 16, 16, this.f1350d);
        this.f1338E = C0035bg.m3111a(obtainStyledAttributes, 17, 17, this.f1350d);
        if (obtainStyledAttributes.hasValue(18)) {
            this.f1353g = mo1072a(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.f1353g = mo1072a(obtainStyledAttributes, 11);
        }
        this.f1342I = C0035bg.m3111a(obtainStyledAttributes, 31, 12, true);
        boolean hasValue = obtainStyledAttributes.hasValue(32);
        this.f1339F = hasValue;
        if (hasValue) {
            this.f1340G = C0035bg.m3111a(obtainStyledAttributes, 32, 14, true);
        }
        this.f1341H = C0035bg.m3111a(obtainStyledAttributes, 24, 15, false);
        this.f1369w = C0035bg.m3111a(obtainStyledAttributes, 25, 25, true);
        this.f1370x = C0035bg.m3111a(obtainStyledAttributes, 20, 20, false);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1086a(PreferenceGroup preferenceGroup) {
        if (preferenceGroup == null || this.f1335B == null) {
            this.f1335B = preferenceGroup;
            return;
        }
        throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
    }

    /* renamed from: b */
    public final boolean mo1095b(Object obj) {
        C0447qm qmVar = this.f1360n;
        return qmVar == null || qmVar.mo3997a(this, obj);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Preference preference = (Preference) obj;
        int i = this.f1362p;
        int i2 = preference.f1362p;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.f1363q;
        CharSequence charSequence2 = preference.f1363q;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f1363q.toString());
    }

    /* renamed from: b */
    public void mo1093b(Bundle bundle) {
        Parcelable parcelable;
        if (mo1107j() && (parcelable = bundle.getParcelable(this.f1365s)) != null) {
            this.f1344K = false;
            mo1073a(parcelable);
            if (!this.f1344K) {
                throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
            }
        }
    }

    /* renamed from: a */
    public void mo1085a(Bundle bundle) {
        if (mo1107j()) {
            this.f1344K = false;
            Parcelable d = mo1077d();
            if (!this.f1344K) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            } else if (d != null) {
                bundle.putParcelable(this.f1365s, d);
            }
        }
    }

    /* renamed from: a */
    private final Preference mo1075a(String str) {
        C0470ri riVar = this.f1357k;
        if (riVar != null) {
            return riVar.mo5808a(str);
        }
        return null;
    }

    /* renamed from: h */
    public final Bundle mo1105h() {
        if (this.f1349c == null) {
            this.f1349c = new Bundle();
        }
        return this.f1349c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo1096b(boolean z) {
        return mo1108k() ? this.f1357k.mo5810b().getBoolean(this.f1365s, z) : z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo1101d(int i) {
        return mo1108k() ? this.f1357k.mo5810b().getInt(this.f1365s, i) : i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo1102d(String str) {
        return mo1108k() ? this.f1357k.mo5810b().getString(this.f1365s, str) : str;
    }

    /* renamed from: b */
    public final Set mo1091b(Set set) {
        return mo1108k() ? this.f1357k.mo5810b().getStringSet(this.f1365s, set) : set;
    }

    /* renamed from: f */
    public CharSequence mo1080f() {
        C0450qp qpVar = this.f1336C;
        return qpVar != null ? qpVar.mo5764a(this) : this.f1347a;
    }

    /* renamed from: j */
    public final boolean mo1107j() {
        return !TextUtils.isEmpty(this.f1365s);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1071b() {
        int indexOf;
        C0446ql qlVar = this.f1334A;
        if (qlVar != null && (indexOf = ((C0466re) qlVar).f10241b.indexOf(this)) != -1) {
            ((C0261jp) qlVar).mo5306a(indexOf, this);
        }
    }

    /* renamed from: a */
    public void mo1090a(boolean z) {
        List list = this.f1343J;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((Preference) list.get(i)).mo1131d(z);
            }
        }
    }

    /* renamed from: m */
    public final void mo1110m() {
        C0446ql qlVar = this.f1334A;
        if (qlVar != null) {
            qlVar.mo5782b();
        }
    }

    /* renamed from: n */
    public void mo1111n() {
        mo1113p();
    }

    /* renamed from: a */
    public final void mo1089a(C0470ri riVar) {
        this.f1357k = riVar;
        if (!this.f1359m) {
            this.f1358l = riVar.mo5807a();
        }
        if (mo1108k()) {
            C0470ri riVar2 = this.f1357k;
            if ((riVar2 != null ? riVar2.mo5810b() : null).contains(this.f1365s)) {
                mo1074a((Object) null);
                return;
            }
        }
        Object obj = this.f1353g;
        if (obj != null) {
            mo1074a(obj);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: androidx.preference.Preference.a(android.view.View, boolean):void
     arg types: [android.view.View, int]
     candidates:
      androidx.preference.Preference.a(android.content.res.TypedArray, int):java.lang.Object
      androidx.preference.Preference.a(android.view.View, boolean):void */
    /* renamed from: a */
    public void mo1069a(C0473rl rlVar) {
        Integer num;
        int i;
        View view = rlVar.f9783a;
        view.setOnClickListener(this.f1346M);
        view.setId(0);
        TextView textView = (TextView) rlVar.mo5812c(16908304);
        int i2 = 8;
        if (textView != null) {
            CharSequence f = mo1080f();
            if (!TextUtils.isEmpty(f)) {
                textView.setText(f);
                textView.setVisibility(0);
                num = Integer.valueOf(textView.getCurrentTextColor());
            } else {
                textView.setVisibility(8);
                num = null;
            }
        } else {
            num = null;
        }
        TextView textView2 = (TextView) rlVar.mo5812c(16908310);
        if (textView2 != null) {
            CharSequence charSequence = this.f1363q;
            if (!TextUtils.isEmpty(charSequence)) {
                textView2.setText(charSequence);
                textView2.setVisibility(0);
                if (this.f1339F) {
                    textView2.setSingleLine(this.f1340G);
                }
                if (!this.f1350d && mo1106i() && num != null) {
                    textView2.setTextColor(num.intValue());
                }
            } else {
                textView2.setVisibility(8);
            }
        }
        ImageView imageView = (ImageView) rlVar.mo5812c(16908294);
        if (imageView != null) {
            int i3 = this.f1364r;
            if (!(i3 == 0 && this.f1348b == null)) {
                if (this.f1348b == null) {
                    this.f1348b = C0129es.m7262b(this.f1356j, i3);
                }
                Drawable drawable = this.f1348b;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.f1348b == null) {
                if (!this.f1341H) {
                    i = 8;
                } else {
                    i = 4;
                }
                imageView.setVisibility(i);
            } else {
                imageView.setVisibility(0);
            }
        }
        View c = rlVar.mo5812c(R.id.icon_frame);
        if (c == null) {
            c = rlVar.mo5812c(16908350);
        }
        if (c != null) {
            if (this.f1348b == null) {
                if (this.f1341H) {
                    i2 = 4;
                }
                c.setVisibility(i2);
            } else {
                c.setVisibility(0);
            }
        }
        if (!this.f1342I) {
            mo3823a(view, true);
        } else {
            mo3823a(view, mo1106i());
        }
        boolean z = this.f1350d;
        view.setFocusable(z);
        view.setClickable(z);
        rlVar.f10259p = this.f1337D;
        rlVar.f10260q = this.f1338E;
        boolean z2 = this.f1370x;
        if (z2 && this.f1345L == null) {
            this.f1345L = new C0449qo(this);
        }
        view.setOnCreateContextMenuListener(z2 ? this.f1345L : null);
        view.setLongClickable(z2);
        if (z2 && !z) {
            C0107dx.m7199a(view, (Drawable) null);
        }
    }

    /* renamed from: d */
    private final void mo1131d(boolean z) {
        if (this.f1354h == z) {
            this.f1354h = !z;
            mo1090a(mo1076c());
            mo1071b();
        }
    }

    /* renamed from: o */
    public void mo1112o() {
        mo1114q();
    }

    /* renamed from: c */
    public final void mo1099c(boolean z) {
        if (this.f1355i == z) {
            this.f1355i = !z;
            mo1090a(mo1076c());
            mo1071b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1073a(Parcelable parcelable) {
        this.f1344K = true;
        if (parcelable != C0445qk.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Parcelable mo1077d() {
        this.f1344K = true;
        return C0445qk.EMPTY_STATE;
    }

    /* renamed from: l */
    public final void mo1109l() {
        C0470ri riVar;
        C0469rh rhVar;
        if (mo1106i() && this.f1350d) {
            mo1070a();
            C0448qn qnVar = this.f1361o;
            if ((qnVar != null && qnVar.mo3837a(this)) || (riVar = this.f1357k) == null || (rhVar = riVar.f10249c) == null || rhVar.mo4019b(this)) {
            }
        }
    }

    /* renamed from: a */
    public void mo1068a(View view) {
        mo1109l();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo1104e(String str) {
        if (mo1108k() && !TextUtils.equals(str, mo1102d((String) null))) {
            SharedPreferences.Editor c = this.f1357k.mo5811c();
            c.putString(this.f1365s, str);
            m1473a(c);
        }
    }

    /* renamed from: p */
    public final void mo1113p() {
        if (!TextUtils.isEmpty(this.f1352f)) {
            Preference a = mo1075a(this.f1352f);
            if (a != null) {
                if (a.f1343J == null) {
                    a.f1343J = new ArrayList();
                }
                a.f1343J.add(this);
                mo1131d(a.mo1076c());
                return;
            }
            throw new IllegalStateException("Dependency \"" + this.f1352f + "\" not found for preference \"" + this.f1365s + "\" (title: \"" + ((Object) this.f1363q) + "\"");
        }
    }

    /* renamed from: a */
    private final void mo3823a(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                mo3823a(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    /* renamed from: a */
    public final void mo1084a(Drawable drawable) {
        if (this.f1348b != drawable) {
            this.f1348b = drawable;
            this.f1364r = 0;
            mo1071b();
        }
    }

    /* renamed from: c */
    public final void mo1098c(String str) {
        this.f1365s = str;
        if (this.f1351e && !mo1107j()) {
            if (!TextUtils.isEmpty(this.f1365s)) {
                this.f1351e = true;
                return;
            }
            throw new IllegalStateException("Preference does not have a key assigned.");
        }
    }

    /* renamed from: a */
    public final void mo1083a(int i) {
        if (i != this.f1362p) {
            this.f1362p = i;
            mo1110m();
        }
    }

    /* renamed from: r */
    public final void mo1115r() {
        this.f1368v = false;
    }

    /* renamed from: c */
    public final void mo1097c(int i) {
        mo1078a((CharSequence) this.f1356j.getString(i));
    }

    /* renamed from: a */
    public void mo1078a(CharSequence charSequence) {
        if (this.f1336C != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        } else if (!TextUtils.equals(this.f1347a, charSequence)) {
            this.f1347a = charSequence;
            mo1071b();
        }
    }

    /* renamed from: a */
    public final void mo1088a(C0450qp qpVar) {
        this.f1336C = qpVar;
        mo1071b();
    }

    /* renamed from: b */
    public final void mo1092b(int i) {
        mo1094b((CharSequence) this.f1356j.getString(i));
    }

    /* renamed from: b */
    public final void mo1094b(CharSequence charSequence) {
        if ((charSequence == null && this.f1363q != null) || (charSequence != null && !charSequence.equals(this.f1363q))) {
            this.f1363q = charSequence;
            mo1071b();
        }
    }

    /* renamed from: c */
    public boolean mo1076c() {
        return !mo1106i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo1108k() {
        return this.f1357k != null && this.f1368v && mo1107j();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.f1363q;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence f = mo1080f();
        if (!TextUtils.isEmpty(f)) {
            sb.append(f);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static final void m1473a(SharedPreferences.Editor editor) {
        editor.apply();
    }

    /* renamed from: q */
    public final void mo1114q() {
        Preference a;
        List list;
        String str = this.f1352f;
        if (str != null && (a = mo1075a(str)) != null && (list = a.f1343J) != null) {
            list.remove(this);
        }
    }
}
