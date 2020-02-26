package defpackage;

import android.app.Fragment;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.tvlauncher.R;

@Deprecated
/* renamed from: qx  reason: default package */
/* compiled from: PG */
public abstract class qx extends Fragment implements rh, rf, rg, ps {
    public final qt a = new qt(this);
    public ri b;
    public RecyclerView c;
    public Context d;
    public int e = R.layout.preference_list_fragment;
    public final Handler f = new qr(this);
    public final Runnable g = new qs(this);
    private boolean h;
    private boolean i;

    public Fragment a() {
        throw null;
    }

    @Deprecated
    public RecyclerView a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        throw null;
    }

    @Deprecated
    public abstract void a(Bundle bundle);

    @Deprecated
    public final PreferenceScreen b() {
        return this.b.b;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        PreferenceScreen b2 = b();
        if (b2 != null) {
            this.c.a(new re(b2));
            b2.n();
        }
    }

    @Deprecated
    public final Preference a(CharSequence charSequence) {
        ri riVar = this.b;
        if (riVar != null) {
            return riVar.a(charSequence);
        }
        return null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i2 = typedValue.resourceId;
        if (i2 == 0) {
            i2 = R.style.PreferenceThemeOverlay;
        }
        this.d = new ContextThemeWrapper(getActivity(), i2);
        ri riVar = new ri(this.d);
        this.b = riVar;
        riVar.e = this;
        if (getArguments() != null) {
            getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        }
        a(bundle);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray obtainStyledAttributes = this.d.obtainStyledAttributes(null, rm.h, bg.a(this.d, (int) R.attr.preferenceFragmentStyle, 16844038), 0);
        this.e = obtainStyledAttributes.getResourceId(0, this.e);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(this.d);
        View inflate = cloneInContext.inflate(this.e, viewGroup, false);
        View findViewById = inflate.findViewById(16908351);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            RecyclerView a2 = a(cloneInContext, viewGroup2);
            if (a2 != null) {
                this.c = a2;
                a2.a(this.a);
                qt qtVar = this.a;
                if (drawable != null) {
                    qtVar.b = drawable.getIntrinsicHeight();
                } else {
                    qtVar.b = 0;
                }
                qtVar.a = drawable;
                qtVar.d.c.p();
                if (dimensionPixelSize != -1) {
                    qt qtVar2 = this.a;
                    qtVar2.b = dimensionPixelSize;
                    qtVar2.d.c.p();
                }
                this.a.c = z;
                if (this.c.getParent() == null) {
                    viewGroup2.addView(this.c);
                }
                this.f.post(this.g);
                return inflate;
            }
            throw new RuntimeException("Could not create RecyclerView");
        }
        throw new RuntimeException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
    }

    public final void onDestroyView() {
        PreferenceScreen b2;
        this.f.removeCallbacks(this.g);
        this.f.removeMessages(1);
        if (this.h && (b2 = b()) != null) {
            b2.o();
        }
        this.c = null;
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
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.preference.Preference r6) {
        /*
            r5 = this;
            android.app.Fragment r0 = r5.a()
            boolean r0 = r0 instanceof defpackage.qu
            if (r0 == 0) goto L_0x0014
            android.app.Fragment r0 = r5.a()
            qu r0 = (defpackage.qu) r0
            boolean r0 = r0.a(r5, r6)
            if (r0 != 0) goto L_0x0028
        L_0x0014:
            android.app.Activity r0 = r5.getActivity()
            boolean r0 = r0 instanceof defpackage.qu
            if (r0 == 0) goto L_0x0029
            android.app.Activity r0 = r5.getActivity()
            qu r0 = (defpackage.qu) r0
            boolean r0 = r0.a(r5, r6)
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
            java.lang.String r6 = r6.s
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
            java.lang.String r6 = r6.s
            qd r0 = new qd
            r0.<init>()
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r3)
            r4.putString(r2, r6)
            r0.setArguments(r4)
            goto L_0x0087
        L_0x0073:
            java.lang.String r6 = r6.s
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qx.c(androidx.preference.Preference):void");
    }

    @Deprecated
    public final void X() {
        if (a() instanceof qw) {
            ((qw) a()).b();
        }
        if (getActivity() instanceof qw) {
            ((qw) getActivity()).b();
        }
    }

    @Deprecated
    public boolean b(Preference preference) {
        boolean z = false;
        if (preference.t == null) {
            return false;
        }
        if (a() instanceof qv) {
            z = ((qv) a()).b(this, preference);
        }
        return (z || !(getActivity() instanceof qv)) ? z : ((qv) getActivity()).b(this, preference);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen b2 = b();
        if (b2 != null) {
            Bundle bundle2 = new Bundle();
            b2.a(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    public void onStart() {
        super.onStart();
        ri riVar = this.b;
        riVar.c = this;
        riVar.d = this;
    }

    public void onStop() {
        super.onStop();
        ri riVar = this.b;
        riVar.c = null;
        riVar.d = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen b2;
        super.onViewCreated(view, bundle);
        if (!(bundle == null || (bundle2 = bundle.getBundle("android:preferences")) == null || (b2 = b()) == null)) {
            b2.b(bundle2);
        }
        if (this.h) {
            c();
        }
        this.i = true;
    }

    @Deprecated
    public final void a(PreferenceScreen preferenceScreen) {
        ri riVar = this.b;
        PreferenceScreen preferenceScreen2 = riVar.b;
        if (preferenceScreen != preferenceScreen2) {
            if (preferenceScreen2 != null) {
                preferenceScreen2.o();
            }
            riVar.b = preferenceScreen;
            if (preferenceScreen != null) {
                this.h = true;
                if (this.i && !this.f.hasMessages(1)) {
                    this.f.obtainMessage(1).sendToTarget();
                }
            }
        }
    }
}
