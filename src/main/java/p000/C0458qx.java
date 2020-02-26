package p000;

import android.app.Fragment;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.p002v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.tvlauncher.R;

@Deprecated
/* renamed from: qx */
/* compiled from: PG */
public abstract class C0458qx extends Fragment implements C0469rh, C0467rf, C0468rg, C0426ps {

    /* renamed from: a */
    public final C0454qt f10223a = new C0454qt(this);

    /* renamed from: b */
    public C0470ri f10224b;

    /* renamed from: c */
    public RecyclerView f10225c;

    /* renamed from: d */
    public Context f10226d;

    /* renamed from: e */
    public int f10227e = R.layout.preference_list_fragment;

    /* renamed from: f */
    public final Handler f10228f = new C0452qr(this);

    /* renamed from: g */
    public final Runnable f10229g = new C0453qs(this);

    /* renamed from: h */
    private boolean f10230h;

    /* renamed from: i */
    private boolean f10231i;

    /* renamed from: a */
    public Fragment mo5573a() {
        throw null;
    }

    @Deprecated
    /* renamed from: a */
    public RecyclerView mo5574a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        throw null;
    }

    @Deprecated
    /* renamed from: a */
    public abstract void mo3836a(Bundle bundle);

    @Deprecated
    /* renamed from: b */
    public final PreferenceScreen mo5793b() {
        return this.f10224b.f10248b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo5794c() {
        PreferenceScreen b = mo5793b();
        if (b != null) {
            this.f10225c.mo831a(new C0466re(b));
            b.mo1111n();
        }
    }

    @Deprecated
    /* renamed from: a */
    public final Preference mo5758a(CharSequence charSequence) {
        C0470ri riVar = this.f10224b;
        if (riVar != null) {
            return riVar.mo5808a(charSequence);
        }
        return null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlay;
        }
        this.f10226d = new ContextThemeWrapper(getActivity(), i);
        C0470ri riVar = new C0470ri(this.f10226d);
        this.f10224b = riVar;
        riVar.f10251e = this;
        if (getArguments() != null) {
            getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        }
        mo3836a(bundle);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray obtainStyledAttributes = this.f10226d.obtainStyledAttributes(null, C0474rm.f10269h, C0035bg.m3102a(this.f10226d, (int) R.attr.preferenceFragmentStyle, 16844038), 0);
        this.f10227e = obtainStyledAttributes.getResourceId(0, this.f10227e);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(this.f10226d);
        View inflate = cloneInContext.inflate(this.f10227e, viewGroup, false);
        View findViewById = inflate.findViewById(16908351);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            RecyclerView a = mo5574a(cloneInContext, viewGroup2);
            if (a != null) {
                this.f10225c = a;
                a.mo829a(this.f10223a);
                C0454qt qtVar = this.f10223a;
                if (drawable != null) {
                    qtVar.f10220b = drawable.getIntrinsicHeight();
                } else {
                    qtVar.f10220b = 0;
                }
                qtVar.f10219a = drawable;
                qtVar.f10222d.f10225c.mo908p();
                if (dimensionPixelSize != -1) {
                    C0454qt qtVar2 = this.f10223a;
                    qtVar2.f10220b = dimensionPixelSize;
                    qtVar2.f10222d.f10225c.mo908p();
                }
                this.f10223a.f10221c = z;
                if (this.f10225c.getParent() == null) {
                    viewGroup2.addView(this.f10225c);
                }
                this.f10228f.post(this.f10229g);
                return inflate;
            }
            throw new RuntimeException("Could not create RecyclerView");
        }
        throw new RuntimeException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
    }

    public final void onDestroyView() {
        PreferenceScreen b;
        this.f10228f.removeCallbacks(this.f10229g);
        this.f10228f.removeMessages(1);
        if (this.f10230h && (b = mo5793b()) != null) {
            b.mo1112o();
        }
        this.f10225c = null;
        super.onDestroyView();
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: px} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: qd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: qh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: px} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: px} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: px} */
    /* JADX WARNING: Multi-variable type inference failed */
    @java.lang.Deprecated
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5795c(androidx.preference.Preference r6) {
        /*
            r5 = this;
            android.app.Fragment r0 = r5.mo5573a()
            boolean r0 = r0 instanceof p000.C0455qu
            if (r0 == 0) goto L_0x0014
            android.app.Fragment r0 = r5.mo5573a()
            qu r0 = (p000.C0455qu) r0
            boolean r0 = r0.mo5585a(r5, r6)
            if (r0 != 0) goto L_0x0028
        L_0x0014:
            android.app.Activity r0 = r5.getActivity()
            boolean r0 = r0 instanceof p000.C0455qu
            if (r0 == 0) goto L_0x0029
            android.app.Activity r0 = r5.getActivity()
            qu r0 = (p000.C0455qu) r0
            boolean r0 = r0.mo5585a(r5, r6)
            if (r0 == 0) goto L_0x0029
        L_0x0028:
            return
        L_0x0029:
            android.app.FragmentManager r0 = r5.getFragmentManager()
            java.lang.String r1 = "androidx.preference.PreferenceFragment.DIALOG"
            android.app.Fragment r0 = r0.findFragmentByTag(r1)
            if (r0 != 0) goto L_0x0093
            boolean r0 = r6 instanceof androidx.preference.EditTextPreference
            java.lang.String r2 = "key"
            r3 = 1
            if (r0 != 0) goto L_0x0073
            boolean r0 = r6 instanceof androidx.preference.ListPreference
            if (r0 != 0) goto L_0x005f
            boolean r0 = r6 instanceof androidx.preference.MultiSelectListPreference
            if (r0 == 0) goto L_0x0057
            java.lang.String r6 = r6.f1365s
            qh r0 = new qh
            r0.<init>()
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r3)
            r4.putString(r2, r6)
            r0.setArguments(r4)
            goto L_0x0087
        L_0x0057:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Tried to display dialog for unknown preference type. Did you forget to override onDisplayPreferenceDialog()?"
            r6.<init>(r0)
            throw r6
        L_0x005f:
            java.lang.String r6 = r6.f1365s
            qd r0 = new qd
            r0.<init>()
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r3)
            r4.putString(r2, r6)
            r0.setArguments(r4)
            goto L_0x0087
        L_0x0073:
            java.lang.String r6 = r6.f1365s
            px r0 = new px
            r0.<init>()
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r3)
            r4.putString(r2, r6)
            r0.setArguments(r4)
        L_0x0087:
            r6 = 0
            r0.setTargetFragment(r5, r6)
            android.app.FragmentManager r6 = r5.getFragmentManager()
            r0.show(r6, r1)
            return
        L_0x0093:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0458qx.mo5795c(androidx.preference.Preference):void");
    }

    @Deprecated
    /* renamed from: X */
    public final void mo5791X() {
        if (mo5573a() instanceof C0457qw) {
            ((C0457qw) mo5573a()).mo3833b();
        }
        if (getActivity() instanceof C0457qw) {
            ((C0457qw) getActivity()).mo3833b();
        }
    }

    @Deprecated
    /* renamed from: b */
    public boolean mo4019b(Preference preference) {
        boolean z = false;
        if (preference.f1366t == null) {
            return false;
        }
        if (mo5573a() instanceof C0456qv) {
            z = ((C0456qv) mo5573a()).mo3834b(this, preference);
        }
        return (z || !(getActivity() instanceof C0456qv)) ? z : ((C0456qv) getActivity()).mo3834b(this, preference);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen b = mo5793b();
        if (b != null) {
            Bundle bundle2 = new Bundle();
            b.mo1085a(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    public void onStart() {
        super.onStart();
        C0470ri riVar = this.f10224b;
        riVar.f10249c = this;
        riVar.f10250d = this;
    }

    public void onStop() {
        super.onStop();
        C0470ri riVar = this.f10224b;
        riVar.f10249c = null;
        riVar.f10250d = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen b;
        super.onViewCreated(view, bundle);
        if (!(bundle == null || (bundle2 = bundle.getBundle("android:preferences")) == null || (b = mo5793b()) == null)) {
            b.mo1093b(bundle2);
        }
        if (this.f10230h) {
            mo5794c();
        }
        this.f10231i = true;
    }

    @Deprecated
    /* renamed from: a */
    public final void mo5792a(PreferenceScreen preferenceScreen) {
        C0470ri riVar = this.f10224b;
        PreferenceScreen preferenceScreen2 = riVar.f10248b;
        if (preferenceScreen != preferenceScreen2) {
            if (preferenceScreen2 != null) {
                preferenceScreen2.mo1112o();
            }
            riVar.f10248b = preferenceScreen;
            if (preferenceScreen != null) {
                this.f10230h = true;
                if (this.f10231i && !this.f10228f.hasMessages(1)) {
                    this.f10228f.obtainMessage(1).sendToTarget();
                }
            }
        }
    }
}
